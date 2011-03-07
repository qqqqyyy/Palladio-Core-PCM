/*
 * Copyright 2009, SDQ, IPD, Uni Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.resource.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import de.uka.ipd.sdq.pcm.core.entity.EntityPackage;
import de.uka.ipd.sdq.pcm.gmf.resource.edit.parts.CommunicationLinkResourceSpecificationFailureProbabilityEditPart;
import de.uka.ipd.sdq.pcm.gmf.resource.edit.parts.ProcessingResourceSpecificationMTTFEditPart;
import de.uka.ipd.sdq.pcm.gmf.resource.edit.parts.ProcessingResourceSpecificationMTTREditPart;
import de.uka.ipd.sdq.pcm.gmf.resource.edit.parts.ProcessingResourceSpecificationSchedulingPolicyEditPart;
import de.uka.ipd.sdq.pcm.gmf.resource.edit.parts.ResourceContainerEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.resource.parsers.MessageFormatParser;
import de.uka.ipd.sdq.pcm.gmf.resource.part.PalladioComponentModelVisualIDRegistry;
import de.uka.ipd.sdq.pcm.resourceenvironment.ResourceenvironmentPackage;

/**
 * @generated
 */
public class PalladioComponentModelParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser resourceContainerEntityName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getResourceContainerEntityName_5001Parser() {
		if (resourceContainerEntityName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			resourceContainerEntityName_5001Parser = parser;
		}
		return resourceContainerEntityName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser processingResourceSpecificationMTTF_5002Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingResourceSpecificationMTTF_5002Parser() {
		if (processingResourceSpecificationMTTF_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ResourceenvironmentPackage.eINSTANCE.getProcessingResourceSpecification_MTTF() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("MTTF: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("MTTF: {0}"); //$NON-NLS-1$
			parser.setEditPattern("MTTF: {0}"); //$NON-NLS-1$
			processingResourceSpecificationMTTF_5002Parser = parser;
		}
		return processingResourceSpecificationMTTF_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser processingResourceSpecificationMTTR_5003Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingResourceSpecificationMTTR_5003Parser() {
		if (processingResourceSpecificationMTTR_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ResourceenvironmentPackage.eINSTANCE.getProcessingResourceSpecification_MTTR() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("MTTR: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("MTTR: {0}"); //$NON-NLS-1$
			parser.setEditPattern("MTTR: {0}"); //$NON-NLS-1$
			processingResourceSpecificationMTTR_5003Parser = parser;
		}
		return processingResourceSpecificationMTTR_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser processingResourceSpecificationSchedulingPolicy_5004Parser;

	/**
	 * @generated
	 */
	private IParser getProcessingResourceSpecificationSchedulingPolicy_5004Parser() {
		if (processingResourceSpecificationSchedulingPolicy_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ResourceenvironmentPackage.eINSTANCE.getProcessingResourceSpecification_SchedulingPolicy() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Scheduling Policy: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Scheduling Policy: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Scheduling Policy: {0}"); //$NON-NLS-1$
			processingResourceSpecificationSchedulingPolicy_5004Parser = parser;
		}
		return processingResourceSpecificationSchedulingPolicy_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser communicationLinkResourceSpecificationFailureProbability_5009Parser;

	/**
	 * @generated
	 */
	private IParser getCommunicationLinkResourceSpecificationFailureProbability_5009Parser() {
		if (communicationLinkResourceSpecificationFailureProbability_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ResourceenvironmentPackage.eINSTANCE.getCommunicationLinkResourceSpecification_FailureProbability() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("CommunicationSpecification"); //$NON-NLS-1$
			parser.setEditorPattern("CommunicationSpecification"); //$NON-NLS-1$
			parser.setEditPattern("CommunicationSpecification"); //$NON-NLS-1$
			communicationLinkResourceSpecificationFailureProbability_5009Parser = parser;
		}
		return communicationLinkResourceSpecificationFailureProbability_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ResourceContainerEntityNameEditPart.VISUAL_ID:
			return getResourceContainerEntityName_5001Parser();
		case ProcessingResourceSpecificationMTTFEditPart.VISUAL_ID:
			return getProcessingResourceSpecificationMTTF_5002Parser();
		case ProcessingResourceSpecificationMTTREditPart.VISUAL_ID:
			return getProcessingResourceSpecificationMTTR_5003Parser();
		case ProcessingResourceSpecificationSchedulingPolicyEditPart.VISUAL_ID:
			return getProcessingResourceSpecificationSchedulingPolicy_5004Parser();
		case CommunicationLinkResourceSpecificationFailureProbabilityEditPart.VISUAL_ID:
			return getCommunicationLinkResourceSpecificationFailureProbability_5009Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(PalladioComponentModelVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(PalladioComponentModelVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (PalladioComponentModelElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}