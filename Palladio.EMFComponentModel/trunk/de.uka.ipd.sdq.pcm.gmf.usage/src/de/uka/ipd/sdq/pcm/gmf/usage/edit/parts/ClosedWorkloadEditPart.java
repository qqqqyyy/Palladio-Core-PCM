/*
 * Copyright 2007, SDQ, IPD, University of Karlsruhe
 */
package de.uka.ipd.sdq.pcm.gmf.usage.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uka.ipd.sdq.pcm.gmf.usage.edit.policies.ClosedWorkloadItemSemanticEditPolicy;
import de.uka.ipd.sdq.pcm.gmf.usage.part.PalladioComponentModelVisualIDRegistry;

/**
 * @generated
 */
public class ClosedWorkloadEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ClosedWorkloadEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {

		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ClosedWorkloadItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		ClosedWorkloadFigure figure = new ClosedWorkloadFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ClosedWorkloadFigure getPrimaryShape() {
		return (ClosedWorkloadFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ClosedWorkloadTitleLabelEditPart) {
			((ClosedWorkloadTitleLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureClosedWorkloadTitleLabelFigure());
			return true;
		}
		if (childEditPart instanceof ClosedWorkloadPopulationEditPart) {
			((ClosedWorkloadPopulationEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureClosedWorkloadPopulationFigure());
			return true;
		}
		if (childEditPart instanceof ClosedWorkloadThinkTimeLabelEditPart) {
			((ClosedWorkloadThinkTimeLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureClosedWorkloadThinkTimeLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {

		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode()
				.DPtoLP(40), getMapMode().DPtoLP(40));
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(PalladioComponentModelVisualIDRegistry
				.getType(ClosedWorkloadTitleLabelEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ClosedWorkloadFigure extends RectangleFigure {
		/**
		 * @generated
		 */
		public ClosedWorkloadFigure() {
			this.setFill(true);
			this.setFillXOR(false);
			this.setOutline(true);
			this.setOutlineXOR(false);
			this.setLineWidth(1);
			this.setLineStyle(Graphics.LINE_SOLID);
			this.setBackgroundColor(ColorConstants.yellow);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			WrapLabel closedWorkloadTitleLabelFigure0 = new WrapLabel();
			closedWorkloadTitleLabelFigure0.setText("<<ClosedWorkload>>");

			this.add(closedWorkloadTitleLabelFigure0);
			setFigureClosedWorkloadTitleLabelFigure(closedWorkloadTitleLabelFigure0);

			WrapLabel closedWorkloadPopulationFigure0 = new WrapLabel();
			closedWorkloadPopulationFigure0.setText("<...>");

			this.add(closedWorkloadPopulationFigure0);
			setFigureClosedWorkloadPopulationFigure(closedWorkloadPopulationFigure0);

			WrapLabel closedWorkloadThinkTimeLabelFigure0 = new WrapLabel();
			closedWorkloadThinkTimeLabelFigure0.setText("");

			this.add(closedWorkloadThinkTimeLabelFigure0);
			setFigureClosedWorkloadThinkTimeLabelFigure(closedWorkloadThinkTimeLabelFigure0);

		}

		/**
		 * @generated
		 */
		private WrapLabel fClosedWorkloadPopulationFigure;

		/**
		 * @generated
		 */
		public WrapLabel getFigureClosedWorkloadPopulationFigure() {
			return fClosedWorkloadPopulationFigure;
		}

		/**
		 * @generated
		 */
		private void setFigureClosedWorkloadPopulationFigure(WrapLabel fig) {
			fClosedWorkloadPopulationFigure = fig;
		}

		/**
		 * @generated
		 */
		private WrapLabel fClosedWorkloadThinkTimeLabelFigure;

		/**
		 * @generated
		 */
		public WrapLabel getFigureClosedWorkloadThinkTimeLabelFigure() {
			return fClosedWorkloadThinkTimeLabelFigure;
		}

		/**
		 * @generated
		 */
		private void setFigureClosedWorkloadThinkTimeLabelFigure(WrapLabel fig) {
			fClosedWorkloadThinkTimeLabelFigure = fig;
		}

		/**
		 * @generated
		 */
		private WrapLabel fClosedWorkloadTitleLabelFigure;

		/**
		 * @generated
		 */
		public WrapLabel getFigureClosedWorkloadTitleLabelFigure() {
			return fClosedWorkloadTitleLabelFigure;
		}

		/**
		 * @generated
		 */
		private void setFigureClosedWorkloadTitleLabelFigure(WrapLabel fig) {
			fClosedWorkloadTitleLabelFigure = fig;
		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

	}

}
