/**
 */
package de.thm.mni.hochschule.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Student#getMatrikelnr <em>Matrikelnr</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Student#getVorname <em>Vorname</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Student#getNachname <em>Nachname</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Student#getVorlesung <em>Vorlesung</em>}</li>
 * </ul>
 *
 * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject
{
  /**
   * Returns the value of the '<em><b>Matrikelnr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Matrikelnr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Matrikelnr</em>' attribute.
   * @see #setMatrikelnr(String)
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getStudent_Matrikelnr()
   * @model
   * @generated
   */
  String getMatrikelnr();

  /**
   * Sets the value of the '{@link de.thm.mni.hochschule.mydsl.myDsl.Student#getMatrikelnr <em>Matrikelnr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Matrikelnr</em>' attribute.
   * @see #getMatrikelnr()
   * @generated
   */
  void setMatrikelnr(String value);

  /**
   * Returns the value of the '<em><b>Vorname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vorname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vorname</em>' attribute.
   * @see #setVorname(String)
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getStudent_Vorname()
   * @model
   * @generated
   */
  String getVorname();

  /**
   * Sets the value of the '{@link de.thm.mni.hochschule.mydsl.myDsl.Student#getVorname <em>Vorname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vorname</em>' attribute.
   * @see #getVorname()
   * @generated
   */
  void setVorname(String value);

  /**
   * Returns the value of the '<em><b>Nachname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nachname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nachname</em>' attribute.
   * @see #setNachname(String)
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getStudent_Nachname()
   * @model
   * @generated
   */
  String getNachname();

  /**
   * Sets the value of the '{@link de.thm.mni.hochschule.mydsl.myDsl.Student#getNachname <em>Nachname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nachname</em>' attribute.
   * @see #getNachname()
   * @generated
   */
  void setNachname(String value);

  /**
   * Returns the value of the '<em><b>Vorlesung</b></em>' reference list.
   * The list contents are of type {@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vorlesung</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vorlesung</em>' reference list.
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getStudent_Vorlesung()
   * @model
   * @generated
   */
  EList<Vorlesung> getVorlesung();

} // Student
