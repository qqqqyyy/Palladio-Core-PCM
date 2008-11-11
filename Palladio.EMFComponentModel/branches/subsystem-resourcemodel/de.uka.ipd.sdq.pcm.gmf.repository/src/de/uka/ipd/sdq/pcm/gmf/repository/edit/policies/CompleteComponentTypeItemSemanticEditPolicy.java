/*
 * Copyright 2007, IPD, SDQ, University of Karlsruhe
 */
package de.uka.ipd.sdq.pcm.gmf.repository.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

import de.uka.ipd.sdq.pcm.gmf.repository.edit.commands.CompleteComponentTypeParentProvidesComponentTypesCreateCommand;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.commands.CompleteComponentTypeParentProvidesComponentTypesReorientCommand;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.commands.ImplementationComponentTypeParentCompleteComponentTypesCreateCommand;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.commands.ImplementationComponentTypeParentCompleteComponentTypesReorientCommand;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.commands.ProvidedRoleCreateCommand;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.commands.ProvidedRoleReorientCommand;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.commands.RequiredRoleCreateCommand;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.commands.RequiredRoleReorientCommand;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.commands.ResourceRequiredRoleCreateCommand;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.commands.ResourceRequiredRoleReorientCommand;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.parts.CompleteComponentTypeParentProvidesComponentTypesEditPart;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.parts.ImplementationComponentTypeParentCompleteComponentTypesEditPart;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.parts.ProvidedRoleEditPart;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.parts.RequiredRoleEditPart;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.parts.ResourceRequiredRoleEditPart;
import de.uka.ipd.sdq.pcm.gmf.repository.providers.PalladioComponentModelElementTypes;

/**
 * @generated
 */
public class CompleteComponentTypeItemSemanticEditPolicy extends
		PalladioComponentModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyShortcutsCommand(cc);
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			req.setElementToDestroy(view);
		}
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (PalladioComponentModelElementTypes.ProvidedRole_4101 == req
				.getElementType()) {
			return getGEFWrapper(new ProvidedRoleCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (PalladioComponentModelElementTypes.RequiredRole_4102 == req
				.getElementType()) {
			return getGEFWrapper(new RequiredRoleCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (PalladioComponentModelElementTypes.ImplementationComponentTypeParentCompleteComponentTypes_4103 == req
				.getElementType()) {
			return null;
		}
		if (PalladioComponentModelElementTypes.CompleteComponentTypeParentProvidesComponentTypes_4104 == req
				.getElementType()) {
			return getGEFWrapper(new CompleteComponentTypeParentProvidesComponentTypesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (PalladioComponentModelElementTypes.ResourceRequiredRole_4106 == req
				.getElementType()) {
			return getGEFWrapper(new ResourceRequiredRoleCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (PalladioComponentModelElementTypes.ProvidedRole_4101 == req
				.getElementType()) {
			return null;
		}
		if (PalladioComponentModelElementTypes.RequiredRole_4102 == req
				.getElementType()) {
			return null;
		}
		if (PalladioComponentModelElementTypes.ImplementationComponentTypeParentCompleteComponentTypes_4103 == req
				.getElementType()) {
			return getGEFWrapper(new ImplementationComponentTypeParentCompleteComponentTypesCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (PalladioComponentModelElementTypes.CompleteComponentTypeParentProvidesComponentTypes_4104 == req
				.getElementType()) {
			return null;
		}
		if (PalladioComponentModelElementTypes.ResourceRequiredRole_4106 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ProvidedRoleEditPart.VISUAL_ID:
			return getGEFWrapper(new ProvidedRoleReorientCommand(req));
		case RequiredRoleEditPart.VISUAL_ID:
			return getGEFWrapper(new RequiredRoleReorientCommand(req));
		case ResourceRequiredRoleEditPart.VISUAL_ID:
			return getGEFWrapper(new ResourceRequiredRoleReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ImplementationComponentTypeParentCompleteComponentTypesEditPart.VISUAL_ID:
			return getGEFWrapper(new ImplementationComponentTypeParentCompleteComponentTypesReorientCommand(
					req));
		case CompleteComponentTypeParentProvidesComponentTypesEditPart.VISUAL_ID:
			return getGEFWrapper(new CompleteComponentTypeParentProvidesComponentTypesReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
