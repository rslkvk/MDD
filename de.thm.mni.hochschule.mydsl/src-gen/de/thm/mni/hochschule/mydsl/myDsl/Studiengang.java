/**
 */
package de.thm.mni.hochschule.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Studiengang</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Studiengang#getName <em>Name</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Studiengang#getNc <em>Nc</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Studiengang#getStudent <em>Student</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Studiengang#getVorlesung <em>Vorlesung</em>}</li>
 * </ul>
 *
 * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getStudiengang()
 * @model
 * @generated
 */
public interface Studiengang extends EObject
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
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getStudiengang_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.thm.mni.hochschule.mydsl.myDsl.Studiengang#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Nc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nc</em>' attribute.
   * @see #setNc(String)
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getStudiengang_Nc()
   * @model
   * @generated
   */
  String getNc();

  /**
   * Sets the value of the '{@link de.thm.mni.hochschule.mydsl.myDsl.Studiengang#getNc <em>Nc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nc</em>' attribute.
   * @see #getNc()
   * @generated
   */
  void setNc(String value);

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
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getStudiengang_Student()
   * @model
   * @generated
   */
  EList<Student> getStudent();

  /**
   * Returns the value of the '<em><b>Vorlesung</b></em>' containment reference list.
   * The list contents are of type {@link de.thm.mni.hochschule.mydsl.myDsl.Vorlesung}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vorlesung</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vorlesung</em>' containment reference list.
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getStudiengang_Vorlesung()
   * @model containment="true"
   * @generated
   */
  EList<Vorlesung> getVorlesung();

} // Studiengang
