/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 3-nov-2017 1.49.46                          ---
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
	/** Qualifier of the <code>CyclistTeam.cyclists</code> attribute **/
	public static final String CYCLISTS = "cyclists";
	/**
	* {@link OneToManyHandler} for handling 1:n CYCLISTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Cyclist> CYCLISTSHANDLER = new OneToManyHandler<Cyclist>(
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
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.cyclists</code> attribute.
	 * @return the cyclists
	 */
	public Collection<Cyclist> getCyclists(final SessionContext ctx)
	{
		return CYCLISTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistTeam.cyclists</code> attribute.
	 * @return the cyclists
	 */
	public Collection<Cyclist> getCyclists()
	{
		return getCyclists( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.cyclists</code> attribute. 
	 * @param value the cyclists
	 */
	public void setCyclists(final SessionContext ctx, final Collection<Cyclist> value)
	{
		CYCLISTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistTeam.cyclists</code> attribute. 
	 * @param value the cyclists
	 */
	public void setCyclists(final Collection<Cyclist> value)
	{
		setCyclists( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cyclists. 
	 * @param value the item to add to cyclists
	 */
	public void addToCyclists(final SessionContext ctx, final Cyclist value)
	{
		CYCLISTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cyclists. 
	 * @param value the item to add to cyclists
	 */
	public void addToCyclists(final Cyclist value)
	{
		addToCyclists( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cyclists. 
	 * @param value the item to remove from cyclists
	 */
	public void removeFromCyclists(final SessionContext ctx, final Cyclist value)
	{
		CYCLISTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cyclists. 
	 * @param value the item to remove from cyclists
	 */
	public void removeFromCyclists(final Cyclist value)
	{
		removeFromCyclists( getSession().getSessionContext(), value );
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
