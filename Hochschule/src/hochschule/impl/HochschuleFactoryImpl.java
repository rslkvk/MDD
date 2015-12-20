/**
 */
package hochschule.impl;

import hochschule.*;

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
public class HochschuleFactoryImpl extends EFactoryImpl implements HochschuleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HochschuleFactory init() {
		try {
			HochschuleFactory theHochschuleFactory = (HochschuleFactory)EPackage.Registry.INSTANCE.getEFactory(HochschulePackage.eNS_URI);
			if (theHochschuleFactory != null) {
				return theHochschuleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HochschuleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HochschuleFactoryImpl() {
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
			case HochschulePackage.HOCHSCHULE: return createHochschule();
			case HochschulePackage.FACHBEREICH: return createFachbereich();
			case HochschulePackage.STUDIENGANG: return createStudiengang();
			case HochschulePackage.VORLESUNG: return createVorlesung();
			case HochschulePackage.DOZENT: return createDozent();
			case HochschulePackage.LEHRBEAUFTRAGTER: return createLehrbeauftragter();
			case HochschulePackage.PROFESSOR: return createProfessor();
			case HochschulePackage.STUDENT: return createStudent();
			case HochschulePackage.EVALUATION: return createEvaluation();
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
	public HochschulePackage getHochschulePackage() {
		return (HochschulePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HochschulePackage getPackage() {
		return HochschulePackage.eINSTANCE;
	}

} //HochschuleFactoryImpl
