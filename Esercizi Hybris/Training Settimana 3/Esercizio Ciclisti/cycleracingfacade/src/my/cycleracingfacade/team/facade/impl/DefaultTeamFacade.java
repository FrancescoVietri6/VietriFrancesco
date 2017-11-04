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
package my.cycleracingfacade.team.facade.impl;

import de.hybris.platform.converters.impl.AbstractPopulatingConverter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cycleracingcore.model.CyclistTeamModel;
import my.cycleracingcore.model.PersonModel;
import my.cycleracingcore.team.service.TeamService;
import my.cycleracingfacade.data.CyclistTeamData;
import my.cycleracingfacade.data.PersonData;
import my.cycleracingfacade.team.facade.TeamFacade;



public class DefaultTeamFacade implements TeamFacade
{
	private TeamService teamService;
	AbstractPopulatingConverter<CyclistTeamModel, CyclistTeamData> cyclistTeamConverter;
	AbstractPopulatingConverter<PersonModel, PersonData> personConverter;

	@Override
	public List<CyclistTeamData> getTeams()
	{

		final List<CyclistTeamModel> cyclists = teamService.getTeams();
		final List<CyclistTeamData> result = new ArrayList<CyclistTeamData>();
		for (final CyclistTeamModel c : cyclists)
		{
			result.add(cyclistTeamConverter.convert(c));
		}
		return result;
	}

	public List<PersonData> getPersonForTeam(final String team)
	{
		final List<PersonModel> person = teamService.getPersonForTeam(team);
		final List<PersonData> people = new ArrayList<PersonData>();
		for (final PersonModel p : person)
		{
			people.add(personConverter.convert(p));
		}
		return people;
	}


	public TeamService getTeamService()
	{
		return teamService;
	}

	@Required
	public void setTeamService(final TeamService teamService)
	{
		this.teamService = teamService;
	}

	/**
	 * @return the cyclistTeamConverter
	 */
	public AbstractPopulatingConverter<CyclistTeamModel, CyclistTeamData> getCyclistTeamConverter()
	{
		return cyclistTeamConverter;
	}

	@Required
	public void setCyclistTeamConverter(final AbstractPopulatingConverter<CyclistTeamModel, CyclistTeamData> cyclistTeamConverter)
	{
		this.cyclistTeamConverter = cyclistTeamConverter;
	}

	/**
	 * @return the personConverter
	 */
	public AbstractPopulatingConverter<PersonModel, PersonData> getPersonConverter()
	{
		return personConverter;
	}

	@Required
	public void setPersonConverter(final AbstractPopulatingConverter<PersonModel, PersonData> personConverter)
	{
		this.personConverter = personConverter;
	}



}
