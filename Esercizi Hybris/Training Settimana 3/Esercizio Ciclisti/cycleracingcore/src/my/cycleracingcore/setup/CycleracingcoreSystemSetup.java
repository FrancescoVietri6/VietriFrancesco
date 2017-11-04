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
package my.cycleracingcore.setup;

import static my.cycleracingcore.constants.CycleracingcoreConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.cycleracingcore.constants.CycleracingcoreConstants;
import my.cycleracingcore.service.CycleracingcoreService;


@SystemSetup(extension = CycleracingcoreConstants.EXTENSIONNAME)
public class CycleracingcoreSystemSetup
{
	private final CycleracingcoreService cycleracingcoreService;

	public CycleracingcoreSystemSetup(final CycleracingcoreService cycleracingcoreService)
	{
		this.cycleracingcoreService = cycleracingcoreService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		cycleracingcoreService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return CycleracingcoreSystemSetup.class.getResourceAsStream("/cycleracingcore/sap-hybris-platform.png");
	}
}
