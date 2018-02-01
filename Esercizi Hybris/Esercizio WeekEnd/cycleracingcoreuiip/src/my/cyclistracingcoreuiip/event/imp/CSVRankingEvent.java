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
package my.cyclistracingcoreuiip.event.imp;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;

import org.springframework.beans.factory.annotation.Required;

import my.cycleracingcoreuiip.cronjob.imp.MyJob;


public class CSVRankingEvent extends AbstractEvent
{

	MyJob myJob;


	public MyJob getMyJob()
	{
		return myJob;
	}

	@Required
	public void setMyJob(final MyJob myJob)
	{
		this.myJob = myJob;
	}


}
