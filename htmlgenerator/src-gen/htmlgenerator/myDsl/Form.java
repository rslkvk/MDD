/**
 */
package htmlgenerator.myDsl;

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
 *   <li>{@link htmlgenerator.myDsl.Form#getName <em>Name</em>}</li>
 *   <li>{@link htmlgenerator.myDsl.Form#getDescription <em>Description</em>}</li>
 *   <li>{@link htmlgenerator.myDsl.Form#getTitle <em>Title</em>}</li>
 *   <li>{@link htmlgenerator.myDsl.Form#getForm <em>Form</em>}</li>
 * </ul>
 *
 * @see htmlgenerator.myDsl.MyDslPackage#getForm()
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
   * @see htmlgenerator.myDsl.MyDslPackage#getForm_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link htmlgenerator.myDsl.Form#getName <em>Name</em>}' attribute.
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
   * @see htmlgenerator.myDsl.MyDslPackage#getForm_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link htmlgenerator.myDsl.Form#getDescription <em>Description</em>}' attribute.
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
   * @see htmlgenerator.myDsl.MyDslPackage#getForm_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link htmlgenerator.myDsl.Form#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Form</b></em>' containment reference list.
   * The list contents are of type {@link htmlgenerator.myDsl.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Form</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Form</em>' containment reference list.
   * @see htmlgenerator.myDsl.MyDslPackage#getForm_Form()
   * @model containment="true"
   * @generated
   */
  EList<Field> getForm();

} // Form
