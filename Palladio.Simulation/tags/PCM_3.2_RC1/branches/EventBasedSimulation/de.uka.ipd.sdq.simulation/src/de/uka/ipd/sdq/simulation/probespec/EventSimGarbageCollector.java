package de.uka.ipd.sdq.simulation.probespec;

import de.uka.ipd.sdq.probespec.framework.ISampleBlackboard;
import de.uka.ipd.sdq.probespec.framework.ProbeSetAndRequestContext;
import de.uka.ipd.sdq.probespec.framework.RequestContext;
import de.uka.ipd.sdq.probespec.framework.garbagecollection.RegionBasedGarbageCollector;

/**
 * A {@link RegionBasedGarbageCollector}, specialised to be used within EventSim.
 * It enables a {@link RequestContext} to be used as region identifier. More
 * precisely, the specified {@link RequestContext} gets translated to the
 * appropriate region identifier.
 * 
 * @author Philipp Merkle
 * 
 */
public class EventSimGarbageCollector extends
		RegionBasedGarbageCollector<RequestContext> {

	private ISampleBlackboard blackboard;

	public EventSimGarbageCollector(ISampleBlackboard blackboard) {
		this.blackboard = blackboard;
	}

	@Override
	public void collectRegionSamples(RequestContext regionId) {
		blackboard.deleteSamplesInRequestContext(regionId);
	}

	@Override
	public RequestContext obtainRegionId(ProbeSetAndRequestContext sampleId) {
		return sampleId.getCtxID().rootContext();
	}

}
