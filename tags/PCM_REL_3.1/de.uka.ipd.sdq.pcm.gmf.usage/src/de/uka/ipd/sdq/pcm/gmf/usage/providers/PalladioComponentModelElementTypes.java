/*
 * Copyright 2007, SDQ, IPD, University of Karlsruhe
 */
package de.uka.ipd.sdq.pcm.gmf.usage.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import de.uka.ipd.sdq.pcm.gmf.usage.part.PalladioComponentModelUsageDiagramEditorPlugin;
import de.uka.ipd.sdq.pcm.parameter.ParameterPackage;
import de.uka.ipd.sdq.pcm.usagemodel.UsagemodelPackage;

/**
 * @generated
 */
public class PalladioComponentModelElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private PalladioComponentModelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType UsageScenario_1000 = getElementType("de.uka.ipd.sdq.pcm.gmf.usage.UsageScenario_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ScenarioBehaviour_2001 = getElementType("de.uka.ipd.sdq.pcm.gmf.usage.ScenarioBehaviour_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ClosedWorkload_2002 = getElementType("de.uka.ipd.sdq.pcm.gmf.usage.ClosedWorkload_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OpenWorkload_2003 = getElementType("de.uka.ipd.sdq.pcm.gmf.usage.OpenWorkload_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Start_3001 = getElementType("de.uka.ipd.sdq.pcm.gmf.usage.Start_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Stop_3002 = getElementType("de.uka.ipd.sdq.pcm.gmf.usage.Stop_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntryLevelSystemCall_3003 = getElementType("de.uka.ipd.sdq.pcm.gmf.usage.EntryLevelSystemCall_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType VariableUsage_3012 = getElementType("de.uka.ipd.sdq.pcm.gmf.usage.VariableUsage_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType VariableCharacterisation_3013 = getElementType("de.uka.ipd.sdq.pcm.gmf.usage.VariableCharacterisation_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Loop_3005 = getElementType("de.uka.ipd.sdq.pcm.gmf.usage.Loop_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ScenarioBehaviour_3007 = getElementType("de.uka.ipd.sdq.pcm.gmf.usage.ScenarioBehaviour_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Branch_3008 = getElementType("de.uka.ipd.sdq.pcm.gmf.usage.Branch_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType BranchTransition_3009 = getElementType("de.uka.ipd.sdq.pcm.gmf.usage.BranchTransition_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ScenarioBehaviour_3010 = getElementType("de.uka.ipd.sdq.pcm.gmf.usage.ScenarioBehaviour_3010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AbstractUserActionSuccessor_4002 = getElementType("de.uka.ipd.sdq.pcm.gmf.usage.AbstractUserActionSuccessor_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return PalladioComponentModelUsageDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(UsageScenario_1000, UsagemodelPackage.eINSTANCE
					.getUsageScenario());

			elements.put(ScenarioBehaviour_2001, UsagemodelPackage.eINSTANCE
					.getScenarioBehaviour());

			elements.put(ClosedWorkload_2002, UsagemodelPackage.eINSTANCE
					.getClosedWorkload());

			elements.put(OpenWorkload_2003, UsagemodelPackage.eINSTANCE
					.getOpenWorkload());

			elements.put(Start_3001, UsagemodelPackage.eINSTANCE.getStart());

			elements.put(Stop_3002, UsagemodelPackage.eINSTANCE.getStop());

			elements.put(EntryLevelSystemCall_3003, UsagemodelPackage.eINSTANCE
					.getEntryLevelSystemCall());

			elements.put(VariableUsage_3012, ParameterPackage.eINSTANCE
					.getVariableUsage());

			elements.put(VariableCharacterisation_3013,
					ParameterPackage.eINSTANCE.getVariableCharacterisation());

			elements.put(Loop_3005, UsagemodelPackage.eINSTANCE.getLoop());

			elements.put(ScenarioBehaviour_3007, UsagemodelPackage.eINSTANCE
					.getScenarioBehaviour());

			elements.put(Branch_3008, UsagemodelPackage.eINSTANCE.getBranch());

			elements.put(BranchTransition_3009, UsagemodelPackage.eINSTANCE
					.getBranchTransition());

			elements.put(ScenarioBehaviour_3010, UsagemodelPackage.eINSTANCE
					.getScenarioBehaviour());

			elements.put(AbstractUserActionSuccessor_4002,
					UsagemodelPackage.eINSTANCE
							.getAbstractUserAction_Successor());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(UsageScenario_1000);
			KNOWN_ELEMENT_TYPES.add(ScenarioBehaviour_2001);
			KNOWN_ELEMENT_TYPES.add(ClosedWorkload_2002);
			KNOWN_ELEMENT_TYPES.add(OpenWorkload_2003);
			KNOWN_ELEMENT_TYPES.add(Start_3001);
			KNOWN_ELEMENT_TYPES.add(Stop_3002);
			KNOWN_ELEMENT_TYPES.add(EntryLevelSystemCall_3003);
			KNOWN_ELEMENT_TYPES.add(VariableUsage_3012);
			KNOWN_ELEMENT_TYPES.add(VariableCharacterisation_3013);
			KNOWN_ELEMENT_TYPES.add(Loop_3005);
			KNOWN_ELEMENT_TYPES.add(ScenarioBehaviour_3007);
			KNOWN_ELEMENT_TYPES.add(Branch_3008);
			KNOWN_ELEMENT_TYPES.add(BranchTransition_3009);
			KNOWN_ELEMENT_TYPES.add(ScenarioBehaviour_3010);
			KNOWN_ELEMENT_TYPES.add(AbstractUserActionSuccessor_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}