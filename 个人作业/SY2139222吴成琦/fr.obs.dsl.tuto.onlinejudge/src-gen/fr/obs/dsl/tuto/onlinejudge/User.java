/**
 */
package fr.obs.dsl.tuto.onlinejudge;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.User#getID <em>ID</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.User#getUsername <em>Username</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.User#getAc_num <em>Ac num</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.User#getSubmit_num <em>Submit num</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.User#getProblem <em>Problem</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.User#getContest <em>Contest</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.User#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getUser_ID()
	 * @model
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.User#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getUser_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.User#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Ac num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ac num</em>' attribute.
	 * @see #setAc_num(int)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getUser_Ac_num()
	 * @model
	 * @generated
	 */
	int getAc_num();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.User#getAc_num <em>Ac num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ac num</em>' attribute.
	 * @see #getAc_num()
	 * @generated
	 */
	void setAc_num(int value);

	/**
	 * Returns the value of the '<em><b>Submit num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submit num</em>' attribute.
	 * @see #setSubmit_num(int)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getUser_Submit_num()
	 * @model
	 * @generated
	 */
	int getSubmit_num();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.User#getSubmit_num <em>Submit num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submit num</em>' attribute.
	 * @see #getSubmit_num()
	 * @generated
	 */
	void setSubmit_num(int value);

	/**
	 * Returns the value of the '<em><b>Problem</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obs.dsl.tuto.onlinejudge.Problem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem</em>' containment reference list.
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getUser_Problem()
	 * @model containment="true"
	 * @generated
	 */
	EList<Problem> getProblem();

	/**
	 * Returns the value of the '<em><b>Contest</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obs.dsl.tuto.onlinejudge.Contest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contest</em>' containment reference list.
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getUser_Contest()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contest> getContest();

	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obs.dsl.tuto.onlinejudge.File}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' containment reference list.
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getUser_File()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFile();

} // User
