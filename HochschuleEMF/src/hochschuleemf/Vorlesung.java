/**
 */
package hochschuleemf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vorlesung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hochschuleemf.Vorlesung#getTutor <em>Tutor</em>}</li>
 *   <li>{@link hochschuleemf.Vorlesung#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link hochschuleemf.Vorlesung#getDozent <em>Dozent</em>}</li>
 *   <li>{@link hochschuleemf.Vorlesung#getName <em>Name</em>}</li>
 *   <li>{@link hochschuleemf.Vorlesung#getModulNr <em>Modul Nr</em>}</li>
 *   <li>{@link hochschuleemf.Vorlesung#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link hochschuleemf.Vorlesung#getCrP <em>Cr P</em>}</li>
 *   <li>{@link hochschuleemf.Vorlesung#getStudent <em>Student</em>}</li>
 * </ul>
 *
 * @see hochschuleemf.HochschuleemfPackage#getVorlesung()
 * @model
 * @generated
 */
public interface Vorlesung extends EObject {
	/**
	 * Returns the value of the '<em><b>Tutor</b></em>' reference list.
	 * The list contents are of type {@link hochschuleemf.Student}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tutor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tutor</em>' reference list.
	 * @see hochschuleemf.HochschuleemfPackage#getVorlesung_Tutor()
	 * @model required="true"
	 * @generated
	 */
	EList<Student> getTutor();

	/**
	 * Returns the value of the '<em><b>Evaluation</b></em>' containment reference list.
	 * The list contents are of type {@link hochschuleemf.Evaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation</em>' containment reference list.
	 * @see hochschuleemf.HochschuleemfPackage#getVorlesung_Evaluation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Evaluation> getEvaluation();

	/**
	 * Returns the value of the '<em><b>Dozent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hochschuleemf.Dozent#getVorlesung <em>Vorlesung</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dozent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dozent</em>' reference.
	 * @see #setDozent(Dozent)
	 * @see hochschuleemf.HochschuleemfPackage#getVorlesung_Dozent()
	 * @see hochschuleemf.Dozent#getVorlesung
	 * @model opposite="vorlesung" required="true"
	 * @generated
	 */
	Dozent getDozent();

	/**
	 * Sets the value of the '{@link hochschuleemf.Vorlesung#getDozent <em>Dozent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dozent</em>' reference.
	 * @see #getDozent()
	 * @generated
	 */
	void setDozent(Dozent value);

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
	 * @see hochschuleemf.HochschuleemfPackage#getVorlesung_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hochschuleemf.Vorlesung#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Modul Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modul Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modul Nr</em>' attribute.
	 * @see #setModulNr(String)
	 * @see hochschuleemf.HochschuleemfPackage#getVorlesung_ModulNr()
	 * @model
	 * @generated
	 */
	String getModulNr();

	/**
	 * Sets the value of the '{@link hochschuleemf.Vorlesung#getModulNr <em>Modul Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modul Nr</em>' attribute.
	 * @see #getModulNr()
	 * @generated
	 */
	void setModulNr(String value);

	/**
	 * Returns the value of the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beschreibung</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beschreibung</em>' attribute.
	 * @see #setBeschreibung(String)
	 * @see hochschuleemf.HochschuleemfPackage#getVorlesung_Beschreibung()
	 * @model
	 * @generated
	 */
	String getBeschreibung();

	/**
	 * Sets the value of the '{@link hochschuleemf.Vorlesung#getBeschreibung <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beschreibung</em>' attribute.
	 * @see #getBeschreibung()
	 * @generated
	 */
	void setBeschreibung(String value);

	/**
	 * Returns the value of the '<em><b>Cr P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cr P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cr P</em>' attribute.
	 * @see #setCrP(String)
	 * @see hochschuleemf.HochschuleemfPackage#getVorlesung_CrP()
	 * @model
	 * @generated
	 */
	String getCrP();

	/**
	 * Sets the value of the '{@link hochschuleemf.Vorlesung#getCrP <em>Cr P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cr P</em>' attribute.
	 * @see #getCrP()
	 * @generated
	 */
	void setCrP(String value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' reference list.
	 * The list contents are of type {@link hochschuleemf.Student}.
	 * It is bidirectional and its opposite is '{@link hochschuleemf.Student#getVorlesung <em>Vorlesung</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Student</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' reference list.
	 * @see hochschuleemf.HochschuleemfPackage#getVorlesung_Student()
	 * @see hochschuleemf.Student#getVorlesung
	 * @model opposite="vorlesung" lower="5"
	 * @generated
	 */
	EList<Student> getStudent();

} // Vorlesung
