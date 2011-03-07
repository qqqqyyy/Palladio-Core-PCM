/**
 * Opt4J is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Opt4J is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with Opt4J. If not, see http://www.gnu.org/licenses/. 
 */

package org.opt4j.operator.crossover;

import org.opt4j.core.problem.Genotype;
import org.opt4j.operator.GenericOperator;

import com.google.inject.ImplementedBy;


/**
 * Interface for a generic {@code Crossover} that handles different types of
 * genotypes. The implementation is {@link CrossoverGenericImplementation}.
 * 
 * @author lukasiewycz
 * 
 */
@ImplementedBy(CrossoverGenericImplementation.class)
public interface CrossoverGeneric extends Crossover<Genotype>,
		GenericOperator<Crossover<Genotype>> {

}