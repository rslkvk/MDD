/**
 */
package hochschule;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hochschule.HmodelFactory
 * @model kind="package"
 * @generated
 */
public interface HmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hochschule";

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
	HmodelPackage eINSTANCE = hochschule.impl.HmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hochschule.impl.HochschuleImpl <em>Hochschule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hochschule.impl.HochschuleImpl
	 * @see hochschule.impl.HmodelPackageImpl#getHochschule()
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
	 * The number of operations of the '<em>Hochschule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOCHSCHULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hochschule.impl.FachbereichImpl <em>Fachbereich</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hochschule.impl.FachbereichImpl
	 * @see hochschule.impl.HmodelPackageImpl#getFachbereich()
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
	 * The number of operations of the '<em>Fachbereich</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACHBEREICH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hochschule.impl.StudiengangImpl <em>Studiengang</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hochschule.impl.StudiengangImpl
	 * @see hochschule.impl.HmodelPackageImpl#getStudiengang()
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
	 * The number of operations of the '<em>Studiengang</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDIENGANG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hochschule.impl.VorlesungImpl <em>Vorlesung</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hochschule.impl.VorlesungImpl
	 * @see hochschule.impl.HmodelPackageImpl#getVorlesung()
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
	 * The number of operations of the '<em>Vorlesung</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORLESUNG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hochschule.impl.DozentImpl <em>Dozent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hochschule.impl.DozentImpl
	 * @see hochschule.impl.HmodelPackageImpl#getDozent()
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
	 * The number of operations of the '<em>Dozent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOZENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hochschule.impl.LehrbeauftragterImpl <em>Lehrbeauftragter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hochschule.impl.LehrbeauftragterImpl
	 * @see hochschule.impl.HmodelPackageImpl#getLehrbeauftragter()
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
	 * The number of operations of the '<em>Lehrbeauftragter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEHRBEAUFTRAGTER_OPERATION_COUNT = DOZENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hochschule.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hochschule.impl.ProfessorImpl
	 * @see hochschule.impl.HmodelPackageImpl#getProfessor()
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
	 * The number of operations of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = DOZENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hochschule.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hochschule.impl.StudentImpl
	 * @see hochschule.impl.HmodelPackageImpl#getStudent()
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
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hochschule.impl.EvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hochschule.impl.EvaluationImpl
	 * @see hochschule.impl.HmodelPackageImpl#getEvaluation()
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
	 * The number of operations of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hochschule.Hochschule <em>Hochschule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hochschule</em>'.
	 * @see hochschule.Hochschule
	 * @generated
	 */
	EClass getHochschule();

	/**
	 * Returns the meta object for the containment reference list '{@link hochschule.Hochschule#getFachbereich <em>Fachbereich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fachbereich</em>'.
	 * @see hochschule.Hochschule#getFachbereich()
	 * @see #getHochschule()
	 * @generated
	 */
	EReference getHochschule_Fachbereich();

	/**
	 * Returns the meta object for the attribute '{@link hochschule.Hochschule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hochschule.Hochschule#getName()
	 * @see #getHochschule()
	 * @generated
	 */
	EAttribute getHochschule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hochschule.Hochschule#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Student</em>'.
	 * @see hochschule.Hochschule#getStudent()
	 * @see #getHochschule()
	 * @generated
	 */
	EReference getHochschule_Student();

	/**
	 * Returns the meta object for class '{@link hochschule.Fachbereich <em>Fachbereich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fachbereich</em>'.
	 * @see hochschule.Fachbereich
	 * @generated
	 */
	EClass getFachbereich();

	/**
	 * Returns the meta object for the containment reference list '{@link hochschule.Fachbereich#getStudiengang <em>Studiengang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Studiengang</em>'.
	 * @see hochschule.Fachbereich#getStudiengang()
	 * @see #getFachbereich()
	 * @generated
	 */
	EReference getFachbereich_Studiengang();

	/**
	 * Returns the meta object for the reference list '{@link hochschule.Fachbereich#getVorlesung <em>Vorlesung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vorlesung</em>'.
	 * @see hochschule.Fachbereich#getVorlesung()
	 * @see #getFachbereich()
	 * @generated
	 */
	EReference getFachbereich_Vorlesung();

	/**
	 * Returns the meta object for the containment reference list '{@link hochschule.Fachbereich#getDozent <em>Dozent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dozent</em>'.
	 * @see hochschule.Fachbereich#getDozent()
	 * @see #getFachbereich()
	 * @generated
	 */
	EReference getFachbereich_Dozent();

	/**
	 * Returns the meta object for the attribute '{@link hochschule.Fachbereich#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hochschule.Fachbereich#getName()
	 * @see #getFachbereich()
	 * @generated
	 */
	EAttribute getFachbereich_Name();

	/**
	 * Returns the meta object for the attribute '{@link hochschule.Fachbereich#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see hochschule.Fachbereich#getAlias()
	 * @see #getFachbereich()
	 * @generated
	 */
	EAttribute getFachbereich_Alias();

	/**
	 * Returns the meta object for class '{@link hochschule.Studiengang <em>Studiengang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Studiengang</em>'.
	 * @see hochschule.Studiengang
	 * @generated
	 */
	EClass getStudiengang();

	/**
	 * Returns the meta object for the containment reference list '{@link hochschule.Studiengang#getVorlesung <em>Vorlesung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vorlesung</em>'.
	 * @see hochschule.Studiengang#getVorlesung()
	 * @see #getStudiengang()
	 * @generated
	 */
	EReference getStudiengang_Vorlesung();

	/**
	 * Returns the meta object for the attribute '{@link hochschule.Studiengang#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hochschule.Studiengang#getName()
	 * @see #getStudiengang()
	 * @generated
	 */
	EAttribute getStudiengang_Name();

	/**
	 * Returns the meta object for the attribute '{@link hochschule.Studiengang#getNC <em>NC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NC</em>'.
	 * @see hochschule.Studiengang#getNC()
	 * @see #getStudiengang()
	 * @generated
	 */
	EAttribute getStudiengang_NC();

	/**
	 * Returns the meta object for the reference list '{@link hochschule.Studiengang#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Student</em>'.
	 * @see hochschule.Studiengang#getStudent()
	 * @see #getStudiengang()
	 * @generated
	 */
	EReference getStudiengang_Student();

	/**
	 * Returns the meta object for class '{@link hochschule.Vorlesung <em>Vorlesung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vorlesung</em>'.
	 * @see hochschule.Vorlesung
	 * @generated
	 */
	EClass getVorlesung();

	/**
	 * Returns the meta object for the reference list '{@link hochschule.Vorlesung#getTutor <em>Tutor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tutor</em>'.
	 * @see hochschule.Vorlesung#getTutor()
	 * @see #getVorlesung()
	 * @generated
	 */
	EReference getVorlesung_Tutor();

	/**
	 * Returns the meta object for the containment reference list '{@link hochschule.Vorlesung#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluation</em>'.
	 * @see hochschule.Vorlesung#getEvaluation()
	 * @see #getVorlesung()
	 * @generated
	 */
	EReference getVorlesung_Evaluation();

	/**
	 * Returns the meta object for the reference '{@link hochschule.Vorlesung#getDozent <em>Dozent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dozent</em>'.
	 * @see hochschule.Vorlesung#getDozent()
	 * @see #getVorlesung()
	 * @generated
	 */
	EReference getVorlesung_Dozent();

	/**
	 * Returns the meta object for the attribute '{@link hochschule.Vorlesung#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hochschule.Vorlesung#getName()
	 * @see #getVorlesung()
	 * @generated
	 */
	EAttribute getVorlesung_Name();

	/**
	 * Returns the meta object for the attribute '{@link hochschule.Vorlesung#getModulNr <em>Modul Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modul Nr</em>'.
	 * @see hochschule.Vorlesung#getModulNr()
	 * @see #getVorlesung()
	 * @generated
	 */
	EAttribute getVorlesung_ModulNr();

	/**
	 * Returns the meta object for the attribute '{@link hochschule.Vorlesung#getBeschreibung <em>Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beschreibung</em>'.
	 * @see hochschule.Vorlesung#getBeschreibung()
	 * @see #getVorlesung()
	 * @generated
	 */
	EAttribute getVorlesung_Beschreibung();

	/**
	 * Returns the meta object for the attribute '{@link hochschule.Vorlesung#getCrP <em>Cr P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cr P</em>'.
	 * @see hochschule.Vorlesung#getCrP()
	 * @see #getVorlesung()
	 * @generated
	 */
	EAttribute getVorlesung_CrP();

	/**
	 * Returns the meta object for the reference list '{@link hochschule.Vorlesung#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Student</em>'.
	 * @see hochschule.Vorlesung#getStudent()
	 * @see #getVorlesung()
	 * @generated
	 */
	EReference getVorlesung_Student();

	/**
	 * Returns the meta object for class '{@link hochschule.Dozent <em>Dozent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dozent</em>'.
	 * @see hochschule.Dozent
	 * @generated
	 */
	EClass getDozent();

	/**
	 * Returns the meta object for the reference list '{@link hochschule.Dozent#getVorlesung <em>Vorlesung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vorlesung</em>'.
	 * @see hochschule.Dozent#getVorlesung()
	 * @see #getDozent()
	 * @generated
	 */
	EReference getDozent_Vorlesung();

	/**
	 * Returns the meta object for the attribute '{@link hochschule.Dozent#getPersonalNr <em>Personal Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personal Nr</em>'.
	 * @see hochschule.Dozent#getPersonalNr()
	 * @see #getDozent()
	 * @generated
	 */
	EAttribute getDozent_PersonalNr();

	/**
	 * Returns the meta object for the attribute '{@link hochschule.Dozent#getVorname <em>Vorname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vorname</em>'.
	 * @see hochschule.Dozent#getVorname()
	 * @see #getDozent()
	 * @generated
	 */
	EAttribute getDozent_Vorname();

	/**
	 * Returns the meta object for the attribute '{@link hochschule.Dozent#getNachname <em>Nachname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nachname</em>'.
	 * @see hochschule.Dozent#getNachname()
	 * @see #getDozent()
	 * @generated
	 */
	EAttribute getDozent_Nachname();

	/**
	 * Returns the meta object for class '{@link hochschule.Lehrbeauftragter <em>Lehrbeauftragter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lehrbeauftragter</em>'.
	 * @see hochschule.Lehrbeauftragter
	 * @generated
	 */
	EClass getLehrbeauftragter();

	/**
	 * Returns the meta object for class '{@link hochschule.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor</em>'.
	 * @see hochschule.Professor
	 * @generated
	 */
	EClass getProfessor();

	/**
	 * Returns the meta object for class '{@link hochschule.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see hochschule.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link hochschule.Student#getMatrikelNr <em>Matrikel Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matrikel Nr</em>'.
	 * @see hochschule.Student#getMatrikelNr()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_MatrikelNr();

	/**
	 * Returns the meta object for the attribute '{@link hochschule.Student#getVorname <em>Vorname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vorname</em>'.
	 * @see hochschule.Student#getVorname()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Vorname();

	/**
	 * Returns the meta object for the attribute '{@link hochschule.Student#getNachname <em>Nachname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nachname</em>'.
	 * @see hochschule.Student#getNachname()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Nachname();

	/**
	 * Returns the meta object for the reference list '{@link hochschule.Student#getVorlesung <em>Vorlesung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vorlesung</em>'.
	 * @see hochschule.Student#getVorlesung()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_Vorlesung();

	/**
	 * Returns the meta object for class '{@link hochschule.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see hochschule.Evaluation
	 * @generated
	 */
	EClass getEvaluation();

	/**
	 * Returns the meta object for the attribute '{@link hochschule.Evaluation#getGesamtnote <em>Gesamtnote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gesamtnote</em>'.
	 * @see hochschule.Evaluation#getGesamtnote()
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
	HmodelFactory getHmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hochschule.impl.HochschuleImpl <em>Hochschule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hochschule.impl.HochschuleImpl
		 * @see hochschule.impl.HmodelPackageImpl#getHochschule()
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
		 * The meta object literal for the '{@link hochschule.impl.FachbereichImpl <em>Fachbereich</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hochschule.impl.FachbereichImpl
		 * @see hochschule.impl.HmodelPackageImpl#getFachbereich()
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
		 * The meta object literal for the '{@link hochschule.impl.StudiengangImpl <em>Studiengang</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hochschule.impl.StudiengangImpl
		 * @see hochschule.impl.HmodelPackageImpl#getStudiengang()
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
		 * The meta object literal for the '{@link hochschule.impl.VorlesungImpl <em>Vorlesung</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hochschule.impl.VorlesungImpl
		 * @see hochschule.impl.HmodelPackageImpl#getVorlesung()
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
		 * The meta object literal for the '{@link hochschule.impl.DozentImpl <em>Dozent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hochschule.impl.DozentImpl
		 * @see hochschule.impl.HmodelPackageImpl#getDozent()
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
		 * The meta object literal for the '{@link hochschule.impl.LehrbeauftragterImpl <em>Lehrbeauftragter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hochschule.impl.LehrbeauftragterImpl
		 * @see hochschule.impl.HmodelPackageImpl#getLehrbeauftragter()
		 * @generated
		 */
		EClass LEHRBEAUFTRAGTER = eINSTANCE.getLehrbeauftragter();

		/**
		 * The meta object literal for the '{@link hochschule.impl.ProfessorImpl <em>Professor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hochschule.impl.ProfessorImpl
		 * @see hochschule.impl.HmodelPackageImpl#getProfessor()
		 * @generated
		 */
		EClass PROFESSOR = eINSTANCE.getProfessor();

		/**
		 * The meta object literal for the '{@link hochschule.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hochschule.impl.StudentImpl
		 * @see hochschule.impl.HmodelPackageImpl#getStudent()
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
		 * The meta object literal for the '{@link hochschule.impl.EvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hochschule.impl.EvaluationImpl
		 * @see hochschule.impl.HmodelPackageImpl#getEvaluation()
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

} //HmodelPackage
