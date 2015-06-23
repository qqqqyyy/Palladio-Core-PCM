/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.palladiosimulator.completions.validation;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.completions.Completion;

/**
 * A sample validator interface for {@link de.uka.ipd.sdq.completions.CompletionRepository}. This
 * doesn't really do anything, and it's not a real EMF artifact. It was generated by the
 * org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can
 * be extended. This can be disabled with -vmargs
 * -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CompletionRepositoryValidator {

    boolean validate();

    boolean validateCompletions_CompletionRepository(EList<Completion> value);
}
