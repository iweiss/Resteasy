/*******************************************************************************
 * Copyright (c) 2010 Robert "Unlogic" Olofsson (unlogic@unlogic.se).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0-standalone.html
 ******************************************************************************/
package se.unlogic.standardutils.dao;

import se.unlogic.standardutils.populators.QueryParameterPopulator;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public interface Column<BeanType,ColumnType> {

	Field getBeanField();

	Class<?> getParamType();

	Object getParamValue(Object param);

	Object getBeanValue(BeanType bean);

	Method getQueryMethod();

	String getColumnName();

	boolean isAutoGenerated();

	QueryParameterPopulator<?> getQueryParameterPopulator();

}