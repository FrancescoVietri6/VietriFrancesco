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
package my.cycleracingcoreuiip.stage.dao.imp;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.cycleracingcoreuiip.model.StageModel;
import my.cycleracingcoreuiip.stage.dao.StageDao;


public class DefaultStageDao extends AbstractItemDao implements StageDao
{

	@Override
	public List<StageModel> findStagesByStageRace(final String stageRace)
	{
		final String queryStr = "SELECT {s.PK} FROM {Stage as s} WHERE {s.stages} = ?stageRace ";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);

		fsq.addQueryParameter("Stage", stageRace);

		final SearchResult<StageModel> result = getFlexibleSearchService().search(fsq);

		final List<StageModel> stages = result.getResult();

		return stages;
	}

}
