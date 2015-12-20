/**
 */
package de.thm.mni.htmlgen.hTMLGen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.thm.mni.htmlgen.hTMLGen.HTMLGenFactory
 * @model kind="package"
 * @generated
 */
public interface HTMLGenPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "hTMLGen";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.thm.de/mni/htmlgen/HTMLGen";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "hTMLGen";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HTMLGenPackage eINSTANCE = de.thm.mni.htmlgen.hTMLGen.impl.HTMLGenPackageImpl.init();

  /**
   * The meta object id for the '{@link de.thm.mni.htmlgen.hTMLGen.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.thm.mni.htmlgen.hTMLGen.impl.ModelImpl
   * @see de.thm.mni.htmlgen.hTMLGen.impl.HTMLGenPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Model</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MODEL = 0;

  /**
   * The feature id for the '<em><b>Form</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FORM = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.thm.mni.htmlgen.hTMLGen.impl.FormImpl <em>Form</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.thm.mni.htmlgen.hTMLGen.impl.FormImpl
   * @see de.thm.mni.htmlgen.hTMLGen.impl.HTMLGenPackageImpl#getForm()
   * @generated
   */
  int FORM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__TITLE = 2;

  /**
   * The feature id for the '<em><b>Form</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__FORM = 3;

  /**
   * The number of structural features of the '<em>Form</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.thm.mni.htmlgen.hTMLGen.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.thm.mni.htmlgen.hTMLGen.impl.FieldImpl
   * @see de.thm.mni.htmlgen.hTMLGen.impl.HTMLGenPackageImpl#getField()
   * @generated
   */
  int FIELD = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__LABEL = 1;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.thm.mni.htmlgen.hTMLGen.impl.TextFieldImpl <em>Text Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.thm.mni.htmlgen.hTMLGen.impl.TextFieldImpl
   * @see de.thm.mni.htmlgen.hTMLGen.impl.HTMLGenPackageImpl#getTextField()
   * @generated
   */
  int TEXT_FIELD = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD__NAME = FIELD__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD__LABEL = FIELD__LABEL;

  /**
   * The number of structural features of the '<em>Text Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.thm.mni.htmlgen.hTMLGen.impl.MultilineFieldImpl <em>Multiline Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.thm.mni.htmlgen.hTMLGen.impl.MultilineFieldImpl
   * @see de.thm.mni.htmlgen.hTMLGen.impl.HTMLGenPackageImpl#getMultilineField()
   * @generated
   */
  int MULTILINE_FIELD = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTILINE_FIELD__NAME = TEXT_FIELD__NAME;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTILINE_FIELD__LABEL = TEXT_FIELD__LABEL;

  /**
   * The number of structural features of the '<em>Multiline Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTILINE_FIELD_FEATURE_COUNT = TEXT_FIELD_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link de.thm.mni.htmlgen.hTMLGen.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.thm.mni.htmlgen.hTMLGen.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.thm.mni.htmlgen.hTMLGen.Model#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Model</em>'.
   * @see de.thm.mni.htmlgen.hTMLGen.Model#getModel()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Model();

  /**
   * Returns the meta object for the containment reference list '{@link de.thm.mni.htmlgen.hTMLGen.Model#getForm <em>Form</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Form</em>'.
   * @see de.thm.mni.htmlgen.hTMLGen.Model#getForm()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Form();

  /**
   * Returns the meta object for class '{@link de.thm.mni.htmlgen.hTMLGen.Form <em>Form</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form</em>'.
   * @see de.thm.mni.htmlgen.hTMLGen.Form
   * @generated
   */
  EClass getForm();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.htmlgen.hTMLGen.Form#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.thm.mni.htmlgen.hTMLGen.Form#getName()
   * @see #getForm()
   * @generated
   */
  EAttribute getForm_Name();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.htmlgen.hTMLGen.Form#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see de.thm.mni.htmlgen.hTMLGen.Form#getDescription()
   * @see #getForm()
   * @generated
   */
  EAttribute getForm_Description();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.htmlgen.hTMLGen.Form#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see de.thm.mni.htmlgen.hTMLGen.Form#getTitle()
   * @see #getForm()
   * @generated
   */
  EAttribute getForm_Title();

  /**
   * Returns the meta object for the containment reference list '{@link de.thm.mni.htmlgen.hTMLGen.Form#getForm <em>Form</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Form</em>'.
   * @see de.thm.mni.htmlgen.hTMLGen.Form#getForm()
   * @see #getForm()
   * @generated
   */
  EReference getForm_Form();

  /**
   * Returns the meta object for class '{@link de.thm.mni.htmlgen.hTMLGen.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see de.thm.mni.htmlgen.hTMLGen.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.htmlgen.hTMLGen.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.thm.mni.htmlgen.hTMLGen.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the attribute '{@link de.thm.mni.htmlgen.hTMLGen.Field#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see de.thm.mni.htmlgen.hTMLGen.Field#getLabel()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Label();

  /**
   * Returns the meta object for class '{@link de.thm.mni.htmlgen.hTMLGen.TextField <em>Text Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Field</em>'.
   * @see de.thm.mni.htmlgen.hTMLGen.TextField
   * @generated
   */
  EClass getTextField();

  /**
   * Returns the meta object for class '{@link de.thm.mni.htmlgen.hTMLGen.MultilineField <em>Multiline Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiline Field</em>'.
   * @see de.thm.mni.htmlgen.hTMLGen.MultilineField
   * @generated
   */
  EClass getMultilineField();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  HTMLGenFactory getHTMLGenFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.thm.mni.htmlgen.hTMLGen.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.thm.mni.htmlgen.hTMLGen.impl.ModelImpl
     * @see de.thm.mni.htmlgen.hTMLGen.impl.HTMLGenPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MODEL = eINSTANCE.getModel_Model();

    /**
     * The meta object literal for the '<em><b>Form</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FORM = eINSTANCE.getModel_Form();

    /**
     * The meta object literal for the '{@link de.thm.mni.htmlgen.hTMLGen.impl.FormImpl <em>Form</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.thm.mni.htmlgen.hTMLGen.impl.FormImpl
     * @see de.thm.mni.htmlgen.hTMLGen.impl.HTMLGenPackageImpl#getForm()
     * @generated
     */
    EClass FORM = eINSTANCE.getForm();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM__NAME = eINSTANCE.getForm_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM__DESCRIPTION = eINSTANCE.getForm_Description();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORM__TITLE = eINSTANCE.getForm_Title();

    /**
     * The meta object literal for the '<em><b>Form</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORM__FORM = eINSTANCE.getForm_Form();

    /**
     * The meta object literal for the '{@link de.thm.mni.htmlgen.hTMLGen.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.thm.mni.htmlgen.hTMLGen.impl.FieldImpl
     * @see de.thm.mni.htmlgen.hTMLGen.impl.HTMLGenPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__LABEL = eINSTANCE.getField_Label();

    /**
     * The meta object literal for the '{@link de.thm.mni.htmlgen.hTMLGen.impl.TextFieldImpl <em>Text Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.thm.mni.htmlgen.hTMLGen.impl.TextFieldImpl
     * @see de.thm.mni.htmlgen.hTMLGen.impl.HTMLGenPackageImpl#getTextField()
     * @generated
     */
    EClass TEXT_FIELD = eINSTANCE.getTextField();

    /**
     * The meta object literal for the '{@link de.thm.mni.htmlgen.hTMLGen.impl.MultilineFieldImpl <em>Multiline Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.thm.mni.htmlgen.hTMLGen.impl.MultilineFieldImpl
     * @see de.thm.mni.htmlgen.hTMLGen.impl.HTMLGenPackageImpl#getMultilineField()
     * @generated
     */
    EClass MULTILINE_FIELD = eINSTANCE.getMultilineField();

  }

} //HTMLGenPackage
