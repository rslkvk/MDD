/**
 */
package hochschuleemf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hochschuleemf.HochschuleemfPackage
 * @generated
 */
public interface HochschuleemfFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HochschuleemfFactory eINSTANCE = hochschuleemf.impl.HochschuleemfFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hochschule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hochschule</em>'.
	 * @generated
	 */
	Hochschule createHochschule();

	/**
	 * Returns a new object of class '<em>Fachbereich</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fachbereich</em>'.
	 * @generated
	 */
	Fachbereich createFachbereich();

	/**
	 * Returns a new object of class '<em>Studiengang</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Studiengang</em>'.
	 * @generated
	 */
	Studiengang createStudiengang();

	/**
	 * Returns a new object of class '<em>Vorlesung</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vorlesung</em>'.
	 * @generated
	 */
	Vorlesung createVorlesung();

	/**
	 * Returns a new object of class '<em>Dozent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dozent</em>'.
	 * @generated
	 */
	Dozent createDozent();

	/**
	 * Returns a new object of class '<em>Lehrbeauftragter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lehrbeauftragter</em>'.
	 * @generated
	 */
	Lehrbeauftragter createLehrbeauftragter();

	/**
	 * Returns a new object of class '<em>Professor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professor</em>'.
	 * @generated
	 */
	Professor createProfessor();

	/**
	 * Returns a new object of class '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Student</em>'.
	 * @generated
	 */
	Student createStudent();

	/**
	 * Returns a new object of class '<em>Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation</em>'.
	 * @generated
	 */
	Evaluation createEvaluation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HochschuleemfPackage getHochschuleemfPackage();

} //HochschuleemfFactory