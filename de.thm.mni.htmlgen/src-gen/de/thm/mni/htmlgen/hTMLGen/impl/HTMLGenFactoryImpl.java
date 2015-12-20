/**
 */
package de.thm.mni.htmlgen.hTMLGen.impl;

import de.thm.mni.htmlgen.hTMLGen.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HTMLGenFactoryImpl extends EFactoryImpl implements HTMLGenFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HTMLGenFactory init()
  {
    try
    {
      HTMLGenFactory theHTMLGenFactory = (HTMLGenFactory)EPackage.Registry.INSTANCE.getEFactory(HTMLGenPackage.eNS_URI);
      if (theHTMLGenFactory != null)
      {
        return theHTMLGenFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HTMLGenFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HTMLGenFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case HTMLGenPackage.MODEL: return createModel();
      case HTMLGenPackage.FORM: return createForm();
      case HTMLGenPackage.FIELD: return createField();
      case HTMLGenPackage.TEXT_FIELD: return createTextField();
      case HTMLGenPackage.MULTILINE_FIELD: return createMultilineField();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Form createForm()
  {
    FormImpl form = new FormImpl();
    return form;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextField createTextField()
  {
    TextFieldImpl textField = new TextFieldImpl();
    return textField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultilineField createMultilineField()
  {
    MultilineFieldImpl multilineField = new MultilineFieldImpl();
    return multilineField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HTMLGenPackage getHTMLGenPackage()
  {
    return (HTMLGenPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HTMLGenPackage getPackage()
  {
    return HTMLGenPackage.eINSTANCE;
  }

} //HTMLGenFactoryImpl
