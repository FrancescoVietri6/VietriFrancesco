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
package my.cycleracingcoreuiip.stage.service.imp;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;

import my.cycleracingcoreuiip.model.StageModel;
import my.cycleracingcoreuiip.stage.dao.StageDao;
import my.cycleracingcoreuiip.stage.service.StageService;


/**
 *
 */
public class DefaultStageService implements StageService
{

	private StageDao stageDao;

	@Override
	public List<StageModel> getStagesForStageRace(final String stageRace)
	{

		final List<StageModel> stages = stageDao.findStagesByStageRace(stageRace);

		if (CollectionUtils.isEmpty(stages))
		{
			return null;
		}

		return stages;
	}


	public StageDao getStageDao()
	{
		return stageDao;
	}

	@Required
	public void setStageDao(final StageDao stageDao)
	{
		this.stageDao = stageDao;
	}

}
