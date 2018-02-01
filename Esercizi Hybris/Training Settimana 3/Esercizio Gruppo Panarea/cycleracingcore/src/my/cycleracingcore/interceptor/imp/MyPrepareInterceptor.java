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
package my.cycleracingcore.interceptor.imp;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cycleracingcore.model.StageModel;
import my.cycleracingcore.model.StageRaceModel;
import my.cyclistracingcore.stage.service.StageService;


public class MyPrepareInterceptor implements PrepareInterceptor<StageRaceModel>
{
	private StageService stageService;

	@Override
	public void onPrepare(final StageRaceModel stageRace, final InterceptorContext ctx) throws InterceptorException
	{

		final List<StageModel> stages = stageService.getStagesForStageRace(stageRace.getId());

		for (final StageModel stage : stages)
		{

			final Date data = stage.getStartDate();
			final int days = stage.getDays().intValue();

			final Calendar cal = Calendar.getInstance();
			cal.setTime(data);
			cal.add(Calendar.DAY_OF_MONTH, days);
			stage.setEndtDate(cal.getTime());

		}

	}


	public StageService getStageService()
	{
		return stageService;
	}

	@Required
	public void setStageService(final StageService stageService)
	{
		this.stageService = stageService;
	}

}
