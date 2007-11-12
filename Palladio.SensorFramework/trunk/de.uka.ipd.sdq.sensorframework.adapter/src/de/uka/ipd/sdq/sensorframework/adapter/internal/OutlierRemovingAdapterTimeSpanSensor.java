package de.uka.ipd.sdq.sensorframework.adapter.internal;

import java.util.Properties;

import de.uka.ipd.sdq.sensorframework.adapter.IAdapter;
import de.uka.ipd.sdq.sensorframework.entities.SensorAndMeasurements;


public class OutlierRemovingAdapterTimeSpanSensor implements IAdapter {

	private Properties myProperties = new Properties();
	private SensorAndMeasurements sam;

	public OutlierRemovingAdapterTimeSpanSensor(SensorAndMeasurements sensorAndMeasurements){
		this.sam = sensorAndMeasurements;
	}

	public Object getAdaptedObject() {
		SensorAndMeasurements result = new SensorAndMeasurements(sam.getSensor(),
			new OutlierFilteringCollection(sam.getMeasurements(),0.1));
		
		return result;
	}

	public Properties getProperties() {
		return myProperties;
	}

	public void setProperties(Properties arg0) {
		myProperties = arg0;
	}

}
