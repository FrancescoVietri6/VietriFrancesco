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
package my.universityuiip.student.com.service.imp;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;

import my.universityuiip.model.StudentModel;
import my.universityuiip.student.com.dao.StudentDao;
import my.universityuiip.student.com.service.StudentService;


public class DefaultStudentService implements StudentService
{
	private StudentDao studentDao;

	@Override
	public StudentModel getStudentForCode(final String code)
	{
		final List<StudentModel> students = studentDao.findStudentByCode(code);

		if (CollectionUtils.isEmpty(students))
		{
			return null;
		}
		else if (students.size() > 1)
		{
			throw new AmbiguousIdentifierException("Two students were found for code " + code);
		}
		else
		{
			return students.get(0);
		}

	}

	public StudentDao getStudentDao()
	{
		return studentDao;
	}

	@Required
	public void setStudentDao(final StudentDao studentDao)
	{
		this.studentDao = studentDao;
	}

}
