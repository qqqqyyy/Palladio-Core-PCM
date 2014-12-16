package org.palladiosimulator.protocom.model.usage

import org.palladiosimulator.protocom.model.ModelAdapter
import de.uka.ipd.sdq.pcm.usagemodel.Workload

/**
 * Abstract base class for PCM Workload adapters.
 * @author Christian Klaussner
 */
abstract class WorkloadAdapter<E extends Workload> extends ModelAdapter<E> {
	new(E entity) {
		super(entity)
	}	
}
