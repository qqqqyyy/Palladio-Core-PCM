package de.uka.ipd.sdq.edp2.visualization;

import java.util.ArrayList;
import java.util.Observer;

import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.jfree.data.general.AbstractSeriesDataset;

import de.uka.ipd.sdq.edp2.models.ExperimentData.MetricDescription;
import de.uka.ipd.sdq.edp2.visualization.editors.AbstractEditor;

/**
 * A {@link IDataSink} represents an Object which receives input by an
 * {@link AbstractDataSource}. Objects, which implement only {@link IDataSink}
 * instead of subclassing {@link AbstractTransformation}, are inputs for
 * different {@link AbstractEditor}s or rather their specific
 * {@link IVisualizationInputHandle}. Because Editor inputs and transformations both
 * may be (and typically are) located in separate plugins, all {@link IDataSink}
 * s extend {@link IExecutableExtension}.
 * 
 * 
 * @author Dominik Ernst
 * 
 */
public interface IDataSink extends IDataFlow, Observer, IExecutableExtension {
	/**
	 * @return The current IDataSource.
	 */
	AbstractDataSource getSource();

	/**
	 * @param source
	 *            The IDataSource which represents the input for this sink.
	 */
	void setSource(AbstractDataSource source);

	/**
	 * Roles are MetricDescriptions, which this IDataSink can use (i.e. its
	 * editor can display) for the given source.
	 * 
	 * @return A list of metric descriptions, applicable to any source.
	 */
	ArrayList<MetricDescription> getMetricRoles();

	/**
	 * 
	 * @return <code>true</code> if there exists a MetricDescription that accepts the
	 *         source.
	 */
	boolean canAccept(AbstractDataSource source);
	
	IDataSink createCopyForSource(AbstractDataSource source);
}
