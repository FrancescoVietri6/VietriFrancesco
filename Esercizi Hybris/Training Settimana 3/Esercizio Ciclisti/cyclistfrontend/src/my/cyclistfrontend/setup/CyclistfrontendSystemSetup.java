/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package my.cyclistfrontend.setup;

import static my.cyclistfrontend.constants.CyclistfrontendConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.cyclistfrontend.constants.CyclistfrontendConstants;
import my.cyclistfrontend.service.CyclistfrontendService;


@SystemSetup(extension = CyclistfrontendConstants.EXTENSIONNAME)
public class CyclistfrontendSystemSetup
{
	private final CyclistfrontendService cyclistfrontendService;

	public CyclistfrontendSystemSetup(final CyclistfrontendService cyclistfrontendService)
	{
		this.cyclistfrontendService = cyclistfrontendService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		cyclistfrontendService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return CyclistfrontendSystemSetup.class.getResourceAsStream("/cyclistfrontend/sap-hybris-platform.png");
	}
}
