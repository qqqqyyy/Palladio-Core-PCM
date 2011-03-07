package de.uka.ipd.sdq.simulation.traversal.usage.strategies;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.pcm.core.PCMRandomVariable;
import de.uka.ipd.sdq.pcm.usagemodel.AbstractUserAction;
import de.uka.ipd.sdq.pcm.usagemodel.Loop;
import de.uka.ipd.sdq.pcm.usagemodel.ScenarioBehaviour;
import de.uka.ipd.sdq.simucomframework.variables.StackContext;
import de.uka.ipd.sdq.simulation.entities.User;
import de.uka.ipd.sdq.simulation.traversal.instructions.ITraversalInstruction;
import de.uka.ipd.sdq.simulation.traversal.instructions.TraverseNextAction;
import de.uka.ipd.sdq.simulation.traversal.instructions.TraverseUsageBehaviour;
import de.uka.ipd.sdq.simulation.traversal.state.ITraversalStrategyState;
import de.uka.ipd.sdq.simulation.traversal.state.TraversalState;
import de.uka.ipd.sdq.simulation.traversal.usage.IUsageTraversalStrategy;

public class LoopTraversalStrategy implements IUsageTraversalStrategy<Loop> {

    private static Logger logger = Logger.getLogger(LoopTraversalStrategy.class);

    @Override
    public ITraversalInstruction<AbstractUserAction> traverse(final Loop loop, final User user,
            final TraversalState<AbstractUserAction> state) {
        // restore or create state
        LoopTraversalState internalState = (LoopTraversalState) state.getStack().currentScope().getState(loop);
        if (internalState == null) {
            internalState = this.initialiseState(user, loop, state);
        }

        if (!this.doneAllIterations(internalState)) {
            if (logger.isDebugEnabled()) {
                logger.debug("Traversing iteration " + internalState.getCurrentIteration() + " of "
                        + internalState.getOverallIterations());
            }

            // traverse the body behaviour
            internalState.incrementCurrentIteration();
            final ScenarioBehaviour bheaviour = loop.getBodyBehaviour_Loop();
            return new TraverseUsageBehaviour(user.getModel(), bheaviour, loop);
        } else {
            if (logger.isDebugEnabled()) {
                logger.debug("Completed loop traversal");
            }
            return new TraverseNextAction<AbstractUserAction>(loop.getSuccessor());
        }
    }

    private LoopTraversalState initialiseState(final User user, final Loop loop,
            final TraversalState<AbstractUserAction> state) {
        // evaluate the iteration count
        final PCMRandomVariable loopCountRandVar = loop.getLoopIteration_Loop();
        final Integer overallIterations = StackContext.evaluateStatic(loopCountRandVar.getSpecification(),
                Integer.class);

        // create and set state
        final LoopTraversalState internalState = new LoopTraversalState(overallIterations);
        state.getStack().currentScope().addState(loop, internalState);

        return internalState;
    }

    private boolean doneAllIterations(final LoopTraversalState state) {
        return state.getCurrentIteration() > state.getOverallIterations();
    }

    private class LoopTraversalState implements ITraversalStrategyState {

        private int currentIteration;
        private final int overallIterations;

        public LoopTraversalState(final int overallIterations) {
            this.overallIterations = overallIterations;
            this.currentIteration = 1;
        }

        public int getCurrentIteration() {
            return this.currentIteration;
        }

        public void incrementCurrentIteration() {
            this.currentIteration++;
        }

        public int getOverallIterations() {
            return this.overallIterations;
        }

    }

}
