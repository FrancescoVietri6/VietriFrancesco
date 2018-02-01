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
package my.cycleracingcore.team.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.cycleracingcore.model.CyclistTeamModel;
import my.cycleracingcore.model.PersonModel;
import my.cycleracingcore.team.dao.TeamDao;


/**
 *
 */
public class DefaultTeamDao extends AbstractItemDao implements TeamDao
{

	@Override
	public List<CyclistTeamModel> findTeams()
	{
		final String queryStr = "SELECT {PK} FROM {CyclistTeam}";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);

		final SearchResult<CyclistTeamModel> result = getFlexibleSearchService().search(fsq);

		final List<CyclistTeamModel> teams = result.getResult();

		return teams;
	}

	public List<PersonModel> findPersonByTeam(final String team)
	{
		final String queryStr = "SELECT {PK} FROM {CyclistTeam as ct JOIN Cyclist as c ON {ct.PK}={c.cyclistTeam}} WHERE {ct.id}=?team";

		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		fsq.addQueryParameter("team", team);

		final SearchResult<PersonModel> result = getFlexibleSearchService().search(fsq);

		final List<PersonModel> people = result.getResult();

		return people;
	}
}
