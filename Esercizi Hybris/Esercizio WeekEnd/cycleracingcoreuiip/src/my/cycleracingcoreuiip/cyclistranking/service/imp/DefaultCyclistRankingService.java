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
package my.cycleracingcoreuiip.cyclistranking.service.imp;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;

import my.cycleracingcoreuiip.cyclistranking.dao.CyclistRankingDao;
import my.cycleracingcoreuiip.cyclistranking.service.CyclistRankingService;
import my.cycleracingcoreuiip.model.CyclistRankingModel;


public class DefaultCyclistRankingService implements CyclistRankingService
{
	private CyclistRankingDao cyclistRankingDao;

	@Override
	public List<CyclistRankingModel> getCyclistRankingForStageRace(final String stageRace)
	{
		final List<CyclistRankingModel> cyclistRanking = cyclistRankingDao.findCyclistRankingByStageRace(stageRace);
		if (CollectionUtils.isEmpty(cyclistRanking))
		{
			return null;
		}
		return cyclistRanking;
	}


	public CyclistRankingDao getCyclistRankingDao()
	{
		return cyclistRankingDao;
	}

	@Required
	public void setCyclistRankingDao(final CyclistRankingDao cyclistRankingDao)
	{
		this.cyclistRankingDao = cyclistRankingDao;
	}

}
