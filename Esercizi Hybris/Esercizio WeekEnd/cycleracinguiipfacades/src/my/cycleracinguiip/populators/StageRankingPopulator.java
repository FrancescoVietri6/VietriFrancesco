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

import my.cycleracingcoreuiip.data.CyclistData;
import my.cycleracingcoreuiip.data.StageData;
import my.cycleracingcoreuiip.data.StageRankingData;
import my.cycleracingcoreuiip.model.CyclistModel;
import my.cycleracingcoreuiip.model.StageModel;
import my.cycleracingcoreuiip.model.StageRankingModel;


/**
 *
 */
public class StageRankingPopulator implements Populator<StageRankingModel, StageRankingData>
{
	AbstractPopulatingConverter<StageModel, StageData> stage;
	AbstractPopulatingConverter<CyclistModel, CyclistData> cyclist;

	@Override
	public void populate(final StageRankingModel source, final StageRankingData target) throws ConversionException
	{

		target.setId(source.getId());
		target.setPosition(source.getPosition());
		target.setRetired(source.getRetired());
		target.setTime(source.getTime());
		target.setStage(stage.convert(source.getStage()));
		target.setCyclist(cyclist.convert(source.getCyclist()));


	}

	/**
	 * @return the stage
	 */
	public AbstractPopulatingConverter<StageModel, StageData> getStage()
	{
		return stage;
	}

	@Required
	public void setStage(final AbstractPopulatingConverter<StageModel, StageData> stage)
	{
		this.stage = stage;
	}

}
