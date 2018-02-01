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
package my.universityuiip.interceptor.com.imp;

import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;

import java.util.UUID;

import my.universityuiip.model.IndividualModel;
import my.universityuiip.model.ProfessorModel;
import my.universityuiip.model.StudentModel;


public class MyInitInterception implements InitDefaultsInterceptor<IndividualModel>
{

	@Override
	public void onInitDefaults(final IndividualModel individual, final InterceptorContext ctx) throws InterceptorException
	{
		final UUID randomUUID = UUID.randomUUID();
		final String serialNumber = randomUUID.toString();
		if (individual instanceof StudentModel)
		{
			final StudentModel student = (StudentModel) individual;
			student.setSerialNumber(serialNumber);
		}
		else
		{
			final ProfessorModel professor = (ProfessorModel) individual;
			professor.setSerialNumber(serialNumber);
		}
	}

}
