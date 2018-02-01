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
package my.hospitalfacade.populators.impl;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.hospitalcore.model.DoctorModel;
import my.hospitalcore.model.ExaminationModel;
import my.hospitalfacade.data.DoctorData;
import my.hospitalfacade.data.ExaminationData;


/**
 *
 */
public class DoctorPopulator implements Populator<DoctorModel, DoctorData>
{
	AbstractPopulatingConverter<ExaminationModel, ExaminationData> examinationConverter;

	@Override
	public void populate(final DoctorModel source, final DoctorData target) throws ConversionException
	{
		target.setRegisterNumber(source.getRegisterNumber());
		final Collection<ExaminationModel> exams = source.getExaminations();
		final List<ExaminationData> result = new ArrayList<ExaminationData>();
		for (final ExaminationModel e : exams)
		{
			result.add(examinationConverter.convert(e));
		}
		target.setExaminations(result);
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
