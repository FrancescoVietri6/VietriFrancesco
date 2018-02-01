/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 31-ott-2017 1.35.29                         ---
 * ----------------------------------------------------------------
 */
package my.cycleracingcore.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.cycleracingcore.constants.CycleracingcoreConstants;
import my.cycleracingcore.jalo.Cyclist;
import my.cycleracingcore.jalo.Manager;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CyclistTeam}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCyclistTeam extends GenericItem
{
	/** Qualifier of the <code>CyclistTeam.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>CyclistTeam.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>CyclistTeam.year</code> attribute **/
	public static final String YEAR = "year";
	/** Qualifier of the <code>CyclistTeam.manager</code> attribute **/
	public static final String MANAGER = "manager";
	/** Qualifier of the <code>CyclistTeam.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>CyclistTeam.bicycle</code> attribute **/
	public static final String BICYCLE = "bicycle";
	/** Qualifier of the <code>CyclistTeam.cyclist</code> attribute **/
	public static final String CYCLIST = "cyclist";
	/**
	* {@link OneToManyHandler} for handling 1:n CYCLIST's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Cyclist> CYCLISTHANDLER = new OneToManyHandler<Cyclist>(
	CycleracingcoreConstants.TC.CYCLIST,
	false,
	"cyclistTeam",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(YEAR, AttributeMode.INITIAL);
		tmp.put(MANAGER, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(BICYCLE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.bicycle</code> attribute.
	 * @return the bicycle
	 */
	public String getBicycle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BICYCLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.bicycle</code> attribute.
	 * @return the bicycle
	 */
	public String getBicycle()
	{
		return getBicycle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.bicycle</code> attribute. 
	 * @param value the bicycle
	 */
	public void setBicycle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BICYCLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.bicycle</code> attribute. 
	 * @param value the bicycle
	 */
	public void setBicycle(final String value)
	{
		setBicycle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.country</code> attribute.
	 * @return the country
	 */
	public String getCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.country</code> attribute.
	 * @return the country
	 */
	public String getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final String value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.cyclist</code> attribute.
	 * @return the cyclist
	 */
	public Collection<Cyclist> getCyclist(final SessionContext ctx)
	{
		return CYCLISTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.cyclist</code> attribute.
	 * @return the cyclist
	 */
	public Collection<Cyclist> getCyclist()
	{
		return getCyclist( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.cyclist</code> attribute. 
	 * @param value the cyclist
	 */
	public void setCyclist(final SessionContext ctx, final Collection<Cyclist> value)
	{
		CYCLISTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.cyclist</code> attribute. 
	 * @param value the cyclist
	 */
	public void setCyclist(final Collection<Cyclist> value)
	{
		setCyclist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cyclist. 
	 * @param value the item to add to cyclist
	 */
	public void addToCyclist(final SessionContext ctx, final Cyclist value)
	{
		CYCLISTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cyclist. 
	 * @param value the item to add to cyclist
	 */
	public void addToCyclist(final Cyclist value)
	{
		addToCyclist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cyclist. 
	 * @param value the item to remove from cyclist
	 */
	public void removeFromCyclist(final SessionContext ctx, final Cyclist value)
	{
		CYCLISTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cyclist. 
	 * @param value the item to remove from cyclist
	 */
	public void removeFromCyclist(final Cyclist value)
	{
		removeFromCyclist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.manager</code> attribute.
	 * @return the manager
	 */
	public Manager getManager(final SessionContext ctx)
	{
		return (Manager)getProperty( ctx, MANAGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.manager</code> attribute.
	 * @return the manager
	 */
	public Manager getManager()
	{
		return getManager( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.manager</code> attribute. 
	 * @param value the manager
	 */
	public void setManager(final SessionContext ctx, final Manager value)
	{
		setProperty(ctx, MANAGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.manager</code> attribute. 
	 * @param value the manager
	 */
	public void setManager(final Manager value)
	{
		setManager( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.year</code> attribute.
	 * @return the year
	 */
	public String getYear(final SessionContext ctx)
	{
		return (String)getProperty( ctx, YEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.year</code> attribute.
	 * @return the year
	 */
	public String getYear()
	{
		return getYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final SessionContext ctx, final String value)
	{
		setProperty(ctx, YEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final String value)
	{
		setYear( getSession().getSessionContext(), value );
	}
	
}
