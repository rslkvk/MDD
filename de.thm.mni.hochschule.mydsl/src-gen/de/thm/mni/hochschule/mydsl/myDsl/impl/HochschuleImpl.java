/**
 */
package de.thm.mni.hochschule.mydsl.myDsl.impl;

import de.thm.mni.hochschule.mydsl.myDsl.Fachbereich;
import de.thm.mni.hochschule.mydsl.myDsl.Hochschule;
import de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage;
import de.thm.mni.hochschule.mydsl.myDsl.Student;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hochschule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.HochschuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.HochschuleImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.HochschuleImpl#getFachbereich <em>Fachbereich</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HochschuleImpl extends MinimalEObjectImpl.Container implements Hochschule
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getStudent() <em>Student</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudent()
   * @generated
   * @ordered
   */
  protected EList<Student> student;

  /**
   * The cached value of the '{@link #getFachbereich() <em>Fachbereich</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFachbereich()
   * @generated
   * @ordered
   */
  protected EList<Fachbereich> fachbereich;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HochschuleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.HOCHSCHULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.HOCHSCHULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Student> getStudent()
  {
    if (student == null)
    {
      student = new EObjectContainmentEList<Student>(Student.class, this, MyDslPackage.HOCHSCHULE__STUDENT);
    }
    return student;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Fachbereich> getFachbereich()
  {
    if (fachbereich == null)
    {
      fachbereich = new EObjectContainmentEList<Fachbereich>(Fachbereich.class, this, MyDslPackage.HOCHSCHULE__FACHBEREICH);
    }
    return fachbereich;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.HOCHSCHULE__STUDENT:
        return ((InternalEList<?>)getStudent()).basicRemove(otherEnd, msgs);
      case MyDslPackage.HOCHSCHULE__FACHBEREICH:
        return ((InternalEList<?>)getFachbereich()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.HOCHSCHULE__NAME:
        return getName();
      case MyDslPackage.HOCHSCHULE__STUDENT:
        return getStudent();
      case MyDslPackage.HOCHSCHULE__FACHBEREICH:
        return getFachbereich();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.HOCHSCHULE__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.HOCHSCHULE__STUDENT:
        getStudent().clear();
        getStudent().addAll((Collection<? extends Student>)newValue);
        return;
      case MyDslPackage.HOCHSCHULE__FACHBEREICH:
        getFachbereich().clear();
        getFachbereich().addAll((Collection<? extends Fachbereich>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.HOCHSCHULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.HOCHSCHULE__STUDENT:
        getStudent().clear();
        return;
      case MyDslPackage.HOCHSCHULE__FACHBEREICH:
        getFachbereich().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.HOCHSCHULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.HOCHSCHULE__STUDENT:
        return student != null && !student.isEmpty();
      case MyDslPackage.HOCHSCHULE__FACHBEREICH:
        return fachbereich != null && !fachbereich.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //HochschuleImpl
