/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 23.30.47                         ---
 * ----------------------------------------------------------------
 */
package my.hospitalcore.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedHospitalcoreConstants
{
	public static final String EXTENSIONNAME = "hospitalcore";
	public static class TC
	{
		public static final String DEPARTMENT = "Department".intern();
		public static final String DOCTOR = "Doctor".intern();
		public static final String EXAMINATION = "Examination".intern();
		public static final String EXAMRESULT = "ExamResult".intern();
		public static final String HOSPITAL = "Hospital".intern();
		public static final String HOSPITALIZATION = "Hospitalization".intern();
		public static final String PATIENT = "Patient".intern();
		public static final String PERSONGENDER = "PersonGender".intern();
		public static final String PERSONS = "Persons".intern();
	}
	public static class Attributes
	{
		// no constants defined.
	}
	public static class Enumerations
	{
		public static class ExamResult
		{
			public static final String POSITIVE = "POSITIVE".intern();
			public static final String NEGATIVE = "NEGATIVE".intern();
		}
		public static class PersonGender
		{
			public static final String MALE = "MALE".intern();
			public static final String FEMALE = "FEMALE".intern();
		}
	}
	public static class Relations
	{
		public static final String DEPARTMENT2DOCTORRELATION = "Department2DoctorRelation".intern();
		public static final String DEPARTMENT2HOSPITALIZATIONRELATION = "Department2HospitalizationRelation".intern();
		public static final String DOCTOR2EXAMINATIONRELATION = "Doctor2ExaminationRelation".intern();
		public static final String HOSPITAL2DEPARTMENTRELATION = "Hospital2DepartmentRelation".intern();
		public static final String PATIENT2EXAMINATIONRELATION = "Patient2ExaminationRelation".intern();
	}
	
	protected GeneratedHospitalcoreConstants()
	{
		// private constructor
	}
	
	
}
