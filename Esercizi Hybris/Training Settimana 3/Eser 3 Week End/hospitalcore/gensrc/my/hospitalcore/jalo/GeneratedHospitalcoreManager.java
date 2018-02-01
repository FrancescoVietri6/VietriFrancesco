/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 23.30.47                         ---
 * ----------------------------------------------------------------
 */
package my.hospitalcore.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;
import my.hospitalcore.constants.HospitalcoreConstants;
import my.hospitalcore.jalo.Department;
import my.hospitalcore.jalo.Doctor;
import my.hospitalcore.jalo.Examination;
import my.hospitalcore.jalo.Hospital;
import my.hospitalcore.jalo.Hospitalization;
import my.hospitalcore.jalo.Patient;
import my.hospitalcore.jalo.Persons;

/**
 * Generated class for type <code>HospitalcoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHospitalcoreManager extends Extension
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
	
	public Department createDepartment(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HospitalcoreConstants.TC.DEPARTMENT );
			return (Department)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Department : "+e.getMessage(), 0 );
		}
	}
	
	public Department createDepartment(final Map attributeValues)
	{
		return createDepartment( getSession().getSessionContext(), attributeValues );
	}
	
	public Doctor createDoctor(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HospitalcoreConstants.TC.DOCTOR );
			return (Doctor)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Doctor : "+e.getMessage(), 0 );
		}
	}
	
	public Doctor createDoctor(final Map attributeValues)
	{
		return createDoctor( getSession().getSessionContext(), attributeValues );
	}
	
	public Examination createExamination(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HospitalcoreConstants.TC.EXAMINATION );
			return (Examination)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Examination : "+e.getMessage(), 0 );
		}
	}
	
	public Examination createExamination(final Map attributeValues)
	{
		return createExamination( getSession().getSessionContext(), attributeValues );
	}
	
	public Hospital createHospital(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HospitalcoreConstants.TC.HOSPITAL );
			return (Hospital)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Hospital : "+e.getMessage(), 0 );
		}
	}
	
	public Hospital createHospital(final Map attributeValues)
	{
		return createHospital( getSession().getSessionContext(), attributeValues );
	}
	
	public Hospitalization createHospitalization(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HospitalcoreConstants.TC.HOSPITALIZATION );
			return (Hospitalization)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Hospitalization : "+e.getMessage(), 0 );
		}
	}
	
	public Hospitalization createHospitalization(final Map attributeValues)
	{
		return createHospitalization( getSession().getSessionContext(), attributeValues );
	}
	
	public Patient createPatient(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HospitalcoreConstants.TC.PATIENT );
			return (Patient)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Patient : "+e.getMessage(), 0 );
		}
	}
	
	public Patient createPatient(final Map attributeValues)
	{
		return createPatient( getSession().getSessionContext(), attributeValues );
	}
	
	public Persons createPersons(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HospitalcoreConstants.TC.PERSONS );
			return (Persons)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Persons : "+e.getMessage(), 0 );
		}
	}
	
	public Persons createPersons(final Map attributeValues)
	{
		return createPersons( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return HospitalcoreConstants.EXTENSIONNAME;
	}
	
}
