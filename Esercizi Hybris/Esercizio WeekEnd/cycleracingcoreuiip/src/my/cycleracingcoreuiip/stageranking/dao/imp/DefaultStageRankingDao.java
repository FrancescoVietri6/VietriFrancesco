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
package my.cycleracingcoreuiip.stageranking.dao.imp;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.cycleracingcoreuiip.model.StageRankingModel;
import my.cycleracingcoreuiip.stageranking.dao.StageRankingDao;


public class DefaultStageRankingDao extends AbstractItemDao implements StageRankingDao
{

	@Override
	public List<StageRankingModel> findStageRankingByStageRace(final String stageRace)
	{
		final String queryStr = "SELECT {r.PK},{c.name},{c.surname} FROM {StageRace as sr JOIN Stage as st ON {sr.PK}={st.stageRace}"
				+ "JOIN StageRanking as r ON {st.PK}={r.stage} JOIN Cyclist as c ON {c.PK}={r.cyclist}} "
				+ "WHERE {s.stages} = ?stageRace ORDER BY {r.stage},{r.position},{c.surname},{c.name}";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);

		fsq.addQueryParameter("stageRace", stageRace);

		final SearchResult<StageRankingModel> result = getFlexibleSearchService().search(fsq);

		final List<StageRankingModel> stageRankings = result.getResult();

		return stageRankings;
	}

}
