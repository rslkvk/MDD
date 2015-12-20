/**
 */
package hochschuleemf.tests;

import hochschuleemf.HochschuleemfFactory;
import hochschuleemf.Lehrbeauftragter;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lehrbeauftragter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LehrbeauftragterTest extends DozentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LehrbeauftragterTest.class);
	}

	/**
	 * Constructs a new Lehrbeauftragter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LehrbeauftragterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Lehrbeauftragter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Lehrbeauftragter getFixture() {
		return (Lehrbeauftragter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HochschuleemfFactory.eINSTANCE.createLehrbeauftragter());
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

} //LehrbeauftragterTest
