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
package my.hospitalcore.examination.dao;

import java.util.Date;
import java.util.List;

import my.hospitalcore.model.ExaminationModel;


/**
 *
 */
public interface ExaminationDao
{
	public List<ExaminationModel> findExaminationByPatient(String patientCode);

	public List<ExaminationModel> findExaminationByDate(Date date);
}
