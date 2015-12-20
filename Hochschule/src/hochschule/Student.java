/**
 */
package hochschule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hochschule.Student#getMatrikelNr <em>Matrikel Nr</em>}</li>
 *   <li>{@link hochschule.Student#getVorname <em>Vorname</em>}</li>
 *   <li>{@link hochschule.Student#getNachname <em>Nachname</em>}</li>
 *   <li>{@link hochschule.Student#getVorlesung <em>Vorlesung</em>}</li>
 * </ul>
 *
 * @see hochschule.HochschulePackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Matrikel Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matrikel Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrikel Nr</em>' attribute.
	 * @see #setMatrikelNr(String)
	 * @see hochschule.HochschulePackage#getStudent_MatrikelNr()
	 * @model id="true"
	 * @generated
	 */
	String getMatrikelNr();

	/**
	 * Sets the value of the '{@link hochschule.Student#getMatrikelNr <em>Matrikel Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrikel Nr</em>' attribute.
	 * @see #getMatrikelNr()
	 * @generated
	 */
	void setMatrikelNr(String value);

	/**
	 * Returns the value of the '<em><b>Vorname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vorname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vorname</em>' attribute.
	 * @see #setVorname(String)
	 * @see hochschule.HochschulePackage#getStudent_Vorname()
	 * @model
	 * @generated
	 */
	String getVorname();

	/**
	 * Sets the value of the '{@link hochschule.Student#getVorname <em>Vorname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vorname</em>' attribute.
	 * @see #getVorname()
	 * @generated
	 */
	void setVorname(String value);

	/**
	 * Returns the value of the '<em><b>Nachname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nachname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nachname</em>' attribute.
	 * @see #setNachname(String)
	 * @see hochschule.HochschulePackage#getStudent_Nachname()
	 * @model
	 * @generated
	 */
	String getNachname();

	/**
	 * Sets the value of the '{@link hochschule.Student#getNachname <em>Nachname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachname</em>' attribute.
	 * @see #getNachname()
	 * @generated
	 */
	void setNachname(String value);

	/**
	 * Returns the value of the '<em><b>Vorlesung</b></em>' reference list.
	 * The list contents are of type {@link hochschule.Vorlesung}.
	 * It is bidirectional and its opposite is '{@link hochschule.Vorlesung#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vorlesung</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vorlesung</em>' reference list.
	 * @see hochschule.HochschulePackage#getStudent_Vorlesung()
	 * @see hochschule.Vorlesung#getStudent
	 * @model opposite="student"
	 * @generated
	 */
	EList<Vorlesung> getVorlesung();

} // Student
