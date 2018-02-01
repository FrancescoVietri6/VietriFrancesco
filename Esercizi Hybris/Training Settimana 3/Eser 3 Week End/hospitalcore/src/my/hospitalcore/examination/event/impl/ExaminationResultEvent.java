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
package my.hospitalcore.examination.event.impl;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;


/**
 *
 */
public class ExaminationResultEvent extends AbstractEvent
{

	private String patientCode;

	public ExaminationResultEvent(final String patientCode)
	{
		super();
		this.patientCode = patientCode;
	}


	public String getPatientCode()
	{
		return patientCode;
	}


	public void setPatientCode(final String patientCode)
	{
		this.patientCode = patientCode;
	}


	@Override
	public String toString()
	{
		return "ExaminationResultEvent [patientCode=" + patientCode + "]";
	}

}
