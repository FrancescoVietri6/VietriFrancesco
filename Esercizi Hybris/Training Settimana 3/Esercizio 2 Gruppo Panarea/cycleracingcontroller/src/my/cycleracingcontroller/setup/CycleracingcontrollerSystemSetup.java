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
package my.cycleracingcontroller.setup;

import static my.cycleracingcontroller.constants.CycleracingcontrollerConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.cycleracingcontroller.constants.CycleracingcontrollerConstants;
import my.cycleracingcontroller.service.CycleracingcontrollerService;


@SystemSetup(extension = CycleracingcontrollerConstants.EXTENSIONNAME)
public class CycleracingcontrollerSystemSetup
{
	private final CycleracingcontrollerService cycleracingcontrollerService;

	public CycleracingcontrollerSystemSetup(final CycleracingcontrollerService cycleracingcontrollerService)
	{
		this.cycleracingcontrollerService = cycleracingcontrollerService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		cycleracingcontrollerService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return CycleracingcontrollerSystemSetup.class.getResourceAsStream("/cycleracingcontroller/sap-hybris-platform.png");
	}
}
