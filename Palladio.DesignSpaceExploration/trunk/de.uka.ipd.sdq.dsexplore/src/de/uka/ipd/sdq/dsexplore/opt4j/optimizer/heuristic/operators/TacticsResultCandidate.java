package de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators;

import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;
import de.uka.ipd.sdq.pcm.designdecision.Problem;

/**
 * HeuristicCandidate is used to manage the candidates generated
 * be heuristics
 * @author martens, Tom Beyer
 */
public class TacticsResultCandidate extends DSEIndividual{
	/**
	 * Double between 0 and 1 that determines the probability
	 * with which it is selected out of a set of HeuristicCandidates
	 */
	private double candidateWeight;
	/**
	 * Heuristic which generated this candidate
	 */
	private ITactic heuristic;
	
	/**
	 * Store the parent individual for analysis purposes. 
	 * We could also just store the hash code of the parent, 
	 * but storing the reference is more flexible for potential 
	 * later extensions.   
	 */
	private DSEIndividual parent;
	
	public TacticsResultCandidate(Problem problem, DSEIndividual parent) {
		super(problem);
		this.parent = parent;
	}

	/**
	 * 
	 * @return Weight of candidate
	 */
	public double getCandidateWeight() {
		return candidateWeight;
	}
	
	/**
	 * Sets weight of candidate
	 * @param candidateWeight Weight of candidate. If parameter
	 * is < 0, weight will be 0. If parameter is > 1, weight will be 1
	 */
	public void setCandidateWeight(double candidateWeight) {
		if (candidateWeight < 0.0 || candidateWeight > 1.0) {
			throw new IllegalArgumentException("Candidate weight value (" + candidateWeight + ") not in [0,1].");
		}
		this.candidateWeight = candidateWeight;
	}
	
	/**
	 * 
	 * @return Heuristic that generated this candidate
	 */
	public ITactic getHeuristic() {
		return heuristic;
	}
	
	/**
	 * Sets heuristic that generated candidate
	 * @param heuristic
	 */
	public void setHeuristic(ITactic heuristic) {
		this.heuristic = heuristic;
	}
	
	/**
	 * Returns product of Heuristic Weight and Candidate Weight
	 * @return
	 */
	public double getFinalWeight() {
		return this.getHeuristic().getHeuristicWeight() * getCandidateWeight();
	}

	/**
	 * @return the parent
	 */
	public DSEIndividual getParent() {
		return parent;
	}
}
