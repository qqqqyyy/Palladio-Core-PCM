package de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.impl;

import org.opt4j.core.problem.Genotype;
import org.opt4j.operator.copy.Copy;

import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividualBuilder;

public class OneLaneBridge extends ConcurrentProcessingSystemImplCatia{

	public OneLaneBridge(Copy<Genotype> copy,
			DSEIndividualBuilder individualBuilder,
			DSEWorkflowConfiguration configuration) {
		super(copy, individualBuilder, configuration, true);
		// TODO Auto-generated constructor stub
	}
	
}
