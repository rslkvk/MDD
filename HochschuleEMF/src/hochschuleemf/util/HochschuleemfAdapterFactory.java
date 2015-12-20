/**
 */
package hochschuleemf.util;

import hochschuleemf.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hochschuleemf.HochschuleemfPackage
 * @generated
 */
public class HochschuleemfAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HochschuleemfPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HochschuleemfAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HochschuleemfPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HochschuleemfSwitch<Adapter> modelSwitch =
		new HochschuleemfSwitch<Adapter>() {
			@Override
			public Adapter caseHochschule(Hochschule object) {
				return createHochschuleAdapter();
			}
			@Override
			public Adapter caseFachbereich(Fachbereich object) {
				return createFachbereichAdapter();
			}
			@Override
			public Adapter caseStudiengang(Studiengang object) {
				return createStudiengangAdapter();
			}
			@Override
			public Adapter caseVorlesung(Vorlesung object) {
				return createVorlesungAdapter();
			}
			@Override
			public Adapter caseDozent(Dozent object) {
				return createDozentAdapter();
			}
			@Override
			public Adapter caseLehrbeauftragter(Lehrbeauftragter object) {
				return createLehrbeauftragterAdapter();
			}
			@Override
			public Adapter caseProfessor(Professor object) {
				return createProfessorAdapter();
			}
			@Override
			public Adapter caseStudent(Student object) {
				return createStudentAdapter();
			}
			@Override
			public Adapter caseEvaluation(Evaluation object) {
				return createEvaluationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hochschuleemf.Hochschule <em>Hochschule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hochschuleemf.Hochschule
	 * @generated
	 */
	public Adapter createHochschuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hochschuleemf.Fachbereich <em>Fachbereich</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hochschuleemf.Fachbereich
	 * @generated
	 */
	public Adapter createFachbereichAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hochschuleemf.Studiengang <em>Studiengang</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hochschuleemf.Studiengang
	 * @generated
	 */
	public Adapter createStudiengangAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hochschuleemf.Vorlesung <em>Vorlesung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hochschuleemf.Vorlesung
	 * @generated
	 */
	public Adapter createVorlesungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hochschuleemf.Dozent <em>Dozent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hochschuleemf.Dozent
	 * @generated
	 */
	public Adapter createDozentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hochschuleemf.Lehrbeauftragter <em>Lehrbeauftragter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hochschuleemf.Lehrbeauftragter
	 * @generated
	 */
	public Adapter createLehrbeauftragterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hochschuleemf.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hochschuleemf.Professor
	 * @generated
	 */
	public Adapter createProfessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hochschuleemf.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hochschuleemf.Student
	 * @generated
	 */
	public Adapter createStudentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hochschuleemf.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hochschuleemf.Evaluation
	 * @generated
	 */
	public Adapter createEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HochschuleemfAdapterFactory
