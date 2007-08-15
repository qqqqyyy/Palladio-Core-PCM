package de.uka.ipd.sdq.capra.simulator.resources_new;

import java.util.Map;


public class MultipleResourceInstancesConstraint implements IResourceInstanceConstraint {

	@Override
	public boolean check(SimResourceInstance instance) {
		return affinityResourceInstanceTableMap.get(instance.getId()) != null;
	}

	/**
	 * @uml.property  name="affinityResourceInstanceTable"
	 * @uml.associationEnd  inverse="resourceInstanceAffinityConstraint:de.uka.ipd.sdq.capra.simulator.resources_new.SimResourceInstance" qualifier="key:java.lang.Integer de.uka.ipd.sdq.capra.simulator.resources_new.SimResourceInstance"
	 */
	private Map<Integer, SimResourceInstance> affinityResourceInstanceTableMap;

	/**
	 * Getter of the property <tt>affinityResourceInstanceTable</tt>
	 * @return  Returns the affinityResourceInstanceTableMap.
	 * @uml.property  name="affinityResourceInstanceTable"
	 */
	public Map<Integer, SimResourceInstance> getAffinityResourceInstanceTable() {
		return affinityResourceInstanceTableMap;
	}

	/**
	 * Setter of the property <tt>affinityResourceInstanceTable</tt>
	 * @param affinityResourceInstanceTable  The affinityResourceInstanceTableMap to set.
	 * @uml.property  name="affinityResourceInstanceTable"
	 */
	public void setAffinityResourceInstanceTable(
			Map<Integer, SimResourceInstance> affinityResourceInstanceTable) {
		affinityResourceInstanceTableMap = affinityResourceInstanceTable;
	}

}
