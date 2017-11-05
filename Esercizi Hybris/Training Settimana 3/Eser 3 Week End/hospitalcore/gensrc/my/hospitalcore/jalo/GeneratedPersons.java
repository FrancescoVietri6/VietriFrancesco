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
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.hospitalcore.constants.HospitalcoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Persons}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPersons extends GenericItem
{
	/** Qualifier of the <code>Persons.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Persons.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Persons.surname</code> attribute **/
	public static final String SURNAME = "surname";
	/** Qualifier of the <code>Persons.fc</code> attribute **/
	public static final String FC = "fc";
	/** Qualifier of the <code>Persons.birthDate</code> attribute **/
	public static final String BIRTHDATE = "birthDate";
	/** Qualifier of the <code>Persons.birthPlace</code> attribute **/
	public static final String BIRTHPLACE = "birthPlace";
	/** Qualifier of the <code>Persons.gender</code> attribute **/
	public static final String GENDER = "gender";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(SURNAME, AttributeMode.INITIAL);
		tmp.put(FC, AttributeMode.INITIAL);
		tmp.put(BIRTHDATE, AttributeMode.INITIAL);
		tmp.put(BIRTHPLACE, AttributeMode.INITIAL);
		tmp.put(GENDER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Persons.birthDate</code> attribute.
	 * @return the birthDate
	 */
	public Date getBirthDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BIRTHDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Persons.birthDate</code> attribute.
	 * @return the birthDate
	 */
	public Date getBirthDate()
	{
		return getBirthDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Persons.birthDate</code> attribute. 
	 * @param value the birthDate
	 */
	public void setBirthDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BIRTHDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Persons.birthDate</code> attribute. 
	 * @param value the birthDate
	 */
	public void setBirthDate(final Date value)
	{
		setBirthDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Persons.birthPlace</code> attribute.
	 * @return the birthPlace
	 */
	public String getBirthPlace(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BIRTHPLACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Persons.birthPlace</code> attribute.
	 * @return the birthPlace
	 */
	public String getBirthPlace()
	{
		return getBirthPlace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Persons.birthPlace</code> attribute. 
	 * @param value the birthPlace
	 */
	public void setBirthPlace(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BIRTHPLACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Persons.birthPlace</code> attribute. 
	 * @param value the birthPlace
	 */
	public void setBirthPlace(final String value)
	{
		setBirthPlace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Persons.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Persons.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Persons.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Persons.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Persons.fc</code> attribute.
	 * @return the fc
	 */
	public String getFc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Persons.fc</code> attribute.
	 * @return the fc
	 */
	public String getFc()
	{
		return getFc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Persons.fc</code> attribute. 
	 * @param value the fc
	 */
	public void setFc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Persons.fc</code> attribute. 
	 * @param value the fc
	 */
	public void setFc(final String value)
	{
		setFc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Persons.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GENDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Persons.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender()
	{
		return getGender( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Persons.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GENDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Persons.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final EnumerationValue value)
	{
		setGender( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Persons.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Persons.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Persons.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Persons.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Persons.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Persons.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname()
	{
		return getSurname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Persons.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Persons.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final String value)
	{
		setSurname( getSession().getSessionContext(), value );
	}
	
}
