package de.uka.ipd.sdq.edp2.visualization.editors;

import java.util.HashMap;
import java.util.logging.Logger;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.IElementFactory;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableEditor;

import de.uka.ipd.sdq.edp2.visualization.FactoryConnector;
import de.uka.ipd.sdq.edp2.visualization.IDataSource;
import de.uka.ipd.sdq.edp2.visualization.datasource.ElementFactory;

/**
 * Factory for {@link ScatterPlotInput}. Also manages persistence of instances
 * of {@link ScatterPlotInput}.
 * 
 * @author Dominik Ernst
 * 
 */
public class ScatterPlotInputFactory extends ElementFactory {

	private static Logger logger = Logger
			.getLogger(ScatterPlotInputFactory.class.getCanonicalName());
	/**
	 * The factory's ID. Must match the ID specified in the extension point
	 * "org.eclipse.ui.elementFactories".
	 */
	private static final String FACTORY_ID = "de.uka.ipd.sdq.edp2.visualization.editors.ScatterPlotInputFactory";

	/**
	 * Method for restoring {@link ScatterPlotInput} elements. Should call
	 * {@link IDataSource#saveState(IMemento)} of the associated source.
	 * 
	 * @param memento the {@link IMemento} passed on
	 *            by {@link IPersistableEditor#restoreState(IMemento)}
	 * @return Restored {@link ScatterPlotInput} with non-null reference to the
	 *         {@link IDataSource}
	 */
	public IAdaptable createElement(IMemento memento) {
		ScatterPlotInput scatterPlotInput = new ScatterPlotInput();
		
		HashMap<String, Object> restoredProperties = scatterPlotInput.getProperties();
		memento = memento.getChild(restoredProperties.get(ELEMENT_KEY)
				.toString());
		//default properties are overridden with persisted properties from the memento
		overrideFromMemento(memento, restoredProperties);
		//properties are set for the restored element
		scatterPlotInput.setProperties(restoredProperties);
		
		FactoryConnector factoryConnector = new FactoryConnector();
		Object sourceFactory = factoryConnector.getAdapter(memento.getString(SOURCE_KEY),
				IElementFactory.class);
		
		IDataSource createdSource = (IDataSource) ((IElementFactory) sourceFactory)
		.createElement(memento);
		
		createdSource.addObserver(scatterPlotInput);
		scatterPlotInput.setSource(createdSource);
		scatterPlotInput.updateDataset();
		
		return scatterPlotInput;
	}
	/**
	 * @return this factory's ID.
	 */
	public static String getFactoryId() {
		return FACTORY_ID;
	}
}
