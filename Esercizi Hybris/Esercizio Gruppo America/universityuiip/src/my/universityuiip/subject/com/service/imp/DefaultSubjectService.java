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
package my.universityuiip.subject.com.service.imp;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;

import my.universityuiip.model.SubjectModel;
import my.universityuiip.subject.com.dao.SubjectDao;
import my.universityuiip.subject.com.service.SubjectService;


/**
 *
 */
public class DefaultSubjectService implements SubjectService
{
	private SubjectDao subjectDao;

	@Override
	public SubjectModel getSubjectForCode(final String code)
	{
		final List<SubjectModel> subjects = subjectDao.findSubjectByCode(code);

		if (CollectionUtils.isEmpty(subjects))
		{
			return null;
		}
		else if (subjects.size() > 1)
		{
			throw new AmbiguousIdentifierException("Two subjects were found for code " + code);
		}
		else
		{
			return subjects.get(0);
		}
	}

	public SubjectDao getSubjectDao()
	{
		return subjectDao;
	}

	@Required
	public void setSubjectDao(final SubjectDao subjectDao)
	{
		this.subjectDao = subjectDao;
	}



}
