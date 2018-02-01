/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 29-ott-2017 21.59.17                        ---
 * ----------------------------------------------------------------
 */
package my.cycleracingcoreuiip.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.cycleracingcoreuiip.constants.CycleracingcoreuiipConstants;
import my.cycleracingcoreuiip.jalo.StageRanking;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Cyclist}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCyclist extends GenericItem
{
	/** Qualifier of the <code>Cyclist.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Cyclist.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Cyclist.surname</code> attribute **/
	public static final String SURNAME = "surname";
	/** Qualifier of the <code>Cyclist.nationality</code> attribute **/
	public static final String NATIONALITY = "nationality";
	/** Qualifier of the <code>Cyclist.stagesRanking</code> attribute **/
	public static final String STAGESRANKING = "stagesRanking";
	/**
	* {@link OneToManyHandler} for handling 1:n STAGESRANKING's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<StageRanking> STAGESRANKINGHANDLER = new OneToManyHandler<StageRanking>(
	CycleracingcoreuiipConstants.TC.STAGERANKING,
	false,
	"cyclist",
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
		tmp.put(SURNAME, AttributeMode.INITIAL);
		tmp.put(NATIONALITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.nationality</code> attribute.
	 * @return the nationality
	 */
	public String getNationality(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NATIONALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.nationality</code> attribute.
	 * @return the nationality
	 */
	public String getNationality()
	{
		return getNationality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NATIONALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final String value)
	{
		setNationality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.stagesRanking</code> attribute.
	 * @return the stagesRanking
	 */
	public Collection<StageRanking> getStagesRanking(final SessionContext ctx)
	{
		return STAGESRANKINGHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.stagesRanking</code> attribute.
	 * @return the stagesRanking
	 */
	public Collection<StageRanking> getStagesRanking()
	{
		return getStagesRanking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.stagesRanking</code> attribute. 
	 * @param value the stagesRanking
	 */
	public void setStagesRanking(final SessionContext ctx, final Collection<StageRanking> value)
	{
		STAGESRANKINGHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.stagesRanking</code> attribute. 
	 * @param value the stagesRanking
	 */
	public void setStagesRanking(final Collection<StageRanking> value)
	{
		setStagesRanking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stagesRanking. 
	 * @param value the item to add to stagesRanking
	 */
	public void addToStagesRanking(final SessionContext ctx, final StageRanking value)
	{
		STAGESRANKINGHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stagesRanking. 
	 * @param value the item to add to stagesRanking
	 */
	public void addToStagesRanking(final StageRanking value)
	{
		addToStagesRanking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stagesRanking. 
	 * @param value the item to remove from stagesRanking
	 */
	public void removeFromStagesRanking(final SessionContext ctx, final StageRanking value)
	{
		STAGESRANKINGHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stagesRanking. 
	 * @param value the item to remove from stagesRanking
	 */
	public void removeFromStagesRanking(final StageRanking value)
	{
		removeFromStagesRanking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Cyclist.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname()
	{
		return getSurname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Cyclist.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final String value)
	{
		setSurname( getSession().getSessionContext(), value );
	}
	
}
