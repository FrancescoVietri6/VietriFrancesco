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
package my.cycleracing.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import my.cycleracingfacade.data.CyclistTeamData;
import my.cycleracingfacade.data.PersonData;
import my.cycleracingfacade.team.facade.TeamFacade;


/**
 *
 */
public class DefaultTeamController
{
	private TeamFacade teamFacade;

	@RequestMapping(value = "/teams")
	public String showTeams(final Model model)
	{
		final List<CyclistTeamData> teams = teamFacade.getTeams();
		model.addAttribute("teams", teams);
		return "TeamListing";
	}

	@RequestMapping(value = "/teams/{teamName}")
	public String showTeamDetails(@PathVariable final String teamName, final Model model)
	{
		final List<PersonData> people = teamFacade.getPersonForTeam(teamName);
		model.addAttribute("people", people);
		return "TeamDetails";
	}



	@Autowired
	public void setTeamFacade(final TeamFacade teamFacade)
	{
		this.teamFacade = teamFacade;
	}

}
