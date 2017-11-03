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
package my.cyclistracingcore.handler.impl;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import java.util.Calendar;
import java.util.Date;

import my.cycleracingcore.model.CyclistModel;


public class CyclistAgeHandler implements DynamicAttributeHandler<Integer, CyclistModel>
{

	private Integer age;

	@Override
	public Integer get(final CyclistModel model)
	{
		final Date birth = model.getBirthDate();
		final int year = birth.getYear();
		final Calendar today = Calendar.getInstance();

		final Date now = today.getTime();
		final int yearNow = now.getYear();

		age = new Integer(yearNow - year);

		return age;

	}

	@Override
	public void set(final CyclistModel model, final Integer age)
	{
		this.age = age;

	}

}
