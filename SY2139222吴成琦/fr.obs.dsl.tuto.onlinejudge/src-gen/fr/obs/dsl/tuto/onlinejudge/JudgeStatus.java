/**
 */
package fr.obs.dsl.tuto.onlinejudge;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Judge Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getId <em>Id</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getCode <em>Code</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getLanguage <em>Language</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getUser_id <em>User id</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getProblem_id <em>Problem id</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getJudgeStatus()
 * @model abstract="true"
 * @generated
 */
public interface JudgeStatus extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getJudgeStatus_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getJudgeStatus_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getJudgeStatus_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>User id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User id</em>' attribute.
	 * @see #setUser_id(int)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getJudgeStatus_User_id()
	 * @model
	 * @generated
	 */
	int getUser_id();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getUser_id <em>User id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User id</em>' attribute.
	 * @see #getUser_id()
	 * @generated
	 */
	void setUser_id(int value);

	/**
	 * Returns the value of the '<em><b>Problem id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem id</em>' attribute.
	 * @see #setProblem_id(int)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getJudgeStatus_Problem_id()
	 * @model
	 * @generated
	 */
	int getProblem_id();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getProblem_id <em>Problem id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem id</em>' attribute.
	 * @see #getProblem_id()
	 * @generated
	 */
	void setProblem_id(int value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obs.dsl.tuto.onlinejudge.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference list.
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getJudgeStatus_User()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUser();

} // JudgeStatus
