/**
 */
package de.thm.mni.htmlgen.hTMLGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.thm.mni.htmlgen.hTMLGen.Form#getName <em>Name</em>}</li>
 *   <li>{@link de.thm.mni.htmlgen.hTMLGen.Form#getDescription <em>Description</em>}</li>
 *   <li>{@link de.thm.mni.htmlgen.hTMLGen.Form#getTitle <em>Title</em>}</li>
 *   <li>{@link de.thm.mni.htmlgen.hTMLGen.Form#getForm <em>Form</em>}</li>
 * </ul>
 *
 * @see de.thm.mni.htmlgen.hTMLGen.HTMLGenPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends EObject
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
   * @see de.thm.mni.htmlgen.hTMLGen.HTMLGenPackage#getForm_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.thm.mni.htmlgen.hTMLGen.Form#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see de.thm.mni.htmlgen.hTMLGen.HTMLGenPackage#getForm_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link de.thm.mni.htmlgen.hTMLGen.Form#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see de.thm.mni.htmlgen.hTMLGen.HTMLGenPackage#getForm_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link de.thm.mni.htmlgen.hTMLGen.Form#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Form</b></em>' containment reference list.
   * The list contents are of type {@link de.thm.mni.htmlgen.hTMLGen.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Form</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Form</em>' containment reference list.
   * @see de.thm.mni.htmlgen.hTMLGen.HTMLGenPackage#getForm_Form()
   * @model containment="true"
   * @generated
   */
  EList<Field> getForm();

} // Form
