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
public class HmodelFactoryImpl extends EFactoryImpl implements HmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HmodelFactory init() {
		try {
			HmodelFactory theHmodelFactory = (HmodelFactory)EPackage.Registry.INSTANCE.getEFactory(HmodelPackage.eNS_URI);
			if (theHmodelFactory != null) {
				return theHmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HmodelFactoryImpl() {
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
			case HmodelPackage.HOCHSCHULE: return createHochschule();
			case HmodelPackage.FACHBEREICH: return createFachbereich();
			case HmodelPackage.STUDIENGANG: return createStudiengang();
			case HmodelPackage.VORLESUNG: return createVorlesung();
			case HmodelPackage.DOZENT: return createDozent();
			case HmodelPackage.LEHRBEAUFTRAGTER: return createLehrbeauftragter();
			case HmodelPackage.PROFESSOR: return createProfessor();
			case HmodelPackage.STUDENT: return createStudent();
			case HmodelPackage.EVALUATION: return createEvaluation();
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
	public HmodelPackage getHmodelPackage() {
		return (HmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HmodelPackage getPackage() {
		return HmodelPackage.eINSTANCE;
	}

} //HmodelFactoryImpl
