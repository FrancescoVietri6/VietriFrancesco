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
package my.cycleracingcore.team.service.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Required;

import my.cycleracingcore.model.CyclistTeamModel;
import my.cycleracingcore.model.PersonModel;
import my.cycleracingcore.team.dao.TeamDao;
import my.cycleracingcore.team.service.TeamService;


/**
 *
 */
public class DefaultTeamService implements TeamService
{
	private TeamDao teamDao;

	@Override
	public List<CyclistTeamModel> getTeams()
	{
		final List<CyclistTeamModel> teams = teamDao.findTeams();
		if (CollectionUtils.isEmpty(teams))
		{
			return null;
		}
		return teams;
	}

	@Override
	public List<PersonModel> getPersonForTeam(final String team)
	{
		final List<PersonModel> people = teamDao.findPersonByTeam(team);
		if (CollectionUtils.isEmpty(people))
		{
			return null;
		}
		return people;
	}

	/**
	 * @return the teamDao
	 */
	public TeamDao getTeamDao()
	{
		return teamDao;
	}

	@Required
	public void setTeamDao(final TeamDao teamDao)
	{
		this.teamDao = teamDao;
	}

}
