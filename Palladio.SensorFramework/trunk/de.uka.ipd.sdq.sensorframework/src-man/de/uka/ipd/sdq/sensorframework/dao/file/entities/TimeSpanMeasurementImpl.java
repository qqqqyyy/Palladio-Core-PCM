/**
 * 
 */
package de.uka.ipd.sdq.sensorframework.dao.file.entities;

import de.uka.ipd.sdq.sensorframework.entities.TimeSpanMeasurement;
import de.uka.ipd.sdq.sensorframework.entities.TimeSpanSensor;

/**
 * @author ihssane
 * 
 * TODO Kommentare TODO Warum wird hier nicht TimeSpanSensorAndMeasurement
 * referenziert??
 * 
 */
public class TimeSpanMeasurementImpl 
extends MeasurementImpl 
implements TimeSpanMeasurement {

	private double timeSpan;

	public TimeSpanMeasurementImpl(long id, double eventTime, double timeSpan) {
		super(id, eventTime);
		this.timeSpan = timeSpan;
	}

	public double getTimeSpan() {
		return timeSpan;
	}

	public void setTimeSpan(double value) {
		this.timeSpan = value;
	}

	public TimeSpanSensor getSensor() {
		throw new UnsupportedOperationException();
	}

	public void setSensor(TimeSpanSensor value) {
		throw new UnsupportedOperationException();
	}

}
