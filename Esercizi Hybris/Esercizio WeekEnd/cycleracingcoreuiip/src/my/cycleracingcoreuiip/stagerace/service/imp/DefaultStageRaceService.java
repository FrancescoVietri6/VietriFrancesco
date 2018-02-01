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
package my.cycleracingcoreuiip.stagerace.service.imp;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;

import my.cycleracingcoreuiip.model.StageRaceModel;
import my.cycleracingcoreuiip.stagerace.dao.StageRaceDao;
import my.cycleracingcoreuiip.stagerace.service.StageRaceService;


public class DefaultStageRaceService implements StageRaceService
{
	private StageRaceDao stageRaceDao;

	@Override
	public List<StageRaceModel> getStageRaces()
	{
		final List<StageRaceModel> stageRaces = stageRaceDao.findStageRaces();
		if (CollectionUtils.isEmpty(stageRaces))
		{
			return null;
		}
		return stageRaces;
	}


	public StageRaceDao getStageRaceDao()
	{
		return stageRaceDao;
	}

	@Required
	public void setStageRaceDao(final StageRaceDao stageRaceDao)
	{
		this.stageRaceDao = stageRaceDao;
	}

}
