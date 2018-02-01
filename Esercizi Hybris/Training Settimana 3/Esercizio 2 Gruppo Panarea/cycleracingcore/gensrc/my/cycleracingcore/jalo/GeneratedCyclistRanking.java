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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.cycleracingcore.constants.CycleracingcoreConstants;
import my.cycleracingcore.jalo.Cyclist;
import my.cycleracingcore.jalo.StageRace;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CyclistRanking}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCyclistRanking extends GenericItem
{
	/** Qualifier of the <code>CyclistRanking.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>CyclistRanking.cyclist</code> attribute **/
	public static final String CYCLIST = "cyclist";
	/** Qualifier of the <code>CyclistRanking.stageRace</code> attribute **/
	public static final String STAGERACE = "stageRace";
	/** Qualifier of the <code>CyclistRanking.position</code> attribute **/
	public static final String POSITION = "position";
	/** Qualifier of the <code>CyclistRanking.time</code> attribute **/
	public static final String TIME = "time";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(CYCLIST, AttributeMode.INITIAL);
		tmp.put(STAGERACE, AttributeMode.INITIAL);
		tmp.put(POSITION, AttributeMode.INITIAL);
		tmp.put(TIME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.cyclist</code> attribute.
	 * @return the cyclist
	 */
	public Cyclist getCyclist(final SessionContext ctx)
	{
		return (Cyclist)getProperty( ctx, CYCLIST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.cyclist</code> attribute.
	 * @return the cyclist
	 */
	public Cyclist getCyclist()
	{
		return getCyclist( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.cyclist</code> attribute. 
	 * @param value the cyclist
	 */
	public void setCyclist(final SessionContext ctx, final Cyclist value)
	{
		setProperty(ctx, CYCLIST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.cyclist</code> attribute. 
	 * @param value the cyclist
	 */
	public void setCyclist(final Cyclist value)
	{
		setCyclist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.position</code> attribute.
	 * @return the position
	 */
	public String getPosition(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POSITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.position</code> attribute.
	 * @return the position
	 */
	public String getPosition()
	{
		return getPosition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.position</code> attribute. 
	 * @param value the position
	 */
	public void setPosition(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POSITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.position</code> attribute. 
	 * @param value the position
	 */
	public void setPosition(final String value)
	{
		setPosition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.stageRace</code> attribute.
	 * @return the stageRace
	 */
	public StageRace getStageRace(final SessionContext ctx)
	{
		return (StageRace)getProperty( ctx, STAGERACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.stageRace</code> attribute.
	 * @return the stageRace
	 */
	public StageRace getStageRace()
	{
		return getStageRace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.stageRace</code> attribute. 
	 * @param value the stageRace
	 */
	public void setStageRace(final SessionContext ctx, final StageRace value)
	{
		setProperty(ctx, STAGERACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.stageRace</code> attribute. 
	 * @param value the stageRace
	 */
	public void setStageRace(final StageRace value)
	{
		setStageRace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.time</code> attribute.
	 * @return the time
	 */
	public Integer getTime(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.time</code> attribute.
	 * @return the time
	 */
	public Integer getTime()
	{
		return getTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.time</code> attribute. 
	 * @return the time
	 */
	public int getTimeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTime( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CyclistRanking.time</code> attribute. 
	 * @return the time
	 */
	public int getTimeAsPrimitive()
	{
		return getTimeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final Integer value)
	{
		setTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final SessionContext ctx, final int value)
	{
		setTime( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CyclistRanking.time</code> attribute. 
	 * @param value the time
	 */
	public void setTime(final int value)
	{
		setTime( getSession().getSessionContext(), value );
	}
	
}
