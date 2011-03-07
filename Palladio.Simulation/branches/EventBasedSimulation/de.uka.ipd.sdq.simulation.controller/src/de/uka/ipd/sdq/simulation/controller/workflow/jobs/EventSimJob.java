package de.uka.ipd.sdq.simulation.controller.workflow.jobs;

import org.eclipse.core.runtime.CoreException;

import de.uka.ipd.sdq.cip.workflow.jobs.CompletionJob;
import de.uka.ipd.sdq.codegen.simucontroller.debug.IDebugListener;
import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.BuildPluginJarJob;
import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.CompilePluginCodeJob;
import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.CreatePluginProjectJob;
import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.CreateWorkingCopyOfModelsJob;
import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.LoadMiddlewareConfigurationIntoBlackboardJob;
import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.SimuComJob;
import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.TransferSimulationBundleToDock;
import de.uka.ipd.sdq.pcm.transformations.ApplyConnectorCompletionsJob;
import de.uka.ipd.sdq.pcm.transformations.EventsTransformationJob;
import de.uka.ipd.sdq.simulation.controller.runconfig.EventSimWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.IJobWithResult;
import de.uka.ipd.sdq.workflow.OrderPreservingBlackboardCompositeJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.pcm.jobs.LoadPCMModelsIntoBlackboardJob;
import de.uka.ipd.sdq.workflow.pcm.jobs.ValidatePCMModelsJob;

/**
 * 
 * TODO describe class
 * 
 * This class is based on {@link SimuComJob}. Some code has been reused.
 * 
 * @author Philipp Merkle
 * 
 */
public class EventSimJob extends OrderPreservingBlackboardCompositeJob<MDSDBlackboard> implements
        IBlackboardInteractingJob<MDSDBlackboard> {

    private IDebugListener debugListener = null;

    public EventSimJob(EventSimWorkflowConfiguration configuration) throws CoreException {
        this(configuration, null);
    }

    public EventSimJob(EventSimWorkflowConfiguration configuration, IDebugListener listener) throws CoreException {
        this(configuration, listener, true);

    }

    public EventSimJob(EventSimWorkflowConfiguration configuration, IDebugListener listener, boolean loadModels)
            throws CoreException {

        if (listener == null && configuration.isDebug())
            throw new IllegalArgumentException("Debug listener has to be non-null for debug runs");
        this.debugListener = listener;
        // 1. Load PCM Models into memory
        if (loadModels == true) {
            this.addJob(new LoadPCMModelsIntoBlackboardJob(configuration));
        }
        this.addJob(new LoadMiddlewareConfigurationIntoBlackboardJob(configuration));

        // 2. Validate PCM Models
        this.addJob(new ValidatePCMModelsJob(configuration));

        // 2. Create new Eclipse plugin project
        this.addJob(new CreatePluginProjectJob(configuration));
        this.addJob(new CreateWorkingCopyOfModelsJob(configuration));

        // TODO 3. Sensitivity Analysis
        // if(configuration.isSensitivityAnalysisEnabled()){
        // this.add(new TransformPCMForSensitivityAnalysisJob(configuration));
        // }

        // 4. Apply Completions
        this.add(new CompletionJob(configuration));

        // 5. Transform Event Model Elements
        this.add(new EventsTransformationJob(configuration));

        // 6. Apply connector completion transformation
        if (configuration.getSimulateLinkingResources()) {
            this.addJob(new ApplyConnectorCompletionsJob(configuration));
        }

        // 7. Generate the plugin's code
        this.addJob(new CreateEventSimMetaDataFilesJob(configuration));
        this.addJob(new CreateSimulationMainFile(configuration));

        // 8. Compile the plugin
        this.addJob(new CompilePluginCodeJob(configuration));

        // 9. Jar the compiled code into a JAR bundle
        IJobWithResult<byte[]> buildBundleJob = new BuildPluginJarJob(configuration);
        this.addJob(buildBundleJob);

        // 10. Transfer the JAR to a free simulation dock and simulate it
        this.addJob(new TransferSimulationBundleToDock(configuration, debugListener, buildBundleJob));

    }

}