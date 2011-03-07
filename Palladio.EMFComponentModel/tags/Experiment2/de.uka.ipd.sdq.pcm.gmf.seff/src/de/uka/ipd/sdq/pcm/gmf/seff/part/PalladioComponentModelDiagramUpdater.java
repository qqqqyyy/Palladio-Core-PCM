/*
 * Copyright 2006 SDQ Research Group, University of Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.seff.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.AbstractActionSuccessor_AbstractActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.AquireAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.AquireActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.BranchAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.BranchActionBranchTransitionCompartment2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.BranchActionBranchTransitionCompartmentEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.BranchActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.CollectionIteratorAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.CollectionIteratorActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ExternalCallAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ExternalCallActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ExternalCallActionInputVariableUsage2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ExternalCallActionInputVariableUsageEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ExternalCallActionOutputVariableUsage2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ExternalCallActionOutputVariableUsageEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ForkAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ForkActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ForkActionForkedBehaviours2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ForkActionForkedBehavioursEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.GuardedBranchTransitionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.InternalAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.InternalActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.InternalActionResourceDemand2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.InternalActionResourceDemandEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.LoopAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.LoopActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ParametricResourceDemandEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ProbabilisticBranchTransitionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ReleaseAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ReleaseActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ResourceDemandingBehaviour2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ResourceDemandingBehaviour3EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ResourceDemandingBehaviour4EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ResourceDemandingBehaviour5EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ResourceDemandingBehaviourBehaviourCompartmentEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ResourceDemandingBehaviourBranchCompartment2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ResourceDemandingBehaviourBranchCompartmentEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ResourceDemandingBehaviourEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ResourceDemandingBehaviourLoopCompartment2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ResourceDemandingBehaviourLoopCompartmentEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ResourceDemandingSEFFEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.SetVariableAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.SetVariableActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.SetVariableActionVariableSetter2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.SetVariableActionVariableSetterEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.StartAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.StartActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.StopAction2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.StopActionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableCharacterisation2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableCharacterisation3EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableCharacterisationEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableUsage2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableUsage3EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableUsageEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableUsageVariableCharacterisation2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableUsageVariableCharacterisation3EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableUsageVariableCharacterisationEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.providers.PalladioComponentModelElementTypes;
import de.uka.ipd.sdq.pcm.parameter.VariableCharacterisation;
import de.uka.ipd.sdq.pcm.parameter.VariableUsage;
import de.uka.ipd.sdq.pcm.seff.AbstractAction;
import de.uka.ipd.sdq.pcm.seff.AbstractBranchTransition;
import de.uka.ipd.sdq.pcm.seff.AquireAction;
import de.uka.ipd.sdq.pcm.seff.BranchAction;
import de.uka.ipd.sdq.pcm.seff.CollectionIteratorAction;
import de.uka.ipd.sdq.pcm.seff.ExternalCallAction;
import de.uka.ipd.sdq.pcm.seff.ForkAction;
import de.uka.ipd.sdq.pcm.seff.GuardedBranchTransition;
import de.uka.ipd.sdq.pcm.seff.InternalAction;
import de.uka.ipd.sdq.pcm.seff.LoopAction;
import de.uka.ipd.sdq.pcm.seff.ParametricResourceDemand;
import de.uka.ipd.sdq.pcm.seff.ProbabilisticBranchTransition;
import de.uka.ipd.sdq.pcm.seff.ReleaseAction;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingBehaviour;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingSEFF;
import de.uka.ipd.sdq.pcm.seff.SeffPackage;
import de.uka.ipd.sdq.pcm.seff.SetVariableAction;
import de.uka.ipd.sdq.pcm.seff.StartAction;
import de.uka.ipd.sdq.pcm.seff.StopAction;

/**
 * @generated
 */
public class PalladioComponentModelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (PalladioComponentModelVisualIDRegistry.getVisualID(view)) {
		case LoopActionEditPart.VISUAL_ID:
			return getLoopAction_2004SemanticChildren(view);
		case CollectionIteratorAction2EditPart.VISUAL_ID:
			return getCollectionIteratorAction_2007SemanticChildren(view);
		case LoopAction2EditPart.VISUAL_ID:
			return getLoopAction_3006SemanticChildren(view);
		case ProbabilisticBranchTransitionEditPart.VISUAL_ID:
			return getProbabilisticBranchTransition_3010SemanticChildren(view);
		case CollectionIteratorActionEditPart.VISUAL_ID:
			return getCollectionIteratorAction_3013SemanticChildren(view);
		case GuardedBranchTransitionEditPart.VISUAL_ID:
			return getGuardedBranchTransition_3017SemanticChildren(view);
		case ExternalCallActionInputVariableUsageEditPart.VISUAL_ID:
			return getExternalCallActionInputVariableUsage_7001SemanticChildren(view);
		case ExternalCallActionOutputVariableUsageEditPart.VISUAL_ID:
			return getExternalCallActionOutputVariableUsage_7021SemanticChildren(view);
		case VariableUsageVariableCharacterisationEditPart.VISUAL_ID:
			return getVariableUsageVariableCharacterisation_7002SemanticChildren(view);
		case VariableUsageVariableCharacterisation2EditPart.VISUAL_ID:
			return getVariableUsageVariableCharacterisation_7022SemanticChildren(view);
		case ResourceDemandingBehaviourLoopCompartmentEditPart.VISUAL_ID:
			return getResourceDemandingBehaviourLoopCompartment_7004SemanticChildren(view);
		case InternalActionResourceDemandEditPart.VISUAL_ID:
			return getInternalActionResourceDemand_7006SemanticChildren(view);
		case BranchActionBranchTransitionCompartmentEditPart.VISUAL_ID:
			return getBranchActionBranchTransitionCompartment_7007SemanticChildren(view);
		case ResourceDemandingBehaviourBranchCompartmentEditPart.VISUAL_ID:
			return getResourceDemandingBehaviourBranchCompartment_7009SemanticChildren(view);
		case ExternalCallActionInputVariableUsage2EditPart.VISUAL_ID:
			return getExternalCallActionInputVariableUsage_7010SemanticChildren(view);
		case ExternalCallActionOutputVariableUsage2EditPart.VISUAL_ID:
			return getExternalCallActionOutputVariableUsage_7023SemanticChildren(view);
		case ForkActionForkedBehavioursEditPart.VISUAL_ID:
			return getForkActionForkedBehaviours_7024SemanticChildren(view);
		case ResourceDemandingBehaviourBehaviourCompartmentEditPart.VISUAL_ID:
			return getResourceDemandingBehaviourBehaviourCompartment_7020SemanticChildren(view);
		case ResourceDemandingBehaviourLoopCompartment2EditPart.VISUAL_ID:
			return getResourceDemandingBehaviourLoopCompartment_7014SemanticChildren(view);
		case SetVariableActionVariableSetterEditPart.VISUAL_ID:
			return getSetVariableActionVariableSetter_7025SemanticChildren(view);
		case VariableUsageVariableCharacterisation3EditPart.VISUAL_ID:
			return getVariableUsageVariableCharacterisation_7017SemanticChildren(view);
		case ResourceDemandingBehaviourBranchCompartment2EditPart.VISUAL_ID:
			return getResourceDemandingBehaviourBranchCompartment_7018SemanticChildren(view);
		case BranchActionBranchTransitionCompartment2EditPart.VISUAL_ID:
			return getBranchActionBranchTransitionCompartment_7011SemanticChildren(view);
		case InternalActionResourceDemand2EditPart.VISUAL_ID:
			return getInternalActionResourceDemand_7012SemanticChildren(view);
		case SetVariableActionVariableSetter2EditPart.VISUAL_ID:
			return getSetVariableActionVariableSetter_7016SemanticChildren(view);
		case ForkActionForkedBehaviours2EditPart.VISUAL_ID:
			return getForkActionForkedBehaviours_7019SemanticChildren(view);
		case ResourceDemandingSEFFEditPart.VISUAL_ID:
			return getResourceDemandingSEFF_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLoopAction_2004SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		LoopAction modelElement = (LoopAction) view.getElement();
		List result = new LinkedList();
		{
			ResourceDemandingBehaviour childElement = modelElement
					.getBodyBehaviour_Loop();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ResourceDemandingBehaviourEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCollectionIteratorAction_2007SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CollectionIteratorAction modelElement = (CollectionIteratorAction) view
				.getElement();
		List result = new LinkedList();
		{
			ResourceDemandingBehaviour childElement = modelElement
					.getBodyBehaviour_Loop();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ResourceDemandingBehaviour4EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLoopAction_3006SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		LoopAction modelElement = (LoopAction) view.getElement();
		List result = new LinkedList();
		{
			ResourceDemandingBehaviour childElement = modelElement
					.getBodyBehaviour_Loop();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ResourceDemandingBehaviourEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProbabilisticBranchTransition_3010SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ProbabilisticBranchTransition modelElement = (ProbabilisticBranchTransition) view
				.getElement();
		List result = new LinkedList();
		{
			ResourceDemandingBehaviour childElement = modelElement
					.getBranchBehaviour_BranchTransition();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ResourceDemandingBehaviour2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCollectionIteratorAction_3013SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		CollectionIteratorAction modelElement = (CollectionIteratorAction) view
				.getElement();
		List result = new LinkedList();
		{
			ResourceDemandingBehaviour childElement = modelElement
					.getBodyBehaviour_Loop();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ResourceDemandingBehaviour4EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGuardedBranchTransition_3017SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		GuardedBranchTransition modelElement = (GuardedBranchTransition) view
				.getElement();
		List result = new LinkedList();
		{
			ResourceDemandingBehaviour childElement = modelElement
					.getBranchBehaviour_BranchTransition();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ResourceDemandingBehaviour5EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExternalCallActionInputVariableUsage_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ExternalCallAction modelElement = (ExternalCallAction) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getParameterUsage_ExternalCallAction()
				.iterator(); it.hasNext();) {
			VariableUsage childElement = (VariableUsage) it.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == VariableUsageEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExternalCallActionOutputVariableUsage_7021SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ExternalCallAction modelElement = (ExternalCallAction) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement
				.getOutputVariableUsage_ExternalCallAction().iterator(); it
				.hasNext();) {
			VariableUsage childElement = (VariableUsage) it.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == VariableUsage2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getVariableUsageVariableCharacterisation_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		VariableUsage modelElement = (VariableUsage) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement
				.getVariableCharacterisation_VariableUsage().iterator(); it
				.hasNext();) {
			VariableCharacterisation childElement = (VariableCharacterisation) it
					.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == VariableCharacterisationEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getVariableUsageVariableCharacterisation_7022SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		VariableUsage modelElement = (VariableUsage) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement
				.getVariableCharacterisation_VariableUsage().iterator(); it
				.hasNext();) {
			VariableCharacterisation childElement = (VariableCharacterisation) it
					.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == VariableCharacterisation2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviourLoopCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ResourceDemandingBehaviour modelElement = (ResourceDemandingBehaviour) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getSteps_Behaviour().iterator(); it
				.hasNext();) {
			AbstractAction childElement = (AbstractAction) it.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == StartAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == StopAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == LoopAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == InternalActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == BranchActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ExternalCallAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == CollectionIteratorActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == AquireActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ReleaseActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ForkActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SetVariableActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInternalActionResourceDemand_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		InternalAction modelElement = (InternalAction) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getResourceDemand_Action().iterator(); it
				.hasNext();) {
			ParametricResourceDemand childElement = (ParametricResourceDemand) it
					.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ParametricResourceDemandEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBranchActionBranchTransitionCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		BranchAction modelElement = (BranchAction) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getBranches_Branch().iterator(); it
				.hasNext();) {
			AbstractBranchTransition childElement = (AbstractBranchTransition) it
					.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ProbabilisticBranchTransitionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == GuardedBranchTransitionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviourBranchCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ResourceDemandingBehaviour modelElement = (ResourceDemandingBehaviour) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getSteps_Behaviour().iterator(); it
				.hasNext();) {
			AbstractAction childElement = (AbstractAction) it.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == StartAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == StopAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == LoopAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == InternalActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == BranchActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ExternalCallAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == AquireActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ReleaseActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ForkActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == CollectionIteratorActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SetVariableActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExternalCallActionInputVariableUsage_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ExternalCallAction modelElement = (ExternalCallAction) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getParameterUsage_ExternalCallAction()
				.iterator(); it.hasNext();) {
			VariableUsage childElement = (VariableUsage) it.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == VariableUsageEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExternalCallActionOutputVariableUsage_7023SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ExternalCallAction modelElement = (ExternalCallAction) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement
				.getOutputVariableUsage_ExternalCallAction().iterator(); it
				.hasNext();) {
			VariableUsage childElement = (VariableUsage) it.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == VariableUsage2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForkActionForkedBehaviours_7024SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ForkAction modelElement = (ForkAction) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getForkedBehaviours_Fork().iterator(); it
				.hasNext();) {
			ResourceDemandingBehaviour childElement = (ResourceDemandingBehaviour) it
					.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ResourceDemandingBehaviour3EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviourBehaviourCompartment_7020SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ResourceDemandingBehaviour modelElement = (ResourceDemandingBehaviour) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getSteps_Behaviour().iterator(); it
				.hasNext();) {
			AbstractAction childElement = (AbstractAction) it.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == StartAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == StopAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == LoopAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == InternalActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == BranchActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ExternalCallAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == CollectionIteratorActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == AquireActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ReleaseActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ForkActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviourLoopCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ResourceDemandingBehaviour modelElement = (ResourceDemandingBehaviour) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getSteps_Behaviour().iterator(); it
				.hasNext();) {
			AbstractAction childElement = (AbstractAction) it.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == StartAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == StopAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == LoopAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == InternalActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == BranchActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ExternalCallAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == CollectionIteratorActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == AquireActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ReleaseActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ForkActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSetVariableActionVariableSetter_7025SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SetVariableAction modelElement = (SetVariableAction) containerView
				.getElement();
		List result = new LinkedList();
		{
			VariableUsage childElement = modelElement
					.getVariableUsage_SetVariableAction();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == VariableUsage3EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getVariableUsageVariableCharacterisation_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		VariableUsage modelElement = (VariableUsage) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement
				.getVariableCharacterisation_VariableUsage().iterator(); it
				.hasNext();) {
			VariableCharacterisation childElement = (VariableCharacterisation) it
					.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == VariableCharacterisation3EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviourBranchCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ResourceDemandingBehaviour modelElement = (ResourceDemandingBehaviour) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getSteps_Behaviour().iterator(); it
				.hasNext();) {
			AbstractAction childElement = (AbstractAction) it.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == StartAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == StopAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == LoopAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == InternalActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == BranchActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ExternalCallAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == AquireActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ReleaseActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ForkActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == CollectionIteratorActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SetVariableActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBranchActionBranchTransitionCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		BranchAction modelElement = (BranchAction) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getBranches_Branch().iterator(); it
				.hasNext();) {
			AbstractBranchTransition childElement = (AbstractBranchTransition) it
					.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ProbabilisticBranchTransitionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == GuardedBranchTransitionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInternalActionResourceDemand_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		InternalAction modelElement = (InternalAction) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getResourceDemand_Action().iterator(); it
				.hasNext();) {
			ParametricResourceDemand childElement = (ParametricResourceDemand) it
					.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ParametricResourceDemandEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSetVariableActionVariableSetter_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		SetVariableAction modelElement = (SetVariableAction) containerView
				.getElement();
		List result = new LinkedList();
		{
			VariableUsage childElement = modelElement
					.getVariableUsage_SetVariableAction();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == VariableUsage3EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForkActionForkedBehaviours_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ForkAction modelElement = (ForkAction) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getForkedBehaviours_Fork().iterator(); it
				.hasNext();) {
			ResourceDemandingBehaviour childElement = (ResourceDemandingBehaviour) it
					.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == ResourceDemandingBehaviour3EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingSEFF_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		ResourceDemandingSEFF modelElement = (ResourceDemandingSEFF) view
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getSteps_Behaviour().iterator(); it
				.hasNext();) {
			AbstractAction childElement = (AbstractAction) it.next();
			int visualID = PalladioComponentModelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == StartActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == StopActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ExternalCallActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == LoopActionEditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == BranchAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == InternalAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == CollectionIteratorAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == SetVariableAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == AquireAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ReleaseAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == ForkAction2EditPart.VISUAL_ID) {
				result.add(new PalladioComponentModelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (PalladioComponentModelVisualIDRegistry.getVisualID(view)) {
		case ResourceDemandingSEFFEditPart.VISUAL_ID:
			return getResourceDemandingSEFF_1000ContainedLinks(view);
		case StartActionEditPart.VISUAL_ID:
			return getStartAction_2001ContainedLinks(view);
		case StopActionEditPart.VISUAL_ID:
			return getStopAction_2002ContainedLinks(view);
		case ExternalCallActionEditPart.VISUAL_ID:
			return getExternalCallAction_2003ContainedLinks(view);
		case LoopActionEditPart.VISUAL_ID:
			return getLoopAction_2004ContainedLinks(view);
		case BranchAction2EditPart.VISUAL_ID:
			return getBranchAction_2005ContainedLinks(view);
		case InternalAction2EditPart.VISUAL_ID:
			return getInternalAction_2006ContainedLinks(view);
		case CollectionIteratorAction2EditPart.VISUAL_ID:
			return getCollectionIteratorAction_2007ContainedLinks(view);
		case SetVariableAction2EditPart.VISUAL_ID:
			return getSetVariableAction_2008ContainedLinks(view);
		case AquireAction2EditPart.VISUAL_ID:
			return getAquireAction_2009ContainedLinks(view);
		case ReleaseAction2EditPart.VISUAL_ID:
			return getReleaseAction_2010ContainedLinks(view);
		case ForkAction2EditPart.VISUAL_ID:
			return getForkAction_2011ContainedLinks(view);
		case VariableUsageEditPart.VISUAL_ID:
			return getVariableUsage_3001ContainedLinks(view);
		case VariableCharacterisationEditPart.VISUAL_ID:
			return getVariableCharacterisation_3002ContainedLinks(view);
		case VariableUsage2EditPart.VISUAL_ID:
			return getVariableUsage_3022ContainedLinks(view);
		case VariableCharacterisation2EditPart.VISUAL_ID:
			return getVariableCharacterisation_3016ContainedLinks(view);
		case ResourceDemandingBehaviourEditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3003ContainedLinks(view);
		case StartAction2EditPart.VISUAL_ID:
			return getStartAction_3004ContainedLinks(view);
		case StopAction2EditPart.VISUAL_ID:
			return getStopAction_3005ContainedLinks(view);
		case LoopAction2EditPart.VISUAL_ID:
			return getLoopAction_3006ContainedLinks(view);
		case InternalActionEditPart.VISUAL_ID:
			return getInternalAction_3007ContainedLinks(view);
		case ParametricResourceDemandEditPart.VISUAL_ID:
			return getParametricResourceDemand_3008ContainedLinks(view);
		case BranchActionEditPart.VISUAL_ID:
			return getBranchAction_3009ContainedLinks(view);
		case ProbabilisticBranchTransitionEditPart.VISUAL_ID:
			return getProbabilisticBranchTransition_3010ContainedLinks(view);
		case ResourceDemandingBehaviour2EditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3011ContainedLinks(view);
		case ExternalCallAction2EditPart.VISUAL_ID:
			return getExternalCallAction_3012ContainedLinks(view);
		case AquireActionEditPart.VISUAL_ID:
			return getAquireAction_3019ContainedLinks(view);
		case ReleaseActionEditPart.VISUAL_ID:
			return getReleaseAction_3020ContainedLinks(view);
		case ForkActionEditPart.VISUAL_ID:
			return getForkAction_3023ContainedLinks(view);
		case ResourceDemandingBehaviour3EditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3021ContainedLinks(view);
		case CollectionIteratorActionEditPart.VISUAL_ID:
			return getCollectionIteratorAction_3013ContainedLinks(view);
		case ResourceDemandingBehaviour4EditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3014ContainedLinks(view);
		case SetVariableActionEditPart.VISUAL_ID:
			return getSetVariableAction_3024ContainedLinks(view);
		case VariableUsage3EditPart.VISUAL_ID:
			return getVariableUsage_3015ContainedLinks(view);
		case VariableCharacterisation3EditPart.VISUAL_ID:
			return getVariableCharacterisation_3025ContainedLinks(view);
		case GuardedBranchTransitionEditPart.VISUAL_ID:
			return getGuardedBranchTransition_3017ContainedLinks(view);
		case ResourceDemandingBehaviour5EditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3018ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (PalladioComponentModelVisualIDRegistry.getVisualID(view)) {
		case StartActionEditPart.VISUAL_ID:
			return getStartAction_2001IncomingLinks(view);
		case StopActionEditPart.VISUAL_ID:
			return getStopAction_2002IncomingLinks(view);
		case ExternalCallActionEditPart.VISUAL_ID:
			return getExternalCallAction_2003IncomingLinks(view);
		case LoopActionEditPart.VISUAL_ID:
			return getLoopAction_2004IncomingLinks(view);
		case BranchAction2EditPart.VISUAL_ID:
			return getBranchAction_2005IncomingLinks(view);
		case InternalAction2EditPart.VISUAL_ID:
			return getInternalAction_2006IncomingLinks(view);
		case CollectionIteratorAction2EditPart.VISUAL_ID:
			return getCollectionIteratorAction_2007IncomingLinks(view);
		case SetVariableAction2EditPart.VISUAL_ID:
			return getSetVariableAction_2008IncomingLinks(view);
		case AquireAction2EditPart.VISUAL_ID:
			return getAquireAction_2009IncomingLinks(view);
		case ReleaseAction2EditPart.VISUAL_ID:
			return getReleaseAction_2010IncomingLinks(view);
		case ForkAction2EditPart.VISUAL_ID:
			return getForkAction_2011IncomingLinks(view);
		case VariableUsageEditPart.VISUAL_ID:
			return getVariableUsage_3001IncomingLinks(view);
		case VariableCharacterisationEditPart.VISUAL_ID:
			return getVariableCharacterisation_3002IncomingLinks(view);
		case VariableUsage2EditPart.VISUAL_ID:
			return getVariableUsage_3022IncomingLinks(view);
		case VariableCharacterisation2EditPart.VISUAL_ID:
			return getVariableCharacterisation_3016IncomingLinks(view);
		case ResourceDemandingBehaviourEditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3003IncomingLinks(view);
		case StartAction2EditPart.VISUAL_ID:
			return getStartAction_3004IncomingLinks(view);
		case StopAction2EditPart.VISUAL_ID:
			return getStopAction_3005IncomingLinks(view);
		case LoopAction2EditPart.VISUAL_ID:
			return getLoopAction_3006IncomingLinks(view);
		case InternalActionEditPart.VISUAL_ID:
			return getInternalAction_3007IncomingLinks(view);
		case ParametricResourceDemandEditPart.VISUAL_ID:
			return getParametricResourceDemand_3008IncomingLinks(view);
		case BranchActionEditPart.VISUAL_ID:
			return getBranchAction_3009IncomingLinks(view);
		case ProbabilisticBranchTransitionEditPart.VISUAL_ID:
			return getProbabilisticBranchTransition_3010IncomingLinks(view);
		case ResourceDemandingBehaviour2EditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3011IncomingLinks(view);
		case ExternalCallAction2EditPart.VISUAL_ID:
			return getExternalCallAction_3012IncomingLinks(view);
		case AquireActionEditPart.VISUAL_ID:
			return getAquireAction_3019IncomingLinks(view);
		case ReleaseActionEditPart.VISUAL_ID:
			return getReleaseAction_3020IncomingLinks(view);
		case ForkActionEditPart.VISUAL_ID:
			return getForkAction_3023IncomingLinks(view);
		case ResourceDemandingBehaviour3EditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3021IncomingLinks(view);
		case CollectionIteratorActionEditPart.VISUAL_ID:
			return getCollectionIteratorAction_3013IncomingLinks(view);
		case ResourceDemandingBehaviour4EditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3014IncomingLinks(view);
		case SetVariableActionEditPart.VISUAL_ID:
			return getSetVariableAction_3024IncomingLinks(view);
		case VariableUsage3EditPart.VISUAL_ID:
			return getVariableUsage_3015IncomingLinks(view);
		case VariableCharacterisation3EditPart.VISUAL_ID:
			return getVariableCharacterisation_3025IncomingLinks(view);
		case GuardedBranchTransitionEditPart.VISUAL_ID:
			return getGuardedBranchTransition_3017IncomingLinks(view);
		case ResourceDemandingBehaviour5EditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3018IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (PalladioComponentModelVisualIDRegistry.getVisualID(view)) {
		case StartActionEditPart.VISUAL_ID:
			return getStartAction_2001OutgoingLinks(view);
		case StopActionEditPart.VISUAL_ID:
			return getStopAction_2002OutgoingLinks(view);
		case ExternalCallActionEditPart.VISUAL_ID:
			return getExternalCallAction_2003OutgoingLinks(view);
		case LoopActionEditPart.VISUAL_ID:
			return getLoopAction_2004OutgoingLinks(view);
		case BranchAction2EditPart.VISUAL_ID:
			return getBranchAction_2005OutgoingLinks(view);
		case InternalAction2EditPart.VISUAL_ID:
			return getInternalAction_2006OutgoingLinks(view);
		case CollectionIteratorAction2EditPart.VISUAL_ID:
			return getCollectionIteratorAction_2007OutgoingLinks(view);
		case SetVariableAction2EditPart.VISUAL_ID:
			return getSetVariableAction_2008OutgoingLinks(view);
		case AquireAction2EditPart.VISUAL_ID:
			return getAquireAction_2009OutgoingLinks(view);
		case ReleaseAction2EditPart.VISUAL_ID:
			return getReleaseAction_2010OutgoingLinks(view);
		case ForkAction2EditPart.VISUAL_ID:
			return getForkAction_2011OutgoingLinks(view);
		case VariableUsageEditPart.VISUAL_ID:
			return getVariableUsage_3001OutgoingLinks(view);
		case VariableCharacterisationEditPart.VISUAL_ID:
			return getVariableCharacterisation_3002OutgoingLinks(view);
		case VariableUsage2EditPart.VISUAL_ID:
			return getVariableUsage_3022OutgoingLinks(view);
		case VariableCharacterisation2EditPart.VISUAL_ID:
			return getVariableCharacterisation_3016OutgoingLinks(view);
		case ResourceDemandingBehaviourEditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3003OutgoingLinks(view);
		case StartAction2EditPart.VISUAL_ID:
			return getStartAction_3004OutgoingLinks(view);
		case StopAction2EditPart.VISUAL_ID:
			return getStopAction_3005OutgoingLinks(view);
		case LoopAction2EditPart.VISUAL_ID:
			return getLoopAction_3006OutgoingLinks(view);
		case InternalActionEditPart.VISUAL_ID:
			return getInternalAction_3007OutgoingLinks(view);
		case ParametricResourceDemandEditPart.VISUAL_ID:
			return getParametricResourceDemand_3008OutgoingLinks(view);
		case BranchActionEditPart.VISUAL_ID:
			return getBranchAction_3009OutgoingLinks(view);
		case ProbabilisticBranchTransitionEditPart.VISUAL_ID:
			return getProbabilisticBranchTransition_3010OutgoingLinks(view);
		case ResourceDemandingBehaviour2EditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3011OutgoingLinks(view);
		case ExternalCallAction2EditPart.VISUAL_ID:
			return getExternalCallAction_3012OutgoingLinks(view);
		case AquireActionEditPart.VISUAL_ID:
			return getAquireAction_3019OutgoingLinks(view);
		case ReleaseActionEditPart.VISUAL_ID:
			return getReleaseAction_3020OutgoingLinks(view);
		case ForkActionEditPart.VISUAL_ID:
			return getForkAction_3023OutgoingLinks(view);
		case ResourceDemandingBehaviour3EditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3021OutgoingLinks(view);
		case CollectionIteratorActionEditPart.VISUAL_ID:
			return getCollectionIteratorAction_3013OutgoingLinks(view);
		case ResourceDemandingBehaviour4EditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3014OutgoingLinks(view);
		case SetVariableActionEditPart.VISUAL_ID:
			return getSetVariableAction_3024OutgoingLinks(view);
		case VariableUsage3EditPart.VISUAL_ID:
			return getVariableUsage_3015OutgoingLinks(view);
		case VariableCharacterisation3EditPart.VISUAL_ID:
			return getVariableCharacterisation_3025OutgoingLinks(view);
		case GuardedBranchTransitionEditPart.VISUAL_ID:
			return getGuardedBranchTransition_3017OutgoingLinks(view);
		case ResourceDemandingBehaviour5EditPart.VISUAL_ID:
			return getResourceDemandingBehaviour_3018OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingSEFF_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStartAction_2001ContainedLinks(View view) {
		StartAction modelElement = (StartAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStopAction_2002ContainedLinks(View view) {
		StopAction modelElement = (StopAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExternalCallAction_2003ContainedLinks(View view) {
		ExternalCallAction modelElement = (ExternalCallAction) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLoopAction_2004ContainedLinks(View view) {
		LoopAction modelElement = (LoopAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBranchAction_2005ContainedLinks(View view) {
		BranchAction modelElement = (BranchAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInternalAction_2006ContainedLinks(View view) {
		InternalAction modelElement = (InternalAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCollectionIteratorAction_2007ContainedLinks(View view) {
		CollectionIteratorAction modelElement = (CollectionIteratorAction) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSetVariableAction_2008ContainedLinks(View view) {
		SetVariableAction modelElement = (SetVariableAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAquireAction_2009ContainedLinks(View view) {
		AquireAction modelElement = (AquireAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReleaseAction_2010ContainedLinks(View view) {
		ReleaseAction modelElement = (ReleaseAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForkAction_2011ContainedLinks(View view) {
		ForkAction modelElement = (ForkAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getVariableUsage_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariableCharacterisation_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariableUsage_3022ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariableCharacterisation_3016ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviour_3003ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStartAction_3004ContainedLinks(View view) {
		StartAction modelElement = (StartAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStopAction_3005ContainedLinks(View view) {
		StopAction modelElement = (StopAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLoopAction_3006ContainedLinks(View view) {
		LoopAction modelElement = (LoopAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInternalAction_3007ContainedLinks(View view) {
		InternalAction modelElement = (InternalAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getParametricResourceDemand_3008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBranchAction_3009ContainedLinks(View view) {
		BranchAction modelElement = (BranchAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProbabilisticBranchTransition_3010ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviour_3011ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExternalCallAction_3012ContainedLinks(View view) {
		ExternalCallAction modelElement = (ExternalCallAction) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAquireAction_3019ContainedLinks(View view) {
		AquireAction modelElement = (AquireAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReleaseAction_3020ContainedLinks(View view) {
		ReleaseAction modelElement = (ReleaseAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForkAction_3023ContainedLinks(View view) {
		ForkAction modelElement = (ForkAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviour_3021ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCollectionIteratorAction_3013ContainedLinks(View view) {
		CollectionIteratorAction modelElement = (CollectionIteratorAction) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviour_3014ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSetVariableAction_3024ContainedLinks(View view) {
		SetVariableAction modelElement = (SetVariableAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getVariableUsage_3015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariableCharacterisation_3025ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGuardedBranchTransition_3017ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviour_3018ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStartAction_2001IncomingLinks(View view) {
		StartAction modelElement = (StartAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStopAction_2002IncomingLinks(View view) {
		StopAction modelElement = (StopAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExternalCallAction_2003IncomingLinks(View view) {
		ExternalCallAction modelElement = (ExternalCallAction) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLoopAction_2004IncomingLinks(View view) {
		LoopAction modelElement = (LoopAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBranchAction_2005IncomingLinks(View view) {
		BranchAction modelElement = (BranchAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInternalAction_2006IncomingLinks(View view) {
		InternalAction modelElement = (InternalAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCollectionIteratorAction_2007IncomingLinks(View view) {
		CollectionIteratorAction modelElement = (CollectionIteratorAction) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSetVariableAction_2008IncomingLinks(View view) {
		SetVariableAction modelElement = (SetVariableAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAquireAction_2009IncomingLinks(View view) {
		AquireAction modelElement = (AquireAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReleaseAction_2010IncomingLinks(View view) {
		ReleaseAction modelElement = (ReleaseAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForkAction_2011IncomingLinks(View view) {
		ForkAction modelElement = (ForkAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getVariableUsage_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariableCharacterisation_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariableUsage_3022IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariableCharacterisation_3016IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviour_3003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStartAction_3004IncomingLinks(View view) {
		StartAction modelElement = (StartAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStopAction_3005IncomingLinks(View view) {
		StopAction modelElement = (StopAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLoopAction_3006IncomingLinks(View view) {
		LoopAction modelElement = (LoopAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInternalAction_3007IncomingLinks(View view) {
		InternalAction modelElement = (InternalAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getParametricResourceDemand_3008IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBranchAction_3009IncomingLinks(View view) {
		BranchAction modelElement = (BranchAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProbabilisticBranchTransition_3010IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviour_3011IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExternalCallAction_3012IncomingLinks(View view) {
		ExternalCallAction modelElement = (ExternalCallAction) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAquireAction_3019IncomingLinks(View view) {
		AquireAction modelElement = (AquireAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReleaseAction_3020IncomingLinks(View view) {
		ReleaseAction modelElement = (ReleaseAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForkAction_3023IncomingLinks(View view) {
		ForkAction modelElement = (ForkAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviour_3021IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCollectionIteratorAction_3013IncomingLinks(View view) {
		CollectionIteratorAction modelElement = (CollectionIteratorAction) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviour_3014IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSetVariableAction_3024IncomingLinks(View view) {
		SetVariableAction modelElement = (SetVariableAction) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getVariableUsage_3015IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariableCharacterisation_3025IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGuardedBranchTransition_3017IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviour_3018IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStartAction_2001OutgoingLinks(View view) {
		StartAction modelElement = (StartAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStopAction_2002OutgoingLinks(View view) {
		StopAction modelElement = (StopAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getExternalCallAction_2003OutgoingLinks(View view) {
		ExternalCallAction modelElement = (ExternalCallAction) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLoopAction_2004OutgoingLinks(View view) {
		LoopAction modelElement = (LoopAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getBranchAction_2005OutgoingLinks(View view) {
		BranchAction modelElement = (BranchAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInternalAction_2006OutgoingLinks(View view) {
		InternalAction modelElement = (InternalAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCollectionIteratorAction_2007OutgoingLinks(View view) {
		CollectionIteratorAction modelElement = (CollectionIteratorAction) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSetVariableAction_2008OutgoingLinks(View view) {
		SetVariableAction modelElement = (SetVariableAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAquireAction_2009OutgoingLinks(View view) {
		AquireAction modelElement = (AquireAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReleaseAction_2010OutgoingLinks(View view) {
		ReleaseAction modelElement = (ReleaseAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForkAction_2011OutgoingLinks(View view) {
		ForkAction modelElement = (ForkAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getVariableUsage_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariableCharacterisation_3002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariableUsage_3022OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariableCharacterisation_3016OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviour_3003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getStartAction_3004OutgoingLinks(View view) {
		StartAction modelElement = (StartAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getStopAction_3005OutgoingLinks(View view) {
		StopAction modelElement = (StopAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLoopAction_3006OutgoingLinks(View view) {
		LoopAction modelElement = (LoopAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getInternalAction_3007OutgoingLinks(View view) {
		InternalAction modelElement = (InternalAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getParametricResourceDemand_3008OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBranchAction_3009OutgoingLinks(View view) {
		BranchAction modelElement = (BranchAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getProbabilisticBranchTransition_3010OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviour_3011OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getExternalCallAction_3012OutgoingLinks(View view) {
		ExternalCallAction modelElement = (ExternalCallAction) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAquireAction_3019OutgoingLinks(View view) {
		AquireAction modelElement = (AquireAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getReleaseAction_3020OutgoingLinks(View view) {
		ReleaseAction modelElement = (ReleaseAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getForkAction_3023OutgoingLinks(View view) {
		ForkAction modelElement = (ForkAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviour_3021OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCollectionIteratorAction_3013OutgoingLinks(View view) {
		CollectionIteratorAction modelElement = (CollectionIteratorAction) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviour_3014OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSetVariableAction_3024OutgoingLinks(View view) {
		SetVariableAction modelElement = (SetVariableAction) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getVariableUsage_3015OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getVariableCharacterisation_3025OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGuardedBranchTransition_3017OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResourceDemandingBehaviour_3018OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
			AbstractAction target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == SeffPackage.eINSTANCE
					.getAbstractAction_Successor_AbstractAction()) {
				result
						.add(new PalladioComponentModelLinkDescriptor(
								setting.getEObject(),
								target,
								PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001,
								AbstractActionSuccessor_AbstractActionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_AbstractAction_Successor_AbstractAction_4001(
			AbstractAction source) {
		Collection result = new LinkedList();
		AbstractAction destination = source.getSuccessor_AbstractAction();
		result
				.add(new PalladioComponentModelLinkDescriptor(
						source,
						destination,
						PalladioComponentModelElementTypes.AbstractActionSuccessor_AbstractAction_4001,
						AbstractActionSuccessor_AbstractActionEditPart.VISUAL_ID));
		return result;
	}

}