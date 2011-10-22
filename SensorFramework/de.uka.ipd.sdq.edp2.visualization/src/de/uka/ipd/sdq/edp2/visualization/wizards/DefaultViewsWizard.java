/**
 * 
 */
package de.uka.ipd.sdq.edp2.visualization.wizards;

import java.util.ArrayList;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import de.uka.ipd.sdq.edp2.models.ExperimentData.RawMeasurements;
import de.uka.ipd.sdq.edp2.visualization.IAdapter;
import de.uka.ipd.sdq.edp2.visualization.IDataSink;
import de.uka.ipd.sdq.edp2.visualization.IDataSource;
import de.uka.ipd.sdq.edp2.visualization.IFilter;

/**
 * A wizard which is opened upon selection/doubleclick on an element containing Experiment Data.
 * Provides possible "Default-Combinations" of Filter/Adapter/Editor which allows to visualize the
 * the selected Data in a appropriate way.
 * @author Dominik Ernst
 * 
 */
public class DefaultViewsWizard extends Wizard implements INewWizard {
	
	/**
	 * The page, which displays the list of available filters.
	 */
	SelectDefaultCombinationsPage selectCombinationsPage;
	/**
	 * The source, which is associated with the selected RawMeasurements.
	 */
	IDataSource source;
	/**
	 * Variable to indicate, if the user is allowed to finish the Wizard.
	 */
	boolean finishable;
	
	ArrayList<IDataSink> selectedDefault;

	public void setFinishable(boolean finishable) {
		this.finishable = finishable;
	}

	/**
	 * 
	 */
	public DefaultViewsWizard(IDataSource source) {
		setWindowTitle("Select a Visualization");
		this.source = source;
		this.finishable = false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		if (canFinish()) {
			return true;
		}
		return false;
	}
	
	@Override
	public void addPages() {
		selectCombinationsPage = new SelectDefaultCombinationsPage("Select a Visualization", source);
		addPage(selectCombinationsPage);
	}

	@Override
	public boolean needsPreviousAndNextButtons() {
		return false;
	}

	@Override
	public void createPageControls(Composite pageContainer) {
		// TODO Auto-generated method stub
		super.createPageControls(pageContainer);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	@Override
	public boolean canFinish() {
		return finishable;
	}
	
	/**
	 * @return the selectedDefault
	 */
	public ArrayList<IDataSink> getSelectedDefault() {
		return selectedDefault;
	}

	/**
	 * @param selectedDefault the selectedDefault to set
	 */
	public void setSelectedDefault(ArrayList<IDataSink> selectedDefault) {
		this.selectedDefault = selectedDefault;
	}

}