/**
 */
package de.thm.mni.hochschule.mydsl.myDsl.impl;

import de.thm.mni.hochschule.mydsl.myDsl.Dozent;
import de.thm.mni.hochschule.mydsl.myDsl.Evaluation;
import de.thm.mni.hochschule.mydsl.myDsl.MyDslPackage;
import de.thm.mni.hochschule.mydsl.myDsl.Student;
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
 * An implementation of the model object '<em><b>Vorlesung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.VorlesungImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.VorlesungImpl#getModulnr <em>Modulnr</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.VorlesungImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.VorlesungImpl#getCrp <em>Crp</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.VorlesungImpl#getDozent <em>Dozent</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.VorlesungImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.VorlesungImpl#getTutor <em>Tutor</em>}</li>
 *   <li>{@link de.thm.mni.hochschule.mydsl.myDsl.impl.VorlesungImpl#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VorlesungImpl extends MinimalEObjectImpl.Container implements Vorlesung
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
   * The default value of the '{@link #getModulnr() <em>Modulnr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModulnr()
   * @generated
   * @ordered
   */
  protected static final String MODULNR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModulnr() <em>Modulnr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModulnr()
   * @generated
   * @ordered
   */
  protected String modulnr = MODULNR_EDEFAULT;

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
   * The default value of the '{@link #getCrp() <em>Crp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCrp()
   * @generated
   * @ordered
   */
  protected static final String CRP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCrp() <em>Crp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCrp()
   * @generated
   * @ordered
   */
  protected String crp = CRP_EDEFAULT;

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
   * The cached value of the '{@link #getStudent() <em>Student</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudent()
   * @generated
   * @ordered
   */
  protected EList<Student> student;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VorlesungImpl()
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
    return MyDslPackage.Literals.VORLESUNG;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VORLESUNG__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModulnr()
  {
    return modulnr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModulnr(String newModulnr)
  {
    String oldModulnr = modulnr;
    modulnr = newModulnr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VORLESUNG__MODULNR, oldModulnr, modulnr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBeschreibung()
  {
    return beschreibung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeschreibung(String newBeschreibung)
  {
    String oldBeschreibung = beschreibung;
    beschreibung = newBeschreibung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VORLESUNG__BESCHREIBUNG, oldBeschreibung, beschreibung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCrp()
  {
    return crp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCrp(String newCrp)
  {
    String oldCrp = crp;
    crp = newCrp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VORLESUNG__CRP, oldCrp, crp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dozent getDozent()
  {
    if (dozent != null && dozent.eIsProxy())
    {
      InternalEObject oldDozent = (InternalEObject)dozent;
      dozent = (Dozent)eResolveProxy(oldDozent);
      if (dozent != oldDozent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.VORLESUNG__DOZENT, oldDozent, dozent));
      }
    }
    return dozent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dozent basicGetDozent()
  {
    return dozent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDozent(Dozent newDozent)
  {
    Dozent oldDozent = dozent;
    dozent = newDozent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VORLESUNG__DOZENT, oldDozent, dozent));
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
      student = new EObjectResolvingEList<Student>(Student.class, this, MyDslPackage.VORLESUNG__STUDENT);
    }
    return student;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Student> getTutor()
  {
    if (tutor == null)
    {
      tutor = new EObjectResolvingEList<Student>(Student.class, this, MyDslPackage.VORLESUNG__TUTOR);
    }
    return tutor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Evaluation> getEvaluation()
  {
    if (evaluation == null)
    {
      evaluation = new EObjectContainmentEList<Evaluation>(Evaluation.class, this, MyDslPackage.VORLESUNG__EVALUATION);
    }
    return evaluation;
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
      case MyDslPackage.VORLESUNG__EVALUATION:
        return ((InternalEList<?>)getEvaluation()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.VORLESUNG__NAME:
        return getName();
      case MyDslPackage.VORLESUNG__MODULNR:
        return getModulnr();
      case MyDslPackage.VORLESUNG__BESCHREIBUNG:
        return getBeschreibung();
      case MyDslPackage.VORLESUNG__CRP:
        return getCrp();
      case MyDslPackage.VORLESUNG__DOZENT:
        if (resolve) return getDozent();
        return basicGetDozent();
      case MyDslPackage.VORLESUNG__STUDENT:
        return getStudent();
      case MyDslPackage.VORLESUNG__TUTOR:
        return getTutor();
      case MyDslPackage.VORLESUNG__EVALUATION:
        return getEvaluation();
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
      case MyDslPackage.VORLESUNG__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.VORLESUNG__MODULNR:
        setModulnr((String)newValue);
        return;
      case MyDslPackage.VORLESUNG__BESCHREIBUNG:
        setBeschreibung((String)newValue);
        return;
      case MyDslPackage.VORLESUNG__CRP:
        setCrp((String)newValue);
        return;
      case MyDslPackage.VORLESUNG__DOZENT:
        setDozent((Dozent)newValue);
        return;
      case MyDslPackage.VORLESUNG__STUDENT:
        getStudent().clear();
        getStudent().addAll((Collection<? extends Student>)newValue);
        return;
      case MyDslPackage.VORLESUNG__TUTOR:
        getTutor().clear();
        getTutor().addAll((Collection<? extends Student>)newValue);
        return;
      case MyDslPackage.VORLESUNG__EVALUATION:
        getEvaluation().clear();
        getEvaluation().addAll((Collection<? extends Evaluation>)newValue);
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
      case MyDslPackage.VORLESUNG__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.VORLESUNG__MODULNR:
        setModulnr(MODULNR_EDEFAULT);
        return;
      case MyDslPackage.VORLESUNG__BESCHREIBUNG:
        setBeschreibung(BESCHREIBUNG_EDEFAULT);
        return;
      case MyDslPackage.VORLESUNG__CRP:
        setCrp(CRP_EDEFAULT);
        return;
      case MyDslPackage.VORLESUNG__DOZENT:
        setDozent((Dozent)null);
        return;
      case MyDslPackage.VORLESUNG__STUDENT:
        getStudent().clear();
        return;
      case MyDslPackage.VORLESUNG__TUTOR:
        getTutor().clear();
        return;
      case MyDslPackage.VORLESUNG__EVALUATION:
        getEvaluation().clear();
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
      case MyDslPackage.VORLESUNG__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.VORLESUNG__MODULNR:
        return MODULNR_EDEFAULT == null ? modulnr != null : !MODULNR_EDEFAULT.equals(modulnr);
      case MyDslPackage.VORLESUNG__BESCHREIBUNG:
        return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
      case MyDslPackage.VORLESUNG__CRP:
        return CRP_EDEFAULT == null ? crp != null : !CRP_EDEFAULT.equals(crp);
      case MyDslPackage.VORLESUNG__DOZENT:
        return dozent != null;
      case MyDslPackage.VORLESUNG__STUDENT:
        return student != null && !student.isEmpty();
      case MyDslPackage.VORLESUNG__TUTOR:
        return tutor != null && !tutor.isEmpty();
      case MyDslPackage.VORLESUNG__EVALUATION:
        return evaluation != null && !evaluation.isEmpty();
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
    result.append(", modulnr: ");
    result.append(modulnr);
    result.append(", beschreibung: ");
    result.append(beschreibung);
    result.append(", crp: ");
    result.append(crp);
    result.append(')');
    return result.toString();
  }

} //VorlesungImpl
