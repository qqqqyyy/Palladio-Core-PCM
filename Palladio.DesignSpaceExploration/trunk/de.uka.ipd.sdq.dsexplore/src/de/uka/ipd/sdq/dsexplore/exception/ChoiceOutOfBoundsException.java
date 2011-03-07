package de.uka.ipd.sdq.dsexplore.exception;

import de.uka.ipd.sdq.dsexplore.helper.DegreeOfFreedomHelper;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.EnumerationChoice;
import de.uka.ipd.sdq.pcm.designdecision.SchedulingPolicyChoice;

/**
 * Thrown in the value of a {@link Choice} is not contained in the corresponding {@link DegreeOfFreedom}.
 * Example: {@link DiscreteRangeChoice} A has the chosen value 5, but the linked {@link DegreeOfFreedom} D 
 * has from = 7 and to = 10.
 *   
 * @author martens
 *
 */
public class ChoiceOutOfBoundsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5518058966677144866L;
	
	public ChoiceOutOfBoundsException(EnumerationChoice choice){
		super("Chosen entity "+choice.getEntity().getEntityName()+" of choice "+choice.getClass().getSimpleName()+" does not exist in domain of degree "+DegreeOfFreedomHelper.getDegreeDescription(choice.getDegreeOfFreedom())+" of type "+choice.getDegreeOfFreedom().getClass().getSimpleName());
	}
	
	public ChoiceOutOfBoundsException(EnumerationChoice choice, String location){
		super(location+": Chosen entity "+choice.getEntity().getEntityName()+" of choice "+choice.getClass().getSimpleName()+" does not exist in domain of degree "+DegreeOfFreedomHelper.getDegreeDescription(choice.getDegreeOfFreedom())+" of type "+choice.getDegreeOfFreedom().getClass().getSimpleName());
	}

	public ChoiceOutOfBoundsException(SchedulingPolicyChoice choice,
			String location) {
		super(location+": Chosen entity "+choice.getChosenValue().getLiteral()+" of choice "+choice.getClass().getSimpleName()+" does not exist in domain of degree "+DegreeOfFreedomHelper.getDegreeDescription(choice.getDegreeOfFreedom())+" of type "+choice.getDegreeOfFreedom().getClass().getSimpleName());
	}

}