/**
 */
package de.thm.mni.hochschule.mydsl.myDsl;

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
 * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.thm.de/mni/hochschule/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link de.thm.mni.hochschule.mydsl.myDsl.impl.HochschuleImpl <em>Hochschule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.thm.mni.hochschule.mydsl.myDsl.impl.HochschuleImpl
   * @see de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl#getHochschule()
   * @generated
   */
  int HOCHSCHULE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOCHSCHULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Student</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOCHSCHULE__STUDENT = 1;

  /**
   * The feature id for the '<em><b>Fachbereich</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOCHSCHULE__FACHBEREICH = 2;

  /**
   * The number of structural features of the '<em>Hochschule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOCHSCHULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.thm.mni.hochschule.mydsl.myDsl.impl.FachbereichImpl <em>Fachbereich</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.thm.mni.hochschule.mydsl.myDsl.impl.FachbereichImpl
   * @see de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl#getFachbereich()
   * @generated
   */
  int FACHBEREICH = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACHBEREICH__NAME = 0;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACHBEREICH__ALIAS = 1;

  /**
   * The feature id for the '<em><b>Studiengang</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACHBEREICH__STUDIENGANG = 2;

  /**
   * The feature id for the '<em><b>Dozent</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACHBEREICH__DOZENT = 3;

  /**
   * The feature id for the '<em><b>Vorlesung</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACHBEREICH__VORLESUNG = 4;

  /**
   * The number of structural features of the '<em>Fachbereich</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACHBEREICH_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.thm.mni.hochschule.mydsl.myDsl.impl.StudiengangImpl <em>Studiengang</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.thm.mni.hochschule.mydsl.myDsl.impl.StudiengangImpl
   * @see de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl#getStudiengang()
   * @generated
   */
  int STUDIENGANG = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDIENGANG__NAME = 0;

  /**
   * The feature id for the '<em><b>Nc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDIENGANG__NC = 1;

  /**
   * The feature id for the '<em><b>Student</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDIENGANG__STUDENT = 2;

  /**
   * The feature id for the '<em><b>Vorlesung</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDIENGANG__VORLESUNG = 3;

  /**
   * The number of structural features of the '<em>Studiengang</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDIENGANG_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.thm.mni.hochschule.mydsl.myDsl.impl.VorlesungImpl <em>Vorlesung</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.thm.mni.hochschule.mydsl.myDsl.impl.VorlesungImpl
   * @see de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl#getVorlesung()
   * @generated
   */
  int VORLESUNG = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VORLESUNG__NAME = 0;

  /**
   * The feature id for the '<em><b>Modulnr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VORLESUNG__MODULNR = 1;

  /**
   * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VORLESUNG__BESCHREIBUNG = 2;

  /**
   * The feature id for the '<em><b>Crp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VORLESUNG__CRP = 3;

  /**
   * The feature id for the '<em><b>Dozent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VORLESUNG__DOZENT = 4;

  /**
   * The feature id for the '<em><b>Student</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VORLESUNG__STUDENT = 5;

  /**
   * The feature id for the '<em><b>Tutor</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VORLESUNG__TUTOR = 6;

  /**
   * The feature id for the '<em><b>Evaluation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VORLESUNG__EVALUATION = 7;

  /**
   * The number of structural features of the '<em>Vorlesung</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VORLESUNG_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link de.thm.mni.hochschule.mydsl.myDsl.impl.StudentImpl <em>Student</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.thm.mni.hochschule.mydsl.myDsl.impl.StudentImpl
   * @see de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl#getStudent()
   * @generated
   */
  int STUDENT = 4;

  /**
   * The feature id for the '<em><b>Matrikelnr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STUDENT__MATRIKELNR = 0;

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
   * The meta object id for the '{@link de.thm.mni.hochschule.mydsl.myDsl.impl.DozentImpl <em>Dozent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.thm.mni.hochschule.mydsl.myDsl.impl.DozentImpl
   * @see de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl#getDozent()
   * @generated
   */
  int DOZENT = 5;

  /**
   * The feature id for the '<em><b>Personalnr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOZENT__PERSONALNR = 0;

  /**
   * The feature id for the '<em><b>Vorname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOZENT__VORNAME = 1;

  /**
   * The feature id for the '<em><b>Nachname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOZENT__NACHNAME = 2;

  /**
   * The feature id for the '<em><b>Vorlesung</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOZENT__VORLESUNG = 3;

  /**
   * The number of structural features of the '<em>Dozent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOZENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.thm.mni.hochschule.mydsl.myDsl.impl.ProfessorImpl <em>Professor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.thm.mni.hochschule.mydsl.myDsl.impl.ProfessorImpl
   * @see de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl#getProfessor()
   * @generated
   */
  int PROFESSOR = 6;

  /**
   * The feature id for the '<em><b>Personalnr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESSOR__PERSONALNR = DOZENT__PERSONALNR;

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
   * The feature id for the '<em><b>Vorlesung</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESSOR__VORLESUNG = DOZENT__VORLESUNG;

  /**
   * The number of structural features of the '<em>Professor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROFESSOR_FEATURE_COUNT = DOZENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.thm.mni.hochschule.mydsl.myDsl.impl.LehrbeauftragerImpl <em>Lehrbeauftrager</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.thm.mni.hochschule.mydsl.myDsl.impl.LehrbeauftragerImpl
   * @see de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl#getLehrbeauftrager()
   * @generated
   */
  int LEHRBEAUFTRAGER = 7;

  /**
   * The feature id for the '<em><b>Personalnr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEHRBEAUFTRAGER__PERSONALNR = DOZENT__PERSONALNR;

  /**
   * The feature id for the '<em><b>Vorname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEHRBEAUFTRAGER__VORNAME = DOZENT__VORNAME;

  /**
   * The feature id for the '<em><b>Nachname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEHRBEAUFTRAGER__NACHNAME = DOZENT__NACHNAME;

  /**
   * The feature id for the '<em><b>Vorlesung</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEHRBEAUFTRAGER__VORLESUNG = DOZENT__VORLESUNG;

  /**
   * The number of structural features of the '<em>Lehrbeauftrager</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEHRBEAUFTRAGER_FEATURE_COUNT = DOZENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.thm.mni.hochschule.mydsl.myDsl.impl.EvaluationImpl <em>Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.thm.mni.hochschule.mydsl.myDsl.impl.EvaluationImpl
   * @see de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl#getEvaluation()
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
   * Returns the meta object for class '{@link de.thm.mni.hochschule.mydsl.myDsl.Hochschule <em>Hochschule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hochschule</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Hochschule
   * @generated
   */
  EClass getHochschule();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.hochschule.mydsl.myDsl.Hochschule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Hochschule#getName()
   * @see #getHochschule()
   * @generated
   */
  EAttribute getHochschule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.thm.mni.hochschule.mydsl.myDsl.Hochschule#getStudent <em>Student</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Student</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Hochschule#getStudent()
   * @see #getHochschule()
   * @generated
   */
  EReference getHochschule_Student();

  /**
   * Returns the meta object for the containment reference list '{@link de.thm.mni.hochschule.mydsl.myDsl.Hochschule#getFachbereich <em>Fachbereich</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fachbereich</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Hochschule#getFachbereich()
   * @see #getHochschule()
   * @generated
   */
  EReference getHochschule_Fachbereich();

  /**
   * Returns the meta object for class '{@link de.thm.mni.hochschule.mydsl.myDsl.Fachbereich <em>Fachbereich</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fachbereich</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Fachbereich
   * @generated
   */
  EClass getFachbereich();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.hochschule.mydsl.myDsl.Fachbereich#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Fachbereich#getName()
   * @see #getFachbereich()
   * @generated
   */
  EAttribute getFachbereich_Name();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.hochschule.mydsl.myDsl.Fachbereich#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Fachbereich#getAlias()
   * @see #getFachbereich()
   * @generated
   */
  EAttribute getFachbereich_Alias();

  /**
   * Returns the meta object for the containment reference list '{@link de.thm.mni.hochschule.mydsl.myDsl.Fachbereich#getStudiengang <em>Studiengang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Studiengang</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Fachbereich#getStudiengang()
   * @see #getFachbereich()
   * @generated
   */
  EReference getFachbereich_Studiengang();

  /**
   * Returns the meta object for the containment reference list '{@link de.thm.mni.hochschule.mydsl.myDsl.Fachbereich#getDozent <em>Dozent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dozent</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Fachbereich#getDozent()
   * @see #getFachbereich()
   * @generated
   */
  EReference getFachbereich_Dozent();

  /**
   * Returns the meta object for the reference list '{@link de.thm.mni.hochschule.mydsl.myDsl.Fachbereich#getVorlesung <em>Vorlesung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Vorlesung</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Fachbereich#getVorlesung()
   * @see #getFachbereich()
   * @generated
   */
  EReference getFachbereich_Vorlesung();

  /**
   * Returns the meta object for class '{@link de.thm.mni.hochschule.mydsl.myDsl.Studiengang <em>Studiengang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Studiengang</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Studiengang
   * @generated
   */
  EClass getStudiengang();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.hochschule.mydsl.myDsl.Studiengang#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Studiengang#getName()
   * @see #getStudiengang()
   * @generated
   */
  EAttribute getStudiengang_Name();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.hochschule.mydsl.myDsl.Studiengang#getNc <em>Nc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nc</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Studiengang#getNc()
   * @see #getStudiengang()
   * @generated
   */
  EAttribute getStudiengang_Nc();

  /**
   * Returns the meta object for the reference list '{@link de.thm.mni.hochschule.mydsl.myDsl.Studiengang#getStudent <em>Student</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Student</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Studiengang#getStudent()
   * @see #getStudiengang()
   * @generated
   */
  EReference getStudiengang_Student();

  /**
   * Returns the meta object for the containment reference list '{@link de.thm.mni.hochschule.mydsl.myDsl.Studiengang#getVorlesung <em>Vorlesung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Vorlesung</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Studiengang#getVorlesung()
   * @see #getStudiengang()
   * @generated
   */
  EReference getStudiengang_Vorlesung();

  /**
   * Returns the meta object for class '{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung <em>Vorlesung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vorlesung</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Vorlesung
   * @generated
   */
  EClass getVorlesung();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getName()
   * @see #getVorlesung()
   * @generated
   */
  EAttribute getVorlesung_Name();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getModulnr <em>Modulnr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modulnr</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getModulnr()
   * @see #getVorlesung()
   * @generated
   */
  EAttribute getVorlesung_Modulnr();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getBeschreibung <em>Beschreibung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Beschreibung</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getBeschreibung()
   * @see #getVorlesung()
   * @generated
   */
  EAttribute getVorlesung_Beschreibung();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getCrp <em>Crp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Crp</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getCrp()
   * @see #getVorlesung()
   * @generated
   */
  EAttribute getVorlesung_Crp();

  /**
   * Returns the meta object for the reference '{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getDozent <em>Dozent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dozent</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getDozent()
   * @see #getVorlesung()
   * @generated
   */
  EReference getVorlesung_Dozent();

  /**
   * Returns the meta object for the reference list '{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getStudent <em>Student</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Student</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getStudent()
   * @see #getVorlesung()
   * @generated
   */
  EReference getVorlesung_Student();

  /**
   * Returns the meta object for the reference list '{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getTutor <em>Tutor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Tutor</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getTutor()
   * @see #getVorlesung()
   * @generated
   */
  EReference getVorlesung_Tutor();

  /**
   * Returns the meta object for the containment reference list '{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getEvaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Evaluation</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getEvaluation()
   * @see #getVorlesung()
   * @generated
   */
  EReference getVorlesung_Evaluation();

  /**
   * Returns the meta object for class '{@link de.thm.mni.hochschule.mydsl.myDsl.Student <em>Student</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Student</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Student
   * @generated
   */
  EClass getStudent();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.hochschule.mydsl.myDsl.Student#getMatrikelnr <em>Matrikelnr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Matrikelnr</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Student#getMatrikelnr()
   * @see #getStudent()
   * @generated
   */
  EAttribute getStudent_Matrikelnr();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.hochschule.mydsl.myDsl.Student#getVorname <em>Vorname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vorname</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Student#getVorname()
   * @see #getStudent()
   * @generated
   */
  EAttribute getStudent_Vorname();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.hochschule.mydsl.myDsl.Student#getNachname <em>Nachname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nachname</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Student#getNachname()
   * @see #getStudent()
   * @generated
   */
  EAttribute getStudent_Nachname();

  /**
   * Returns the meta object for the reference list '{@link de.thm.mni.hochschule.mydsl.myDsl.Student#getVorlesung <em>Vorlesung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Vorlesung</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Student#getVorlesung()
   * @see #getStudent()
   * @generated
   */
  EReference getStudent_Vorlesung();

  /**
   * Returns the meta object for class '{@link de.thm.mni.hochschule.mydsl.myDsl.Dozent <em>Dozent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dozent</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Dozent
   * @generated
   */
  EClass getDozent();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.hochschule.mydsl.myDsl.Dozent#getPersonalnr <em>Personalnr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Personalnr</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Dozent#getPersonalnr()
   * @see #getDozent()
   * @generated
   */
  EAttribute getDozent_Personalnr();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.hochschule.mydsl.myDsl.Dozent#getVorname <em>Vorname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Vorname</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Dozent#getVorname()
   * @see #getDozent()
   * @generated
   */
  EAttribute getDozent_Vorname();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.hochschule.mydsl.myDsl.Dozent#getNachname <em>Nachname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nachname</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Dozent#getNachname()
   * @see #getDozent()
   * @generated
   */
  EAttribute getDozent_Nachname();

  /**
   * Returns the meta object for the reference list '{@link de.thm.mni.hochschule.mydsl.myDsl.Dozent#getVorlesung <em>Vorlesung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Vorlesung</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Dozent#getVorlesung()
   * @see #getDozent()
   * @generated
   */
  EReference getDozent_Vorlesung();

  /**
   * Returns the meta object for class '{@link de.thm.mni.hochschule.mydsl.myDsl.Professor <em>Professor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Professor</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Professor
   * @generated
   */
  EClass getProfessor();

  /**
   * Returns the meta object for class '{@link de.thm.mni.hochschule.mydsl.myDsl.Lehrbeauftrager <em>Lehrbeauftrager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lehrbeauftrager</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Lehrbeauftrager
   * @generated
   */
  EClass getLehrbeauftrager();

  /**
   * Returns the meta object for class '{@link de.thm.mni.hochschule.mydsl.myDsl.Evaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluation</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Evaluation
   * @generated
   */
  EClass getEvaluation();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.hochschule.mydsl.myDsl.Evaluation#getGesamtnote <em>Gesamtnote</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gesamtnote</em>'.
   * @see de.thm.mni.hochschule.mydsl.myDsl.Evaluation#getGesamtnote()
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
  MyDslFactory getMyDslFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.thm.mni.hochschule.mydsl.myDsl.impl.HochschuleImpl <em>Hochschule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.thm.mni.hochschule.mydsl.myDsl.impl.HochschuleImpl
     * @see de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl#getHochschule()
     * @generated
     */
    EClass HOCHSCHULE = eINSTANCE.getHochschule();

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
     * The meta object literal for the '<em><b>Fachbereich</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HOCHSCHULE__FACHBEREICH = eINSTANCE.getHochschule_Fachbereich();

    /**
     * The meta object literal for the '{@link de.thm.mni.hochschule.mydsl.myDsl.impl.FachbereichImpl <em>Fachbereich</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.thm.mni.hochschule.mydsl.myDsl.impl.FachbereichImpl
     * @see de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl#getFachbereich()
     * @generated
     */
    EClass FACHBEREICH = eINSTANCE.getFachbereich();

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
     * The meta object literal for the '<em><b>Studiengang</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACHBEREICH__STUDIENGANG = eINSTANCE.getFachbereich_Studiengang();

    /**
     * The meta object literal for the '<em><b>Dozent</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACHBEREICH__DOZENT = eINSTANCE.getFachbereich_Dozent();

    /**
     * The meta object literal for the '<em><b>Vorlesung</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACHBEREICH__VORLESUNG = eINSTANCE.getFachbereich_Vorlesung();

    /**
     * The meta object literal for the '{@link de.thm.mni.hochschule.mydsl.myDsl.impl.StudiengangImpl <em>Studiengang</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.thm.mni.hochschule.mydsl.myDsl.impl.StudiengangImpl
     * @see de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl#getStudiengang()
     * @generated
     */
    EClass STUDIENGANG = eINSTANCE.getStudiengang();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STUDIENGANG__NAME = eINSTANCE.getStudiengang_Name();

    /**
     * The meta object literal for the '<em><b>Nc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STUDIENGANG__NC = eINSTANCE.getStudiengang_Nc();

    /**
     * The meta object literal for the '<em><b>Student</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STUDIENGANG__STUDENT = eINSTANCE.getStudiengang_Student();

    /**
     * The meta object literal for the '<em><b>Vorlesung</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STUDIENGANG__VORLESUNG = eINSTANCE.getStudiengang_Vorlesung();

    /**
     * The meta object literal for the '{@link de.thm.mni.hochschule.mydsl.myDsl.impl.VorlesungImpl <em>Vorlesung</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.thm.mni.hochschule.mydsl.myDsl.impl.VorlesungImpl
     * @see de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl#getVorlesung()
     * @generated
     */
    EClass VORLESUNG = eINSTANCE.getVorlesung();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VORLESUNG__NAME = eINSTANCE.getVorlesung_Name();

    /**
     * The meta object literal for the '<em><b>Modulnr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VORLESUNG__MODULNR = eINSTANCE.getVorlesung_Modulnr();

    /**
     * The meta object literal for the '<em><b>Beschreibung</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VORLESUNG__BESCHREIBUNG = eINSTANCE.getVorlesung_Beschreibung();

    /**
     * The meta object literal for the '<em><b>Crp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VORLESUNG__CRP = eINSTANCE.getVorlesung_Crp();

    /**
     * The meta object literal for the '<em><b>Dozent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VORLESUNG__DOZENT = eINSTANCE.getVorlesung_Dozent();

    /**
     * The meta object literal for the '<em><b>Student</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VORLESUNG__STUDENT = eINSTANCE.getVorlesung_Student();

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
     * The meta object literal for the '{@link de.thm.mni.hochschule.mydsl.myDsl.impl.StudentImpl <em>Student</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.thm.mni.hochschule.mydsl.myDsl.impl.StudentImpl
     * @see de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl#getStudent()
     * @generated
     */
    EClass STUDENT = eINSTANCE.getStudent();

    /**
     * The meta object literal for the '<em><b>Matrikelnr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STUDENT__MATRIKELNR = eINSTANCE.getStudent_Matrikelnr();

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
     * The meta object literal for the '{@link de.thm.mni.hochschule.mydsl.myDsl.impl.DozentImpl <em>Dozent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.thm.mni.hochschule.mydsl.myDsl.impl.DozentImpl
     * @see de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl#getDozent()
     * @generated
     */
    EClass DOZENT = eINSTANCE.getDozent();

    /**
     * The meta object literal for the '<em><b>Personalnr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOZENT__PERSONALNR = eINSTANCE.getDozent_Personalnr();

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
     * The meta object literal for the '<em><b>Vorlesung</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOZENT__VORLESUNG = eINSTANCE.getDozent_Vorlesung();

    /**
     * The meta object literal for the '{@link de.thm.mni.hochschule.mydsl.myDsl.impl.ProfessorImpl <em>Professor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.thm.mni.hochschule.mydsl.myDsl.impl.ProfessorImpl
     * @see de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl#getProfessor()
     * @generated
     */
    EClass PROFESSOR = eINSTANCE.getProfessor();

    /**
     * The meta object literal for the '{@link de.thm.mni.hochschule.mydsl.myDsl.impl.LehrbeauftragerImpl <em>Lehrbeauftrager</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.thm.mni.hochschule.mydsl.myDsl.impl.LehrbeauftragerImpl
     * @see de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl#getLehrbeauftrager()
     * @generated
     */
    EClass LEHRBEAUFTRAGER = eINSTANCE.getLehrbeauftrager();

    /**
     * The meta object literal for the '{@link de.thm.mni.hochschule.mydsl.myDsl.impl.EvaluationImpl <em>Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.thm.mni.hochschule.mydsl.myDsl.impl.EvaluationImpl
     * @see de.thm.mni.hochschule.mydsl.myDsl.impl.MyDslPackageImpl#getEvaluation()
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

} //MyDslPackage
