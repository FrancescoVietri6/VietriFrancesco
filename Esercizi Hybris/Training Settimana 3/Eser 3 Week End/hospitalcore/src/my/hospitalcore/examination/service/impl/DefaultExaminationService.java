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
package my.hospitalcore.examination.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import my.hospitalcore.examination.dao.ExaminationDao;
import my.hospitalcore.examination.service.ExaminationService;
import my.hospitalcore.model.ExaminationModel;


/**
 *
 */
public class DefaultExaminationService implements ExaminationService
{
	private ExaminationDao examinationDao;
	private static final Logger LOG = Logger.getLogger(DefaultExaminationService.class);

	@Override
	public List<ExaminationModel> getExaminationForPatient(final String patientCode)
	{
		LOG.info("Entering in DefaultExaminationService: we are doing getExaminationForPatient(" + patientCode + ")");
		return examinationDao.findExaminationByPatient(patientCode);
	}

	@Override
	public List<ExaminationModel> getExaminationForDate(final Date date)
	{
		LOG.info("Entering in DefaultExaminationService: we are doing getExaminationForDate(" + date.toString() + ")");
		return examinationDao.findExaminationByDate(date);
	}


	public ExaminationDao getExaminationDao()
	{
		return examinationDao;
	}

	@Required
	public void setExaminationDao(final ExaminationDao examinationDao)
	{
		this.examinationDao = examinationDao;
	}

}
