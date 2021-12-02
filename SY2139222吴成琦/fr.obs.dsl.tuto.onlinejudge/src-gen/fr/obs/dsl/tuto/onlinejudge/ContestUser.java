/**
 */
package fr.obs.dsl.tuto.onlinejudge;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contest User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.ContestUser#getContest_id <em>Contest id</em>}</li>
 * </ul>
 *
 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getContestUser()
 * @model
 * @generated
 */
public interface ContestUser extends User {
	/**
	 * Returns the value of the '<em><b>Contest id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contest id</em>' attribute.
	 * @see #setContest_id(int)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getContestUser_Contest_id()
	 * @model
	 * @generated
	 */
	int getContest_id();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.ContestUser#getContest_id <em>Contest id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contest id</em>' attribute.
	 * @see #getContest_id()
	 * @generated
	 */
	void setContest_id(int value);

} // ContestUser
