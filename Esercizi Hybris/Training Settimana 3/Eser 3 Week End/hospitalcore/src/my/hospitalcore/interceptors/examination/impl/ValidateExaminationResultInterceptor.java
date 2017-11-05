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
package my.hospitalcore.interceptors.examination.impl;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import my.hospitalcore.enums.ExamResult;
import my.hospitalcore.examination.event.impl.ExaminationResultEvent;
import my.hospitalcore.model.ExaminationModel;


/**
 *
 */
public class ValidateExaminationResultInterceptor implements ValidateInterceptor<ExaminationModel>
{
	@Autowired
	private EventService eventService;
	private static final Logger LOG = Logger.getLogger(ValidateExaminationResultInterceptor.class);

	@Override
	public void onValidate(final ExaminationModel model, final InterceptorContext ctx) throws InterceptorException
	{
		LOG.info("Entering in the ValidateExaminationResultInterceptor");
		if (model.getResult() == ExamResult.POSITIVE)
		{
			eventService.publishEvent(new ExaminationResultEvent(model.getPatient().getCode()));
		}

	}

}
