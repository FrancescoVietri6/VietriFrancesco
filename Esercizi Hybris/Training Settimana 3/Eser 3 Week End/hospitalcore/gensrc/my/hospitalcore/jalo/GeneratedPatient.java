/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 23.30.47                         ---
 * ----------------------------------------------------------------
 */
package my.hospitalcore.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.hospitalcore.constants.HospitalcoreConstants;
import my.hospitalcore.jalo.Examination;
import my.hospitalcore.jalo.Persons;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Patient}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPatient extends Persons
{
	/** Qualifier of the <code>Patient.examinations</code> attribute **/
	public static final String EXAMINATIONS = "examinations";
	/**
	* {@link OneToManyHandler} for handling 1:n EXAMINATIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Examination> EXAMINATIONSHANDLER = new OneToManyHandler<Examination>(
	HospitalcoreConstants.TC.EXAMINATION,
	false,
	"patient",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Persons.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.examinations</code> attribute.
	 * @return the examinations
	 */
	public Collection<Examination> getExaminations(final SessionContext ctx)
	{
		return EXAMINATIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.examinations</code> attribute.
	 * @return the examinations
	 */
	public Collection<Examination> getExaminations()
	{
		return getExaminations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.examinations</code> attribute. 
	 * @param value the examinations
	 */
	public void setExaminations(final SessionContext ctx, final Collection<Examination> value)
	{
		EXAMINATIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.examinations</code> attribute. 
	 * @param value the examinations
	 */
	public void setExaminations(final Collection<Examination> value)
	{
		setExaminations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to examinations. 
	 * @param value the item to add to examinations
	 */
	public void addToExaminations(final SessionContext ctx, final Examination value)
	{
		EXAMINATIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to examinations. 
	 * @param value the item to add to examinations
	 */
	public void addToExaminations(final Examination value)
	{
		addToExaminations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from examinations. 
	 * @param value the item to remove from examinations
	 */
	public void removeFromExaminations(final SessionContext ctx, final Examination value)
	{
		EXAMINATIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from examinations. 
	 * @param value the item to remove from examinations
	 */
	public void removeFromExaminations(final Examination value)
	{
		removeFromExaminations( getSession().getSessionContext(), value );
	}
	
}
