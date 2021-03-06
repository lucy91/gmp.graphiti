/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2012 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 *    mwenz - Bug 325084 - Provide documentation for Patterns
 *
 * </copyright>
 *
 *******************************************************************************/
package org.eclipse.graphiti.pattern.mapping;

import java.util.List;

/**
 * The Interface IStructureMappingMulti.
 * 
 * @experimental This API is in an experimental state and should be used by
 *               clients, as it not final and can be removed or changed without
 *               prior notice!
 * 
 * @noimplement This interface is not intended to be implemented by clients.
 * @noextend This interface is not intended to be extended by clients. Extend
 *           {@link StructureMappingMulti} instead
 */
public interface IStructureMappingMulti extends IStructureMapping {

	/**
	 * Returns the list of business object arrays. Each array of business
	 * objects will be linked with a pictogram element acting as placeholder in
	 * a pattern.
	 * 
	 * @param mainBusinessObject
	 *            this is the main business object of the current pattern
	 * 
	 * @return the list of business objects
	 */
	List<ILinkCreationInfo> getLinkCreationInfos(Object mainBusinessObject);
}
