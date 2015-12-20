/**
 */
package hochschuleemf.impl;

import hochschuleemf.Dozent;
import hochschuleemf.Evaluation;
import hochschuleemf.HochschuleemfPackage;
import hochschuleemf.Student;
import hochschuleemf.Vorlesung;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vorlesung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hochschuleemf.impl.VorlesungImpl#getTutor <em>Tutor</em>}</li>
 *   <li>{@link hochschuleemf.impl.VorlesungImpl#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link hochschuleemf.impl.VorlesungImpl#getDozent <em>Dozent</em>}</li>
 *   <li>{@link hochschuleemf.impl.VorlesungImpl#getName <em>Name</em>}</li>
 *   <li>{@link hochschuleemf.impl.VorlesungImpl#getModulNr <em>Modul Nr</em>}</li>
 *   <li>{@link hochschuleemf.impl.VorlesungImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link hochschuleemf.impl.VorlesungImpl#getCrP <em>Cr P</em>}</li>
 *   <li>{@link hochschuleemf.impl.VorlesungImpl#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VorlesungImpl extends EObjectImpl implements Vorlesung {
	/**
	 * The cached value of the '{@link #getTutor() <em>Tutor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTutor()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> tutor;

	/**
	 * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected EList<Evaluation> evaluation;

	/**
	 * The cached value of the '{@link #getDozent() <em>Dozent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDozent()
	 * @generated
	 * @ordered
	 */
	protected Dozent dozent;

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
	 * The default value of the '{@link #getModulNr() <em>Modul Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulNr()
	 * @generated
	 * @ordered
	 */
	protected static final String MODUL_NR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModulNr() <em>Modul Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulNr()
	 * @generated
	 * @ordered
	 */
	protected String modulNr = MODUL_NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected static final String BESCHREIBUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected String beschreibung = BESCHREIBUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrP() <em>Cr P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrP()
	 * @generated
	 * @ordered
	 */
	protected static final String CR_P_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrP() <em>Cr P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrP()
	 * @generated
	 * @ordered
	 */
	protected String crP = CR_P_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VorlesungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HochschuleemfPackage.Literals.VORLESUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getTutor() {
		if (tutor == null) {
			tutor = new EObjectResolvingEList<Student>(Student.class, this, HochschuleemfPackage.VORLESUNG__TUTOR);
		}
		return tutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evaluation> getEvaluation() {
		if (evaluation == null) {
			evaluation = new EObjectContainmentEList<Evaluation>(Evaluation.class, this, HochschuleemfPackage.VORLESUNG__EVALUATION);
		}
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dozent getDozent() {
		if (dozent != null && dozent.eIsProxy()) {
			InternalEObject oldDozent = (InternalEObject)dozent;
			dozent = (Dozent)eResolveProxy(oldDozent);
			if (dozent != oldDozent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HochschuleemfPackage.VORLESUNG__DOZENT, oldDozent, dozent));
			}
		}
		return dozent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dozent basicGetDozent() {
		return dozent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDozent(Dozent newDozent, NotificationChain msgs) {
		Dozent oldDozent = dozent;
		dozent = newDozent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HochschuleemfPackage.VORLESUNG__DOZENT, oldDozent, newDozent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDozent(Dozent newDozent) {
		if (newDozent != dozent) {
			NotificationChain msgs = null;
			if (dozent != null)
				msgs = ((InternalEObject)dozent).eInverseRemove(this, HochschuleemfPackage.DOZENT__VORLESUNG, Dozent.class, msgs);
			if (newDozent != null)
				msgs = ((InternalEObject)newDozent).eInverseAdd(this, HochschuleemfPackage.DOZENT__VORLESUNG, Dozent.class, msgs);
			msgs = basicSetDozent(newDozent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HochschuleemfPackage.VORLESUNG__DOZENT, newDozent, newDozent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HochschuleemfPackage.VORLESUNG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModulNr() {
		return modulNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModulNr(String newModulNr) {
		String oldModulNr = modulNr;
		modulNr = newModulNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HochschuleemfPackage.VORLESUNG__MODUL_NR, oldModulNr, modulNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeschreibung() {
		return beschreibung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeschreibung(String newBeschreibung) {
		String oldBeschreibung = beschreibung;
		beschreibung = newBeschreibung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HochschuleemfPackage.VORLESUNG__BESCHREIBUNG, oldBeschreibung, beschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCrP() {
		return crP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrP(String newCrP) {
		String oldCrP = crP;
		crP = newCrP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HochschuleemfPackage.VORLESUNG__CR_P, oldCrP, crP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudent() {
		if (student == null) {
			student = new EObjectWithInverseResolvingEList.ManyInverse<Student>(Student.class, this, HochschuleemfPackage.VORLESUNG__STUDENT, HochschuleemfPackage.STUDENT__VORLESUNG);
		}
		return student;
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
			case HochschuleemfPackage.VORLESUNG__DOZENT:
				if (dozent != null)
					msgs = ((InternalEObject)dozent).eInverseRemove(this, HochschuleemfPackage.DOZENT__VORLESUNG, Dozent.class, msgs);
				return basicSetDozent((Dozent)otherEnd, msgs);
			case HochschuleemfPackage.VORLESUNG__STUDENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStudent()).basicAdd(otherEnd, msgs);
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
			case HochschuleemfPackage.VORLESUNG__EVALUATION:
				return ((InternalEList<?>)getEvaluation()).basicRemove(otherEnd, msgs);
			case HochschuleemfPackage.VORLESUNG__DOZENT:
				return basicSetDozent(null, msgs);
			case HochschuleemfPackage.VORLESUNG__STUDENT:
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
			case HochschuleemfPackage.VORLESUNG__TUTOR:
				return getTutor();
			case HochschuleemfPackage.VORLESUNG__EVALUATION:
				return getEvaluation();
			case HochschuleemfPackage.VORLESUNG__DOZENT:
				if (resolve) return getDozent();
				return basicGetDozent();
			case HochschuleemfPackage.VORLESUNG__NAME:
				return getName();
			case HochschuleemfPackage.VORLESUNG__MODUL_NR:
				return getModulNr();
			case HochschuleemfPackage.VORLESUNG__BESCHREIBUNG:
				return getBeschreibung();
			case HochschuleemfPackage.VORLESUNG__CR_P:
				return getCrP();
			case HochschuleemfPackage.VORLESUNG__STUDENT:
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
			case HochschuleemfPackage.VORLESUNG__TUTOR:
				getTutor().clear();
				getTutor().addAll((Collection<? extends Student>)newValue);
				return;
			case HochschuleemfPackage.VORLESUNG__EVALUATION:
				getEvaluation().clear();
				getEvaluation().addAll((Collection<? extends Evaluation>)newValue);
				return;
			case HochschuleemfPackage.VORLESUNG__DOZENT:
				setDozent((Dozent)newValue);
				return;
			case HochschuleemfPackage.VORLESUNG__NAME:
				setName((String)newValue);
				return;
			case HochschuleemfPackage.VORLESUNG__MODUL_NR:
				setModulNr((String)newValue);
				return;
			case HochschuleemfPackage.VORLESUNG__BESCHREIBUNG:
				setBeschreibung((String)newValue);
				return;
			case HochschuleemfPackage.VORLESUNG__CR_P:
				setCrP((String)newValue);
				return;
			case HochschuleemfPackage.VORLESUNG__STUDENT:
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
			case HochschuleemfPackage.VORLESUNG__TUTOR:
				getTutor().clear();
				return;
			case HochschuleemfPackage.VORLESUNG__EVALUATION:
				getEvaluation().clear();
				return;
			case HochschuleemfPackage.VORLESUNG__DOZENT:
				setDozent((Dozent)null);
				return;
			case HochschuleemfPackage.VORLESUNG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HochschuleemfPackage.VORLESUNG__MODUL_NR:
				setModulNr(MODUL_NR_EDEFAULT);
				return;
			case HochschuleemfPackage.VORLESUNG__BESCHREIBUNG:
				setBeschreibung(BESCHREIBUNG_EDEFAULT);
				return;
			case HochschuleemfPackage.VORLESUNG__CR_P:
				setCrP(CR_P_EDEFAULT);
				return;
			case HochschuleemfPackage.VORLESUNG__STUDENT:
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
			case HochschuleemfPackage.VORLESUNG__TUTOR:
				return tutor != null && !tutor.isEmpty();
			case HochschuleemfPackage.VORLESUNG__EVALUATION:
				return evaluation != null && !evaluation.isEmpty();
			case HochschuleemfPackage.VORLESUNG__DOZENT:
				return dozent != null;
			case HochschuleemfPackage.VORLESUNG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HochschuleemfPackage.VORLESUNG__MODUL_NR:
				return MODUL_NR_EDEFAULT == null ? modulNr != null : !MODUL_NR_EDEFAULT.equals(modulNr);
			case HochschuleemfPackage.VORLESUNG__BESCHREIBUNG:
				return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
			case HochschuleemfPackage.VORLESUNG__CR_P:
				return CR_P_EDEFAULT == null ? crP != null : !CR_P_EDEFAULT.equals(crP);
			case HochschuleemfPackage.VORLESUNG__STUDENT:
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
		result.append(", ModulNr: ");
		result.append(modulNr);
		result.append(", Beschreibung: ");
		result.append(beschreibung);
		result.append(", CrP: ");
		result.append(crP);
		result.append(')');
		return result.toString();
	}

} //VorlesungImpl
