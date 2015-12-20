/**
 */
package hochschuleemf;

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
 *   <li>{@link hochschuleemf.Studiengang#getVorlesung <em>Vorlesung</em>}</li>
 *   <li>{@link hochschuleemf.Studiengang#getName <em>Name</em>}</li>
 *   <li>{@link hochschuleemf.Studiengang#getNC <em>NC</em>}</li>
 *   <li>{@link hochschuleemf.Studiengang#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @see hochschuleemf.HochschuleemfPackage#getStudiengang()
 * @model annotation="gmf.node label='Name'"
 * @generated
 */
public interface Studiengang extends EObject {
	/**
	 * Returns the value of the '<em><b>Vorlesung</b></em>' containment reference list.
	 * The list contents are of type {@link hochschuleemf.Vorlesung}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vorlesung</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vorlesung</em>' containment reference list.
	 * @see hochschuleemf.HochschuleemfPackage#getStudiengang_Vorlesung()
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
	 * @see hochschuleemf.HochschuleemfPackage#getStudiengang_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hochschuleemf.Studiengang#getName <em>Name</em>}' attribute.
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
	 * @see hochschuleemf.HochschuleemfPackage#getStudiengang_NC()
	 * @model
	 * @generated
	 */
	String getNC();

	/**
	 * Sets the value of the '{@link hochschuleemf.Studiengang#getNC <em>NC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NC</em>' attribute.
	 * @see #getNC()
	 * @generated
	 */
	void setNC(String value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' reference list.
	 * The list contents are of type {@link hochschuleemf.Student}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Student</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' reference list.
	 * @see hochschuleemf.HochschuleemfPackage#getStudiengang_Student()
	 * @model required="true"
	 * @generated
	 */
	EList<Student> getStudent();

} // Studiengang
