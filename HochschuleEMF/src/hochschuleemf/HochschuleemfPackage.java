/**
 */
package hochschuleemf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hochschuleemf.HochschuleemfFactory
 * @model kind="package"
 * @generated
 */
public interface HochschuleemfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hochschuleemf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/hochschule";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hochschule";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HochschuleemfPackage eINSTANCE = hochschuleemf.impl.HochschuleemfPackageImpl.init();

	/**
	 * The meta object id for the '{@link hochschuleemf.impl.HochschuleImpl <em>Hochschule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hochschuleemf.impl.HochschuleImpl
	 * @see hochschuleemf.impl.HochschuleemfPackageImpl#getHochschule()
	 * @generated
	 */
	int HOCHSCHULE = 0;

	/**
	 * The feature id for the '<em><b>Fachbereich</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOCHSCHULE__FACHBEREICH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOCHSCHULE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Student</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOCHSCHULE__STUDENT = 2;

	/**
	 * The number of structural features of the '<em>Hochschule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOCHSCHULE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hochschuleemf.impl.FachbereichImpl <em>Fachbereich</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hochschuleemf.impl.FachbereichImpl
	 * @see hochschuleemf.impl.HochschuleemfPackageImpl#getFachbereich()
	 * @generated
	 */
	int FACHBEREICH = 1;

	/**
	 * The feature id for the '<em><b>Studiengang</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACHBEREICH__STUDIENGANG = 0;

	/**
	 * The feature id for the '<em><b>Vorlesung</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACHBEREICH__VORLESUNG = 1;

	/**
	 * The feature id for the '<em><b>Dozent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACHBEREICH__DOZENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACHBEREICH__NAME = 3;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACHBEREICH__ALIAS = 4;

	/**
	 * The number of structural features of the '<em>Fachbereich</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACHBEREICH_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link hochschuleemf.impl.StudiengangImpl <em>Studiengang</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hochschuleemf.impl.StudiengangImpl
	 * @see hochschuleemf.impl.HochschuleemfPackageImpl#getStudiengang()
	 * @generated
	 */
	int STUDIENGANG = 2;

	/**
	 * The feature id for the '<em><b>Vorlesung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDIENGANG__VORLESUNG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDIENGANG__NAME = 1;

	/**
	 * The feature id for the '<em><b>NC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDIENGANG__NC = 2;

	/**
	 * The feature id for the '<em><b>Student</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDIENGANG__STUDENT = 3;

	/**
	 * The number of structural features of the '<em>Studiengang</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDIENGANG_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link hochschuleemf.impl.VorlesungImpl <em>Vorlesung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hochschuleemf.impl.VorlesungImpl
	 * @see hochschuleemf.impl.HochschuleemfPackageImpl#getVorlesung()
	 * @generated
	 */
	int VORLESUNG = 3;

	/**
	 * The feature id for the '<em><b>Tutor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORLESUNG__TUTOR = 0;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORLESUNG__EVALUATION = 1;

	/**
	 * The feature id for the '<em><b>Dozent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORLESUNG__DOZENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORLESUNG__NAME = 3;

	/**
	 * The feature id for the '<em><b>Modul Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORLESUNG__MODUL_NR = 4;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORLESUNG__BESCHREIBUNG = 5;

	/**
	 * The feature id for the '<em><b>Cr P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORLESUNG__CR_P = 6;

	/**
	 * The feature id for the '<em><b>Student</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORLESUNG__STUDENT = 7;

	/**
	 * The number of structural features of the '<em>Vorlesung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORLESUNG_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link hochschuleemf.impl.DozentImpl <em>Dozent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hochschuleemf.impl.DozentImpl
	 * @see hochschuleemf.impl.HochschuleemfPackageImpl#getDozent()
	 * @generated
	 */
	int DOZENT = 4;

	/**
	 * The feature id for the '<em><b>Vorlesung</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOZENT__VORLESUNG = 0;

	/**
	 * The feature id for the '<em><b>Personal Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOZENT__PERSONAL_NR = 1;

	/**
	 * The feature id for the '<em><b>Vorname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOZENT__VORNAME = 2;

	/**
	 * The feature id for the '<em><b>Nachname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOZENT__NACHNAME = 3;

	/**
	 * The number of structural features of the '<em>Dozent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOZENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link hochschuleemf.impl.LehrbeauftragterImpl <em>Lehrbeauftragter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hochschuleemf.impl.LehrbeauftragterImpl
	 * @see hochschuleemf.impl.HochschuleemfPackageImpl#getLehrbeauftragter()
	 * @generated
	 */
	int LEHRBEAUFTRAGTER = 5;

	/**
	 * The feature id for the '<em><b>Vorlesung</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEHRBEAUFTRAGTER__VORLESUNG = DOZENT__VORLESUNG;

	/**
	 * The feature id for the '<em><b>Personal Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEHRBEAUFTRAGTER__PERSONAL_NR = DOZENT__PERSONAL_NR;

	/**
	 * The feature id for the '<em><b>Vorname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEHRBEAUFTRAGTER__VORNAME = DOZENT__VORNAME;

	/**
	 * The feature id for the '<em><b>Nachname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEHRBEAUFTRAGTER__NACHNAME = DOZENT__NACHNAME;

	/**
	 * The number of structural features of the '<em>Lehrbeauftragter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEHRBEAUFTRAGTER_FEATURE_COUNT = DOZENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hochschuleemf.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hochschuleemf.impl.ProfessorImpl
	 * @see hochschuleemf.impl.HochschuleemfPackageImpl#getProfessor()
	 * @generated
	 */
	int PROFESSOR = 6;

	/**
	 * The feature id for the '<em><b>Vorlesung</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__VORLESUNG = DOZENT__VORLESUNG;

	/**
	 * The feature id for the '<em><b>Personal Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__PERSONAL_NR = DOZENT__PERSONAL_NR;

	/**
	 * The feature id for the '<em><b>Vorname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__VORNAME = DOZENT__VORNAME;

	/**
	 * The feature id for the '<em><b>Nachname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NACHNAME = DOZENT__NACHNAME;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = DOZENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hochschuleemf.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hochschuleemf.impl.StudentImpl
	 * @see hochschuleemf.impl.HochschuleemfPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 7;

	/**
	 * The feature id for the '<em><b>Matrikel Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__MATRIKEL_NR = 0;

	/**
	 * The feature id for the '<em><b>Vorname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__VORNAME = 1;

	/**
	 * The feature id for the '<em><b>Nachname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NACHNAME = 2;

	/**
	 * The feature id for the '<em><b>Vorlesung</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__VORLESUNG = 3;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link hochschuleemf.impl.EvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hochschuleemf.impl.EvaluationImpl
	 * @see hochschuleemf.impl.HochschuleemfPackageImpl#getEvaluation()
	 * @generated
	 */
	int EVALUATION = 8;

	/**
	 * The feature id for the '<em><b>Gesamtnote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__GESAMTNOTE = 0;

	/**
	 * The number of structural features of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link hochschuleemf.Hochschule <em>Hochschule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hochschule</em>'.
	 * @see hochschuleemf.Hochschule
	 * @generated
	 */
	EClass getHochschule();

	/**
	 * Returns the meta object for the containment reference list '{@link hochschuleemf.Hochschule#getFachbereich <em>Fachbereich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fachbereich</em>'.
	 * @see hochschuleemf.Hochschule#getFachbereich()
	 * @see #getHochschule()
	 * @generated
	 */
	EReference getHochschule_Fachbereich();

	/**
	 * Returns the meta object for the attribute '{@link hochschuleemf.Hochschule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hochschuleemf.Hochschule#getName()
	 * @see #getHochschule()
	 * @generated
	 */
	EAttribute getHochschule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hochschuleemf.Hochschule#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Student</em>'.
	 * @see hochschuleemf.Hochschule#getStudent()
	 * @see #getHochschule()
	 * @generated
	 */
	EReference getHochschule_Student();

	/**
	 * Returns the meta object for class '{@link hochschuleemf.Fachbereich <em>Fachbereich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fachbereich</em>'.
	 * @see hochschuleemf.Fachbereich
	 * @generated
	 */
	EClass getFachbereich();

	/**
	 * Returns the meta object for the containment reference list '{@link hochschuleemf.Fachbereich#getStudiengang <em>Studiengang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Studiengang</em>'.
	 * @see hochschuleemf.Fachbereich#getStudiengang()
	 * @see #getFachbereich()
	 * @generated
	 */
	EReference getFachbereich_Studiengang();

	/**
	 * Returns the meta object for the reference list '{@link hochschuleemf.Fachbereich#getVorlesung <em>Vorlesung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vorlesung</em>'.
	 * @see hochschuleemf.Fachbereich#getVorlesung()
	 * @see #getFachbereich()
	 * @generated
	 */
	EReference getFachbereich_Vorlesung();

	/**
	 * Returns the meta object for the containment reference list '{@link hochschuleemf.Fachbereich#getDozent <em>Dozent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dozent</em>'.
	 * @see hochschuleemf.Fachbereich#getDozent()
	 * @see #getFachbereich()
	 * @generated
	 */
	EReference getFachbereich_Dozent();

	/**
	 * Returns the meta object for the attribute '{@link hochschuleemf.Fachbereich#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hochschuleemf.Fachbereich#getName()
	 * @see #getFachbereich()
	 * @generated
	 */
	EAttribute getFachbereich_Name();

	/**
	 * Returns the meta object for the attribute '{@link hochschuleemf.Fachbereich#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see hochschuleemf.Fachbereich#getAlias()
	 * @see #getFachbereich()
	 * @generated
	 */
	EAttribute getFachbereich_Alias();

	/**
	 * Returns the meta object for class '{@link hochschuleemf.Studiengang <em>Studiengang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Studiengang</em>'.
	 * @see hochschuleemf.Studiengang
	 * @generated
	 */
	EClass getStudiengang();

	/**
	 * Returns the meta object for the containment reference list '{@link hochschuleemf.Studiengang#getVorlesung <em>Vorlesung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vorlesung</em>'.
	 * @see hochschuleemf.Studiengang#getVorlesung()
	 * @see #getStudiengang()
	 * @generated
	 */
	EReference getStudiengang_Vorlesung();

	/**
	 * Returns the meta object for the attribute '{@link hochschuleemf.Studiengang#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hochschuleemf.Studiengang#getName()
	 * @see #getStudiengang()
	 * @generated
	 */
	EAttribute getStudiengang_Name();

	/**
	 * Returns the meta object for the attribute '{@link hochschuleemf.Studiengang#getNC <em>NC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NC</em>'.
	 * @see hochschuleemf.Studiengang#getNC()
	 * @see #getStudiengang()
	 * @generated
	 */
	EAttribute getStudiengang_NC();

	/**
	 * Returns the meta object for the reference list '{@link hochschuleemf.Studiengang#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Student</em>'.
	 * @see hochschuleemf.Studiengang#getStudent()
	 * @see #getStudiengang()
	 * @generated
	 */
	EReference getStudiengang_Student();

	/**
	 * Returns the meta object for class '{@link hochschuleemf.Vorlesung <em>Vorlesung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vorlesung</em>'.
	 * @see hochschuleemf.Vorlesung
	 * @generated
	 */
	EClass getVorlesung();

	/**
	 * Returns the meta object for the reference list '{@link hochschuleemf.Vorlesung#getTutor <em>Tutor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tutor</em>'.
	 * @see hochschuleemf.Vorlesung#getTutor()
	 * @see #getVorlesung()
	 * @generated
	 */
	EReference getVorlesung_Tutor();

	/**
	 * Returns the meta object for the containment reference list '{@link hochschuleemf.Vorlesung#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluation</em>'.
	 * @see hochschuleemf.Vorlesung#getEvaluation()
	 * @see #getVorlesung()
	 * @generated
	 */
	EReference getVorlesung_Evaluation();

	/**
	 * Returns the meta object for the reference '{@link hochschuleemf.Vorlesung#getDozent <em>Dozent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dozent</em>'.
	 * @see hochschuleemf.Vorlesung#getDozent()
	 * @see #getVorlesung()
	 * @generated
	 */
	EReference getVorlesung_Dozent();

	/**
	 * Returns the meta object for the attribute '{@link hochschuleemf.Vorlesung#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hochschuleemf.Vorlesung#getName()
	 * @see #getVorlesung()
	 * @generated
	 */
	EAttribute getVorlesung_Name();

	/**
	 * Returns the meta object for the attribute '{@link hochschuleemf.Vorlesung#getModulNr <em>Modul Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modul Nr</em>'.
	 * @see hochschuleemf.Vorlesung#getModulNr()
	 * @see #getVorlesung()
	 * @generated
	 */
	EAttribute getVorlesung_ModulNr();

	/**
	 * Returns the meta object for the attribute '{@link hochschuleemf.Vorlesung#getBeschreibung <em>Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beschreibung</em>'.
	 * @see hochschuleemf.Vorlesung#getBeschreibung()
	 * @see #getVorlesung()
	 * @generated
	 */
	EAttribute getVorlesung_Beschreibung();

	/**
	 * Returns the meta object for the attribute '{@link hochschuleemf.Vorlesung#getCrP <em>Cr P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr P</em>'.
	 * @see hochschuleemf.Vorlesung#getCrP()
	 * @see #getVorlesung()
	 * @generated
	 */
	EAttribute getVorlesung_CrP();

	/**
	 * Returns the meta object for the reference list '{@link hochschuleemf.Vorlesung#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Student</em>'.
	 * @see hochschuleemf.Vorlesung#getStudent()
	 * @see #getVorlesung()
	 * @generated
	 */
	EReference getVorlesung_Student();

	/**
	 * Returns the meta object for class '{@link hochschuleemf.Dozent <em>Dozent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dozent</em>'.
	 * @see hochschuleemf.Dozent
	 * @generated
	 */
	EClass getDozent();

	/**
	 * Returns the meta object for the reference list '{@link hochschuleemf.Dozent#getVorlesung <em>Vorlesung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vorlesung</em>'.
	 * @see hochschuleemf.Dozent#getVorlesung()
	 * @see #getDozent()
	 * @generated
	 */
	EReference getDozent_Vorlesung();

	/**
	 * Returns the meta object for the attribute '{@link hochschuleemf.Dozent#getPersonalNr <em>Personal Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personal Nr</em>'.
	 * @see hochschuleemf.Dozent#getPersonalNr()
	 * @see #getDozent()
	 * @generated
	 */
	EAttribute getDozent_PersonalNr();

	/**
	 * Returns the meta object for the attribute '{@link hochschuleemf.Dozent#getVorname <em>Vorname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vorname</em>'.
	 * @see hochschuleemf.Dozent#getVorname()
	 * @see #getDozent()
	 * @generated
	 */
	EAttribute getDozent_Vorname();

	/**
	 * Returns the meta object for the attribute '{@link hochschuleemf.Dozent#getNachname <em>Nachname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nachname</em>'.
	 * @see hochschuleemf.Dozent#getNachname()
	 * @see #getDozent()
	 * @generated
	 */
	EAttribute getDozent_Nachname();

	/**
	 * Returns the meta object for class '{@link hochschuleemf.Lehrbeauftragter <em>Lehrbeauftragter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lehrbeauftragter</em>'.
	 * @see hochschuleemf.Lehrbeauftragter
	 * @generated
	 */
	EClass getLehrbeauftragter();

	/**
	 * Returns the meta object for class '{@link hochschuleemf.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor</em>'.
	 * @see hochschuleemf.Professor
	 * @generated
	 */
	EClass getProfessor();

	/**
	 * Returns the meta object for class '{@link hochschuleemf.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see hochschuleemf.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link hochschuleemf.Student#getMatrikelNr <em>Matrikel Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matrikel Nr</em>'.
	 * @see hochschuleemf.Student#getMatrikelNr()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_MatrikelNr();

	/**
	 * Returns the meta object for the attribute '{@link hochschuleemf.Student#getVorname <em>Vorname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vorname</em>'.
	 * @see hochschuleemf.Student#getVorname()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Vorname();

	/**
	 * Returns the meta object for the attribute '{@link hochschuleemf.Student#getNachname <em>Nachname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nachname</em>'.
	 * @see hochschuleemf.Student#getNachname()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Nachname();

	/**
	 * Returns the meta object for the reference list '{@link hochschuleemf.Student#getVorlesung <em>Vorlesung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vorlesung</em>'.
	 * @see hochschuleemf.Student#getVorlesung()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Vorlesung();

	/**
	 * Returns the meta object for class '{@link hochschuleemf.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see hochschuleemf.Evaluation
	 * @generated
	 */
	EClass getEvaluation();

	/**
	 * Returns the meta object for the attribute '{@link hochschuleemf.Evaluation#getGesamtnote <em>Gesamtnote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gesamtnote</em>'.
	 * @see hochschuleemf.Evaluation#getGesamtnote()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_Gesamtnote();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HochschuleemfFactory getHochschuleemfFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hochschuleemf.impl.HochschuleImpl <em>Hochschule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hochschuleemf.impl.HochschuleImpl
		 * @see hochschuleemf.impl.HochschuleemfPackageImpl#getHochschule()
		 * @generated
		 */
		EClass HOCHSCHULE = eINSTANCE.getHochschule();

		/**
		 * The meta object literal for the '<em><b>Fachbereich</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOCHSCHULE__FACHBEREICH = eINSTANCE.getHochschule_Fachbereich();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOCHSCHULE__NAME = eINSTANCE.getHochschule_Name();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOCHSCHULE__STUDENT = eINSTANCE.getHochschule_Student();

		/**
		 * The meta object literal for the '{@link hochschuleemf.impl.FachbereichImpl <em>Fachbereich</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hochschuleemf.impl.FachbereichImpl
		 * @see hochschuleemf.impl.HochschuleemfPackageImpl#getFachbereich()
		 * @generated
		 */
		EClass FACHBEREICH = eINSTANCE.getFachbereich();

		/**
		 * The meta object literal for the '<em><b>Studiengang</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACHBEREICH__STUDIENGANG = eINSTANCE.getFachbereich_Studiengang();

		/**
		 * The meta object literal for the '<em><b>Vorlesung</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACHBEREICH__VORLESUNG = eINSTANCE.getFachbereich_Vorlesung();

		/**
		 * The meta object literal for the '<em><b>Dozent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACHBEREICH__DOZENT = eINSTANCE.getFachbereich_Dozent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACHBEREICH__NAME = eINSTANCE.getFachbereich_Name();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACHBEREICH__ALIAS = eINSTANCE.getFachbereich_Alias();

		/**
		 * The meta object literal for the '{@link hochschuleemf.impl.StudiengangImpl <em>Studiengang</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hochschuleemf.impl.StudiengangImpl
		 * @see hochschuleemf.impl.HochschuleemfPackageImpl#getStudiengang()
		 * @generated
		 */
		EClass STUDIENGANG = eINSTANCE.getStudiengang();

		/**
		 * The meta object literal for the '<em><b>Vorlesung</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDIENGANG__VORLESUNG = eINSTANCE.getStudiengang_Vorlesung();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDIENGANG__NAME = eINSTANCE.getStudiengang_Name();

		/**
		 * The meta object literal for the '<em><b>NC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDIENGANG__NC = eINSTANCE.getStudiengang_NC();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDIENGANG__STUDENT = eINSTANCE.getStudiengang_Student();

		/**
		 * The meta object literal for the '{@link hochschuleemf.impl.VorlesungImpl <em>Vorlesung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hochschuleemf.impl.VorlesungImpl
		 * @see hochschuleemf.impl.HochschuleemfPackageImpl#getVorlesung()
		 * @generated
		 */
		EClass VORLESUNG = eINSTANCE.getVorlesung();

		/**
		 * The meta object literal for the '<em><b>Tutor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORLESUNG__TUTOR = eINSTANCE.getVorlesung_Tutor();

		/**
		 * The meta object literal for the '<em><b>Evaluation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORLESUNG__EVALUATION = eINSTANCE.getVorlesung_Evaluation();

		/**
		 * The meta object literal for the '<em><b>Dozent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORLESUNG__DOZENT = eINSTANCE.getVorlesung_Dozent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORLESUNG__NAME = eINSTANCE.getVorlesung_Name();

		/**
		 * The meta object literal for the '<em><b>Modul Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORLESUNG__MODUL_NR = eINSTANCE.getVorlesung_ModulNr();

		/**
		 * The meta object literal for the '<em><b>Beschreibung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORLESUNG__BESCHREIBUNG = eINSTANCE.getVorlesung_Beschreibung();

		/**
		 * The meta object literal for the '<em><b>Cr P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORLESUNG__CR_P = eINSTANCE.getVorlesung_CrP();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORLESUNG__STUDENT = eINSTANCE.getVorlesung_Student();

		/**
		 * The meta object literal for the '{@link hochschuleemf.impl.DozentImpl <em>Dozent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hochschuleemf.impl.DozentImpl
		 * @see hochschuleemf.impl.HochschuleemfPackageImpl#getDozent()
		 * @generated
		 */
		EClass DOZENT = eINSTANCE.getDozent();

		/**
		 * The meta object literal for the '<em><b>Vorlesung</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOZENT__VORLESUNG = eINSTANCE.getDozent_Vorlesung();

		/**
		 * The meta object literal for the '<em><b>Personal Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOZENT__PERSONAL_NR = eINSTANCE.getDozent_PersonalNr();

		/**
		 * The meta object literal for the '<em><b>Vorname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOZENT__VORNAME = eINSTANCE.getDozent_Vorname();

		/**
		 * The meta object literal for the '<em><b>Nachname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOZENT__NACHNAME = eINSTANCE.getDozent_Nachname();

		/**
		 * The meta object literal for the '{@link hochschuleemf.impl.LehrbeauftragterImpl <em>Lehrbeauftragter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hochschuleemf.impl.LehrbeauftragterImpl
		 * @see hochschuleemf.impl.HochschuleemfPackageImpl#getLehrbeauftragter()
		 * @generated
		 */
		EClass LEHRBEAUFTRAGTER = eINSTANCE.getLehrbeauftragter();

		/**
		 * The meta object literal for the '{@link hochschuleemf.impl.ProfessorImpl <em>Professor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hochschuleemf.impl.ProfessorImpl
		 * @see hochschuleemf.impl.HochschuleemfPackageImpl#getProfessor()
		 * @generated
		 */
		EClass PROFESSOR = eINSTANCE.getProfessor();

		/**
		 * The meta object literal for the '{@link hochschuleemf.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hochschuleemf.impl.StudentImpl
		 * @see hochschuleemf.impl.HochschuleemfPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Matrikel Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__MATRIKEL_NR = eINSTANCE.getStudent_MatrikelNr();

		/**
		 * The meta object literal for the '<em><b>Vorname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__VORNAME = eINSTANCE.getStudent_Vorname();

		/**
		 * The meta object literal for the '<em><b>Nachname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__NACHNAME = eINSTANCE.getStudent_Nachname();

		/**
		 * The meta object literal for the '<em><b>Vorlesung</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__VORLESUNG = eINSTANCE.getStudent_Vorlesung();

		/**
		 * The meta object literal for the '{@link hochschuleemf.impl.EvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hochschuleemf.impl.EvaluationImpl
		 * @see hochschuleemf.impl.HochschuleemfPackageImpl#getEvaluation()
		 * @generated
		 */
		EClass EVALUATION = eINSTANCE.getEvaluation();

		/**
		 * The meta object literal for the '<em><b>Gesamtnote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION__GESAMTNOTE = eINSTANCE.getEvaluation_Gesamtnote();

	}

} //HochschuleemfPackage
