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

import my.hospitalcore.model.DoctorModel;
import my.hospitalcore.model.ExaminationModel;
import my.hospitalcore.model.PatientModel;
import my.hospitalfacade.data.DoctorData;
import my.hospitalfacade.data.ExaminationData;
import my.hospitalfacade.data.PatientData;


/**
 *
 */
public class ExaminationPopulator implements Populator<ExaminationModel, ExaminationData>
{
	AbstractPopulatingConverter<DoctorModel, DoctorData> doctorConverter;
	AbstractPopulatingConverter<PatientModel, PatientData> patientConverter;

	@Override
	public void populate(final ExaminationModel source, final ExaminationData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setDate(source.getDate());
		target.setResult(source.getResult());
		target.setInfos(source.getInfos());
		target.setDoctor(doctorConverter.convert(source.getDoctor()));
		target.setPatient(patientConverter.convert(source.getPatient()));
	}
}
