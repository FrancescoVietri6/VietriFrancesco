/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 3-nov-2017 16.10.33                         ---
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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.cycleracingcore.constants.CycleracingcoreConstants;
import my.cycleracingcore.jalo.Stage;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem StageRace}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStageRace extends GenericItem
{
	/** Qualifier of the <code>StageRace.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>StageRace.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>StageRace.numberStage</code> attribute **/
	public static final String NUMBERSTAGE = "numberStage";
	/** Qualifier of the <code>StageRace.year</code> attribute **/
	public static final String YEAR = "year";
	/** Qualifier of the <code>StageRace.endDate</code> attribute **/
	public static final String ENDDATE = "endDate";
	/** Qualifier of the <code>StageRace.stages</code> attribute **/
	public static final String STAGES = "stages";
	/**
	* {@link OneToManyHandler} for handling 1:n STAGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Stage> STAGESHANDLER = new OneToManyHandler<Stage>(
	CycleracingcoreConstants.TC.STAGE,
	false,
	"stageRace",
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
		tmp.put(NUMBERSTAGE, AttributeMode.INITIAL);
		tmp.put(YEAR, AttributeMode.INITIAL);
		tmp.put(ENDDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate()
	{
		return getEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final Date value)
	{
		setEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.numberStage</code> attribute.
	 * @return the numberStage
	 */
	public String getNumberStage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBERSTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.numberStage</code> attribute.
	 * @return the numberStage
	 */
	public String getNumberStage()
	{
		return getNumberStage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.numberStage</code> attribute. 
	 * @param value the numberStage
	 */
	public void setNumberStage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBERSTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.numberStage</code> attribute. 
	 * @param value the numberStage
	 */
	public void setNumberStage(final String value)
	{
		setNumberStage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.stages</code> attribute.
	 * @return the stages
	 */
	public Collection<Stage> getStages(final SessionContext ctx)
	{
		return STAGESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.stages</code> attribute.
	 * @return the stages
	 */
	public Collection<Stage> getStages()
	{
		return getStages( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.stages</code> attribute. 
	 * @param value the stages
	 */
	public void setStages(final SessionContext ctx, final Collection<Stage> value)
	{
		STAGESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.stages</code> attribute. 
	 * @param value the stages
	 */
	public void setStages(final Collection<Stage> value)
	{
		setStages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stages. 
	 * @param value the item to add to stages
	 */
	public void addToStages(final SessionContext ctx, final Stage value)
	{
		STAGESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stages. 
	 * @param value the item to add to stages
	 */
	public void addToStages(final Stage value)
	{
		addToStages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stages. 
	 * @param value the item to remove from stages
	 */
	public void removeFromStages(final SessionContext ctx, final Stage value)
	{
		STAGESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stages. 
	 * @param value the item to remove from stages
	 */
	public void removeFromStages(final Stage value)
	{
		removeFromStages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.year</code> attribute.
	 * @return the year
	 */
	public String getYear(final SessionContext ctx)
	{
		return (String)getProperty( ctx, YEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StageRace.year</code> attribute.
	 * @return the year
	 */
	public String getYear()
	{
		return getYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final SessionContext ctx, final String value)
	{
		setProperty(ctx, YEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StageRace.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final String value)
	{
		setYear( getSession().getSessionContext(), value );
	}
	
}
