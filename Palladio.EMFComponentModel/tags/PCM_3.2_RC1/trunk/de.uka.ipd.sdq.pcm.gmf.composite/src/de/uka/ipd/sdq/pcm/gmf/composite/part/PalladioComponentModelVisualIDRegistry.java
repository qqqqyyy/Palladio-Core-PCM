/*
 *Copyright 2007, SDQ, IPD, Uni Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.composite.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import de.uka.ipd.sdq.pcm.core.composition.CompositionPackage;
import de.uka.ipd.sdq.pcm.core.entity.ComposedProvidingRequiringEntity;
import de.uka.ipd.sdq.pcm.core.entity.EntityPackage;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.AssemblyConnectorEditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.AssemblyContextEditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.AssemblyContextEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.AssemblyEventConnectorEditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.ComposedProvidingRequiringEntity2EditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.ComposedProvidingRequiringEntityCompositeStructureInnerCompartmentEditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.ComposedProvidingRequiringEntityEditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.ComposedProvidingRequiringEntityEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.OperationProvidedRole2EditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.OperationProvidedRoleEditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.OperationProvidedRoleEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.OperationProvidedRoleEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.OperationRequiredRole2EditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.OperationRequiredRoleEditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.OperationRequiredRoleEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.OperationRequiredRoleEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.ProvidedDelegationConnectorEditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.RequiredDelegationConnectorEditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.SinkRoleEditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.SinkRoleEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.SourceRoleEditPart;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.parts.SourceRoleEntityNameEditPart;
import de.uka.ipd.sdq.pcm.repository.RepositoryPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented 
 * by a domain model object.
 *
 * @generated
 */
public class PalladioComponentModelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "de.uka.ipd.sdq.pcm.gmf.composite/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ComposedProvidingRequiringEntityEditPart.MODEL_ID.equals(view
					.getType())) {
				return ComposedProvidingRequiringEntityEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return de.uka.ipd.sdq.pcm.gmf.composite.part.PalladioComponentModelVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				PalladioComponentModelComposedStructureDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (EntityPackage.eINSTANCE.getComposedProvidingRequiringEntity()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ComposedProvidingRequiringEntity) domainElement)) {
			return ComposedProvidingRequiringEntityEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = de.uka.ipd.sdq.pcm.gmf.composite.part.PalladioComponentModelVisualIDRegistry
				.getModelID(containerView);
		if (!ComposedProvidingRequiringEntityEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ComposedProvidingRequiringEntityEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uka.ipd.sdq.pcm.gmf.composite.part.PalladioComponentModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComposedProvidingRequiringEntityEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ComposedProvidingRequiringEntity2EditPart.VISUAL_ID:
			if (RepositoryPackage.eINSTANCE.getOperationProvidedRole()
					.isSuperTypeOf(domainElement.eClass())) {
				return OperationProvidedRole2EditPart.VISUAL_ID;
			}
			if (RepositoryPackage.eINSTANCE.getOperationRequiredRole()
					.isSuperTypeOf(domainElement.eClass())) {
				return OperationRequiredRole2EditPart.VISUAL_ID;
			}
			break;
		case AssemblyContextEditPart.VISUAL_ID:
			if (RepositoryPackage.eINSTANCE.getOperationProvidedRole()
					.isSuperTypeOf(domainElement.eClass())) {
				return OperationProvidedRoleEditPart.VISUAL_ID;
			}
			if (RepositoryPackage.eINSTANCE.getOperationRequiredRole()
					.isSuperTypeOf(domainElement.eClass())) {
				return OperationRequiredRoleEditPart.VISUAL_ID;
			}
			if (RepositoryPackage.eINSTANCE.getSourceRole().isSuperTypeOf(
					domainElement.eClass())) {
				return SourceRoleEditPart.VISUAL_ID;
			}
			if (RepositoryPackage.eINSTANCE.getSinkRole().isSuperTypeOf(
					domainElement.eClass())) {
				return SinkRoleEditPart.VISUAL_ID;
			}
			break;
		case ComposedProvidingRequiringEntityCompositeStructureInnerCompartmentEditPart.VISUAL_ID:
			if (CompositionPackage.eINSTANCE.getAssemblyContext()
					.isSuperTypeOf(domainElement.eClass())) {
				return AssemblyContextEditPart.VISUAL_ID;
			}
			break;
		case ComposedProvidingRequiringEntityEditPart.VISUAL_ID:
			if (EntityPackage.eINSTANCE.getComposedProvidingRequiringEntity()
					.isSuperTypeOf(domainElement.eClass())) {
				return ComposedProvidingRequiringEntity2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = de.uka.ipd.sdq.pcm.gmf.composite.part.PalladioComponentModelVisualIDRegistry
				.getModelID(containerView);
		if (!ComposedProvidingRequiringEntityEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ComposedProvidingRequiringEntityEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = de.uka.ipd.sdq.pcm.gmf.composite.part.PalladioComponentModelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ComposedProvidingRequiringEntityEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ComposedProvidingRequiringEntity2EditPart.VISUAL_ID:
			if (ComposedProvidingRequiringEntityEntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComposedProvidingRequiringEntityCompositeStructureInnerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperationProvidedRole2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperationRequiredRole2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AssemblyContextEditPart.VISUAL_ID:
			if (AssemblyContextEntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperationProvidedRoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OperationRequiredRoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SourceRoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SinkRoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperationProvidedRoleEditPart.VISUAL_ID:
			if (OperationProvidedRoleEntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperationRequiredRoleEditPart.VISUAL_ID:
			if (OperationRequiredRoleEntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SourceRoleEditPart.VISUAL_ID:
			if (SourceRoleEntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SinkRoleEditPart.VISUAL_ID:
			if (SinkRoleEntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperationProvidedRole2EditPart.VISUAL_ID:
			if (OperationProvidedRoleEntityName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperationRequiredRole2EditPart.VISUAL_ID:
			if (OperationRequiredRoleEntityName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComposedProvidingRequiringEntityCompositeStructureInnerCompartmentEditPart.VISUAL_ID:
			if (AssemblyContextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComposedProvidingRequiringEntityEditPart.VISUAL_ID:
			if (ComposedProvidingRequiringEntity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CompositionPackage.eINSTANCE.getAssemblyConnector().isSuperTypeOf(
				domainElement.eClass())) {
			return AssemblyConnectorEditPart.VISUAL_ID;
		}
		if (CompositionPackage.eINSTANCE.getAssemblyEventConnector()
				.isSuperTypeOf(domainElement.eClass())) {
			return AssemblyEventConnectorEditPart.VISUAL_ID;
		}
		if (CompositionPackage.eINSTANCE.getRequiredDelegationConnector()
				.isSuperTypeOf(domainElement.eClass())) {
			return RequiredDelegationConnectorEditPart.VISUAL_ID;
		}
		if (CompositionPackage.eINSTANCE.getProvidedDelegationConnector()
				.isSuperTypeOf(domainElement.eClass())) {
			return ProvidedDelegationConnectorEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ComposedProvidingRequiringEntity element) {
		return true;
	}
}
