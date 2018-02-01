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
package my.hospitalcore.setup;

import static my.hospitalcore.constants.HospitalcoreConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.hospitalcore.constants.HospitalcoreConstants;
import my.hospitalcore.service.HospitalcoreService;


@SystemSetup(extension = HospitalcoreConstants.EXTENSIONNAME)
public class HospitalcoreSystemSetup
{
	private final HospitalcoreService hospitalcoreService;

	public HospitalcoreSystemSetup(final HospitalcoreService hospitalcoreService)
	{
		this.hospitalcoreService = hospitalcoreService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		hospitalcoreService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return HospitalcoreSystemSetup.class.getResourceAsStream("/hospitalcore/sap-hybris-platform.png");
	}
}
