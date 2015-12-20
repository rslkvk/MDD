/**
 */
package hochschule.impl;

import hochschule.Dozent;
import hochschule.HmodelPackage;
import hochschule.Vorlesung;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dozent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hochschule.impl.DozentImpl#getVorlesung <em>Vorlesung</em>}</li>
 *   <li>{@link hochschule.impl.DozentImpl#getPersonalNr <em>Personal Nr</em>}</li>
 *   <li>{@link hochschule.impl.DozentImpl#getVorname <em>Vorname</em>}</li>
 *   <li>{@link hochschule.impl.DozentImpl#getNachname <em>Nachname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DozentImpl extends MinimalEObjectImpl.Container implements Dozent {
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
	 * The default value of the '{@link #getPersonalNr() <em>Personal Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalNr()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSONAL_NR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonalNr() <em>Personal Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalNr()
	 * @generated
	 * @ordered
	 */
	protected String personalNr = PERSONAL_NR_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DozentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HmodelPackage.Literals.DOZENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vorlesung> getVorlesung() {
		if (vorlesung == null) {
			vorlesung = new EObjectWithInverseResolvingEList<Vorlesung>(Vorlesung.class, this, HmodelPackage.DOZENT__VORLESUNG, HmodelPackage.VORLESUNG__DOZENT);
		}
		return vorlesung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersonalNr() {
		return personalNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonalNr(String newPersonalNr) {
		String oldPersonalNr = personalNr;
		personalNr = newPersonalNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HmodelPackage.DOZENT__PERSONAL_NR, oldPersonalNr, personalNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVorname() {
		return vorname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVorname(String newVorname) {
		String oldVorname = vorname;
		vorname = newVorname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HmodelPackage.DOZENT__VORNAME, oldVorname, vorname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNachname() {
		return nachname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNachname(String newNachname) {
		String oldNachname = nachname;
		nachname = newNachname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HmodelPackage.DOZENT__NACHNAME, oldNachname, nachname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HmodelPackage.DOZENT__VORLESUNG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVorlesung()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HmodelPackage.DOZENT__VORLESUNG:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HmodelPackage.DOZENT__VORLESUNG:
				return getVorlesung();
			case HmodelPackage.DOZENT__PERSONAL_NR:
				return getPersonalNr();
			case HmodelPackage.DOZENT__VORNAME:
				return getVorname();
			case HmodelPackage.DOZENT__NACHNAME:
				return getNachname();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HmodelPackage.DOZENT__VORLESUNG:
				getVorlesung().clear();
				getVorlesung().addAll((Collection<? extends Vorlesung>)newValue);
				return;
			case HmodelPackage.DOZENT__PERSONAL_NR:
				setPersonalNr((String)newValue);
				return;
			case HmodelPackage.DOZENT__VORNAME:
				setVorname((String)newValue);
				return;
			case HmodelPackage.DOZENT__NACHNAME:
				setNachname((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case HmodelPackage.DOZENT__VORLESUNG:
				getVorlesung().clear();
				return;
			case HmodelPackage.DOZENT__PERSONAL_NR:
				setPersonalNr(PERSONAL_NR_EDEFAULT);
				return;
			case HmodelPackage.DOZENT__VORNAME:
				setVorname(VORNAME_EDEFAULT);
				return;
			case HmodelPackage.DOZENT__NACHNAME:
				setNachname(NACHNAME_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HmodelPackage.DOZENT__VORLESUNG:
				return vorlesung != null && !vorlesung.isEmpty();
			case HmodelPackage.DOZENT__PERSONAL_NR:
				return PERSONAL_NR_EDEFAULT == null ? personalNr != null : !PERSONAL_NR_EDEFAULT.equals(personalNr);
			case HmodelPackage.DOZENT__VORNAME:
				return VORNAME_EDEFAULT == null ? vorname != null : !VORNAME_EDEFAULT.equals(vorname);
			case HmodelPackage.DOZENT__NACHNAME:
				return NACHNAME_EDEFAULT == null ? nachname != null : !NACHNAME_EDEFAULT.equals(nachname);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (PersonalNr: ");
		result.append(personalNr);
		result.append(", Vorname: ");
		result.append(vorname);
		result.append(", Nachname: ");
		result.append(nachname);
		result.append(')');
		return result.toString();
	}

} //DozentImpl
