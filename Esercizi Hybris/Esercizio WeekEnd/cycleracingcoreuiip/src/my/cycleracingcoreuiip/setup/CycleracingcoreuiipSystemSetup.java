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
package my.cycleracingcoreuiip.setup;

import static my.cycleracingcoreuiip.constants.CycleracingcoreuiipConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.cycleracingcoreuiip.constants.CycleracingcoreuiipConstants;
import my.cycleracingcoreuiip.service.CycleracingcoreuiipService;


@SystemSetup(extension = CycleracingcoreuiipConstants.EXTENSIONNAME)
public class CycleracingcoreuiipSystemSetup
{
	private final CycleracingcoreuiipService cycleracingcoreuiipService;

	public CycleracingcoreuiipSystemSetup(final CycleracingcoreuiipService cycleracingcoreuiipService)
	{
		this.cycleracingcoreuiipService = cycleracingcoreuiipService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		cycleracingcoreuiipService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return CycleracingcoreuiipSystemSetup.class.getResourceAsStream("/cycleracingcoreuiip/sap-hybris-platform.png");
	}
}
