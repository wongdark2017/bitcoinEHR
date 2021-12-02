/**
 */
package fr.obs.dsl.tuto.onlinejudge.util;

import fr.obs.dsl.tuto.onlinejudge.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage
 * @generated
 */
public class OnlinejudgeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OnlinejudgePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnlinejudgeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OnlinejudgePackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnlinejudgeSwitch<Adapter> modelSwitch = new OnlinejudgeSwitch<Adapter>() {
		@Override
		public Adapter caseProblem(Problem object) {
			return createProblemAdapter();
		}

		@Override
		public Adapter caseUser(User object) {
			return createUserAdapter();
		}

		@Override
		public Adapter caseJudgeStatus(JudgeStatus object) {
			return createJudgeStatusAdapter();
		}

		@Override
		public Adapter caseArticles(Articles object) {
			return createArticlesAdapter();
		}

		@Override
		public Adapter caseAdmin(Admin object) {
			return createAdminAdapter();
		}

		@Override
		public Adapter caseContestUser(ContestUser object) {
			return createContestUserAdapter();
		}

		@Override
		public Adapter caseContest(Contest object) {
			return createContestAdapter();
		}

		@Override
		public Adapter caseFile(File object) {
			return createFileAdapter();
		}

		@Override
		public Adapter caseProblemTag(ProblemTag object) {
			return createProblemTagAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obs.dsl.tuto.onlinejudge.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obs.dsl.tuto.onlinejudge.Problem
	 * @generated
	 */
	public Adapter createProblemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obs.dsl.tuto.onlinejudge.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obs.dsl.tuto.onlinejudge.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus <em>Judge Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obs.dsl.tuto.onlinejudge.JudgeStatus
	 * @generated
	 */
	public Adapter createJudgeStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obs.dsl.tuto.onlinejudge.Articles <em>Articles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obs.dsl.tuto.onlinejudge.Articles
	 * @generated
	 */
	public Adapter createArticlesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obs.dsl.tuto.onlinejudge.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obs.dsl.tuto.onlinejudge.Admin
	 * @generated
	 */
	public Adapter createAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obs.dsl.tuto.onlinejudge.ContestUser <em>Contest User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obs.dsl.tuto.onlinejudge.ContestUser
	 * @generated
	 */
	public Adapter createContestUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obs.dsl.tuto.onlinejudge.Contest <em>Contest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obs.dsl.tuto.onlinejudge.Contest
	 * @generated
	 */
	public Adapter createContestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obs.dsl.tuto.onlinejudge.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obs.dsl.tuto.onlinejudge.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.obs.dsl.tuto.onlinejudge.ProblemTag <em>Problem Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.obs.dsl.tuto.onlinejudge.ProblemTag
	 * @generated
	 */
	public Adapter createProblemTagAdapter() {
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

} //OnlinejudgeAdapterFactory
