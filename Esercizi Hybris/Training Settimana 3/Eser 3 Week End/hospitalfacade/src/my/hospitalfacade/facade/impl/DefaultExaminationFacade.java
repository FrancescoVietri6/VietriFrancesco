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
package my.hospitalfacade.facade.impl;

import de.hybris.platform.converters.impl.AbstractPopulatingConverter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.hospitalcore.examination.service.ExaminationService;
import my.hospitalcore.model.ExaminationModel;
import my.hospitalfacade.data.ExaminationData;
import my.hospitalfacade.examination.facade.ExaminationFacde;


/**
 *
 */
public class DefaultExaminationFacade implements ExaminationFacde
{

	private ExaminationService examinationService;
	private AbstractPopulatingConverter<ExaminationModel, ExaminationData> examinationConverter;

	@Override
	public List<ExaminationData> getExaminationForPatient(final String patientCode)
	{
		final List<ExaminationModel> exams = examinationService.getExaminationForPatient(patientCode);
		final List<ExaminationData> result = new ArrayList<ExaminationData>();
		for (final ExaminationModel e : exams)
		{
			result.add(examinationConverter.convert(e));
		}
		return result;
	}

	@Override
	public List<ExaminationData> getExaminationForDate(final Date date)
	{
		final List<ExaminationModel> exams = examinationService.getExaminationForDate(date);
		final List<ExaminationData> result = new ArrayList<ExaminationData>();
		for (final ExaminationModel e : exams)
		{
			result.add(examinationConverter.convert(e));
		}
		return result;
	}

	/**
	 * @return the examinationService
	 */
	public ExaminationService getExaminationService()
	{
		return examinationService;
	}

	@Required
	public void setExaminationService(final ExaminationService examinationService)
	{
		this.examinationService = examinationService;
	}

	/**
	 * @return the examinationConverter
	 */
	public AbstractPopulatingConverter<ExaminationModel, ExaminationData> getExaminationConverter()
	{
		return examinationConverter;
	}

	@Required
	public void setExaminationConverter(final AbstractPopulatingConverter<ExaminationModel, ExaminationData> examinationConverter)
	{
		this.examinationConverter = examinationConverter;
	}



}
