/**
 */
package de.thm.mni.hochschule.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.Evaluation#getGesamtnote <em>Gesamtnote</em>}</li>
 * </ul>
 *
 * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getEvaluation()
 * @model
 * @generated
 */
public interface Evaluation extends EObject
{
  /**
   * Returns the value of the '<em><b>Gesamtnote</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gesamtnote</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gesamtnote</em>' attribute.
   * @see #setGesamtnote(int)
   * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage#getEvaluation_Gesamtnote()
   * @model
   * @generated
   */
  int getGesamtnote();

  /**
   * Sets the value of the '{@link de.thm.mni.hochschule.mydsl.myDsl.Evaluation#getGesamtnote <em>Gesamtnote</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gesamtnote</em>' attribute.
   * @see #getGesamtnote()
   * @generated
   */
  void setGesamtnote(int value);

} // Evaluation
