/*
 * Copyright 2009, SDQ, IPD, Uni Karlsruhe (TH)
 */
package de.uka.ipd.sdq.pcm.gmf.resource.custom.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.NonResizableHandleKit;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.LabelDirectEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Image;
import org.palladiosimulator.pcm.dialogs.resource.OpenLatencyDialog;

import de.uka.ipd.sdq.pcm.gmf.resource.edit.parts.CommunicationLinkResourceSpecificationLatencyLabelEditPart;
import org.palladiosimulator.pcm.resourceenvironment.CommunicationLinkResourceSpecification;

// TODO: Auto-generated Javadoc
/**
 * An edit part.
 */
public class CustomCommunicationLinkResourceSpecificationLatencyLabelEditPart extends
        CommunicationLinkResourceSpecificationLatencyLabelEditPart {

    /**
     * Instantiates a new custom communication link resource specification latency label edit part.
     * 
     * @param view
     *            a View
     */
    public CustomCommunicationLinkResourceSpecificationLatencyLabelEditPart(View view) {
        super(view);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.pcm.gmf.resource.edit.parts.
     * CommunicationLinkResourceSpecificationLatencyLabelEditPart#createDefaultEditPolicies()
     */
    @Override
    protected void createDefaultEditPolicies() {
        super.createDefaultEditPolicies();
        installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new LabelDirectEditPolicy());
        installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new NonResizableEditPolicy() {

            protected List createSelectionHandles() {
                List handles = new ArrayList();
                NonResizableHandleKit.addMoveHandle((GraphicalEditPart) getHost(), handles);
                return handles;
            }

            public Command getCommand(Request request) {
                return null;
            }

            public boolean understandsRequest(Request request) {
                return false;
            }
        });
        installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenLatencyDialog());
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.pcm.gmf.resource.edit.parts.
     * CommunicationLinkResourceSpecificationLatencyLabelEditPart#getLabelIcon()
     */
    @Override
    protected Image getLabelIcon() {
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.pcm.gmf.resource.edit.parts.
     * CommunicationLinkResourceSpecificationLatencyLabelEditPart#getLabelText()
     */
    @Override
    protected String getLabelText() {
        String text = null;
        CommunicationLinkResourceSpecification spec = (CommunicationLinkResourceSpecification) resolveSemanticElement();
        if (spec.getLatency_CommunicationLinkResourceSpecification() != null) {
            text = spec.getLatency_CommunicationLinkResourceSpecification().getSpecification();
        }
        if (text == null || text.length() == 0) {
            text = getLabelTextHelper(getFigure());
        }
        return text;
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.pcm.gmf.resource.edit.parts.
     * CommunicationLinkResourceSpecificationLatencyLabelEditPart#addSemanticListeners()
     */
    @Override
    protected void addSemanticListeners() {
        CommunicationLinkResourceSpecification spec = (CommunicationLinkResourceSpecification) resolveSemanticElement();
        addListenerFilter("SemanticModel", this, spec.getLatency_CommunicationLinkResourceSpecification()); //$NON-NLS-1$

    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.pcm.gmf.resource.edit.parts.
     * CommunicationLinkResourceSpecificationLatencyLabelEditPart#removeSemanticListeners()
     */
    @Override
    protected void removeSemanticListeners() {
        removeListenerFilter("SemanticModel"); //$NON-NLS-1$
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.pcm.gmf.resource.edit.parts.
     * CommunicationLinkResourceSpecificationLatencyLabelEditPart
     * #handleNotificationEvent(org.eclipse.emf.common.notify.Notification)
     */
    @Override
    protected void handleNotificationEvent(Notification event) {
        Object feature = event.getFeature();
        if (NotationPackage.eINSTANCE.getFontStyle_FontColor().equals(feature)) {
            Integer c = (Integer) event.getNewValue();
            setFontColor(DiagramColorRegistry.getInstance().getColor(c));
        } else if (NotationPackage.eINSTANCE.getFontStyle_Underline().equals(feature)) {
            refreshUnderline();
        } else if (NotationPackage.eINSTANCE.getFontStyle_StrikeThrough().equals(feature)) {
            refreshStrikeThrough();
        } else if (NotationPackage.eINSTANCE.getFontStyle_FontHeight().equals(feature)
                || NotationPackage.eINSTANCE.getFontStyle_FontName().equals(feature)
                || NotationPackage.eINSTANCE.getFontStyle_Bold().equals(feature)
                || NotationPackage.eINSTANCE.getFontStyle_Italic().equals(feature)) {
            refreshFont();
        } else {
            refreshLabel();
        }
        super.handleNotificationEvent(event);
    }

}
