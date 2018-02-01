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
import my.cycleracingcoreuiip.data.CyclistRankingData;
import my.cycleracingcoreuiip.data.StageData;
import my.cycleracingcoreuiip.data.StageRaceData;
import my.cycleracingcoreuiip.model.CyclistModel;
import my.cycleracingcoreuiip.model.CyclistRankingModel;
import my.cycleracingcoreuiip.model.StageModel;
import my.cycleracingcoreuiip.model.StageRaceModel;


/**
 *
 */
public class CyclistRankingPopulator implements Populator<CyclistRankingModel, CyclistRankingData>
{

	AbstractPopulatingConverter<StageModel, StageData> stage;
	AbstractPopulatingConverter<StageRaceModel, StageRaceData> stageRace;
	AbstractPopulatingConverter<CyclistModel, CyclistData> cyclist;


	@Override
	public void populate(final CyclistRankingModel source, final CyclistRankingData target) throws ConversionException
	{
		target.setId(source.getId());
		target.setPosition(source.getPosition());
		target.setTime(source.getTime());
		target.setStage(stage.convert(source.getStage()));
		target.setCyclist(cyclist.convert(source.getCyclist()));
		target.setStageRace(stageRace.convert(source.getStageRace()));
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


	/**
	 * @return the cyclist
	 */
	public AbstractPopulatingConverter<CyclistModel, CyclistData> getCyclist()
	{
		return cyclist;
	}


	@Required
	public void setCyclist(final AbstractPopulatingConverter<CyclistModel, CyclistData> cyclist)
	{
		this.cyclist = cyclist;
	}

}
