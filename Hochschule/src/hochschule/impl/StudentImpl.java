/**
 */
package hochschule.impl;

import hochschule.HochschulePackage;
import hochschule.Student;
import hochschule.Vorlesung;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hochschule.impl.StudentImpl#getMatrikelNr <em>Matrikel Nr</em>}</li>
 *   <li>{@link hochschule.impl.StudentImpl#getVorname <em>Vorname</em>}</li>
 *   <li>{@link hochschule.impl.StudentImpl#getNachname <em>Nachname</em>}</li>
 *   <li>{@link hochschule.impl.StudentImpl#getVorlesung <em>Vorlesung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends EObjectImpl implements Student {
	/**
	 * The default value of the '{@link #getMatrikelNr() <em>Matrikel Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrikelNr()
	 * @generated
	 * @ordered
	 */
	protected static final String MATRIKEL_NR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatrikelNr() <em>Matrikel Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrikelNr()
	 * @generated
	 * @ordered
	 */
	protected String matrikelNr = MATRIKEL_NR_EDEFAULT;

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
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HochschulePackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatrikelNr() {
		return matrikelNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatrikelNr(String newMatrikelNr) {
		String oldMatrikelNr = matrikelNr;
		matrikelNr = newMatrikelNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HochschulePackage.STUDENT__MATRIKEL_NR, oldMatrikelNr, matrikelNr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HochschulePackage.STUDENT__VORNAME, oldVorname, vorname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HochschulePackage.STUDENT__NACHNAME, oldNachname, nachname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vorlesung> getVorlesung() {
		if (vorlesung == null) {
			vorlesung = new EObjectWithInverseResolvingEList.ManyInverse<Vorlesung>(Vorlesung.class, this, HochschulePackage.STUDENT__VORLESUNG, HochschulePackage.VORLESUNG__STUDENT);
		}
		return vorlesung;
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
			case HochschulePackage.STUDENT__VORLESUNG:
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
			case HochschulePackage.STUDENT__VORLESUNG:
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
			case HochschulePackage.STUDENT__MATRIKEL_NR:
				return getMatrikelNr();
			case HochschulePackage.STUDENT__VORNAME:
				return getVorname();
			case HochschulePackage.STUDENT__NACHNAME:
				return getNachname();
			case HochschulePackage.STUDENT__VORLESUNG:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HochschulePackage.STUDENT__MATRIKEL_NR:
				setMatrikelNr((String)newValue);
				return;
			case HochschulePackage.STUDENT__VORNAME:
				setVorname((String)newValue);
				return;
			case HochschulePackage.STUDENT__NACHNAME:
				setNachname((String)newValue);
				return;
			case HochschulePackage.STUDENT__VORLESUNG:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case HochschulePackage.STUDENT__MATRIKEL_NR:
				setMatrikelNr(MATRIKEL_NR_EDEFAULT);
				return;
			case HochschulePackage.STUDENT__VORNAME:
				setVorname(VORNAME_EDEFAULT);
				return;
			case HochschulePackage.STUDENT__NACHNAME:
				setNachname(NACHNAME_EDEFAULT);
				return;
			case HochschulePackage.STUDENT__VORLESUNG:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HochschulePackage.STUDENT__MATRIKEL_NR:
				return MATRIKEL_NR_EDEFAULT == null ? matrikelNr != null : !MATRIKEL_NR_EDEFAULT.equals(matrikelNr);
			case HochschulePackage.STUDENT__VORNAME:
				return VORNAME_EDEFAULT == null ? vorname != null : !VORNAME_EDEFAULT.equals(vorname);
			case HochschulePackage.STUDENT__NACHNAME:
				return NACHNAME_EDEFAULT == null ? nachname != null : !NACHNAME_EDEFAULT.equals(nachname);
			case HochschulePackage.STUDENT__VORLESUNG:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (MatrikelNr: ");
		result.append(matrikelNr);
		result.append(", Vorname: ");
		result.append(vorname);
		result.append(", Nachname: ");
		result.append(nachname);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
