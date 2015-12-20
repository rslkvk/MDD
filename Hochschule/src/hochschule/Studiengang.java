/**
 */
package hochschule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Studiengang</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hochschule.Studiengang#getVorlesung <em>Vorlesung</em>}</li>
 *   <li>{@link hochschule.Studiengang#getName <em>Name</em>}</li>
 *   <li>{@link hochschule.Studiengang#getNC <em>NC</em>}</li>
 *   <li>{@link hochschule.Studiengang#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @see hochschule.HochschulePackage#getStudiengang()
 * @model
 * @generated
 */
public interface Studiengang extends EObject {
	/**
	 * Returns the value of the '<em><b>Vorlesung</b></em>' containment reference list.
	 * The list contents are of type {@link hochschule.Vorlesung}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vorlesung</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vorlesung</em>' containment reference list.
	 * @see hochschule.HochschulePackage#getStudiengang_Vorlesung()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Vorlesung> getVorlesung();

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
	 * @see hochschule.HochschulePackage#getStudiengang_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hochschule.Studiengang#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>NC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NC</em>' attribute.
	 * @see #setNC(String)
	 * @see hochschule.HochschulePackage#getStudiengang_NC()
	 * @model
	 * @generated
	 */
	String getNC();

	/**
	 * Sets the value of the '{@link hochschule.Studiengang#getNC <em>NC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NC</em>' attribute.
	 * @see #getNC()
	 * @generated
	 */
	void setNC(String value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' reference list.
	 * The list contents are of type {@link hochschule.Student}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Student</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' reference list.
	 * @see hochschule.HochschulePackage#getStudiengang_Student()
	 * @model required="true"
	 * @generated
	 */
	EList<Student> getStudent();

} // Studiengang
