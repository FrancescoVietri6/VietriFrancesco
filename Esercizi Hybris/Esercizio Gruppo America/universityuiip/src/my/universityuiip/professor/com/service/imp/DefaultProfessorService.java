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
package my.universityuiip.professor.com.service.imp;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;

import my.universityuiip.model.ProfessorModel;
import my.universityuiip.professor.com.dao.ProfessorDao;
import my.universityuiip.professor.com.service.ProfessorService;


public class DefaultProfessorService extends AbstractItemDao implements ProfessorService
{
	private ProfessorDao professorDao;

	@Override
	public ProfessorModel getProfessorForCode(final String code)
	{

		final List<ProfessorModel> professor = professorDao.findProfessorByCode(code);

		if (CollectionUtils.isEmpty(professor))
		{
			return null;
		}
		else if (professor.size() > 1)
		{
			throw new AmbiguousIdentifierException("Two professors were found for code " + code);
		}
		else
		{
			return professor.get(0);
		}
	}

	public ProfessorDao getProfessorDao()
	{
		return professorDao;
	}

	@Required
	public void setProfessorDao(final ProfessorDao professorDao)
	{
		this.professorDao = professorDao;
	}



}
