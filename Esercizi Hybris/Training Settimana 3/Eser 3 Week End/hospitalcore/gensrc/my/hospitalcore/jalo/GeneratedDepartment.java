/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 23.30.47                         ---
 * ----------------------------------------------------------------
 */
package my.hospitalcore.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my.hospitalcore.constants.HospitalcoreConstants;
import my.hospitalcore.jalo.Doctor;
import my.hospitalcore.jalo.Hospital;
import my.hospitalcore.jalo.Hospitalization;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Department}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDepartment extends GenericItem
{
	/** Qualifier of the <code>Department.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Department.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Department.hospital</code> attribute **/
	public static final String HOSPITAL = "hospital";
	/** Qualifier of the <code>Department.hospitalizations</code> attribute **/
	public static final String HOSPITALIZATIONS = "hospitalizations";
	/** Qualifier of the <code>Department.doctors</code> attribute **/
	public static final String DOCTORS = "doctors";
	/** Relation ordering override parameter constants for Department2DoctorRelation from ((hospitalcore))*/
	protected static String DEPARTMENT2DOCTORRELATION_SRC_ORDERED = "relation.Department2DoctorRelation.source.ordered";
	protected static String DEPARTMENT2DOCTORRELATION_TGT_ORDERED = "relation.Department2DoctorRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Department2DoctorRelation from ((hospitalcore))*/
	protected static String DEPARTMENT2DOCTORRELATION_MARKMODIFIED = "relation.Department2DoctorRelation.markmodified";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n HOSPITAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDepartment> HOSPITALHANDLER = new BidirectionalOneToManyHandler<GeneratedDepartment>(
	HospitalcoreConstants.TC.DEPARTMENT,
	false,
	"hospital",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n HOSPITALIZATIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Hospitalization> HOSPITALIZATIONSHANDLER = new OneToManyHandler<Hospitalization>(
	HospitalcoreConstants.TC.HOSPITALIZATION,
	false,
	"department",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(HOSPITAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		HOSPITALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.doctors</code> attribute.
	 * @return the doctors
	 */
	public Collection<Doctor> getDoctors(final SessionContext ctx)
	{
		final List<Doctor> items = getLinkedItems( 
			ctx,
			true,
			HospitalcoreConstants.Relations.DEPARTMENT2DOCTORRELATION,
			"Doctor",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.doctors</code> attribute.
	 * @return the doctors
	 */
	public Collection<Doctor> getDoctors()
	{
		return getDoctors( getSession().getSessionContext() );
	}
	
	public long getDoctorsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			HospitalcoreConstants.Relations.DEPARTMENT2DOCTORRELATION,
			"Doctor",
			null
		);
	}
	
	public long getDoctorsCount()
	{
		return getDoctorsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.doctors</code> attribute. 
	 * @param value the doctors
	 */
	public void setDoctors(final SessionContext ctx, final Collection<Doctor> value)
	{
		setLinkedItems( 
			ctx,
			true,
			HospitalcoreConstants.Relations.DEPARTMENT2DOCTORRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(DEPARTMENT2DOCTORRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.doctors</code> attribute. 
	 * @param value the doctors
	 */
	public void setDoctors(final Collection<Doctor> value)
	{
		setDoctors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to doctors. 
	 * @param value the item to add to doctors
	 */
	public void addToDoctors(final SessionContext ctx, final Doctor value)
	{
		addLinkedItems( 
			ctx,
			true,
			HospitalcoreConstants.Relations.DEPARTMENT2DOCTORRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DEPARTMENT2DOCTORRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to doctors. 
	 * @param value the item to add to doctors
	 */
	public void addToDoctors(final Doctor value)
	{
		addToDoctors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from doctors. 
	 * @param value the item to remove from doctors
	 */
	public void removeFromDoctors(final SessionContext ctx, final Doctor value)
	{
		removeLinkedItems( 
			ctx,
			true,
			HospitalcoreConstants.Relations.DEPARTMENT2DOCTORRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DEPARTMENT2DOCTORRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from doctors. 
	 * @param value the item to remove from doctors
	 */
	public void removeFromDoctors(final Doctor value)
	{
		removeFromDoctors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.hospital</code> attribute.
	 * @return the hospital
	 */
	public Hospital getHospital(final SessionContext ctx)
	{
		return (Hospital)getProperty( ctx, HOSPITAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.hospital</code> attribute.
	 * @return the hospital
	 */
	public Hospital getHospital()
	{
		return getHospital( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.hospital</code> attribute. 
	 * @param value the hospital
	 */
	public void setHospital(final SessionContext ctx, final Hospital value)
	{
		HOSPITALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.hospital</code> attribute. 
	 * @param value the hospital
	 */
	public void setHospital(final Hospital value)
	{
		setHospital( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.hospitalizations</code> attribute.
	 * @return the hospitalizations
	 */
	public Collection<Hospitalization> getHospitalizations(final SessionContext ctx)
	{
		return HOSPITALIZATIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.hospitalizations</code> attribute.
	 * @return the hospitalizations
	 */
	public Collection<Hospitalization> getHospitalizations()
	{
		return getHospitalizations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.hospitalizations</code> attribute. 
	 * @param value the hospitalizations
	 */
	public void setHospitalizations(final SessionContext ctx, final Collection<Hospitalization> value)
	{
		HOSPITALIZATIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.hospitalizations</code> attribute. 
	 * @param value the hospitalizations
	 */
	public void setHospitalizations(final Collection<Hospitalization> value)
	{
		setHospitalizations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to hospitalizations. 
	 * @param value the item to add to hospitalizations
	 */
	public void addToHospitalizations(final SessionContext ctx, final Hospitalization value)
	{
		HOSPITALIZATIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to hospitalizations. 
	 * @param value the item to add to hospitalizations
	 */
	public void addToHospitalizations(final Hospitalization value)
	{
		addToHospitalizations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from hospitalizations. 
	 * @param value the item to remove from hospitalizations
	 */
	public void removeFromHospitalizations(final SessionContext ctx, final Hospitalization value)
	{
		HOSPITALIZATIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from hospitalizations. 
	 * @param value the item to remove from hospitalizations
	 */
	public void removeFromHospitalizations(final Hospitalization value)
	{
		removeFromHospitalizations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
