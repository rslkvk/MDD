/**
 */
package hochschule.tests;

import hochschule.HochschuleFactory;
import hochschule.Studiengang;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Studiengang</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudiengangTest extends TestCase {

	/**
	 * The fixture for this Studiengang test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Studiengang fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StudiengangTest.class);
	}

	/**
	 * Constructs a new Studiengang test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudiengangTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Studiengang test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Studiengang fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Studiengang test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Studiengang getFixture() {
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
		setFixture(HochschuleFactory.eINSTANCE.createStudiengang());
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

} //StudiengangTest
