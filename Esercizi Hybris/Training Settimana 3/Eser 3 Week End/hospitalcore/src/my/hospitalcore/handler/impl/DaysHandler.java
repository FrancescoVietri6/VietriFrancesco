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
package my.hospitalcore.handler.impl;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import java.util.Date;

import org.apache.log4j.Logger;

import my.hospitalcore.model.HospitalizationModel;


/**
 *
 */
public class DaysHandler implements DynamicAttributeHandler<Integer, HospitalizationModel>
{
	private Integer numbDays;
	private static final Logger LOG = Logger.getLogger(DaysHandler.class);

	@Override
	public Integer get(final HospitalizationModel model)
	{
		LOG.info("Entering in DaysHandler");
		final Date dayIn = model.getDateIn();
		final Date dayOut = model.getDateOut();

		final long millisIn = dayIn.getTime();
		final long millisOut = dayOut.getTime();

		final long millis = millisIn - millisOut;

		final int days = (int) (millis / 86400000);

		numbDays = new Integer(days);

		return numbDays;
	}

	@Override
	public void set(final HospitalizationModel model, final Integer days)
	{

		numbDays = days;

	}

}
