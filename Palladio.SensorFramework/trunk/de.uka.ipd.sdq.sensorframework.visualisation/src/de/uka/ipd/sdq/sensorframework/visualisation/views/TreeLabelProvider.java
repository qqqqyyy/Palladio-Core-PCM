package de.uka.ipd.sdq.sensorframework.visualisation.views;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import de.uka.ipd.sdq.sensorframework.dialogs.dataset.DataSetLabelProvider;
import de.uka.ipd.sdq.sensorframework.entities.ExperimentRun;
import de.uka.ipd.sdq.sensorframework.entities.Sensor;
import de.uka.ipd.sdq.sensorframework.entities.dao.IDAOFactory;
import de.uka.ipd.sdq.sensorframework.visualisation.SimuImages;

/**
 * The label provider to define how model objects should be presented in the
 * view. Each view can present the same model objects using different labels and
 * icons, if needed. Alternatively, a single label provider can be shared
 * between views in order to ensure that objects of the same type are presented
 * in the same way everywhere.
 * 
 */
public class TreeLabelProvider extends LabelProvider {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(Object obj) {
		if (obj instanceof ExperimentAndDAO)
			return ((ExperimentAndDAO) obj).getExperiment().getExperimentName();

		if (obj instanceof TreeContainer)
			return ((TreeContainer) obj).getName();
		
		if (obj instanceof TreeObject) {
			TreeObject object = (TreeObject) obj;

			if (object.getObject() instanceof ExperimentRun) {
				ExperimentRun run = (ExperimentRun) object.getObject();
				return runRepresentation(run);
			}

			if (object.getObject() instanceof Sensor) {
				Sensor sensor = (Sensor) object.getObject();
				return sensorRepresentation(sensor);
			}
		}
			
		if (obj instanceof IDAOFactory) {
			IDAOFactory factory = (IDAOFactory) obj;
			return DataSetLabelProvider.dataSetRepresentation(factory);
		}

		return obj.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.LabelProvider#getImage(java.lang.Object)
	 */
	@Override
	public Image getImage(Object obj) {

		if (obj instanceof ExperimentAndDAO)
			return SimuImages.imageRegistry.get(SimuImages.EXPERIMENT);

		if (obj instanceof TreeContainer){
			String icon = "";
			TreeContainer container = (TreeContainer) obj;
			switch (container.getType()) {
			case TreeContentProvider.EXPERIMENT_RUNS:
				icon = SimuImages.RUNS;
				break;
			case TreeContentProvider.SENSORS:
				icon = SimuImages.SENSORS;
				break;
			}
			return SimuImages.imageRegistry.get(icon);
		}

		if (obj instanceof TreeObject) {
			TreeObject object = (TreeObject) obj;

			if (object.getObject() instanceof ExperimentRun)
				return SimuImages.imageRegistry.get(SimuImages.RUN);

			if (object.getObject() instanceof Sensor)
				return SimuImages.imageRegistry.get(SimuImages.SENSOR);
		}
		
		if (obj instanceof IDAOFactory)
			return SimuImages.imageRegistry.get(SimuImages.TREEROOT);

		return PlatformUI.getWorkbench().getSharedImages().getImage(
				ISharedImages.IMG_OBJ_ELEMENT);
	}

	public String sensorRepresentation(Sensor sensor) {
		return sensor.getSensorName() + " [ID:" + sensor.getSensorID() + "]";
	}
	
	public String runRepresentation(ExperimentRun run) {
		return run.getExperimentDateTime() + " [ID:" + run.getExperimentRunID() + "]";
	}
}
