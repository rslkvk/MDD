/**
 */
package hochschuleemf.impl;

import hochschuleemf.Evaluation;
import hochschuleemf.HochschuleemfPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hochschuleemf.impl.EvaluationImpl#getGesamtnote <em>Gesamtnote</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationImpl extends EObjectImpl implements Evaluation {
	/**
	 * The default value of the '{@link #getGesamtnote() <em>Gesamtnote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGesamtnote()
	 * @generated
	 * @ordered
	 */
	protected static final int GESAMTNOTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGesamtnote() <em>Gesamtnote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGesamtnote()
	 * @generated
	 * @ordered
	 */
	protected int gesamtnote = GESAMTNOTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HochschuleemfPackage.Literals.EVALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGesamtnote() {
		return gesamtnote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGesamtnote(int newGesamtnote) {
		int oldGesamtnote = gesamtnote;
		gesamtnote = newGesamtnote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HochschuleemfPackage.EVALUATION__GESAMTNOTE, oldGesamtnote, gesamtnote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HochschuleemfPackage.EVALUATION__GESAMTNOTE:
				return getGesamtnote();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HochschuleemfPackage.EVALUATION__GESAMTNOTE:
				setGesamtnote((Integer)newValue);
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
			case HochschuleemfPackage.EVALUATION__GESAMTNOTE:
				setGesamtnote(GESAMTNOTE_EDEFAULT);
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
			case HochschuleemfPackage.EVALUATION__GESAMTNOTE:
				return gesamtnote != GESAMTNOTE_EDEFAULT;
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
		result.append(" (Gesamtnote: ");
		result.append(gesamtnote);
		result.append(')');
		return result.toString();
	}

} //EvaluationImpl
