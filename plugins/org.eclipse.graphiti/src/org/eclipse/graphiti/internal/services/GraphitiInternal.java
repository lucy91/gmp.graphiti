/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 *
 * </copyright>
 *
 *******************************************************************************/
package org.eclipse.graphiti.internal.services;

import org.eclipse.graphiti.internal.services.impl.EmfService;

/**
 * This class is the main access point to all internal Graphiti services.
 * 
 * @noinstantiate This class is not intended to be instantiated by clients.
 * @noextend This class is not intended to be subclassed by clients.
 */
public final class GraphitiInternal {

	private static IEmfService emfService = new EmfService();

	/**
	 * Returns the EMF service
	 * 
	 * @return the EMF service
	 */
	public static IEmfService getEmfService() {
		return emfService;
	}

}
