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
package my.cycleracingcoreuiip.stagerace.dao.imp;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.cycleracingcoreuiip.model.StageRaceModel;
import my.cycleracingcoreuiip.stagerace.dao.StageRaceDao;


public class DefaultStageRaceDao extends AbstractItemDao implements StageRaceDao
{

	@Override
	public List<StageRaceModel> findStageRaces()
	{
		final String query = "SELECT {PK} FROM {StageRace}";
		final FlexibleSearchQuery flex = new FlexibleSearchQuery(query);
		final SearchResult<StageRaceModel> result = getFlexibleSearchService().search(flex);
		final List<StageRaceModel> stageRaces = result.getResult();

		return stageRaces;
	}

}
