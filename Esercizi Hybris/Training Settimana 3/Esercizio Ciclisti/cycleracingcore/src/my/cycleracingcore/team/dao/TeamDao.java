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
package my.cycleracingcore.team.dao;

import java.util.List;

import my.cycleracingcore.model.CyclistTeamModel;
import my.cycleracingcore.model.PersonModel;


/**
 *
 */
public interface TeamDao
{
	public List<CyclistTeamModel> findTeams();

	public List<PersonModel> findPersonByTeam(String team);
}
