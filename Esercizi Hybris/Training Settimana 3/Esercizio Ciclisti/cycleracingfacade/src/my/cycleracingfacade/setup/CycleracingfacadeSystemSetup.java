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
package my.cycleracingfacade.setup;

import static my.cycleracingfacade.constants.CycleracingfacadeConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.cycleracingfacade.constants.CycleracingfacadeConstants;
import my.cycleracingfacade.service.CycleracingfacadeService;


@SystemSetup(extension = CycleracingfacadeConstants.EXTENSIONNAME)
public class CycleracingfacadeSystemSetup
{
	private final CycleracingfacadeService cycleracingfacadeService;

	public CycleracingfacadeSystemSetup(final CycleracingfacadeService cycleracingfacadeService)
	{
		this.cycleracingfacadeService = cycleracingfacadeService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		cycleracingfacadeService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return CycleracingfacadeSystemSetup.class.getResourceAsStream("/cycleracingfacade/sap-hybris-platform.png");
	}
}
