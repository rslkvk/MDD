/**
 */
package de.thm.mni.hochschule.mydsl.myDsl.impl;

import de.thm.mni.hochschule.mydsl.myDsl.Dozent;
import de.thm.mni.hochschule.mydsl.myDsl.Fachbereich;
import de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage;
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
 * An implementation of the model object '<em><b>Fachbereich</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.FachbereichImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.FachbereichImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.FachbereichImpl#getStudiengang <em>Studiengang</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.FachbereichImpl#getDozent <em>Dozent</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.FachbereichImpl#getVorlesung <em>Vorlesung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FachbereichImpl extends MinimalEObjectImpl.Container implements Fachbereich
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
   * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected static final String ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected String alias = ALIAS_EDEFAULT;

  /**
   * The cached value of the '{@link #getStudiengang() <em>Studiengang</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudiengang()
   * @generated
   * @ordered
   */
  protected EList<Studiengang> studiengang;

  /**
   * The cached value of the '{@link #getDozent() <em>Dozent</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDozent()
   * @generated
   * @ordered
   */
  protected EList<Dozent> dozent;

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
  protected FachbereichImpl()
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
    return MyDslPackage.Literals.FACHBEREICH;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FACHBEREICH__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlias(String newAlias)
  {
    String oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FACHBEREICH__ALIAS, oldAlias, alias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Studiengang> getStudiengang()
  {
    if (studiengang == null)
    {
      studiengang = new EObjectContainmentEList<Studiengang>(Studiengang.class, this, MyDslPackage.FACHBEREICH__STUDIENGANG);
    }
    return studiengang;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Dozent> getDozent()
  {
    if (dozent == null)
    {
      dozent = new EObjectContainmentEList<Dozent>(Dozent.class, this, MyDslPackage.FACHBEREICH__DOZENT);
    }
    return dozent;
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
      vorlesung = new EObjectResolvingEList<Vorlesung>(Vorlesung.class, this, MyDslPackage.FACHBEREICH__VORLESUNG);
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
      case MyDslPackage.FACHBEREICH__STUDIENGANG:
        return ((InternalEList<?>)getStudiengang()).basicRemove(otherEnd, msgs);
      case MyDslPackage.FACHBEREICH__DOZENT:
        return ((InternalEList<?>)getDozent()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.FACHBEREICH__NAME:
        return getName();
      case MyDslPackage.FACHBEREICH__ALIAS:
        return getAlias();
      case MyDslPackage.FACHBEREICH__STUDIENGANG:
        return getStudiengang();
      case MyDslPackage.FACHBEREICH__DOZENT:
        return getDozent();
      case MyDslPackage.FACHBEREICH__VORLESUNG:
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
      case MyDslPackage.FACHBEREICH__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.FACHBEREICH__ALIAS:
        setAlias((String)newValue);
        return;
      case MyDslPackage.FACHBEREICH__STUDIENGANG:
        getStudiengang().clear();
        getStudiengang().addAll((Collection<? extends Studiengang>)newValue);
        return;
      case MyDslPackage.FACHBEREICH__DOZENT:
        getDozent().clear();
        getDozent().addAll((Collection<? extends Dozent>)newValue);
        return;
      case MyDslPackage.FACHBEREICH__VORLESUNG:
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
      case MyDslPackage.FACHBEREICH__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.FACHBEREICH__ALIAS:
        setAlias(ALIAS_EDEFAULT);
        return;
      case MyDslPackage.FACHBEREICH__STUDIENGANG:
        getStudiengang().clear();
        return;
      case MyDslPackage.FACHBEREICH__DOZENT:
        getDozent().clear();
        return;
      case MyDslPackage.FACHBEREICH__VORLESUNG:
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
      case MyDslPackage.FACHBEREICH__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.FACHBEREICH__ALIAS:
        return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
      case MyDslPackage.FACHBEREICH__STUDIENGANG:
        return studiengang != null && !studiengang.isEmpty();
      case MyDslPackage.FACHBEREICH__DOZENT:
        return dozent != null && !dozent.isEmpty();
      case MyDslPackage.FACHBEREICH__VORLESUNG:
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
    result.append(", alias: ");
    result.append(alias);
    result.append(')');
    return result.toString();
  }

} //FachbereichImpl
