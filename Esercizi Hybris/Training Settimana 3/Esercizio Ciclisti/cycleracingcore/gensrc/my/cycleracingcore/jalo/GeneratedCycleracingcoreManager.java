/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 3-nov-2017 16.10.33                         ---
 * ----------------------------------------------------------------
 */
package my.cycleracingcore.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;
import my.cycleracingcore.constants.CycleracingcoreConstants;
import my.cycleracingcore.jalo.Cyclist;
import my.cycleracingcore.jalo.CyclistRanking;
import my.cycleracingcore.jalo.CyclistTeam;
import my.cycleracingcore.jalo.Manager;
import my.cycleracingcore.jalo.Person;
import my.cycleracingcore.jalo.Stage;
import my.cycleracingcore.jalo.StageRace;
import my.cycleracingcore.jalo.StageRanking;

/**
 * Generated class for type <code>CycleracingcoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCycleracingcoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public Cyclist createCyclist(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CycleracingcoreConstants.TC.CYCLIST );
			return (Cyclist)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Cyclist : "+e.getMessage(), 0 );
		}
	}
	
	public Cyclist createCyclist(final Map attributeValues)
	{
		return createCyclist( getSession().getSessionContext(), attributeValues );
	}
	
	public CyclistRanking createCyclistRanking(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CycleracingcoreConstants.TC.CYCLISTRANKING );
			return (CyclistRanking)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CyclistRanking : "+e.getMessage(), 0 );
		}
	}
	
	public CyclistRanking createCyclistRanking(final Map attributeValues)
	{
		return createCyclistRanking( getSession().getSessionContext(), attributeValues );
	}
	
	public CyclistTeam createCyclistTeam(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CycleracingcoreConstants.TC.CYCLISTTEAM );
			return (CyclistTeam)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CyclistTeam : "+e.getMessage(), 0 );
		}
	}
	
	public CyclistTeam createCyclistTeam(final Map attributeValues)
	{
		return createCyclistTeam( getSession().getSessionContext(), attributeValues );
	}
	
	public Manager createManager(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CycleracingcoreConstants.TC.MANAGER );
			return (Manager)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Manager : "+e.getMessage(), 0 );
		}
	}
	
	public Manager createManager(final Map attributeValues)
	{
		return createManager( getSession().getSessionContext(), attributeValues );
	}
	
	public Person createPerson(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CycleracingcoreConstants.TC.PERSON );
			return (Person)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Person : "+e.getMessage(), 0 );
		}
	}
	
	public Person createPerson(final Map attributeValues)
	{
		return createPerson( getSession().getSessionContext(), attributeValues );
	}
	
	public Stage createStage(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CycleracingcoreConstants.TC.STAGE );
			return (Stage)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Stage : "+e.getMessage(), 0 );
		}
	}
	
	public Stage createStage(final Map attributeValues)
	{
		return createStage( getSession().getSessionContext(), attributeValues );
	}
	
	public StageRace createStageRace(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CycleracingcoreConstants.TC.STAGERACE );
			return (StageRace)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating StageRace : "+e.getMessage(), 0 );
		}
	}
	
	public StageRace createStageRace(final Map attributeValues)
	{
		return createStageRace( getSession().getSessionContext(), attributeValues );
	}
	
	public StageRanking createStageRanking(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( CycleracingcoreConstants.TC.STAGERANKING );
			return (StageRanking)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating StageRanking : "+e.getMessage(), 0 );
		}
	}
	
	public StageRanking createStageRanking(final Map attributeValues)
	{
		return createStageRanking( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return CycleracingcoreConstants.EXTENSIONNAME;
	}
	
}
