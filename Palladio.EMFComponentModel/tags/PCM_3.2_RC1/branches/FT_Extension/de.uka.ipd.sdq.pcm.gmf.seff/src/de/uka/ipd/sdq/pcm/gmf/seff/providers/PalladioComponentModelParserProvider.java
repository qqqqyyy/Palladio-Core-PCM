/*
 *Copyright 2006 SDQ Research Group, University of Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.seff.providers;

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
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.AcquireActionEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.AcquireActionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.BranchActionEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.BranchActionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.CollectionIteratorActionEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.CollectionIteratorActionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ExternalCallActionEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ExternalCallActionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.FailureOccurrenceDescriptionEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ForkActionEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ForkActionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.GuardedBranchTransitionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.InternalActionEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.InternalActionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.LoopActionEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.LoopActionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ProbabilisticBranchTransitionBranchProbabilityEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ProbabilisticBranchTransitionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ReleaseActionEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.ReleaseActionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.SetVariableActionEntityName2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.SetVariableActionEntityNameEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableCharacterisation2EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableCharacterisation3EditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.edit.parts.VariableCharacterisationEditPart;
import de.uka.ipd.sdq.pcm.gmf.seff.parsers.MessageFormatParser;
import de.uka.ipd.sdq.pcm.gmf.seff.part.PalladioComponentModelVisualIDRegistry;
import de.uka.ipd.sdq.pcm.parameter.ParameterPackage;
import de.uka.ipd.sdq.pcm.seff.SeffPackage;

/**
 * @generated
 */
public class PalladioComponentModelParserProvider extends AbstractProvider implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser externalCallActionEntityName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getExternalCallActionEntityName_5002Parser() {
		if (externalCallActionEntityName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalCallActionEntityName_5002Parser = parser;
		}
		return externalCallActionEntityName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser loopActionEntityName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getLoopActionEntityName_5009Parser() {
		if (loopActionEntityName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loopActionEntityName_5009Parser = parser;
		}
		return loopActionEntityName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser branchActionEntityName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getBranchActionEntityName_5011Parser() {
		if (branchActionEntityName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			branchActionEntityName_5011Parser = parser;
		}
		return branchActionEntityName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser internalActionEntityName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getInternalActionEntityName_5012Parser() {
		if (internalActionEntityName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			internalActionEntityName_5012Parser = parser;
		}
		return internalActionEntityName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser collectionIteratorActionEntityName_5015Parser;

	/**
	 * @generated
	 */
	private IParser getCollectionIteratorActionEntityName_5015Parser() {
		if (collectionIteratorActionEntityName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			collectionIteratorActionEntityName_5015Parser = parser;
		}
		return collectionIteratorActionEntityName_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser setVariableActionEntityName_5023Parser;

	/**
	 * @generated
	 */
	private IParser getSetVariableActionEntityName_5023Parser() {
		if (setVariableActionEntityName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			setVariableActionEntityName_5023Parser = parser;
		}
		return setVariableActionEntityName_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser acquireActionEntityName_5029Parser;

	/**
	 * @generated
	 */
	private IParser getAcquireActionEntityName_5029Parser() {
		if (acquireActionEntityName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			acquireActionEntityName_5029Parser = parser;
		}
		return acquireActionEntityName_5029Parser;
	}

	/**
	 * @generated
	 */
	private IParser releaseActionEntityName_5022Parser;

	/**
	 * @generated
	 */
	private IParser getReleaseActionEntityName_5022Parser() {
		if (releaseActionEntityName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			releaseActionEntityName_5022Parser = parser;
		}
		return releaseActionEntityName_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser forkActionEntityName_5024Parser;

	/**
	 * @generated
	 */
	private IParser getForkActionEntityName_5024Parser() {
		if (forkActionEntityName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forkActionEntityName_5024Parser = parser;
		}
		return forkActionEntityName_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser variableCharacterisation_3033Parser;

	/**
	 * @generated
	 */
	private IParser getVariableCharacterisation_3033Parser() {
		if (variableCharacterisation_3033Parser == null) {
			EAttribute[] features = new EAttribute[] { ParameterPackage.eINSTANCE.getVariableCharacterisation_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} = {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} = {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} = {1}"); //$NON-NLS-1$
			variableCharacterisation_3033Parser = parser;
		}
		return variableCharacterisation_3033Parser;
	}

	/**
	 * @generated
	 */
	private IParser variableCharacterisation_3035Parser;

	/**
	 * @generated
	 */
	private IParser getVariableCharacterisation_3035Parser() {
		if (variableCharacterisation_3035Parser == null) {
			EAttribute[] features = new EAttribute[] { ParameterPackage.eINSTANCE.getVariableCharacterisation_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} = {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} = {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} = {1}"); //$NON-NLS-1$
			variableCharacterisation_3035Parser = parser;
		}
		return variableCharacterisation_3035Parser;
	}

	/**
	 * @generated
	 */
	private IParser loopActionEntityName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getLoopActionEntityName_5003Parser() {
		if (loopActionEntityName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			loopActionEntityName_5003Parser = parser;
		}
		return loopActionEntityName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser internalActionEntityName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getInternalActionEntityName_5005Parser() {
		if (internalActionEntityName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			internalActionEntityName_5005Parser = parser;
		}
		return internalActionEntityName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser failureOccurrenceDescription_3041Parser;

	/**
	 * @generated
	 */
	private IParser getFailureOccurrenceDescription_3041Parser() {
		if (failureOccurrenceDescription_3041Parser == null) {
			EAttribute[] features = new EAttribute[] { SeffPackage.eINSTANCE.getFailureOccurrenceDescription_FailureProbability() };
			EAttribute[] editableFeatures = new EAttribute[] { SeffPackage.eINSTANCE.getFailureOccurrenceDescription_FailureProbability() };
			MessageFormatParser parser = new MessageFormatParser(features, editableFeatures);
			failureOccurrenceDescription_3041Parser = parser;
		}
		return failureOccurrenceDescription_3041Parser;
	}

	/**
	 * @generated
	 */
	private IParser branchActionEntityName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getBranchActionEntityName_5008Parser() {
		if (branchActionEntityName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			branchActionEntityName_5008Parser = parser;
		}
		return branchActionEntityName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser probabilisticBranchTransitionEntityName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getProbabilisticBranchTransitionEntityName_5007Parser() {
		if (probabilisticBranchTransitionEntityName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			probabilisticBranchTransitionEntityName_5007Parser = parser;
		}
		return probabilisticBranchTransitionEntityName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser probabilisticBranchTransitionBranchProbability_5037Parser;

	/**
	 * @generated
	 */
	private IParser getProbabilisticBranchTransitionBranchProbability_5037Parser() {
		if (probabilisticBranchTransitionBranchProbability_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { SeffPackage.eINSTANCE.getProbabilisticBranchTransition_BranchProbability() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("Probability: {0}"); //$NON-NLS-1$
			parser.setEditorPattern("Probability: {0}"); //$NON-NLS-1$
			parser.setEditPattern("Probability: {0}"); //$NON-NLS-1$
			probabilisticBranchTransitionBranchProbability_5037Parser = parser;
		}
		return probabilisticBranchTransitionBranchProbability_5037Parser;
	}

	/**
	 * @generated
	 */
	private IParser externalCallActionEntityName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getExternalCallActionEntityName_5006Parser() {
		if (externalCallActionEntityName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			externalCallActionEntityName_5006Parser = parser;
		}
		return externalCallActionEntityName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser acquireActionEntityName_5028Parser;

	/**
	 * @generated
	 */
	private IParser getAcquireActionEntityName_5028Parser() {
		if (acquireActionEntityName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			acquireActionEntityName_5028Parser = parser;
		}
		return acquireActionEntityName_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser releaseActionEntityName_5020Parser;

	/**
	 * @generated
	 */
	private IParser getReleaseActionEntityName_5020Parser() {
		if (releaseActionEntityName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			releaseActionEntityName_5020Parser = parser;
		}
		return releaseActionEntityName_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser forkActionEntityName_5026Parser;

	/**
	 * @generated
	 */
	private IParser getForkActionEntityName_5026Parser() {
		if (forkActionEntityName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			forkActionEntityName_5026Parser = parser;
		}
		return forkActionEntityName_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser collectionIteratorActionEntityName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getCollectionIteratorActionEntityName_5013Parser() {
		if (collectionIteratorActionEntityName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			collectionIteratorActionEntityName_5013Parser = parser;
		}
		return collectionIteratorActionEntityName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser setVariableActionEntityName_5027Parser;

	/**
	 * @generated
	 */
	private IParser getSetVariableActionEntityName_5027Parser() {
		if (setVariableActionEntityName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			setVariableActionEntityName_5027Parser = parser;
		}
		return setVariableActionEntityName_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser variableCharacterisation_3037Parser;

	/**
	 * @generated
	 */
	private IParser getVariableCharacterisation_3037Parser() {
		if (variableCharacterisation_3037Parser == null) {
			EAttribute[] features = new EAttribute[] { ParameterPackage.eINSTANCE.getVariableCharacterisation_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} = {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} = {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0} = {1}"); //$NON-NLS-1$
			variableCharacterisation_3037Parser = parser;
		}
		return variableCharacterisation_3037Parser;
	}

	/**
	 * @generated
	 */
	private IParser guardedBranchTransitionEntityName_5018Parser;

	/**
	 * @generated
	 */
	private IParser getGuardedBranchTransitionEntityName_5018Parser() {
		if (guardedBranchTransitionEntityName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { EntityPackage.eINSTANCE.getNamedElement_EntityName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			guardedBranchTransitionEntityName_5018Parser = parser;
		}
		return guardedBranchTransitionEntityName_5018Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ExternalCallActionEntityNameEditPart.VISUAL_ID:
			return getExternalCallActionEntityName_5002Parser();
		case LoopActionEntityNameEditPart.VISUAL_ID:
			return getLoopActionEntityName_5009Parser();
		case BranchActionEntityNameEditPart.VISUAL_ID:
			return getBranchActionEntityName_5011Parser();
		case InternalActionEntityNameEditPart.VISUAL_ID:
			return getInternalActionEntityName_5012Parser();
		case CollectionIteratorActionEntityNameEditPart.VISUAL_ID:
			return getCollectionIteratorActionEntityName_5015Parser();
		case SetVariableActionEntityNameEditPart.VISUAL_ID:
			return getSetVariableActionEntityName_5023Parser();
		case AcquireActionEntityNameEditPart.VISUAL_ID:
			return getAcquireActionEntityName_5029Parser();
		case ReleaseActionEntityNameEditPart.VISUAL_ID:
			return getReleaseActionEntityName_5022Parser();
		case ForkActionEntityNameEditPart.VISUAL_ID:
			return getForkActionEntityName_5024Parser();
		case VariableCharacterisationEditPart.VISUAL_ID:
			return getVariableCharacterisation_3033Parser();
		case VariableCharacterisation2EditPart.VISUAL_ID:
			return getVariableCharacterisation_3035Parser();
		case LoopActionEntityName2EditPart.VISUAL_ID:
			return getLoopActionEntityName_5003Parser();
		case InternalActionEntityName2EditPart.VISUAL_ID:
			return getInternalActionEntityName_5005Parser();
		case FailureOccurrenceDescriptionEditPart.VISUAL_ID:
			return getFailureOccurrenceDescription_3041Parser();
		case BranchActionEntityName2EditPart.VISUAL_ID:
			return getBranchActionEntityName_5008Parser();
		case ProbabilisticBranchTransitionEntityNameEditPart.VISUAL_ID:
			return getProbabilisticBranchTransitionEntityName_5007Parser();
		case ProbabilisticBranchTransitionBranchProbabilityEditPart.VISUAL_ID:
			return getProbabilisticBranchTransitionBranchProbability_5037Parser();
		case ExternalCallActionEntityName2EditPart.VISUAL_ID:
			return getExternalCallActionEntityName_5006Parser();
		case AcquireActionEntityName2EditPart.VISUAL_ID:
			return getAcquireActionEntityName_5028Parser();
		case ReleaseActionEntityName2EditPart.VISUAL_ID:
			return getReleaseActionEntityName_5020Parser();
		case ForkActionEntityName2EditPart.VISUAL_ID:
			return getForkActionEntityName_5026Parser();
		case CollectionIteratorActionEntityName2EditPart.VISUAL_ID:
			return getCollectionIteratorActionEntityName_5013Parser();
		case SetVariableActionEntityName2EditPart.VISUAL_ID:
			return getSetVariableActionEntityName_5027Parser();
		case VariableCharacterisation3EditPart.VISUAL_ID:
			return getVariableCharacterisation_3037Parser();
		case GuardedBranchTransitionEntityNameEditPart.VISUAL_ID:
			return getGuardedBranchTransitionEntityName_5018Parser();
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
	 * @generated NOT
	 */
	public static class HintAdapter extends ParserHintAdapter {

		private final IElementType elementType;

		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}
}