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
package my.hospitalcore.examination.eventlistener.impl;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.util.Config;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import my.hospitalcore.examination.event.impl.ExaminationResultEvent;
import my.hospitalcore.examination.service.ExaminationService;
import my.hospitalcore.model.ExaminationModel;


/**
 *
 */
public class ExaminationResultEventListener extends AbstractEventListener<ExaminationResultEvent>
{
	private ExaminationService examinationService;
	private final String separator = ",";
	private final String newLine = "\n";
	private static final Logger LOG = Logger.getLogger(ExaminationResultEventListener.class);

	@Override
	protected void onEvent(final ExaminationResultEvent event)
	{
		LOG.info("Entering in ExaminationResultEventListener");
		final List<ExaminationModel> exams = examinationService.getExaminationForPatient(event.getPatientCode());

		try
		{

			final FileWriter writer = new FileWriter(Config.getParameter("path").toString() + "\\examination.txt");

			writer.append(
					"Cartella clinica di " + exams.get(0).getPatient().getName() + " " + exams.get(0).getPatient().getSurname());
			writer.append("Code, Date, Result, Infos, Doctor");
			writer.append(newLine);

			for (final ExaminationModel e : exams)
			{

				writer.append(e.getCode());
				writer.append(separator);
				writer.append(e.getDate().toString());
				writer.append(separator);
				writer.append(e.getResult().toString());
				writer.append(separator);
				writer.append(e.getInfos());
				writer.append(separator);
				writer.append(e.getDoctor().getName() + " " + e.getDoctor().getSurname());
				writer.append(newLine);

			}

			writer.flush();
			writer.close();
		}
		catch (final IOException e1)
		{
			e1.printStackTrace();
		}


	}


	public ExaminationService getExaminationService()
	{
		return examinationService;
	}

	@Required
	public void setExaminationService(final ExaminationService examinationService)
	{
		this.examinationService = examinationService;
	}


}
