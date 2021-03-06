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
 *
 * </copyright>
 *
 *******************************************************************************/
package org.eclipse.graphiti.examples.common.outline.tree;

import org.eclipse.graphiti.mm.algorithms.styles.Point;

/**
 * A default-implementation for a TreeEditPart, which wraps a Shape. It can be
 * overwritten to provide different behaviour.
 */
public class PointTreeEditPart extends AbstractGraphicsTreeEditPart {

	/**
	 * Creates a new PictogramElementTreeEditPart for the given model Object.
	 * 
	 * @param configurationProvider
	 *            The IConfigurationProviderInternal which defines the model
	 * @param shape
	 *            The Shape of this EditPart.
	 */
	public PointTreeEditPart(Point point) {
		super(point);
	}

	public Point getPoint() {
		return (Point) getModel();
	}

	// ======================= overwriteable behaviour ========================

	/**
	 * Creates the EditPolicies of this EditPart. Subclasses often overwrite
	 * this method to change the behaviour of the editpart.
	 */
	@Override
	protected void createEditPolicies() {
	}
}