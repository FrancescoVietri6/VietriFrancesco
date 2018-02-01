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
package my.hospitalcore.cronjob.impl;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.util.Calendar;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import my.hospitalcore.examination.service.ExaminationService;
import my.hospitalcore.model.ExaminationModel;


/**
 *
 */
public class BookingListExaminationJob extends AbstractJobPerformable<CronJobModel>
{

	private ExaminationService examinationService;
	private static final Logger LOG = Logger.getLogger(BookingListExaminationJob.class);

	@Override
	public PerformResult perform(final CronJobModel model)
	{
		LOG.info("Entering in BookingListExaminationJob");
		final Calendar today = Calendar.getInstance();

		today.add(Calendar.DATE, 1);

		final List<ExaminationModel> exams = examinationService.getExaminationForDate(today.getTime());

		LOG.info("Examination to do tomorrow:");

		for (final ExaminationModel e : exams)
		{

			LOG.info(e.getPatient().getName() + " " + e.getPatient().getSurname() + " " + e.getDate().toString() + " "
					+ e.getDoctor().getName() + " " + e.getDoctor().getSurname());

		}

		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}


	public ExaminationService getExaminationService()
	{
		return examinationService;
	}

	@Required
	public void setExaminationService(final ExaminationService examinationService)
	{
		this.examinationService = examinationService;
	}

}
