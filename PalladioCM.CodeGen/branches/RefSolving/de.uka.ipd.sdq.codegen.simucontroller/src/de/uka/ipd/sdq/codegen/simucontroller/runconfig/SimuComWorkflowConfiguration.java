package de.uka.ipd.sdq.codegen.simucontroller.runconfig;

import javax.management.RuntimeErrorException;

import de.uka.ipd.sdq.cip.launchconfig.AbstractPCMCompletionWorkflowRunConfiguration;
import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.workflow.pcm.configurations.AbstractCodeGenerationWorkflowRunConfiguration;
import de.uka.ipd.sdq.workflow.pcm.configurations.AbstractPCMWorkflowRunConfiguration;


/**
 */
public class SimuComWorkflowConfiguration 
extends AbstractPCMCompletionWorkflowRunConfiguration{

	private SimuComConfig simuComConfig = null;
	private SensitivityAnalysisConfiguration sensitivityAnalysisConfiguration = null;
	private boolean sensitivityAnalysisEnabled;
	private boolean simulateLinkingResources;
	private boolean simulateFailures;

	public boolean isSensitivityAnalysisEnabled() {
		return sensitivityAnalysisEnabled;
	}

	public SimuComConfig getSimuComConfiguration() {
		return simuComConfig ;
	}

	public SensitivityAnalysisConfiguration getSensitivityAnalysisConfiguration() {
		if (!isSensitivityAnalysisEnabled())
			throw new UnsupportedOperationException("GetSensitivityAnalysisConfiguration is only supported if isSensitivityAnaysisEnabled is true!");

		return sensitivityAnalysisConfiguration ;
	}

	public void setSimuComConfiguration(SimuComConfig simuComConfig) {
		checkFixed();
		this.simuComConfig = simuComConfig;
	}

	public void setSensitivityAnalysisEnabled(boolean sensitivityAnalysisEnabled) {
		checkFixed();
		this.sensitivityAnalysisEnabled = sensitivityAnalysisEnabled;
	}

	public boolean getSimulateLinkingResources() {
		return simulateLinkingResources;
	}

	public boolean getSimulateFailures() {
		return simulateFailures;
	}
	
	public void setSimulateLinkingResources(boolean simulateLinkingResources) {
		checkFixed();
		this.simulateLinkingResources = simulateLinkingResources;
	}
	
	public void setSimulateFailures(boolean simulateFailures) {
		checkFixed();
		this.simulateFailures = simulateFailures;
	}

	public void setSensitivityAnalysisConfiguration(
			SensitivityAnalysisConfiguration sensitivityConfig) {
		checkFixed();
		this.sensitivityAnalysisConfiguration = sensitivityConfig;
		
	}

	public String getErrorMessage() {
		// must be null; otherwise a non-empty error message will result in
		// a workflow config being considered invalid
		return null; 
	}

	public void setDefaults() {
		throw new RuntimeException("Not implemented. No defaults defined.");
	}

}