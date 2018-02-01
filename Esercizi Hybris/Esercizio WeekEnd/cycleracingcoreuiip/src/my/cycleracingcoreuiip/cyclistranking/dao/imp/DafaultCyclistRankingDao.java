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
package my.cycleracingcoreuiip.cyclistranking.dao.imp;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.cycleracingcoreuiip.cyclistranking.dao.CyclistRankingDao;
import my.cycleracingcoreuiip.model.CyclistRankingModel;


public class DafaultCyclistRankingDao extends AbstractItemDao implements CyclistRankingDao
{

	@Override
	public List<CyclistRankingModel> findCyclistRankingByStageRace(final String stageRace)
	{
		final String query = "SELECT {PK} FROM {CyclistRanking} WHERE {stageRace}= ?stageRace";

		final FlexibleSearchQuery flex = new FlexibleSearchQuery(query);
		flex.addQueryParameter("stageRace", stageRace);
		final SearchResult<CyclistRankingModel> result = getFlexibleSearchService().search(flex);
		final List<CyclistRankingModel> cyclistRanking = result.getResult();

		return cyclistRanking;
	}

	@Override
	public List<CyclistRankingModel> orderCyclistRanking()
	{
		final String query = "SELECT {PK} FROM {CyclistRanking} ORDER BY {stageRace} ASC, {position} ASC";

		final FlexibleSearchQuery flex = new FlexibleSearchQuery(query);
		final SearchResult<CyclistRankingModel> result = getFlexibleSearchService().search(flex);
		final List<CyclistRankingModel> cyclistRanking = result.getResult();

		return cyclistRanking;
	}

}
