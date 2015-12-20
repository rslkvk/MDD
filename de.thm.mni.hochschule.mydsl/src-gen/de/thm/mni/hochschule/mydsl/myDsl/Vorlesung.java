/**
 */
package de.thm.mni.hochschule.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vorlesung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getName <em>Name</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getModulnr <em>Modulnr</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getCrp <em>Crp</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getDozent <em>Dozent</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getStudent <em>Student</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getTutor <em>Tutor</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 *
 * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getVorlesung()
 * @model
 * @generated
 */
public interface Vorlesung extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getVorlesung_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Modulnr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modulnr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modulnr</em>' attribute.
   * @see #setModulnr(String)
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getVorlesung_Modulnr()
   * @model
   * @generated
   */
  String getModulnr();

  /**
   * Sets the value of the '{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getModulnr <em>Modulnr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modulnr</em>' attribute.
   * @see #getModulnr()
   * @generated
   */
  void setModulnr(String value);

  /**
   * Returns the value of the '<em><b>Beschreibung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Beschreibung</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Beschreibung</em>' attribute.
   * @see #setBeschreibung(String)
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getVorlesung_Beschreibung()
   * @model
   * @generated
   */
  String getBeschreibung();

  /**
   * Sets the value of the '{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getBeschreibung <em>Beschreibung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Beschreibung</em>' attribute.
   * @see #getBeschreibung()
   * @generated
   */
  void setBeschreibung(String value);

  /**
   * Returns the value of the '<em><b>Crp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Crp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Crp</em>' attribute.
   * @see #setCrp(String)
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getVorlesung_Crp()
   * @model
   * @generated
   */
  String getCrp();

  /**
   * Sets the value of the '{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getCrp <em>Crp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Crp</em>' attribute.
   * @see #getCrp()
   * @generated
   */
  void setCrp(String value);

  /**
   * Returns the value of the '<em><b>Dozent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dozent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dozent</em>' reference.
   * @see #setDozent(Dozent)
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getVorlesung_Dozent()
   * @model
   * @generated
   */
  Dozent getDozent();

  /**
   * Sets the value of the '{@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung#getDozent <em>Dozent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dozent</em>' reference.
   * @see #getDozent()
   * @generated
   */
  void setDozent(Dozent value);

  /**
   * Returns the value of the '<em><b>Student</b></em>' reference list.
   * The list contents are of type {@link de.thm.mni.hochschule.mydsl.myDsl.Student}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Student</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Student</em>' reference list.
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getVorlesung_Student()
   * @model
   * @generated
   */
  EList<Student> getStudent();

  /**
   * Returns the value of the '<em><b>Tutor</b></em>' reference list.
   * The list contents are of type {@link de.thm.mni.hochschule.mydsl.myDsl.Student}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tutor</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tutor</em>' reference list.
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getVorlesung_Tutor()
   * @model
   * @generated
   */
  EList<Student> getTutor();

  /**
   * Returns the value of the '<em><b>Evaluation</b></em>' containment reference list.
   * The list contents are of type {@link de.thm.mni.hochschule.mydsl.myDsl.Evaluation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evaluation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evaluation</em>' containment reference list.
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getVorlesung_Evaluation()
   * @model containment="true"
   * @generated
   */
  EList<Evaluation> getEvaluation();

} // Vorlesung
