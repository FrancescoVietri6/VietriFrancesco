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
package my.cyclistracingcoreuiip.event.imp;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;

import org.springframework.beans.factory.annotation.Required;

import my.cycleracingcoreuiip.cyclistranking.dao.CyclistRankingDao;


public class CSVRankingEventListener extends AbstractEventListener<CSVRankingEvent>
{
	private CyclistRankingDao cyclistRankingDao;

	@Override
	protected void onEvent(final CSVRankingEvent arg0)
	{
		//final List<CyclistRankingModel> ranking = cyclistRankingDao.orderCyclistRanking();

		/*
		 * private static final String COMMA_DELIMITER = ",";
		 *
		 * private static final String NEW_LINE_SEPARATOR = "\n";
		 *
		 *
		 *
		 * FileWriter fileWriter = null;
		 *
		 * try {
		 *
		 * fileWriter = new FileWriter(fileName);
		 *
		 *
		 *
		 * //Write the CSV file header
		 *
		 * fileWriter.append(FILE_HEADER.toString());
		 *
		 *
		 *
		 * //Add a new line separator after the header
		 *
		 * fileWriter.append(NEW_LINE_SEPARATOR);
		 *
		 *
		 *
		 * //Write a new student object list to the CSV file
		 *
		 * for (final Student student : students) {
		 *
		 * fileWriter.append(String.valueOf(student.getId()));
		 *
		 * fileWriter.append(COMMA_DELIMITER);
		 *
		 * fileWriter.append(student.getFirstName());
		 *
		 * fileWriter.append(COMMA_DELIMITER);
		 *
		 * fileWriter.append(student.getLastName());
		 *
		 * fileWriter.append(COMMA_DELIMITER);
		 *
		 * fileWriter.append(student.getGender());
		 *
		 * fileWriter.append(COMMA_DELIMITER);
		 *
		 * fileWriter.append(String.valueOf(student.getAge()));
		 *
		 * fileWriter.append(NEW_LINE_SEPARATOR);
		 *
		 * }
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 * System.out.println("CSV file was created successfully !!!");
		 *
		 *
		 *
		 * }catch( Exception e) {
		 *
		 * System.out.println("Error in CsvFileWriter !!!");
		 *
		 * e.printStackTrace();
		 *
		 * }finally {
		 *
		 *
		 *
		 * try {
		 *
		 * fileWriter.flush();
		 *
		 * fileWriter.close();
		 *
		 * } catch (final IOException e) {
		 *
		 * System.out.println("Error while flushing/closing fileWriter !!!");
		 *
		 * e.printStackTrace();
		 *
		 * }
		 *
		 *
		 *
		 * }
		 *
		 * }
		 *
		 * }
		 */
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
