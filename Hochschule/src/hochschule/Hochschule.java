/**
 */
package hochschule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hochschule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hochschule.Hochschule#getFachbereich <em>Fachbereich</em>}</li>
 *   <li>{@link hochschule.Hochschule#getName <em>Name</em>}</li>
 *   <li>{@link hochschule.Hochschule#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @see hochschule.HochschulePackage#getHochschule()
 * @model
 * @generated
 */
public interface Hochschule extends EObject {
	/**
	 * Returns the value of the '<em><b>Fachbereich</b></em>' containment reference list.
	 * The list contents are of type {@link hochschule.Fachbereich}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fachbereich</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fachbereich</em>' containment reference list.
	 * @see hochschule.HochschulePackage#getHochschule_Fachbereich()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Fachbereich> getFachbereich();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hochschule.HochschulePackage#getHochschule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hochschule.Hochschule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' containment reference list.
	 * The list contents are of type {@link hochschule.Student}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Student</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' containment reference list.
	 * @see hochschule.HochschulePackage#getHochschule_Student()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Student> getStudent();

} // Hochschule
