/**
 */
package hochschule.tests;

import hochschule.HochschuleFactory;
import hochschule.Vorlesung;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vorlesung</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VorlesungTest extends TestCase {

	/**
	 * The fixture for this Vorlesung test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vorlesung fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VorlesungTest.class);
	}

	/**
	 * Constructs a new Vorlesung test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VorlesungTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Vorlesung test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Vorlesung fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Vorlesung test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Vorlesung getFixture() {
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
		setFixture(HochschuleFactory.eINSTANCE.createVorlesung());
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

} //VorlesungTest
