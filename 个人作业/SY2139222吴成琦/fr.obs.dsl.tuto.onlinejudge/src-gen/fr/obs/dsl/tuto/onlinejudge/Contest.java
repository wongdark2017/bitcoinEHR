/**
 */
package fr.obs.dsl.tuto.onlinejudge;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.Contest#getId <em>Id</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.Contest#getName <em>Name</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.Contest#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getContest()
 * @model
 * @generated
 */
public interface Contest extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getContest_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.Contest#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getContest_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.Contest#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obs.dsl.tuto.onlinejudge.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference list.
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getContest_User()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUser();

} // Contest
