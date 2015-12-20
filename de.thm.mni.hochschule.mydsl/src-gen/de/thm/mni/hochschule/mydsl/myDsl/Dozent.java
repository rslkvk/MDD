/**
 */
package de.thm.mni.hochschule.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dozent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Dozent#getPersonalnr <em>Personalnr</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Dozent#getVorname <em>Vorname</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Dozent#getNachname <em>Nachname</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Dozent#getVorlesung <em>Vorlesung</em>}</li>
 * </ul>
 *
 * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getDozent()
 * @model
 * @generated
 */
public interface Dozent extends EObject
{
  /**
   * Returns the value of the '<em><b>Personalnr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Personalnr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Personalnr</em>' attribute.
   * @see #setPersonalnr(String)
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getDozent_Personalnr()
   * @model
   * @generated
   */
  String getPersonalnr();

  /**
   * Sets the value of the '{@link de.thm.mni.hochschule.mydsl.myDsl.Dozent#getPersonalnr <em>Personalnr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Personalnr</em>' attribute.
   * @see #getPersonalnr()
   * @generated
   */
  void setPersonalnr(String value);

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
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getDozent_Vorname()
   * @model
   * @generated
   */
  String getVorname();

  /**
   * Sets the value of the '{@link de.thm.mni.hochschule.mydsl.myDsl.Dozent#getVorname <em>Vorname</em>}' attribute.
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
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getDozent_Nachname()
   * @model
   * @generated
   */
  String getNachname();

  /**
   * Sets the value of the '{@link de.thm.mni.hochschule.mydsl.myDsl.Dozent#getNachname <em>Nachname</em>}' attribute.
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
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getDozent_Vorlesung()
   * @model
   * @generated
   */
  EList<Vorlesung> getVorlesung();

} // Dozent
