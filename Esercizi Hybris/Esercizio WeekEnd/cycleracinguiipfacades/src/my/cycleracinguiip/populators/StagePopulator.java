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
package my.cycleracinguiip.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.beans.factory.annotation.Required;

import my.cycleracingcoreuiip.data.StageData;
import my.cycleracingcoreuiip.data.StageRaceData;
import my.cycleracingcoreuiip.model.StageModel;
import my.cycleracingcoreuiip.model.StageRaceModel;


/**
 *
 */
public class StagePopulator implements Populator<StageModel, StageData>
{
	public AbstractPopulatingConverter<StageRaceModel, StageRaceData> stageRace;

	@Override
	public void populate(final StageModel source, final StageData target) throws ConversionException
	{
		target.setId(source.getId());
		target.setName(source.getName());
		target.setStageNumber(source.getStageNumber());
		target.setLength(source.getLength());
		target.setDate(source.getDate());
		target.setType(source.getType());
		target.setStageRace(stageRace.convert(source.getStageRace()));
	}

	/**
	 * @return the stageRace
	 */
	public AbstractPopulatingConverter<StageRaceModel, StageRaceData> getStageRace()
	{
		return stageRace;
	}

	@Required
	public void setStageRace(final AbstractPopulatingConverter<StageRaceModel, StageRaceData> stageRace)
	{
		this.stageRace = stageRace;
	}

}
