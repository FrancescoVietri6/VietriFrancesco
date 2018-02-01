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
package my.cycleracingcoreuiip.stageranking.service.imp;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;

import my.cycleracingcoreuiip.model.StageRankingModel;
import my.cycleracingcoreuiip.stageranking.dao.StageRankingDao;
import my.cycleracingcoreuiip.stageranking.service.StageRankingService;


public class DefaultStafeRankingService implements StageRankingService
{

	private StageRankingDao stageRankingDao;

	@Override
	public List<StageRankingModel> getStageRankingForStageRace(final String stageRace)
	{
		final List<StageRankingModel> rankings = stageRankingDao.findStageRankingByStageRace(stageRace);

		if (CollectionUtils.isEmpty(rankings))
		{
			return null;
		}

		return rankings;

	}

	/**
	 * @return the stageRankingDao
	 */
	public StageRankingDao getStageRankingDao()
	{
		return stageRankingDao;
	}

	@Required
	public void setStageRankingDao(final StageRankingDao stageRankingDao)
	{
		this.stageRankingDao = stageRankingDao;
	}

}
