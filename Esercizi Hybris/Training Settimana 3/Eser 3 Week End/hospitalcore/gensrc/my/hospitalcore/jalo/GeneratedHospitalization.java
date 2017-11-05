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
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.hospitalcore.constants.HospitalcoreConstants;
import my.hospitalcore.jalo.Department;
import my.hospitalcore.jalo.Patient;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Hospitalization}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHospitalization extends GenericItem
{
	/** Qualifier of the <code>Hospitalization.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Hospitalization.dateIn</code> attribute **/
	public static final String DATEIN = "dateIn";
	/** Qualifier of the <code>Hospitalization.dateOut</code> attribute **/
	public static final String DATEOUT = "dateOut";
	/** Qualifier of the <code>Hospitalization.patient</code> attribute **/
	public static final String PATIENT = "patient";
	/** Qualifier of the <code>Hospitalization.department</code> attribute **/
	public static final String DEPARTMENT = "department";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DEPARTMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedHospitalization> DEPARTMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedHospitalization>(
	HospitalcoreConstants.TC.HOSPITALIZATION,
	false,
	"department",
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
		tmp.put(DATEIN, AttributeMode.INITIAL);
		tmp.put(DATEOUT, AttributeMode.INITIAL);
		tmp.put(PATIENT, AttributeMode.INITIAL);
		tmp.put(DEPARTMENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospitalization.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospitalization.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospitalization.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospitalization.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		DEPARTMENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospitalization.dateIn</code> attribute.
	 * @return the dateIn
	 */
	public Date getDateIn(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATEIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospitalization.dateIn</code> attribute.
	 * @return the dateIn
	 */
	public Date getDateIn()
	{
		return getDateIn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospitalization.dateIn</code> attribute. 
	 * @param value the dateIn
	 */
	public void setDateIn(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATEIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospitalization.dateIn</code> attribute. 
	 * @param value the dateIn
	 */
	public void setDateIn(final Date value)
	{
		setDateIn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospitalization.dateOut</code> attribute.
	 * @return the dateOut
	 */
	public Date getDateOut(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATEOUT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospitalization.dateOut</code> attribute.
	 * @return the dateOut
	 */
	public Date getDateOut()
	{
		return getDateOut( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospitalization.dateOut</code> attribute. 
	 * @param value the dateOut
	 */
	public void setDateOut(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATEOUT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospitalization.dateOut</code> attribute. 
	 * @param value the dateOut
	 */
	public void setDateOut(final Date value)
	{
		setDateOut( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospitalization.department</code> attribute.
	 * @return the department
	 */
	public Department getDepartment(final SessionContext ctx)
	{
		return (Department)getProperty( ctx, DEPARTMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospitalization.department</code> attribute.
	 * @return the department
	 */
	public Department getDepartment()
	{
		return getDepartment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospitalization.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final SessionContext ctx, final Department value)
	{
		DEPARTMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospitalization.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final Department value)
	{
		setDepartment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospitalization.patient</code> attribute.
	 * @return the patient
	 */
	public Patient getPatient(final SessionContext ctx)
	{
		return (Patient)getProperty( ctx, PATIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospitalization.patient</code> attribute.
	 * @return the patient
	 */
	public Patient getPatient()
	{
		return getPatient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospitalization.patient</code> attribute. 
	 * @param value the patient
	 */
	public void setPatient(final SessionContext ctx, final Patient value)
	{
		setProperty(ctx, PATIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospitalization.patient</code> attribute. 
	 * @param value the patient
	 */
	public void setPatient(final Patient value)
	{
		setPatient( getSession().getSessionContext(), value );
	}
	
}
