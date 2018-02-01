/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29-ott-2017 21.59.17                        ---
 * ----------------------------------------------------------------
 */
package my.cycleracingcoreuiip.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.cycleracingcoreuiip.constants.CycleracingcoreuiipConstants;
import my.cycleracingcoreuiip.jalo.CyclistRanking;
import my.cycleracingcoreuiip.jalo.StageRace;
import my.cycleracingcoreuiip.jalo.StageRanking;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Stage}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStage extends GenericItem
{
	/** Qualifier of the <code>Stage.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Stage.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Stage.stageNumber</code> attribute **/
	public static final String STAGENUMBER = "stageNumber";
	/** Qualifier of the <code>Stage.type</code> attribute **/
	public static final String TYPE = "type";
	/** Qualifier of the <code>Stage.length</code> attribute **/
	public static final String LENGTH = "length";
	/** Qualifier of the <code>Stage.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>Stage.stageRace</code> attribute **/
	public static final String STAGERACE = "stageRace";
	/** Qualifier of the <code>Stage.stagesRankings</code> attribute **/
	public static final String STAGESRANKINGS = "stagesRankings";
	/** Qualifier of the <code>Stage.cyclistsRanking</code> attribute **/
	public static final String CYCLISTSRANKING = "cyclistsRanking";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n STAGERACE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedStage> STAGERACEHANDLER = new BidirectionalOneToManyHandler<GeneratedStage>(
	CycleracingcoreuiipConstants.TC.STAGE,
	false,
	"stageRace",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n STAGESRANKINGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<StageRanking> STAGESRANKINGSHANDLER = new OneToManyHandler<StageRanking>(
	CycleracingcoreuiipConstants.TC.STAGERANKING,
	false,
	"stage",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CYCLISTSRANKING's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CyclistRanking> CYCLISTSRANKINGHANDLER = new OneToManyHandler<CyclistRanking>(
	CycleracingcoreuiipConstants.TC.CYCLISTRANKING,
	false,
	"stage",
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
		tmp.put(STAGENUMBER, AttributeMode.INITIAL);
		tmp.put(TYPE, AttributeMode.INITIAL);
		tmp.put(LENGTH, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(STAGERACE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		STAGERACEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.cyclistsRanking</code> attribute.
	 * @return the cyclistsRanking
	 */
	public Collection<CyclistRanking> getCyclistsRanking(final SessionContext ctx)
	{
		return CYCLISTSRANKINGHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.cyclistsRanking</code> attribute.
	 * @return the cyclistsRanking
	 */
	public Collection<CyclistRanking> getCyclistsRanking()
	{
		return getCyclistsRanking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.cyclistsRanking</code> attribute. 
	 * @param value the cyclistsRanking
	 */
	public void setCyclistsRanking(final SessionContext ctx, final Collection<CyclistRanking> value)
	{
		CYCLISTSRANKINGHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.cyclistsRanking</code> attribute. 
	 * @param value the cyclistsRanking
	 */
	public void setCyclistsRanking(final Collection<CyclistRanking> value)
	{
		setCyclistsRanking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cyclistsRanking. 
	 * @param value the item to add to cyclistsRanking
	 */
	public void addToCyclistsRanking(final SessionContext ctx, final CyclistRanking value)
	{
		CYCLISTSRANKINGHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cyclistsRanking. 
	 * @param value the item to add to cyclistsRanking
	 */
	public void addToCyclistsRanking(final CyclistRanking value)
	{
		addToCyclistsRanking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cyclistsRanking. 
	 * @param value the item to remove from cyclistsRanking
	 */
	public void removeFromCyclistsRanking(final SessionContext ctx, final CyclistRanking value)
	{
		CYCLISTSRANKINGHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cyclistsRanking. 
	 * @param value the item to remove from cyclistsRanking
	 */
	public void removeFromCyclistsRanking(final CyclistRanking value)
	{
		removeFromCyclistsRanking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.date</code> attribute.
	 * @return the date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.date</code> attribute.
	 * @return the date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.length</code> attribute.
	 * @return the length
	 */
	public String getLength(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LENGTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.length</code> attribute.
	 * @return the length
	 */
	public String getLength()
	{
		return getLength( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.length</code> attribute. 
	 * @param value the length
	 */
	public void setLength(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LENGTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.length</code> attribute. 
	 * @param value the length
	 */
	public void setLength(final String value)
	{
		setLength( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageNumber</code> attribute.
	 * @return the stageNumber
	 */
	public Integer getStageNumber(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, STAGENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageNumber</code> attribute.
	 * @return the stageNumber
	 */
	public Integer getStageNumber()
	{
		return getStageNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageNumber</code> attribute. 
	 * @return the stageNumber
	 */
	public int getStageNumberAsPrimitive(final SessionContext ctx)
	{
		Integer value = getStageNumber( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageNumber</code> attribute. 
	 * @return the stageNumber
	 */
	public int getStageNumberAsPrimitive()
	{
		return getStageNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageNumber</code> attribute. 
	 * @param value the stageNumber
	 */
	public void setStageNumber(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, STAGENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageNumber</code> attribute. 
	 * @param value the stageNumber
	 */
	public void setStageNumber(final Integer value)
	{
		setStageNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageNumber</code> attribute. 
	 * @param value the stageNumber
	 */
	public void setStageNumber(final SessionContext ctx, final int value)
	{
		setStageNumber( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageNumber</code> attribute. 
	 * @param value the stageNumber
	 */
	public void setStageNumber(final int value)
	{
		setStageNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageRace</code> attribute.
	 * @return the stageRace
	 */
	public StageRace getStageRace(final SessionContext ctx)
	{
		return (StageRace)getProperty( ctx, STAGERACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stageRace</code> attribute.
	 * @return the stageRace
	 */
	public StageRace getStageRace()
	{
		return getStageRace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageRace</code> attribute. 
	 * @param value the stageRace
	 */
	public void setStageRace(final SessionContext ctx, final StageRace value)
	{
		STAGERACEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stageRace</code> attribute. 
	 * @param value the stageRace
	 */
	public void setStageRace(final StageRace value)
	{
		setStageRace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stagesRankings</code> attribute.
	 * @return the stagesRankings
	 */
	public Collection<StageRanking> getStagesRankings(final SessionContext ctx)
	{
		return STAGESRANKINGSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.stagesRankings</code> attribute.
	 * @return the stagesRankings
	 */
	public Collection<StageRanking> getStagesRankings()
	{
		return getStagesRankings( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stagesRankings</code> attribute. 
	 * @param value the stagesRankings
	 */
	public void setStagesRankings(final SessionContext ctx, final Collection<StageRanking> value)
	{
		STAGESRANKINGSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.stagesRankings</code> attribute. 
	 * @param value the stagesRankings
	 */
	public void setStagesRankings(final Collection<StageRanking> value)
	{
		setStagesRankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stagesRankings. 
	 * @param value the item to add to stagesRankings
	 */
	public void addToStagesRankings(final SessionContext ctx, final StageRanking value)
	{
		STAGESRANKINGSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stagesRankings. 
	 * @param value the item to add to stagesRankings
	 */
	public void addToStagesRankings(final StageRanking value)
	{
		addToStagesRankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stagesRankings. 
	 * @param value the item to remove from stagesRankings
	 */
	public void removeFromStagesRankings(final SessionContext ctx, final StageRanking value)
	{
		STAGESRANKINGSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stagesRankings. 
	 * @param value the item to remove from stagesRankings
	 */
	public void removeFromStagesRankings(final StageRanking value)
	{
		removeFromStagesRankings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.type</code> attribute.
	 * @return the type
	 */
	public String getType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stage.type</code> attribute.
	 * @return the type
	 */
	public String getType()
	{
		return getType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stage.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final String value)
	{
		setType( getSession().getSessionContext(), value );
	}
	
}
