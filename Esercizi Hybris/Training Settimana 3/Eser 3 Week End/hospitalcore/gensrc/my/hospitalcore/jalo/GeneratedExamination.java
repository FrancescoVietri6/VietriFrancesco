/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 23.30.47                         ---
 * ----------------------------------------------------------------
 */
package my.hospitalcore.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.hospitalcore.constants.HospitalcoreConstants;
import my.hospitalcore.jalo.Doctor;
import my.hospitalcore.jalo.Patient;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Examination}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedExamination extends GenericItem
{
	/** Qualifier of the <code>Examination.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Examination.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>Examination.result</code> attribute **/
	public static final String RESULT = "result";
	/** Qualifier of the <code>Examination.infos</code> attribute **/
	public static final String INFOS = "infos";
	/** Qualifier of the <code>Examination.doctor</code> attribute **/
	public static final String DOCTOR = "doctor";
	/** Qualifier of the <code>Examination.patient</code> attribute **/
	public static final String PATIENT = "patient";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DOCTOR's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedExamination> DOCTORHANDLER = new BidirectionalOneToManyHandler<GeneratedExamination>(
	HospitalcoreConstants.TC.EXAMINATION,
	false,
	"doctor",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PATIENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedExamination> PATIENTHANDLER = new BidirectionalOneToManyHandler<GeneratedExamination>(
	HospitalcoreConstants.TC.EXAMINATION,
	false,
	"patient",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(RESULT, AttributeMode.INITIAL);
		tmp.put(INFOS, AttributeMode.INITIAL);
		tmp.put(DOCTOR, AttributeMode.INITIAL);
		tmp.put(PATIENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Examination.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Examination.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Examination.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Examination.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		DOCTORHANDLER.newInstance(ctx, allAttributes);
		PATIENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Examination.date</code> attribute.
	 * @return the date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Examination.date</code> attribute.
	 * @return the date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Examination.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Examination.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Examination.doctor</code> attribute.
	 * @return the doctor
	 */
	public Doctor getDoctor(final SessionContext ctx)
	{
		return (Doctor)getProperty( ctx, DOCTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Examination.doctor</code> attribute.
	 * @return the doctor
	 */
	public Doctor getDoctor()
	{
		return getDoctor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Examination.doctor</code> attribute. 
	 * @param value the doctor
	 */
	public void setDoctor(final SessionContext ctx, final Doctor value)
	{
		DOCTORHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Examination.doctor</code> attribute. 
	 * @param value the doctor
	 */
	public void setDoctor(final Doctor value)
	{
		setDoctor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Examination.infos</code> attribute.
	 * @return the infos
	 */
	public String getInfos(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INFOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Examination.infos</code> attribute.
	 * @return the infos
	 */
	public String getInfos()
	{
		return getInfos( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Examination.infos</code> attribute. 
	 * @param value the infos
	 */
	public void setInfos(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INFOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Examination.infos</code> attribute. 
	 * @param value the infos
	 */
	public void setInfos(final String value)
	{
		setInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Examination.patient</code> attribute.
	 * @return the patient
	 */
	public Patient getPatient(final SessionContext ctx)
	{
		return (Patient)getProperty( ctx, PATIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Examination.patient</code> attribute.
	 * @return the patient
	 */
	public Patient getPatient()
	{
		return getPatient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Examination.patient</code> attribute. 
	 * @param value the patient
	 */
	public void setPatient(final SessionContext ctx, final Patient value)
	{
		PATIENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Examination.patient</code> attribute. 
	 * @param value the patient
	 */
	public void setPatient(final Patient value)
	{
		setPatient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Examination.result</code> attribute.
	 * @return the result
	 */
	public EnumerationValue getResult(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RESULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Examination.result</code> attribute.
	 * @return the result
	 */
	public EnumerationValue getResult()
	{
		return getResult( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Examination.result</code> attribute. 
	 * @param value the result
	 */
	public void setResult(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RESULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Examination.result</code> attribute. 
	 * @param value the result
	 */
	public void setResult(final EnumerationValue value)
	{
		setResult( getSession().getSessionContext(), value );
	}
	
}
