/**
 */
package hochschule.impl;

import hochschule.Dozent;
import hochschule.Evaluation;
import hochschule.Fachbereich;
import hochschule.Hochschule;
import hochschule.HochschuleFactory;
import hochschule.HochschulePackage;
import hochschule.Lehrbeauftragter;
import hochschule.Professor;
import hochschule.Student;
import hochschule.Studiengang;
import hochschule.Vorlesung;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HochschulePackageImpl extends EPackageImpl implements HochschulePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hochschuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fachbereichEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studiengangEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vorlesungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dozentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lehrbeauftragterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hochschule.HochschulePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HochschulePackageImpl() {
		super(eNS_URI, HochschuleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HochschulePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HochschulePackage init() {
		if (isInited) return (HochschulePackage)EPackage.Registry.INSTANCE.getEPackage(HochschulePackage.eNS_URI);

		// Obtain or create and register package
		HochschulePackageImpl theHochschulePackage = (HochschulePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HochschulePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HochschulePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theHochschulePackage.createPackageContents();

		// Initialize created meta-data
		theHochschulePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHochschulePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HochschulePackage.eNS_URI, theHochschulePackage);
		return theHochschulePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHochschule() {
		return hochschuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHochschule_Fachbereich() {
		return (EReference)hochschuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHochschule_Name() {
		return (EAttribute)hochschuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHochschule_Student() {
		return (EReference)hochschuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFachbereich() {
		return fachbereichEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFachbereich_Studiengang() {
		return (EReference)fachbereichEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFachbereich_Vorlesung() {
		return (EReference)fachbereichEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFachbereich_Dozent() {
		return (EReference)fachbereichEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFachbereich_Name() {
		return (EAttribute)fachbereichEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFachbereich_Alias() {
		return (EAttribute)fachbereichEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudiengang() {
		return studiengangEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudiengang_Vorlesung() {
		return (EReference)studiengangEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudiengang_Name() {
		return (EAttribute)studiengangEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudiengang_NC() {
		return (EAttribute)studiengangEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudiengang_Student() {
		return (EReference)studiengangEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVorlesung() {
		return vorlesungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVorlesung_Tutor() {
		return (EReference)vorlesungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVorlesung_Evaluation() {
		return (EReference)vorlesungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVorlesung_Dozent() {
		return (EReference)vorlesungEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVorlesung_Name() {
		return (EAttribute)vorlesungEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVorlesung_ModulNr() {
		return (EAttribute)vorlesungEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVorlesung_Beschreibung() {
		return (EAttribute)vorlesungEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVorlesung_CrP() {
		return (EAttribute)vorlesungEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVorlesung_Student() {
		return (EReference)vorlesungEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDozent() {
		return dozentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDozent_Vorlesung() {
		return (EReference)dozentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDozent_PersonalNr() {
		return (EAttribute)dozentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDozent_Vorname() {
		return (EAttribute)dozentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDozent_Nachname() {
		return (EAttribute)dozentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLehrbeauftragter() {
		return lehrbeauftragterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfessor() {
		return professorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudent() {
		return studentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_MatrikelNr() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_Vorname() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_Nachname() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_Vorlesung() {
		return (EReference)studentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluation() {
		return evaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluation_Gesamtnote() {
		return (EAttribute)evaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HochschuleFactory getHochschuleFactory() {
		return (HochschuleFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		hochschuleEClass = createEClass(HOCHSCHULE);
		createEReference(hochschuleEClass, HOCHSCHULE__FACHBEREICH);
		createEAttribute(hochschuleEClass, HOCHSCHULE__NAME);
		createEReference(hochschuleEClass, HOCHSCHULE__STUDENT);

		fachbereichEClass = createEClass(FACHBEREICH);
		createEReference(fachbereichEClass, FACHBEREICH__STUDIENGANG);
		createEReference(fachbereichEClass, FACHBEREICH__VORLESUNG);
		createEReference(fachbereichEClass, FACHBEREICH__DOZENT);
		createEAttribute(fachbereichEClass, FACHBEREICH__NAME);
		createEAttribute(fachbereichEClass, FACHBEREICH__ALIAS);

		studiengangEClass = createEClass(STUDIENGANG);
		createEReference(studiengangEClass, STUDIENGANG__VORLESUNG);
		createEAttribute(studiengangEClass, STUDIENGANG__NAME);
		createEAttribute(studiengangEClass, STUDIENGANG__NC);
		createEReference(studiengangEClass, STUDIENGANG__STUDENT);

		vorlesungEClass = createEClass(VORLESUNG);
		createEReference(vorlesungEClass, VORLESUNG__TUTOR);
		createEReference(vorlesungEClass, VORLESUNG__EVALUATION);
		createEReference(vorlesungEClass, VORLESUNG__DOZENT);
		createEAttribute(vorlesungEClass, VORLESUNG__NAME);
		createEAttribute(vorlesungEClass, VORLESUNG__MODUL_NR);
		createEAttribute(vorlesungEClass, VORLESUNG__BESCHREIBUNG);
		createEAttribute(vorlesungEClass, VORLESUNG__CR_P);
		createEReference(vorlesungEClass, VORLESUNG__STUDENT);

		dozentEClass = createEClass(DOZENT);
		createEReference(dozentEClass, DOZENT__VORLESUNG);
		createEAttribute(dozentEClass, DOZENT__PERSONAL_NR);
		createEAttribute(dozentEClass, DOZENT__VORNAME);
		createEAttribute(dozentEClass, DOZENT__NACHNAME);

		lehrbeauftragterEClass = createEClass(LEHRBEAUFTRAGTER);

		professorEClass = createEClass(PROFESSOR);

		studentEClass = createEClass(STUDENT);
		createEAttribute(studentEClass, STUDENT__MATRIKEL_NR);
		createEAttribute(studentEClass, STUDENT__VORNAME);
		createEAttribute(studentEClass, STUDENT__NACHNAME);
		createEReference(studentEClass, STUDENT__VORLESUNG);

		evaluationEClass = createEClass(EVALUATION);
		createEAttribute(evaluationEClass, EVALUATION__GESAMTNOTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		lehrbeauftragterEClass.getESuperTypes().add(this.getDozent());
		professorEClass.getESuperTypes().add(this.getDozent());

		// Initialize classes and features; add operations and parameters
		initEClass(hochschuleEClass, Hochschule.class, "Hochschule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHochschule_Fachbereich(), this.getFachbereich(), null, "fachbereich", null, 1, -1, Hochschule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHochschule_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Hochschule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHochschule_Student(), this.getStudent(), null, "student", null, 1, -1, Hochschule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fachbereichEClass, Fachbereich.class, "Fachbereich", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFachbereich_Studiengang(), this.getStudiengang(), null, "studiengang", null, 1, -1, Fachbereich.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFachbereich_Vorlesung(), this.getVorlesung(), null, "vorlesung", null, 0, -1, Fachbereich.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFachbereich_Dozent(), this.getDozent(), null, "dozent", null, 1, -1, Fachbereich.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFachbereich_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Fachbereich.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFachbereich_Alias(), ecorePackage.getEString(), "Alias", null, 0, 1, Fachbereich.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studiengangEClass, Studiengang.class, "Studiengang", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStudiengang_Vorlesung(), this.getVorlesung(), null, "vorlesung", null, 1, -1, Studiengang.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudiengang_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Studiengang.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudiengang_NC(), ecorePackage.getEString(), "NC", null, 0, 1, Studiengang.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudiengang_Student(), this.getStudent(), null, "student", null, 1, -1, Studiengang.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vorlesungEClass, Vorlesung.class, "Vorlesung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVorlesung_Tutor(), this.getStudent(), null, "tutor", null, 1, -1, Vorlesung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVorlesung_Evaluation(), this.getEvaluation(), null, "evaluation", null, 1, -1, Vorlesung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVorlesung_Dozent(), this.getDozent(), this.getDozent_Vorlesung(), "dozent", null, 1, 1, Vorlesung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVorlesung_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Vorlesung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVorlesung_ModulNr(), ecorePackage.getEString(), "ModulNr", null, 0, 1, Vorlesung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVorlesung_Beschreibung(), ecorePackage.getEString(), "Beschreibung", null, 0, 1, Vorlesung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVorlesung_CrP(), ecorePackage.getEString(), "CrP", null, 0, 1, Vorlesung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVorlesung_Student(), this.getStudent(), this.getStudent_Vorlesung(), "student", null, 5, -1, Vorlesung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dozentEClass, Dozent.class, "Dozent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDozent_Vorlesung(), this.getVorlesung(), this.getVorlesung_Dozent(), "vorlesung", null, 1, -1, Dozent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDozent_PersonalNr(), ecorePackage.getEString(), "PersonalNr", null, 0, 1, Dozent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDozent_Vorname(), ecorePackage.getEString(), "Vorname", null, 0, 1, Dozent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDozent_Nachname(), ecorePackage.getEString(), "Nachname", null, 0, 1, Dozent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lehrbeauftragterEClass, Lehrbeauftragter.class, "Lehrbeauftragter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(professorEClass, Professor.class, "Professor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(studentEClass, Student.class, "Student", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStudent_MatrikelNr(), ecorePackage.getEString(), "MatrikelNr", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudent_Vorname(), ecorePackage.getEString(), "Vorname", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudent_Nachname(), ecorePackage.getEString(), "Nachname", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_Vorlesung(), this.getVorlesung(), this.getVorlesung_Student(), "vorlesung", null, 0, -1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluationEClass, Evaluation.class, "Evaluation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaluation_Gesamtnote(), ecorePackage.getEInt(), "Gesamtnote", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HochschulePackageImpl
