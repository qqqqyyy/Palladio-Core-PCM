/*
 * Copyright 2007, SDQ, IPD, U KA
 */
package de.uka.ipd.sdq.pcm.gmf.allocation.part;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import de.uka.ipd.sdq.pcm.gmf.allocation.edit.parts.AllocationEditPart;

/**
 * @generated
 */
public class PalladioComponentModelInitDiagramFileAction implements
		IObjectActionDelegate {

	/**
	 * @generated
	 */
	private IWorkbenchPart targetPart;

	/**
	 * @generated
	 */
	private org.eclipse.emf.common.util.URI domainModelURI;

	/**
	 * @generated
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	/**
	 * @generated
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		domainModelURI = null;
		action.setEnabled(false);
		if (selection instanceof IStructuredSelection == false
				|| selection.isEmpty()) {
			return;
		}
		IFile file = (IFile) ((IStructuredSelection) selection)
				.getFirstElement();
		domainModelURI = org.eclipse.emf.common.util.URI
				.createPlatformResourceURI(file.getFullPath().toString(), true);
		action.setEnabled(true);
	}

	/**
	 * @generated
	 */
	private Shell getShell() {
		return targetPart.getSite().getShell();
	}

	/**
	 * @generated not
	 */
	public void run(IAction action) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		EObject diagramRoot = null;
		try {
			Resource resource = resourceSet.getResource(domainModelURI, true);
			diagramRoot = (EObject) resource.getContents().get(0);
		} catch (WrappedException ex) {
			PalladioComponentModelAllocationDiagramEditorPlugin.getInstance()
					.logError("Unable to load resource: " + domainModelURI, ex);
		}
		if (diagramRoot == null) {
			MessageDialog.openError(getShell(), "Error",
					"Model file loading failed");
			return;
		}
		Wizard wizard = new PcmNewAllocationDiagramFileWizard(domainModelURI,
				diagramRoot, editingDomain);
		wizard.setWindowTitle("Initialize new " + AllocationEditPart.MODEL_ID
				+ " diagram file");
		PalladioComponentModelDiagramEditorUtil.runWizard(getShell(), wizard,
				"InitDiagramFile"); //$NON-NLS-1$
	}
}
