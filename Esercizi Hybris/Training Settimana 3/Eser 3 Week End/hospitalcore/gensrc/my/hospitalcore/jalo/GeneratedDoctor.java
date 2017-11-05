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
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my.hospitalcore.constants.HospitalcoreConstants;
import my.hospitalcore.jalo.Department;
import my.hospitalcore.jalo.Examination;
import my.hospitalcore.jalo.Persons;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Doctor}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDoctor extends Persons
{
	/** Qualifier of the <code>Doctor.registerNumber</code> attribute **/
	public static final String REGISTERNUMBER = "registerNumber";
	/** Qualifier of the <code>Doctor.departments</code> attribute **/
	public static final String DEPARTMENTS = "departments";
	/** Relation ordering override parameter constants for Department2DoctorRelation from ((hospitalcore))*/
	protected static String DEPARTMENT2DOCTORRELATION_SRC_ORDERED = "relation.Department2DoctorRelation.source.ordered";
	protected static String DEPARTMENT2DOCTORRELATION_TGT_ORDERED = "relation.Department2DoctorRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Department2DoctorRelation from ((hospitalcore))*/
	protected static String DEPARTMENT2DOCTORRELATION_MARKMODIFIED = "relation.Department2DoctorRelation.markmodified";
	/** Qualifier of the <code>Doctor.examinations</code> attribute **/
	public static final String EXAMINATIONS = "examinations";
	/**
	* {@link OneToManyHandler} for handling 1:n EXAMINATIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Examination> EXAMINATIONSHANDLER = new OneToManyHandler<Examination>(
	HospitalcoreConstants.TC.EXAMINATION,
	false,
	"doctor",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Persons.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(REGISTERNUMBER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.departments</code> attribute.
	 * @return the departments
	 */
	public Collection<Department> getDepartments(final SessionContext ctx)
	{
		final List<Department> items = getLinkedItems( 
			ctx,
			false,
			HospitalcoreConstants.Relations.DEPARTMENT2DOCTORRELATION,
			"Department",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.departments</code> attribute.
	 * @return the departments
	 */
	public Collection<Department> getDepartments()
	{
		return getDepartments( getSession().getSessionContext() );
	}
	
	public long getDepartmentsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			HospitalcoreConstants.Relations.DEPARTMENT2DOCTORRELATION,
			"Department",
			null
		);
	}
	
	public long getDepartmentsCount()
	{
		return getDepartmentsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.departments</code> attribute. 
	 * @param value the departments
	 */
	public void setDepartments(final SessionContext ctx, final Collection<Department> value)
	{
		setLinkedItems( 
			ctx,
			false,
			HospitalcoreConstants.Relations.DEPARTMENT2DOCTORRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(DEPARTMENT2DOCTORRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.departments</code> attribute. 
	 * @param value the departments
	 */
	public void setDepartments(final Collection<Department> value)
	{
		setDepartments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to departments. 
	 * @param value the item to add to departments
	 */
	public void addToDepartments(final SessionContext ctx, final Department value)
	{
		addLinkedItems( 
			ctx,
			false,
			HospitalcoreConstants.Relations.DEPARTMENT2DOCTORRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DEPARTMENT2DOCTORRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to departments. 
	 * @param value the item to add to departments
	 */
	public void addToDepartments(final Department value)
	{
		addToDepartments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from departments. 
	 * @param value the item to remove from departments
	 */
	public void removeFromDepartments(final SessionContext ctx, final Department value)
	{
		removeLinkedItems( 
			ctx,
			false,
			HospitalcoreConstants.Relations.DEPARTMENT2DOCTORRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DEPARTMENT2DOCTORRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from departments. 
	 * @param value the item to remove from departments
	 */
	public void removeFromDepartments(final Department value)
	{
		removeFromDepartments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.examinations</code> attribute.
	 * @return the examinations
	 */
	public Collection<Examination> getExaminations(final SessionContext ctx)
	{
		return EXAMINATIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.examinations</code> attribute.
	 * @return the examinations
	 */
	public Collection<Examination> getExaminations()
	{
		return getExaminations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.examinations</code> attribute. 
	 * @param value the examinations
	 */
	public void setExaminations(final SessionContext ctx, final Collection<Examination> value)
	{
		EXAMINATIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.examinations</code> attribute. 
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
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.registerNumber</code> attribute.
	 * @return the registerNumber
	 */
	public String getRegisterNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REGISTERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Doctor.registerNumber</code> attribute.
	 * @return the registerNumber
	 */
	public String getRegisterNumber()
	{
		return getRegisterNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.registerNumber</code> attribute. 
	 * @param value the registerNumber
	 */
	public void setRegisterNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REGISTERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Doctor.registerNumber</code> attribute. 
	 * @param value the registerNumber
	 */
	public void setRegisterNumber(final String value)
	{
		setRegisterNumber( getSession().getSessionContext(), value );
	}
	
}
