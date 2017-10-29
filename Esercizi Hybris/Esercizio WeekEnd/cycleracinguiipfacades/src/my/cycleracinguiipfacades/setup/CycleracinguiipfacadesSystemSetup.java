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
package my.cycleracinguiipfacades.setup;

import static my.cycleracinguiipfacades.constants.CycleracinguiipfacadesConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.cycleracinguiipfacades.constants.CycleracinguiipfacadesConstants;
import my.cycleracinguiipfacades.service.CycleracinguiipfacadesService;


@SystemSetup(extension = CycleracinguiipfacadesConstants.EXTENSIONNAME)
public class CycleracinguiipfacadesSystemSetup
{
	private final CycleracinguiipfacadesService cycleracinguiipfacadesService;

	public CycleracinguiipfacadesSystemSetup(final CycleracinguiipfacadesService cycleracinguiipfacadesService)
	{
		this.cycleracinguiipfacadesService = cycleracinguiipfacadesService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		cycleracinguiipfacadesService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return CycleracinguiipfacadesSystemSetup.class.getResourceAsStream("/cycleracinguiipfacades/sap-hybris-platform.png");
	}
}
