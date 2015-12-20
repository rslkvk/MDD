/**
 */
package htmlgenerator.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link htmlgenerator.myDsl.Model#getModel <em>Model</em>}</li>
 *   <li>{@link htmlgenerator.myDsl.Model#getForm <em>Form</em>}</li>
 * </ul>
 *
 * @see htmlgenerator.myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Model</b></em>' containment reference list.
   * The list contents are of type {@link htmlgenerator.myDsl.Form}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' containment reference list.
   * @see htmlgenerator.myDsl.MyDslPackage#getModel_Model()
   * @model containment="true"
   * @generated
   */
  EList<Form> getModel();

  /**
   * Returns the value of the '<em><b>Form</b></em>' containment reference list.
   * The list contents are of type {@link htmlgenerator.myDsl.Form}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Form</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Form</em>' containment reference list.
   * @see htmlgenerator.myDsl.MyDslPackage#getModel_Form()
   * @model containment="true"
   * @generated
   */
  EList<Form> getForm();

} // Model
