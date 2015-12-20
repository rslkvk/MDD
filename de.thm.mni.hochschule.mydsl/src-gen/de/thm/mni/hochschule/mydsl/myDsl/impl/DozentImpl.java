/**
 */
package de.thm.mni.hochschule.mydsl.myDsl.impl;

import de.thm.mni.hochschule.mydsl.myDsl.Dozent;
import de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage;
import de.thm.mni.hochschule.mydsl.myDsl.Vorlesung;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dozent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.DozentImpl#getPersonalnr <em>Personalnr</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.DozentImpl#getVorname <em>Vorname</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.DozentImpl#getNachname <em>Nachname</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.DozentImpl#getVorlesung <em>Vorlesung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DozentImpl extends MinimalEObjectImpl.Container implements Dozent
{
  /**
   * The default value of the '{@link #getPersonalnr() <em>Personalnr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonalnr()
   * @generated
   * @ordered
   */
  protected static final String PERSONALNR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPersonalnr() <em>Personalnr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonalnr()
   * @generated
   * @ordered
   */
  protected String personalnr = PERSONALNR_EDEFAULT;

  /**
   * The default value of the '{@link #getVorname() <em>Vorname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVorname()
   * @generated
   * @ordered
   */
  protected static final String VORNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVorname() <em>Vorname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVorname()
   * @generated
   * @ordered
   */
  protected String vorname = VORNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getNachname() <em>Nachname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNachname()
   * @generated
   * @ordered
   */
  protected static final String NACHNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNachname() <em>Nachname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNachname()
   * @generated
   * @ordered
   */
  protected String nachname = NACHNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVorlesung() <em>Vorlesung</em>}' reference list.
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
  protected DozentImpl()
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
    return MyDslPackage.Literals.DOZENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPersonalnr()
  {
    return personalnr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPersonalnr(String newPersonalnr)
  {
    String oldPersonalnr = personalnr;
    personalnr = newPersonalnr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DOZENT__PERSONALNR, oldPersonalnr, personalnr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVorname()
  {
    return vorname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVorname(String newVorname)
  {
    String oldVorname = vorname;
    vorname = newVorname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DOZENT__VORNAME, oldVorname, vorname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNachname()
  {
    return nachname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNachname(String newNachname)
  {
    String oldNachname = nachname;
    nachname = newNachname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DOZENT__NACHNAME, oldNachname, nachname));
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
      vorlesung = new EObjectResolvingEList<Vorlesung>(Vorlesung.class, this, MyDslPackage.DOZENT__VORLESUNG);
    }
    return vorlesung;
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
      case MyDslPackage.DOZENT__PERSONALNR:
        return getPersonalnr();
      case MyDslPackage.DOZENT__VORNAME:
        return getVorname();
      case MyDslPackage.DOZENT__NACHNAME:
        return getNachname();
      case MyDslPackage.DOZENT__VORLESUNG:
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
      case MyDslPackage.DOZENT__PERSONALNR:
        setPersonalnr((String)newValue);
        return;
      case MyDslPackage.DOZENT__VORNAME:
        setVorname((String)newValue);
        return;
      case MyDslPackage.DOZENT__NACHNAME:
        setNachname((String)newValue);
        return;
      case MyDslPackage.DOZENT__VORLESUNG:
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
      case MyDslPackage.DOZENT__PERSONALNR:
        setPersonalnr(PERSONALNR_EDEFAULT);
        return;
      case MyDslPackage.DOZENT__VORNAME:
        setVorname(VORNAME_EDEFAULT);
        return;
      case MyDslPackage.DOZENT__NACHNAME:
        setNachname(NACHNAME_EDEFAULT);
        return;
      case MyDslPackage.DOZENT__VORLESUNG:
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
      case MyDslPackage.DOZENT__PERSONALNR:
        return PERSONALNR_EDEFAULT == null ? personalnr != null : !PERSONALNR_EDEFAULT.equals(personalnr);
      case MyDslPackage.DOZENT__VORNAME:
        return VORNAME_EDEFAULT == null ? vorname != null : !VORNAME_EDEFAULT.equals(vorname);
      case MyDslPackage.DOZENT__NACHNAME:
        return NACHNAME_EDEFAULT == null ? nachname != null : !NACHNAME_EDEFAULT.equals(nachname);
      case MyDslPackage.DOZENT__VORLESUNG:
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
    result.append(" (personalnr: ");
    result.append(personalnr);
    result.append(", vorname: ");
    result.append(vorname);
    result.append(", nachname: ");
    result.append(nachname);
    result.append(')');
    return result.toString();
  }

} //DozentImpl
