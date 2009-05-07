/**
 * Copyright (c) 2004-2006 FZI Forschungszentrum Informatik, 
 * 10-14 Haid-und-Neu Street, 76131 Karlsruhe, Germany
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package de.fzi.sissy.commentanalyzer;

import de.fzi.sissy.metamod.SourceEntity;

/**
 * @author Philipp Haller
 */
public class SourceEntityFilenameComparator implements java.util.Comparator {

	public int compare(Object arg0, Object arg1) {
		if ((arg0 instanceof SourceEntity) && (arg1 instanceof SourceEntity)) {
			SourceEntity se0 = (SourceEntity) arg0;
			SourceEntity se1 = (SourceEntity) arg1;
			
			int res = 0;
			try {
				res = se0
						.getPosition()
						.getSourceFile()
						.getPathName()
						.compareTo(
								se1.getPosition().getSourceFile().getPathName());
			} catch (NullPointerException npe) {
			}
			
			return res;
		}
		return 0;
	}

}