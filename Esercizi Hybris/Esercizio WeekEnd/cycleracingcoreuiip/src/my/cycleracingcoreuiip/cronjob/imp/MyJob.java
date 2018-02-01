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
package my.cycleracingcoreuiip.cronjob.imp;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.cycleracingcoreuiip.cyclistranking.dao.CyclistRankingDao;
import my.cycleracingcoreuiip.model.CyclistModel;
import my.cycleracingcoreuiip.model.CyclistRankingModel;
import my.cycleracingcoreuiip.model.StageModel;
import my.cycleracingcoreuiip.model.StageRaceModel;
import my.cycleracingcoreuiip.model.StageRankingModel;
import my.cycleracingcoreuiip.stage.dao.StageDao;
import my.cycleracingcoreuiip.stagerace.dao.StageRaceDao;
import my.cycleracingcoreuiip.stageranking.dao.StageRankingDao;



public class MyJob extends AbstractJobPerformable<CronJobModel>
{
	private StageRankingDao stageRankingDao;
	private StageRaceDao stageRaceDao;
	private StageDao stageDao;
	private CyclistRankingDao cyclistRankingDao;

	@Override
	public PerformResult perform(final CronJobModel job)
	{
		final List<StageRaceModel> stageRaces = stageRaceDao.findStageRaces();

		for (final StageRaceModel race : stageRaces)
		{
			final List<StageModel> stages = stageDao.findStagesByStageRace(race.getId());
			for (final StageModel stage : stages)
			{
				if (stage.getCreationtime().getTime() - job.getEndTime().getTime() >= 0)
				{
					final List<StageRankingModel> rankings = stageRankingDao.findStageRankingByStageRace(race.getId());
					final List<CyclistRankingModel> finalRanking = cyclistRankingDao.findCyclistRankingByStageRace(race.getId());
					for (final StageRankingModel rank : rankings)
					{
						final CyclistModel cyclist = rank.getCyclist();
						for (final CyclistRankingModel cyclistRank : finalRanking)
						{
							if (cyclist.getId().equalsIgnoreCase(cyclistRank.getCyclist().getId()))
							{
								final int temp = cyclistRank.getTime().intValue() + rank.getTime().intValue();
								cyclistRank.setTime(new Integer(temp));

								break;
							}
						}

					}

					updateRanking(finalRanking);
					modelService.save(finalRanking);
				}
			}


		}
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}

	public void updateRanking(final List<CyclistRankingModel> finalRanking)
	{

		for (int i = 0; i < finalRanking.size(); i++)
		{

			final int min = finalRanking.get(i).getTime().intValue();
			for (int j = i + 1; j < finalRanking.size(); j++)
			{

				if (min > finalRanking.get(j).getTime().intValue())
				{
					final int pos = finalRanking.get(j).getPosition().intValue();
					finalRanking.get(j).setTime(new Integer(finalRanking.get(i).getPosition().intValue()));
					finalRanking.get(i).setTime(new Integer(pos));

				}
			}
		}



	}

	public StageRankingDao getStageRankingDao()
	{
		return stageRankingDao;
	}

	@Required
	public void setStageRankingDao(final StageRankingDao stageRankingDao)
	{
		this.stageRankingDao = stageRankingDao;
	}


	public StageRaceDao getStageRaceDao()
	{
		return stageRaceDao;
	}

	@Required
	public void setStageRaceDao(final StageRaceDao stageRaceDao)
	{
		this.stageRaceDao = stageRaceDao;
	}


	public StageDao getStageDao()
	{
		return stageDao;
	}

	@Required
	public void setStageDao(final StageDao stageDao)
	{
		this.stageDao = stageDao;
	}


	public CyclistRankingDao getCyclistRankingDao()
	{
		return cyclistRankingDao;
	}


	@Required
	public void setCyclistRankingDao(final CyclistRankingDao cyclistRankingDao)
	{
		this.cyclistRankingDao = cyclistRankingDao;
	}



}
