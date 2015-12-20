/**
 */
package hochschuleemf.tests;

import hochschuleemf.Fachbereich;
import hochschuleemf.HochschuleemfFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fachbereich</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FachbereichTest extends TestCase {

	/**
	 * The fixture for this Fachbereich test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fachbereich fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FachbereichTest.class);
	}

	/**
	 * Constructs a new Fachbereich test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FachbereichTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Fachbereich test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Fachbereich fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Fachbereich test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fachbereich getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HochschuleemfFactory.eINSTANCE.createFachbereich());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FachbereichTest
