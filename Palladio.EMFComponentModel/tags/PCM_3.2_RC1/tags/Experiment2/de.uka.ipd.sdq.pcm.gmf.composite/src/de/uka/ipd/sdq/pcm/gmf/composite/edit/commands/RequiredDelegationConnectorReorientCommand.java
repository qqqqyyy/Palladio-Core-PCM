/*
 * Copyright 2007, SDQ, IPD, Uni Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.composite.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import de.uka.ipd.sdq.pcm.core.composition.ComposedStructure;
import de.uka.ipd.sdq.pcm.core.composition.RequiredDelegationConnector;
import de.uka.ipd.sdq.pcm.gmf.composite.edit.policies.PalladioComponentModelBaseItemSemanticEditPolicy;
import de.uka.ipd.sdq.pcm.repository.RequiredRole;

/**
 * @generated
 */
public class RequiredDelegationConnectorReorientCommand extends
		EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public RequiredDelegationConnectorReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (!(getElementToEdit() instanceof RequiredDelegationConnector)) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof RequiredRole && newEnd instanceof RequiredRole)) {
			return false;
		}
		RequiredRole target = getLink()
				.getOuterRequiredRole_RequiredDelegationConnector();
		if (!(getLink().eContainer() instanceof ComposedStructure)) {
			return false;
		}
		ComposedStructure container = (ComposedStructure) getLink()
				.eContainer();
		return PalladioComponentModelBaseItemSemanticEditPolicy.LinkConstraints
				.canExistRequiredDelegationConnector_4002(container,
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof RequiredRole && newEnd instanceof RequiredRole)) {
			return false;
		}
		RequiredRole source = getLink()
				.getInnerRequiredRole_RequiredDelegationConnector();
		if (!(getLink().eContainer() instanceof ComposedStructure)) {
			return false;
		}
		ComposedStructure container = (ComposedStructure) getLink()
				.eContainer();
		return PalladioComponentModelBaseItemSemanticEditPolicy.LinkConstraints
				.canExistRequiredDelegationConnector_4002(container, source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setInnerRequiredRole_RequiredDelegationConnector(
				getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setOuterRequiredRole_RequiredDelegationConnector(
				getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected RequiredDelegationConnector getLink() {
		return (RequiredDelegationConnector) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected RequiredRole getOldSource() {
		return (RequiredRole) oldEnd;
	}

	/**
	 * @generated
	 */
	protected RequiredRole getNewSource() {
		return (RequiredRole) newEnd;
	}

	/**
	 * @generated
	 */
	protected RequiredRole getOldTarget() {
		return (RequiredRole) oldEnd;
	}

	/**
	 * @generated
	 */
	protected RequiredRole getNewTarget() {
		return (RequiredRole) newEnd;
	}
}