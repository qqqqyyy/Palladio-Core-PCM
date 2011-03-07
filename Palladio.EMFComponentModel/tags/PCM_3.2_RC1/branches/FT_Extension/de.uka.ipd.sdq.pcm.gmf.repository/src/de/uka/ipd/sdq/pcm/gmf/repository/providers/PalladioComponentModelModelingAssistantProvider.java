/*
 *Copyright 2007, IPD, SDQ, University of Karlsruhe
 */
package de.uka.ipd.sdq.pcm.gmf.repository.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import de.uka.ipd.sdq.pcm.gmf.repository.edit.parts.BasicComponentComponentParameterCompartmentEditPart;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.parts.BasicComponentEditPart;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.parts.CompleteComponentTypeEditPart;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.parts.CompositeComponentEditPart;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.parts.InterfaceEditPart;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.parts.ProvidesComponentTypeEditPart;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.parts.RepositoryEditPart;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.parts.SubSystemEditPart;
import de.uka.ipd.sdq.pcm.gmf.repository.edit.parts.VariableUsageEditPart;
import de.uka.ipd.sdq.pcm.gmf.repository.part.Messages;
import de.uka.ipd.sdq.pcm.gmf.repository.part.PalladioComponentModelRepositoryDiagramEditorPlugin;

/**
 * @generated
 */
public class PalladioComponentModelModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof InterfaceEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(PalladioComponentModelElementTypes.Signature_3101);
			return types;
		}
		if (editPart instanceof BasicComponentEditPart) {
			ArrayList types = new ArrayList(2);
			types
					.add(PalladioComponentModelElementTypes.ResourceDemandingSEFF_3102);
			types.add(PalladioComponentModelElementTypes.PassiveResource_3103);
			return types;
		}
		if (editPart instanceof VariableUsageEditPart) {
			ArrayList types = new ArrayList(1);
			types
					.add(PalladioComponentModelElementTypes.VariableCharacterisation_3105);
			return types;
		}
		if (editPart instanceof BasicComponentComponentParameterCompartmentEditPart) {
			ArrayList types = new ArrayList(1);
			types.add(PalladioComponentModelElementTypes.VariableUsage_3104);
			return types;
		}
		if (editPart instanceof RepositoryEditPart) {
			ArrayList types = new ArrayList(6);
			types.add(PalladioComponentModelElementTypes.Interface_2101);
			types.add(PalladioComponentModelElementTypes.BasicComponent_2102);
			types
					.add(PalladioComponentModelElementTypes.CompositeComponent_2103);
			types
					.add(PalladioComponentModelElementTypes.CompleteComponentType_2104);
			types
					.add(PalladioComponentModelElementTypes.ProvidesComponentType_2105);
			types.add(PalladioComponentModelElementTypes.SubSystem_2106);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof BasicComponentEditPart) {
			return ((BasicComponentEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompositeComponentEditPart) {
			return ((CompositeComponentEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CompleteComponentTypeEditPart) {
			return ((CompleteComponentTypeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ProvidesComponentTypeEditPart) {
			return ((ProvidesComponentTypeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SubSystemEditPart) {
			return ((SubSystemEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof InterfaceEditPart) {
			return ((InterfaceEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CompleteComponentTypeEditPart) {
			return ((CompleteComponentTypeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ProvidesComponentTypeEditPart) {
			return ((ProvidesComponentTypeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof BasicComponentEditPart) {
			return ((BasicComponentEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompositeComponentEditPart) {
			return ((CompositeComponentEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CompleteComponentTypeEditPart) {
			return ((CompleteComponentTypeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ProvidesComponentTypeEditPart) {
			return ((ProvidesComponentTypeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SubSystemEditPart) {
			return ((SubSystemEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof InterfaceEditPart) {
			return ((InterfaceEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CompleteComponentTypeEditPart) {
			return ((CompleteComponentTypeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ProvidesComponentTypeEditPart) {
			return ((ProvidesComponentTypeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof BasicComponentEditPart) {
			return ((BasicComponentEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompositeComponentEditPart) {
			return ((CompositeComponentEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CompleteComponentTypeEditPart) {
			return ((CompleteComponentTypeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ProvidesComponentTypeEditPart) {
			return ((ProvidesComponentTypeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SubSystemEditPart) {
			return ((SubSystemEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				PalladioComponentModelRepositoryDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog
				.setMessage(Messages.PalladioComponentModelModelingAssistantProviderMessage);
		dialog
				.setTitle(Messages.PalladioComponentModelModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
