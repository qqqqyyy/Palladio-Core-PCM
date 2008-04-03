package de.uka.ipd.sdq.simucomframework.simulationdock;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Hashtable;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;
import org.osgi.util.tracker.ServiceTracker;

import de.uka.ipd.sdq.simucomframework.ISimuComControl;
import de.uka.ipd.sdq.simucomframework.IStatusObserver;
import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.simucomframework.SimuComStatus;
import de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer;

public class SimulationDockServiceImpl implements SimulationDockService {

	protected static Logger logger = 
		Logger.getLogger(SimulationDockServiceImpl.class.getName());
	
	private BundleContext context;
	private String myID = EcoreUtil.generateUUID();
	private ServiceTracker service;
	private ServiceTracker eventService;
	private EventAdmin eventAdmin;

	private DebugObserver debugObserver;

	public SimulationDockServiceImpl(BundleContext context) {
		this.context = context;
		ServiceReference eventServiceRef = context.getServiceReference(EventAdmin.class.getName());
		eventService = new ServiceTracker(context,eventServiceRef,null);
		eventService.open();
		eventAdmin = (EventAdmin)eventService.getService();
		
		logger.debug("Simulation Dock Started");
	}
	
	@Override
	protected void finalize() throws Throwable {
		eventService.close();
		super.finalize();
	}

	public void simulate(SimuComConfig config, byte[] simulationBundle, boolean isRemoteRun) {
		postEvent("de/uka/ipd/sdq/simucomframework/simucomdock/DOCK_BUSY");

		if (config.isDebug()) {
			this.debugObserver = new DebugObserver(eventAdmin,this);
		} else {
			this.debugObserver = null;
		}

		ensurePluginLoaded(context, "org.eclipse.equinox.event");
		unloadPluginIfExists(context, "de.uka.ipd.sdq.codegen.simucominstance");
		try {
			loadAndSimulateBundle(config, simulationBundle, eventAdmin, isRemoteRun);
		} catch (Exception e) {
			throw new RuntimeException("Simulation failed",e);
		} finally {
			unloadPluginIfExists(context, "de.uka.ipd.sdq.codegen.simucominstance");
			postEvent("de/uka/ipd/sdq/simucomframework/simucomdock/DOCK_IDLE");
		}
	}

	private void loadAndSimulateBundle(SimuComConfig config,
			byte[] simulationBundle, EventAdmin eventAdmin, boolean isRemoteRun) {
		String bundleLocation = persistBundleInTempDir(simulationBundle);
		Bundle simulationBundleRef = null;
		try {
			simulationBundleRef = context.installBundle(new File(bundleLocation).toURI().toString());
			simulationBundleRef.start();
			
			simulate(config, simulationBundleRef, eventAdmin, isRemoteRun);
		} catch (BundleException e) {
			throw new RuntimeException("OSGi failure",e);
		} finally {
			if (simulationBundleRef != null) {
				try {
					if (simulationBundleRef.getState() == Bundle.ACTIVE)
						simulationBundleRef.stop();

					simulationBundleRef.uninstall();
				} catch (BundleException e) {
					throw new RuntimeException("OSGi failure",e);
				}
			}
		}
	}

	private void simulate(final SimuComConfig config, Bundle simulationBundleRef, final EventAdmin eventAdmin, boolean isRemoteRun) {
		ServiceReference[] services = simulationBundleRef.getRegisteredServices();
		assert services.length == 1;
		
		service = new ServiceTracker(context,services[0],null);
		service.open();
		postEvent("de/uka/ipd/sdq/simucomframework/simucomdock/SIM_STARTED");
		try {
			DispatchingSimulationObserver simulationObservers = new DispatchingSimulationObserver();
			if (debugObserver != null) {
				simulationObservers.addObserver(debugObserver);
			}
			simulationObservers.addObserver(new SimulationProgressReportingObserver(config,eventAdmin,this));
			
			SimuComStatus result = ((ISimuComControl)service.getService()).startSimulation(
					config, simulationObservers, isRemoteRun);
			
			if (result == SimuComStatus.ERROR) {
				throw new RuntimeException("Simulation failed.",((ISimuComControl)service.getService()).getErrorThrowable());
			}
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		} finally {
			service.close();
			postEvent("de/uka/ipd/sdq/simucomframework/simucomdock/SIM_STOPPED");
		}
	}

	public void suspend() {
		if (debugObserver == null)
			throw new IllegalStateException("Suspend only available in debug mode");
		debugObserver.suspend();
	}

	public void resume() {
		if (debugObserver == null)
			throw new IllegalStateException("Suspend only available in debug mode");
		debugObserver.resume();
	}

	private void postEvent(String topic) {
		postEvent(topic, new Hashtable());
	}
	
	private void postEvent(String topic, Hashtable newProperties) {
		Hashtable properties = new Hashtable();
		properties.put("DOCK_ID", SimulationDockServiceImpl.this.getDockId());
		properties.putAll(newProperties);
		Event event = new Event(topic, properties);
		eventAdmin.postEvent(event);
	}
	
	private String persistBundleInTempDir(byte[] simulationBundle) {
		File tempFile = null;
		try {
			tempFile = File.createTempFile("simucominstance", ".jar");
			tempFile.deleteOnExit();
			FileOutputStream fos = new FileOutputStream(tempFile);
			fos.write(simulationBundle);
			fos.close();
		} catch (IOException e) {
			throw new RuntimeException("OSGi failure",e);
		}
		return tempFile.getAbsolutePath();
	}

	public String getDockId() {
		return myID;
	}

	private void unloadPluginIfExists(BundleContext context, String bundleName) {
		for (Bundle b : context.getBundles()) {
			if (b.getSymbolicName() != null && b.getSymbolicName().equals(bundleName)) {
				try {
					if (b.getState() == Bundle.ACTIVE){
						b.stop();
					}
					b.uninstall();
				} catch (BundleException e) {
					throw new RuntimeException("OSGi failure",e);
				}
			}
		}
	}
	
	private void ensurePluginLoaded(BundleContext context, String bundleName) {
		for (Bundle b : context.getBundles()) {
			if (b.getSymbolicName() != null && b.getSymbolicName().equals(bundleName)) {
				if (b.getState() != Bundle.ACTIVE){
					try {
						b.start();
					} catch (BundleException e) {
						throw new RuntimeException("OSGi failure",e);
					}
				}
			}
		}
	}

	public void stopSimulation() {
		((ISimuComControl)service.getService()).stopSimulation();
	}

	public void step() {
		if (debugObserver == null)
			throw new IllegalStateException("Stepping only available in debug mode");
		debugObserver.step();
	}
}
