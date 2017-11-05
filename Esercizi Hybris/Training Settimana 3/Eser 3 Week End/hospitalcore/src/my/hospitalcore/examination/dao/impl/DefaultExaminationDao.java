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
package my.hospitalcore.examination.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import my.hospitalcore.examination.dao.ExaminationDao;
import my.hospitalcore.model.ExaminationModel;


/**
 *
 */
public class DefaultExaminationDao extends AbstractItemDao implements ExaminationDao
{
	private static final Logger LOG = Logger.getLogger(DefaultExaminationDao.class);

	@Override
	public List<ExaminationModel> findExaminationByPatient(final String patientCode)
	{
		LOG.info("Entering in DefaultExaminationDao: we are doing findExaminationByPatient(" + patientCode + ")");

		final String queryStr = "SELECT {p.name},{p.surname},{ex.PK} FROM {Patient as p JOIN Examination as ex ON {p.PK}={ex.patient}} WHERE {p.code} = ?patientCode ";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);

		fsq.addQueryParameter("patientCode", patientCode);

		final SearchResult<ExaminationModel> result = getFlexibleSearchService().search(fsq);

		final List<ExaminationModel> exams = result.getResult();

		return exams;
	}

	@Override
	public List<ExaminationModel> findExaminationByDate(final Date today)
	{
		/*
		 * final Calendar cal = Calendar.getInstance(); cal.setTime(today); cal.add(Calendar.DATE, 1); final Date tomorrow
		 * = cal.getTime();
		 */
		LOG.info("Entering in DefaultExaminationDao: we are doing findExaminationByDate(" + today.toString() + ")");
		final String queryStr = "SELECT {ex.PK} FROM {Examination as ex} WHERE {ex.date} = ?today";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);

		fsq.addQueryParameter("today", today);

		final SearchResult<ExaminationModel> result = getFlexibleSearchService().search(fsq);

		final List<ExaminationModel> exams = result.getResult();

		return exams;
	}

}
