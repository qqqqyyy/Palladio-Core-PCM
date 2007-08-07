/**
 * 
 */
package de.uka.ipd.sdq.sensorfactory.dao.file.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import de.uka.ipd.sdq.sensorfactory.dao.file.FileDAOFactory;
import de.uka.ipd.sdq.sensorfactory.entities.ExperimentRun;
import de.uka.ipd.sdq.sensorfactory.entities.Measurement;
import de.uka.ipd.sdq.sensorfactory.entities.Sensor;
import de.uka.ipd.sdq.sensorfactory.entities.SensorAndMeasurements;
import de.uka.ipd.sdq.sensorfactory.entities.State;
import de.uka.ipd.sdq.sensorfactory.entities.StateMeasurement;
import de.uka.ipd.sdq.sensorfactory.entities.StateSensor;
import de.uka.ipd.sdq.sensorfactory.entities.TimeSpanMeasurement;
import de.uka.ipd.sdq.sensorfactory.entities.TimeSpanSensor;

/**
 * @author ihssane
 * 
 */
public class ExperimentRunImpl implements ExperimentRun, Serializable {

	private static final long serialVersionUID = 1L;
	private transient FileDAOFactory factory;
	private long experimentRunID;
	private String experimetDateTime;
	private transient HashMap<Long, SensorAndMeasurementsImpl> sensorAndMeasurements;
	private List<Long> sensorIDs;

	public ExperimentRunImpl(FileDAOFactory factory) {
		this.factory = factory;
		sensorAndMeasurements = new HashMap<Long, SensorAndMeasurementsImpl>();
		sensorIDs = new ArrayList<Long>();
	}

	public void setFactory(FileDAOFactory factory) {
		this.factory = factory;
	}

	public long getExperimentRunID() {
		return experimentRunID;
	}

	public void setExperimentRunID(long experimentRunID) {
		this.experimentRunID = experimentRunID;
	}

	public String getExperimentDateTime() {
		return experimetDateTime;
	}

	public void setExperimentDateTime(String experimetDateTime) {
		this.experimetDateTime = experimetDateTime;
	}

	public void addMeasurement(Measurement value) {
		return;
	}

	public Collection<SensorAndMeasurementsImpl> getSensorAndMeasurements() {
		return sensorAndMeasurements.values();
	}

	public StateMeasurement addStateMeasurement(StateSensor p_sensor,
			State p_sensorstate, double p_eventtime) {
		// TODO Auto-generated method stub
		return null;
	}

	public TimeSpanMeasurement addTimeSpanMeasurement(TimeSpanSensor p_sensor,
			double p_eventtime, double p_timespan) {
		SensorAndMeasurementsImpl sam = null;
		if (!sensorIDs.contains(p_sensor.getSensorID())) {
			sam = new TimeSpanSensorAndMeasurement(p_sensor);
			sensorIDs.add(p_sensor.getSensorID());
			sensorAndMeasurements.put(p_sensor.getSensorID(), sam);
		}

		sam = sensorAndMeasurements.get(p_sensor.getSensorID());
		if (sam == null) {
			sam = loadMeasurementsFromFile(p_sensor.getSensorID());
		}
		sam.addEventTime(p_eventtime);
		((TimeSpanSensorAndMeasurement) sam).addTimeSpan(p_timespan);

		return factory.createMeasurementDAO().addTimeSpanMeasurement(p_sensor,
				p_eventtime, p_timespan);
	}

	public Collection<Measurement> getMeasurements() {
		ArrayList<Measurement> m = new ArrayList<Measurement>();
		for (Long l : sensorIDs) {
			m.addAll(sensorAndMeasurements.get(l).getMeasurements());
		}
		return m;
	}

	private SensorAndMeasurementsImpl loadMeasurementsFromFile(long sensorID) {
		return (SensorAndMeasurementsImpl) factory.deserializeFromFile("ExpRun"
				+ getExperimentRunID() + "Measurements" + sensorID);
	}

	public SensorAndMeasurements getMeasurementsOfSensor(Sensor sensor) {
		if (!sensorIDs.contains(sensor.getSensorID())) {
			System.err.println("Error: No Measuremts for Sensor: "
					+ sensor.getSensorName() + " found");
			return null;
		}
		if (sensorAndMeasurements == null)
			sensorAndMeasurements = new HashMap<Long, SensorAndMeasurementsImpl>();

		SensorAndMeasurementsImpl sam = sensorAndMeasurements.get(sensor
				.getSensorID());
		if (sam == null) {
			sam = loadMeasurementsFromFile(sensor.getSensorID());
		}

		return new SensorAndMeasurements(sensor, sam.getMeasurements());
	}

}
