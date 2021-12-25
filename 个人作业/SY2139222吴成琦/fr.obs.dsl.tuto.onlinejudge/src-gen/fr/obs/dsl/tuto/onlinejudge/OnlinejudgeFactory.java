/**
 */
package fr.obs.dsl.tuto.onlinejudge;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage
 * @generated
 */
public interface OnlinejudgeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OnlinejudgeFactory eINSTANCE = fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem</em>'.
	 * @generated
	 */
	Problem createProblem();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Articles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Articles</em>'.
	 * @generated
	 */
	Articles createArticles();

	/**
	 * Returns a new object of class '<em>Admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admin</em>'.
	 * @generated
	 */
	Admin createAdmin();

	/**
	 * Returns a new object of class '<em>Contest User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contest User</em>'.
	 * @generated
	 */
	ContestUser createContestUser();

	/**
	 * Returns a new object of class '<em>Contest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contest</em>'.
	 * @generated
	 */
	Contest createContest();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Problem Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem Tag</em>'.
	 * @generated
	 */
	ProblemTag createProblemTag();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OnlinejudgePackage getOnlinejudgePackage();

} //OnlinejudgeFactory
