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
package my.cycleracinguiip.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import my.cycleracingcoreuiip.data.CyclistData;
import my.cycleracingcoreuiip.model.CyclistModel;


/**
 *
 */
public class CyclistPopulator implements Populator<CyclistModel, CyclistData>
{

	@Override
	public void populate(final CyclistModel source, final CyclistData target) throws ConversionException
	{
		target.setId(source.getId());
		target.setName(source.getName());
		target.setNationality(source.getNationality());
		target.setSurname(source.getSurname());
	}

}
