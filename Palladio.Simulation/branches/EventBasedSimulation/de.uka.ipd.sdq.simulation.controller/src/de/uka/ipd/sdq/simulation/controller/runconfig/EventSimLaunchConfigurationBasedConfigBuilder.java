package de.uka.ipd.sdq.simulation.controller.runconfig;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.PCMCompletionRunConfiguration;
import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComLaunchConfigurationBasedConfigBuilder;
import de.uka.ipd.sdq.simulation.EventSimConfig;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowBasedRunConfiguration;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowConfigurationBuilder;
import de.uka.ipd.sdq.workflow.launchconfig.ConstantsContainer;
import de.uka.ipd.sdq.workflow.pcm.configurations.AbstractCodeGenerationWorkflowRunConfiguration.CodeGenerationAdvice;
import de.uka.ipd.sdq.workflow.pcm.runconfig.SensitivityAnalysisConfiguration;

/**
 * TODO comment
 * 
 * This class is based on {@link SimuComLaunchConfigurationBasedConfigBuilder}. Some code has been reused.
 * 
 * @author Philipp Merkle
 *
 */
public class EventSimLaunchConfigurationBasedConfigBuilder extends AbstractWorkflowConfigurationBuilder {

    public EventSimLaunchConfigurationBasedConfigBuilder(
            ILaunchConfiguration configuration, String mode) throws CoreException {
        super(configuration,mode);
    }

    @Override
    public void fillConfiguration(AbstractWorkflowBasedRunConfiguration configuration) throws CoreException {
        EventSimWorkflowConfiguration config = (EventSimWorkflowConfiguration) configuration;
                
        config.setCodeGenerationAdvicesFile(CodeGenerationAdvice.SIMULATION);
        
        
        config.setDebug(this.isDebug);
     // TODO
//        if (hasAttribute(SimulationConfig.SHOULD_THROW_EXCEPTION))
//            config.setInteractive(getBooleanAttribute(SimuComConfig.SHOULD_THROW_EXCEPTION));
//        else
//            config.setInteractive(true);

        config.setSimulateLinkingResources(getBooleanAttribute(ConstantsContainer.SIMULATE_LINKING_RESOURCES));
//        config.setSimulateFailures(getBooleanAttribute(ConstantsContainer.SIMULATE_FAILURES));
        config.setCleanupCode(getBooleanAttribute(ConstantsContainer.DELETE_PLUGIN));
        config.setPluginID(getStringAttribute(ConstantsContainer.PLUGIN_ID));
        
        //This loads the feature config for Steffen's Connector Completions
        //TODO: Integrate this in CIP process. 
        config.setFeatureConfigFile( getStringAttribute(ConstantsContainer.FEATURE_CONFIG) );
        
        config.setSensitivityAnalysisEnabled(
                hasValidSensitvityVariableAttribute(ConstantsContainer.VARIABLE_TEXT));
        if (config.isSensitivityAnalysisEnabled()) {
            SensitivityAnalysisConfiguration sensitivityConfig = 
                new SensitivityAnalysisConfiguration(
                        "",
                        //TODO: getStringAttribute(ConstantsContainer.VARIABLE_SHORT_NAME), 
                        getStringAttribute(ConstantsContainer.VARIABLE_TEXT), 
                        getDoubleAttribute(ConstantsContainer.MINIMUM_TEXT), 
                        getDoubleAttribute(ConstantsContainer.MAXIMUM_TEXT), 
                        getDoubleAttribute(ConstantsContainer.STEP_WIDTH_TEXT));
            config.setSensitivityAnalysisConfiguration(sensitivityConfig);
        }
        
        config.setSimulationConfiguration(new EventSimConfig(properties, config.isDebug()));
        config.setCompletionConfiguration(new PCMCompletionRunConfiguration(config, properties));
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
