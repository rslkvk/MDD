/**
 */
package de.thm.mni.htmlgen.hTMLGen.impl;

import de.thm.mni.htmlgen.hTMLGen.Form;
import de.thm.mni.htmlgen.hTMLGen.HTMLGenPackage;
import de.thm.mni.htmlgen.hTMLGen.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.thm.mni.htmlgen.hTMLGen.impl.ModelImpl#getModel <em>Model</em>}</li>
 *   <li>{@link de.thm.mni.htmlgen.hTMLGen.impl.ModelImpl#getForm <em>Form</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected EList<Form> model;

  /**
   * The cached value of the '{@link #getForm() <em>Form</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForm()
   * @generated
   * @ordered
   */
  protected EList<Form> form;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return HTMLGenPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Form> getModel()
  {
    if (model == null)
    {
      model = new EObjectContainmentEList<Form>(Form.class, this, HTMLGenPackage.MODEL__MODEL);
    }
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Form> getForm()
  {
    if (form == null)
    {
      form = new EObjectContainmentEList<Form>(Form.class, this, HTMLGenPackage.MODEL__FORM);
    }
    return form;
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
      case HTMLGenPackage.MODEL__MODEL:
        return ((InternalEList<?>)getModel()).basicRemove(otherEnd, msgs);
      case HTMLGenPackage.MODEL__FORM:
        return ((InternalEList<?>)getForm()).basicRemove(otherEnd, msgs);
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
      case HTMLGenPackage.MODEL__MODEL:
        return getModel();
      case HTMLGenPackage.MODEL__FORM:
        return getForm();
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
      case HTMLGenPackage.MODEL__MODEL:
        getModel().clear();
        getModel().addAll((Collection<? extends Form>)newValue);
        return;
      case HTMLGenPackage.MODEL__FORM:
        getForm().clear();
        getForm().addAll((Collection<? extends Form>)newValue);
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
      case HTMLGenPackage.MODEL__MODEL:
        getModel().clear();
        return;
      case HTMLGenPackage.MODEL__FORM:
        getForm().clear();
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
      case HTMLGenPackage.MODEL__MODEL:
        return model != null && !model.isEmpty();
      case HTMLGenPackage.MODEL__FORM:
        return form != null && !form.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
