/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2017 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package my.universityuiip.student.com.dao.imp;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.universityuiip.model.StudentModel;
import my.universityuiip.student.com.dao.StudentDao;


public class DefaultStudentDao extends AbstractItemDao implements StudentDao
{

	@Override
	public List<StudentModel> findStudentByCode(final String code)
	{

		final String queryStr = "SELECT {PK} FROM {Student} WHERE {serialNumber} = ?code ";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);

		fsq.addQueryParameter("code", code);

		final SearchResult<StudentModel> result = getFlexibleSearchService().search(fsq);

		final List<StudentModel> students = result.getResult();

		return students;

	}

}
