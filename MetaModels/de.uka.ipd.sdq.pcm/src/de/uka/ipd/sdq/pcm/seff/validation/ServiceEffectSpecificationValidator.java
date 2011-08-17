/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.seff.validation;

import de.uka.ipd.sdq.pcm.repository.Signature;

/**
 * A sample validator interface for {@link de.uka.ipd.sdq.pcm.seff.ServiceEffectSpecification}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ServiceEffectSpecificationValidator {
	boolean validate();

	boolean validateSeffTypeID(String value);
	boolean validateDescribedService__SEFF(Signature value);
}
