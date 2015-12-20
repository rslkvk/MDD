/**
 */
package de.thm.mni.hochschule.mydsl.myDsl.impl;

import de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage;
import de.thm.mni.hochschule.mydsl.myDsl.Student;
import de.thm.mni.hochschule.mydsl.myDsl.Studiengang;
import de.thm.mni.hochschule.mydsl.myDsl.Vorlesung;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Studiengang</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.StudiengangImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.StudiengangImpl#getNc <em>Nc</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.StudiengangImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.StudiengangImpl#getVorlesung <em>Vorlesung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudiengangImpl extends MinimalEObjectImpl.Container implements Studiengang
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
   * The default value of the '{@link #getNc() <em>Nc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNc()
   * @generated
   * @ordered
   */
  protected static final String NC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNc() <em>Nc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNc()
   * @generated
   * @ordered
   */
  protected String nc = NC_EDEFAULT;

  /**
   * The cached value of the '{@link #getStudent() <em>Student</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudent()
   * @generated
   * @ordered
   */
  protected EList<Student> student;

  /**
   * The cached value of the '{@link #getVorlesung() <em>Vorlesung</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVorlesung()
   * @generated
   * @ordered
   */
  protected EList<Vorlesung> vorlesung;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StudiengangImpl()
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
    return MyDslPackage.Literals.STUDIENGANG;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STUDIENGANG__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNc()
  {
    return nc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNc(String newNc)
  {
    String oldNc = nc;
    nc = newNc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STUDIENGANG__NC, oldNc, nc));
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
      student = new EObjectResolvingEList<Student>(Student.class, this, MyDslPackage.STUDIENGANG__STUDENT);
    }
    return student;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Vorlesung> getVorlesung()
  {
    if (vorlesung == null)
    {
      vorlesung = new EObjectContainmentEList<Vorlesung>(Vorlesung.class, this, MyDslPackage.STUDIENGANG__VORLESUNG);
    }
    return vorlesung;
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
      case MyDslPackage.STUDIENGANG__VORLESUNG:
        return ((InternalEList<?>)getVorlesung()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.STUDIENGANG__NAME:
        return getName();
      case MyDslPackage.STUDIENGANG__NC:
        return getNc();
      case MyDslPackage.STUDIENGANG__STUDENT:
        return getStudent();
      case MyDslPackage.STUDIENGANG__VORLESUNG:
        return getVorlesung();
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
      case MyDslPackage.STUDIENGANG__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.STUDIENGANG__NC:
        setNc((String)newValue);
        return;
      case MyDslPackage.STUDIENGANG__STUDENT:
        getStudent().clear();
        getStudent().addAll((Collection<? extends Student>)newValue);
        return;
      case MyDslPackage.STUDIENGANG__VORLESUNG:
        getVorlesung().clear();
        getVorlesung().addAll((Collection<? extends Vorlesung>)newValue);
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
      case MyDslPackage.STUDIENGANG__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.STUDIENGANG__NC:
        setNc(NC_EDEFAULT);
        return;
      case MyDslPackage.STUDIENGANG__STUDENT:
        getStudent().clear();
        return;
      case MyDslPackage.STUDIENGANG__VORLESUNG:
        getVorlesung().clear();
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
      case MyDslPackage.STUDIENGANG__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.STUDIENGANG__NC:
        return NC_EDEFAULT == null ? nc != null : !NC_EDEFAULT.equals(nc);
      case MyDslPackage.STUDIENGANG__STUDENT:
        return student != null && !student.isEmpty();
      case MyDslPackage.STUDIENGANG__VORLESUNG:
        return vorlesung != null && !vorlesung.isEmpty();
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
    result.append(", nc: ");
    result.append(nc);
    result.append(')');
    return result.toString();
  }

} //StudiengangImpl
