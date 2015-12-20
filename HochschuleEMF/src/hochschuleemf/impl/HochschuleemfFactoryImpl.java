/**
 */
package hochschuleemf.impl;

import hochschuleemf.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HochschuleemfFactoryImpl extends EFactoryImpl implements HochschuleemfFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HochschuleemfFactory init() {
		try {
			HochschuleemfFactory theHochschuleemfFactory = (HochschuleemfFactory)EPackage.Registry.INSTANCE.getEFactory(HochschuleemfPackage.eNS_URI);
			if (theHochschuleemfFactory != null) {
				return theHochschuleemfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HochschuleemfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HochschuleemfFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HochschuleemfPackage.HOCHSCHULE: return createHochschule();
			case HochschuleemfPackage.FACHBEREICH: return createFachbereich();
			case HochschuleemfPackage.STUDIENGANG: return createStudiengang();
			case HochschuleemfPackage.VORLESUNG: return createVorlesung();
			case HochschuleemfPackage.DOZENT: return createDozent();
			case HochschuleemfPackage.LEHRBEAUFTRAGTER: return createLehrbeauftragter();
			case HochschuleemfPackage.PROFESSOR: return createProfessor();
			case HochschuleemfPackage.STUDENT: return createStudent();
			case HochschuleemfPackage.EVALUATION: return createEvaluation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hochschule createHochschule() {
		HochschuleImpl hochschule = new HochschuleImpl();
		return hochschule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fachbereich createFachbereich() {
		FachbereichImpl fachbereich = new FachbereichImpl();
		return fachbereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Studiengang createStudiengang() {
		StudiengangImpl studiengang = new StudiengangImpl();
		return studiengang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vorlesung createVorlesung() {
		VorlesungImpl vorlesung = new VorlesungImpl();
		return vorlesung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dozent createDozent() {
		DozentImpl dozent = new DozentImpl();
		return dozent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lehrbeauftragter createLehrbeauftragter() {
		LehrbeauftragterImpl lehrbeauftragter = new LehrbeauftragterImpl();
		return lehrbeauftragter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor createProfessor() {
		ProfessorImpl professor = new ProfessorImpl();
		return professor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation createEvaluation() {
		EvaluationImpl evaluation = new EvaluationImpl();
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HochschuleemfPackage getHochschuleemfPackage() {
		return (HochschuleemfPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HochschuleemfPackage getPackage() {
		return HochschuleemfPackage.eINSTANCE;
	}

} //HochschuleemfFactoryImpl
