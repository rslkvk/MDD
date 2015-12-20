/**
 */
package hochschule.impl;

import hochschule.Fachbereich;
import hochschule.Hochschule;
import hochschule.HochschulePackage;
import hochschule.Student;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
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
 *   <li>{@link hochschule.impl.HochschuleImpl#getFachbereich <em>Fachbereich</em>}</li>
 *   <li>{@link hochschule.impl.HochschuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link hochschule.impl.HochschuleImpl#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HochschuleImpl extends EObjectImpl implements Hochschule {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HochschuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HochschulePackage.Literals.HOCHSCHULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fachbereich> getFachbereich() {
		if (fachbereich == null) {
			fachbereich = new EObjectContainmentEList<Fachbereich>(Fachbereich.class, this, HochschulePackage.HOCHSCHULE__FACHBEREICH);
		}
		return fachbereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HochschulePackage.HOCHSCHULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudent() {
		if (student == null) {
			student = new EObjectContainmentEList<Student>(Student.class, this, HochschulePackage.HOCHSCHULE__STUDENT);
		}
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HochschulePackage.HOCHSCHULE__FACHBEREICH:
				return ((InternalEList<?>)getFachbereich()).basicRemove(otherEnd, msgs);
			case HochschulePackage.HOCHSCHULE__STUDENT:
				return ((InternalEList<?>)getStudent()).basicRemove(otherEnd, msgs);
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
			case HochschulePackage.HOCHSCHULE__FACHBEREICH:
				return getFachbereich();
			case HochschulePackage.HOCHSCHULE__NAME:
				return getName();
			case HochschulePackage.HOCHSCHULE__STUDENT:
				return getStudent();
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
			case HochschulePackage.HOCHSCHULE__FACHBEREICH:
				getFachbereich().clear();
				getFachbereich().addAll((Collection<? extends Fachbereich>)newValue);
				return;
			case HochschulePackage.HOCHSCHULE__NAME:
				setName((String)newValue);
				return;
			case HochschulePackage.HOCHSCHULE__STUDENT:
				getStudent().clear();
				getStudent().addAll((Collection<? extends Student>)newValue);
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
			case HochschulePackage.HOCHSCHULE__FACHBEREICH:
				getFachbereich().clear();
				return;
			case HochschulePackage.HOCHSCHULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HochschulePackage.HOCHSCHULE__STUDENT:
				getStudent().clear();
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
			case HochschulePackage.HOCHSCHULE__FACHBEREICH:
				return fachbereich != null && !fachbereich.isEmpty();
			case HochschulePackage.HOCHSCHULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HochschulePackage.HOCHSCHULE__STUDENT:
				return student != null && !student.isEmpty();
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //HochschuleImpl
