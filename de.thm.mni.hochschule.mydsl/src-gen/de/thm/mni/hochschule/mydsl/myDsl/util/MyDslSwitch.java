/**
 */
package de.thm.mni.hochschule.mydsl.myDsl.util;

import de.thm.mni.hochschule.mydsl.myDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.HOCHSCHULE:
      {
        Hochschule hochschule = (Hochschule)theEObject;
        T result = caseHochschule(hochschule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FACHBEREICH:
      {
        Fachbereich fachbereich = (Fachbereich)theEObject;
        T result = caseFachbereich(fachbereich);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.STUDIENGANG:
      {
        Studiengang studiengang = (Studiengang)theEObject;
        T result = caseStudiengang(studiengang);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.VORLESUNG:
      {
        Vorlesung vorlesung = (Vorlesung)theEObject;
        T result = caseVorlesung(vorlesung);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.STUDENT:
      {
        Student student = (Student)theEObject;
        T result = caseStudent(student);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DOZENT:
      {
        Dozent dozent = (Dozent)theEObject;
        T result = caseDozent(dozent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PROFESSOR:
      {
        Professor professor = (Professor)theEObject;
        T result = caseProfessor(professor);
        if (result == null) result = caseDozent(professor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LEHRBEAUFTRAGER:
      {
        Lehrbeauftrager lehrbeauftrager = (Lehrbeauftrager)theEObject;
        T result = caseLehrbeauftrager(lehrbeauftrager);
        if (result == null) result = caseDozent(lehrbeauftrager);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EVALUATION:
      {
        Evaluation evaluation = (Evaluation)theEObject;
        T result = caseEvaluation(evaluation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hochschule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hochschule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHochschule(Hochschule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fachbereich</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fachbereich</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFachbereich(Fachbereich object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Studiengang</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Studiengang</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStudiengang(Studiengang object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vorlesung</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vorlesung</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVorlesung(Vorlesung object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Student</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Student</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStudent(Student object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dozent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dozent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDozent(Dozent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Professor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Professor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProfessor(Professor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lehrbeauftrager</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lehrbeauftrager</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLehrbeauftrager(Lehrbeauftrager object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Evaluation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Evaluation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvaluation(Evaluation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
