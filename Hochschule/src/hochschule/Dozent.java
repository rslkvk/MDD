/**
 */
package hochschule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dozent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hochschule.Dozent#getVorlesung <em>Vorlesung</em>}</li>
 *   <li>{@link hochschule.Dozent#getPersonalNr <em>Personal Nr</em>}</li>
 *   <li>{@link hochschule.Dozent#getVorname <em>Vorname</em>}</li>
 *   <li>{@link hochschule.Dozent#getNachname <em>Nachname</em>}</li>
 * </ul>
 *
 * @see hochschule.HochschulePackage#getDozent()
 * @model
 * @generated
 */
public interface Dozent extends EObject {
	/**
	 * Returns the value of the '<em><b>Vorlesung</b></em>' reference list.
	 * The list contents are of type {@link hochschule.Vorlesung}.
	 * It is bidirectional and its opposite is '{@link hochschule.Vorlesung#getDozent <em>Dozent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vorlesung</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vorlesung</em>' reference list.
	 * @see hochschule.HochschulePackage#getDozent_Vorlesung()
	 * @see hochschule.Vorlesung#getDozent
	 * @model opposite="dozent" required="true"
	 * @generated
	 */
	EList<Vorlesung> getVorlesung();

	/**
	 * Returns the value of the '<em><b>Personal Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personal Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Nr</em>' attribute.
	 * @see #setPersonalNr(String)
	 * @see hochschule.HochschulePackage#getDozent_PersonalNr()
	 * @model id="true"
	 * @generated
	 */
	String getPersonalNr();

	/**
	 * Sets the value of the '{@link hochschule.Dozent#getPersonalNr <em>Personal Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Nr</em>' attribute.
	 * @see #getPersonalNr()
	 * @generated
	 */
	void setPersonalNr(String value);

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
	 * @see hochschule.HochschulePackage#getDozent_Vorname()
	 * @model
	 * @generated
	 */
	String getVorname();

	/**
	 * Sets the value of the '{@link hochschule.Dozent#getVorname <em>Vorname</em>}' attribute.
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
	 * @see hochschule.HochschulePackage#getDozent_Nachname()
	 * @model
	 * @generated
	 */
	String getNachname();

	/**
	 * Sets the value of the '{@link hochschule.Dozent#getNachname <em>Nachname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachname</em>' attribute.
	 * @see #getNachname()
	 * @generated
	 */
	void setNachname(String value);

} // Dozent
