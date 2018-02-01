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
package my.cycleracingfacade.cyclist.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import my.cycleracingcore.model.CyclistModel;
import my.cycleracingfacade.data.CyclistData;



public class CyclistPopulator implements Populator<CyclistModel, CyclistData>
{

	@Override
	public void populate(final CyclistModel source, final CyclistData target) throws ConversionException
	{
		target.setCountry(source.getCountry());
		target.setBirthDate(source.getBirthDate());
		target.setCyclistAge(source.getCyclistAge());
		target.setWeight(source.getWeight());
		target.setHigh(source.getHigh());

	}

}
