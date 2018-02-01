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
package my.cycleracingcoreuiip.interceptor.imp;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import java.util.Calendar;
import java.util.Date;

import my.cycleracingcoreuiip.model.StageModel;


public class MyInitStageInterceptor implements InitDefaultsInterceptor<StageModel>
{

	@Override
	public void onInitDefaults(final StageModel stage, final InterceptorContext ctx) throws InterceptorException
	{

		final Calendar today = Calendar.getInstance();

		final int dom = today.get(Calendar.DAY_OF_MONTH) - 1;
		final int month = today.get(Calendar.MONTH) + 1;
		final int year = today.get(Calendar.YEAR);
		final Date yesterday = new Date();
		yesterday.setDate(dom);
		yesterday.setMonth(month);
		yesterday.setYear(year);
		stage.setDate(yesterday);

	}

}
