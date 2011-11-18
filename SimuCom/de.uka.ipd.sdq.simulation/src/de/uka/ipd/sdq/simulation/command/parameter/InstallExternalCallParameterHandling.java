package de.uka.ipd.sdq.simulation.command.parameter;

import java.util.ArrayList;
import java.util.List;

import de.uka.ipd.sdq.pcm.core.composition.AssemblyContext;
import de.uka.ipd.sdq.pcm.parameter.VariableUsage;
import de.uka.ipd.sdq.pcm.repository.OperationSignature;
import de.uka.ipd.sdq.pcm.seff.ExternalCallAction;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingSEFF;
import de.uka.ipd.sdq.simucomframework.variables.StackContext;
import de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe;
import de.uka.ipd.sdq.simulation.PCMModel;
import de.uka.ipd.sdq.simulation.command.ICommandExecutor;
import de.uka.ipd.sdq.simulation.command.IPCMCommand;
import de.uka.ipd.sdq.simulation.command.seff.FindExternalCallActionsInSeff;
import de.uka.ipd.sdq.simulation.command.seff.FindSeffsForAssemblyContext;
import de.uka.ipd.sdq.simulation.entities.Request;
import de.uka.ipd.sdq.simulation.staticstructure.ComponentInstance;
import de.uka.ipd.sdq.simulation.traversal.listener.AbstractExternalCallListener;
import de.uka.ipd.sdq.simulation.traversal.seff.SeffBehaviourInterpreter;
import de.uka.ipd.sdq.simulation.traversal.state.RequestState;
import de.uka.ipd.sdq.simulation.util.ParameterHelper;

/**
 * This command sets up the handling of PCM parameter characterisations for
 * {@link ExternalCallAction}s. ExternalCallActions accept input parameters and can return output
 * parameters, both of which are realised by modifying the current stack frame (see:
 * {@link StackContext}). These modifications are performed by this command, once installed.
 * 
 * @author Philipp Merkle
 * 
 */
public class InstallExternalCallParameterHandling implements IPCMCommand<Void> {

    /**
     * {@inheritDoc}
     */
    @Override
    public Void execute(final PCMModel pcm, final ICommandExecutor<PCMModel> executor) {
        // find all external calls
        final List<ExternalCallAction> externalCalls = new ArrayList<ExternalCallAction>();
        for (final AssemblyContext assemblyCtx : pcm.getSystemModel().getAssemblyContexts__ComposedStructure()) {
            final List<ResourceDemandingSEFF> seffs = executor.execute(new FindSeffsForAssemblyContext(assemblyCtx));
            for (ResourceDemandingSEFF s : seffs) {
                externalCalls.addAll(executor.execute(new FindExternalCallActionsInSeff(s)));
            }
        }
        if (externalCalls != null) {
            for (final ExternalCallAction c : externalCalls) {
                SeffBehaviourInterpreter.addTraversalListener(c, new ExternalCallTraversalListener());
            }
        }
        // the listeners are mounted; we don't need to return anything.
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean cachable() {
        return false;
    }

    private class ExternalCallTraversalListener extends AbstractExternalCallListener {

        @Override
        public void before(final ExternalCallAction call, final Request who,
                final ComponentInstance callingComponent, RequestState state) {
            final StackContext ctx = state.getStoExContext();

            // find the component which provides the required call
            final OperationSignature calledService = call.getCalledService_ExternalService();
            final ComponentInstance providingComponent = callingComponent.getProvidingComponent(calledService);

            // get a reference on the current stack frame which is being covered soon
            final SimulatedStackframe<Object> outerFrame = ctx.getStack().currentStackFrame();

            // enter a new scope in which the call is being executed
            final SimulatedStackframe<Object> serviceBodyFrame = ctx.getStack().createAndPushNewStackFrame();

            // add component parameters
            serviceBodyFrame.addVariables(providingComponent.getComponentParameters());

            // evaluate the input parameters and add them to the call's scope
            final List<VariableUsage> parameters = call.getInputVariableUsages__CallAction();
            ParameterHelper.evaluateParametersAndCopyToFrame(parameters, outerFrame, serviceBodyFrame);
        }

        @Override
        public void after(final ExternalCallAction call, final Request who,
                final ComponentInstance callingComponent, RequestState state) {
            final StackContext ctx = state.getStoExContext();

            // get a reference on the current stack frame which is being removed soon
            final SimulatedStackframe<Object> serviceBodyFrame = ctx.getStack().currentStackFrame();

            // remove the current stack frame. This restores the pre-call scope.
            ctx.getStack().removeStackFrame();

            // evaluate the return parameters of the call and add them to the current scope
            final List<VariableUsage> parameters = call.getReturnVariableUsage__CallReturnAction();
            final SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
            ParameterHelper.evaluateParametersAndCopyToFrame(parameters, serviceBodyFrame, currentFrame);
        }

    }

}
