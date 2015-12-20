/**
 */
package hochschule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fachbereich</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hochschule.Fachbereich#getStudiengang <em>Studiengang</em>}</li>
 *   <li>{@link hochschule.Fachbereich#getVorlesung <em>Vorlesung</em>}</li>
 *   <li>{@link hochschule.Fachbereich#getDozent <em>Dozent</em>}</li>
 *   <li>{@link hochschule.Fachbereich#getName <em>Name</em>}</li>
 *   <li>{@link hochschule.Fachbereich#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see hochschule.HochschulePackage#getFachbereich()
 * @model
 * @generated
 */
public interface Fachbereich extends EObject {
	/**
	 * Returns the value of the '<em><b>Studiengang</b></em>' containment reference list.
	 * The list contents are of type {@link hochschule.Studiengang}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Studiengang</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studiengang</em>' containment reference list.
	 * @see hochschule.HochschulePackage#getFachbereich_Studiengang()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Studiengang> getStudiengang();

	/**
	 * Returns the value of the '<em><b>Vorlesung</b></em>' reference list.
	 * The list contents are of type {@link hochschule.Vorlesung}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vorlesung</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vorlesung</em>' reference list.
	 * @see hochschule.HochschulePackage#getFachbereich_Vorlesung()
	 * @model
	 * @generated
	 */
	EList<Vorlesung> getVorlesung();

	/**
	 * Returns the value of the '<em><b>Dozent</b></em>' containment reference list.
	 * The list contents are of type {@link hochschule.Dozent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dozent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dozent</em>' containment reference list.
	 * @see hochschule.HochschulePackage#getFachbereich_Dozent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Dozent> getDozent();

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
	 * @see hochschule.HochschulePackage#getFachbereich_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hochschule.Fachbereich#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see hochschule.HochschulePackage#getFachbereich_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link hochschule.Fachbereich#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

} // Fachbereich
