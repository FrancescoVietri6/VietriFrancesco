/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 23.30.47                         ---
 * ----------------------------------------------------------------
 */
package my.hospitalcore.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.hospitalcore.constants.HospitalcoreConstants;
import my.hospitalcore.jalo.Department;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Hospital}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHospital extends GenericItem
{
	/** Qualifier of the <code>Hospital.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Hospital.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Hospital.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>Hospital.departments</code> attribute **/
	public static final String DEPARTMENTS = "departments";
	/**
	* {@link OneToManyHandler} for handling 1:n DEPARTMENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Department> DEPARTMENTSHANDLER = new OneToManyHandler<Department>(
	HospitalcoreConstants.TC.DEPARTMENT,
	false,
	"hospital",
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
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospital.city</code> attribute.
	 * @return the city
	 */
	public String getCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospital.city</code> attribute.
	 * @return the city
	 */
	public String getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospital.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospital.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospital.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospital.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospital.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospital.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospital.departments</code> attribute.
	 * @return the departments
	 */
	public Collection<Department> getDepartments(final SessionContext ctx)
	{
		return DEPARTMENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospital.departments</code> attribute.
	 * @return the departments
	 */
	public Collection<Department> getDepartments()
	{
		return getDepartments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospital.departments</code> attribute. 
	 * @param value the departments
	 */
	public void setDepartments(final SessionContext ctx, final Collection<Department> value)
	{
		DEPARTMENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospital.departments</code> attribute. 
	 * @param value the departments
	 */
	public void setDepartments(final Collection<Department> value)
	{
		setDepartments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to departments. 
	 * @param value the item to add to departments
	 */
	public void addToDepartments(final SessionContext ctx, final Department value)
	{
		DEPARTMENTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to departments. 
	 * @param value the item to add to departments
	 */
	public void addToDepartments(final Department value)
	{
		addToDepartments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from departments. 
	 * @param value the item to remove from departments
	 */
	public void removeFromDepartments(final SessionContext ctx, final Department value)
	{
		DEPARTMENTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from departments. 
	 * @param value the item to remove from departments
	 */
	public void removeFromDepartments(final Department value)
	{
		removeFromDepartments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospital.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Hospital.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospital.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Hospital.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
