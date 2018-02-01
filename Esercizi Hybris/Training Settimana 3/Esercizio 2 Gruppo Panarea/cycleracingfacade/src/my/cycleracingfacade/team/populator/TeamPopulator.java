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
package my.cycleracingfacade.team.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cycleracingcore.model.CyclistModel;
import my.cycleracingcore.model.CyclistTeamModel;
import my.cycleracingcore.model.ManagerModel;
import my.cycleracingfacade.data.CyclistData;
import my.cycleracingfacade.data.CyclistTeamData;
import my.cycleracingfacade.data.ManagerData;


/**
 *
 */
public class TeamPopulator implements Populator<CyclistTeamModel, CyclistTeamData>
{

	AbstractPopulatingConverter<ManagerModel, ManagerData> managerConverter;
	AbstractPopulatingConverter<CyclistModel, CyclistData> cyclistConverter;

	@Override
	public void populate(final CyclistTeamModel source, final CyclistTeamData target) throws ConversionException
	{
		target.setId(source.getId());
		target.setName(source.getName());
		target.setYear(source.getYear());
		target.setManager(managerConverter.convert(source.getManager()));
		target.setCountry(source.getCountry());
		target.setBicycle(source.getBicycle());

		final Collection<CyclistModel> cyclists = source.getCyclists();
		final List<CyclistData> cyclistsDataList = new ArrayList<CyclistData>();
		for (final CyclistModel c : cyclists)
		{
			cyclistsDataList.add(cyclistConverter.convert(c));
		}
		target.setCyclists(cyclistsDataList);
	}

	/**
	 * @return the managerConverter
	 */
	public AbstractPopulatingConverter<ManagerModel, ManagerData> getManagerConverter()
	{
		return managerConverter;
	}

	@Required
	public void setManagerConverter(final AbstractPopulatingConverter<ManagerModel, ManagerData> managerConverter)
	{
		this.managerConverter = managerConverter;
	}

	/**
	 * @return the cyclistConverter
	 */
	public AbstractPopulatingConverter<CyclistModel, CyclistData> getCyclistConverter()
	{
		return cyclistConverter;
	}

	@Required
	public void setCyclistConverter(final AbstractPopulatingConverter<CyclistModel, CyclistData> cyclistConverter)
	{
		this.cyclistConverter = cyclistConverter;
	}

}
