package de.uka.ipd.sdq.codegen.simucontroller.runconfig;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;

import de.uka.ipd.sdq.cip.runconfig.CompletionConfiguration;
import de.uka.ipd.sdq.simucomframework.SimuComConfig;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowBasedRunConfiguration;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowConfigurationBuilder;
import de.uka.ipd.sdq.workflow.launchconfig.ConstantsContainer;

public class SimuComLaunchConfigurationBasedConfigBuilder 
extends
		AbstractWorkflowConfigurationBuilder {

	public SimuComLaunchConfigurationBasedConfigBuilder(
			ILaunchConfiguration configuration, String mode) throws CoreException {
		super(configuration,mode);
	}

	@Override
	public void fillConfiguration(AbstractWorkflowBasedRunConfiguration configuration) throws CoreException {
		SimuComWorkflowConfiguration config = (SimuComWorkflowConfiguration) configuration;
		
		config.setDebug(this.isDebug);
		if (hasAttribute(SimuComConfig.SHOULD_THROW_EXCEPTION))
			config.setInteractive(getBooleanAttribute(SimuComConfig.SHOULD_THROW_EXCEPTION));
		else
			config.setInteractive(true);

		// TODO: Put this in a config builder for building completion based PCM analysis runs
		config.setFeatureConfigFile( getStringAttribute(ConstantsContainer.FEATURE_CONFIG) );
		
		config.setSimulateLinkingResources(getBooleanAttribute(ConstantsContainer.SIMULATE_LINKING_RESOURCES));
		config.setSimulateFailures(getBooleanAttribute(ConstantsContainer.SIMULATE_FAILURES));
		config.setCleanupCode(getBooleanAttribute(ConstantsContainer.DELETE_PLUGIN));
		config.setPluginID(getStringAttribute(ConstantsContainer.PLUGIN_ID));
		
		config.setSensitivityAnalysisEnabled(
				hasValidSensitvityVariableAttribute(ConstantsContainer.VARIABLE_TEXT));
		if (config.isSensitivityAnalysisEnabled()) {
			SensitivityAnalysisConfiguration sensitivityConfig = 
				new SensitivityAnalysisConfiguration(getStringAttribute(ConstantsContainer.VARIABLE_TEXT), 
						0, 
						getDoubleAttribute(ConstantsContainer.MINIMUM_TEXT), 
						getDoubleAttribute(ConstantsContainer.MAXIMUM_TEXT), 
						getDoubleAttribute(ConstantsContainer.STEP_WIDTH_TEXT));
			config.setSensitivityAnalysisConfiguration(sensitivityConfig);
		}
		
		config.setSimuComConfiguration(new SimuComConfig(properties, 0, config.isDebug()));
		config.setCompletionConfig(new CompletionConfiguration(properties));
	}
	
	private boolean hasValidSensitvityVariableAttribute(String attribute) throws CoreException {
		if (!configuration.hasAttribute(attribute))
			return false;
		Object value = getStringAttribute(attribute);
		//Anne: I sometimes get a "NO ELEMENT SELECTED" result from the LaunchConfig even if I deleted the string from the field
		//I have no idea how to fix it directly, so I need to catch it here. 
		//It seems to only appear in the Design Space Exploration tab. 
		return value instanceof String && !value.equals("") && !value.equals("NO ELEMENT SELECTED");
	}
	
}