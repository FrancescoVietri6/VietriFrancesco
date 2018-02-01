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
package my.hospitalfacade.populators.impl;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import my.hospitalcore.model.PersonsModel;
import my.hospitalfacade.data.PersonsData;


/**
 *
 */
public class PersonsPopulator implements Populator<PersonsModel, PersonsData>
{

	@Override
	public void populate(final PersonsModel source, final PersonsData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setName(source.getName());
		target.setSurname(source.getSurname());
		target.setFc(source.getFc());
		target.setBirthDate(source.getBirthDate());
		target.setBirthPlace(source.getBirthPlace());
		target.setGender(source.getGender());
	}

}
