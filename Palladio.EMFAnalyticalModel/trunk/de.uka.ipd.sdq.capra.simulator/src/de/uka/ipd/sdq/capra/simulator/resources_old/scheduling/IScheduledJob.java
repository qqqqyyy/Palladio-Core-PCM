/**
 * 
 */
package de.uka.ipd.sdq.capra.simulator.resources_old.scheduling;

import de.uka.ipd.sdq.capra.simulator.resources_old.scheduling.impl.PreemptiveProcess;


public interface IScheduledJob {
	
	PreemptiveProcess getProcess();

	double getRemainingDemand();

	public boolean demandProcessed();

	void passTime(double time);

	public boolean timeSliceFinished();
		
	public double getRemainingTimeSlice();

	double getNextEventTime();

	boolean isActive();
}