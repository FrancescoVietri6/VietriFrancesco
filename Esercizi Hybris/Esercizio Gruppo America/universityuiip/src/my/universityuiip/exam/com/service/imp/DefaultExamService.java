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
package my.universityuiip.exam.com.service.imp;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;

import my.universityuiip.exam.com.dao.ExamDao;
import my.universityuiip.exam.com.service.ExamService;
import my.universityuiip.model.ExamModel;


public class DefaultExamService implements ExamService
{
	private ExamDao examDao;

	@Override
	public List<ExamModel> getExamForStudent(final String studentCode)
	{
		final List<ExamModel> exam = examDao.findExamsByStudent(studentCode);

		if (CollectionUtils.isEmpty(exam))
		{
			return null;
		}
		else
		{
			return exam;
		}
	}

	public ExamDao getExamDao()
	{
		return examDao;
	}

	@Required
	public void setExamDao(final ExamDao examDao)
	{
		this.examDao = examDao;
	}

}
