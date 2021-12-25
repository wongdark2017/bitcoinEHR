/**
 */
package fr.obs.dsl.tuto.onlinejudge;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.Admin#isIsadmin <em>Isadmin</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.Admin#getArticles <em>Articles</em>}</li>
 * </ul>
 *
 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getAdmin()
 * @model
 * @generated
 */
public interface Admin extends User {
	/**
	 * Returns the value of the '<em><b>Isadmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isadmin</em>' attribute.
	 * @see #setIsadmin(boolean)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getAdmin_Isadmin()
	 * @model
	 * @generated
	 */
	boolean isIsadmin();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.Admin#isIsadmin <em>Isadmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isadmin</em>' attribute.
	 * @see #isIsadmin()
	 * @generated
	 */
	void setIsadmin(boolean value);

	/**
	 * Returns the value of the '<em><b>Articles</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obs.dsl.tuto.onlinejudge.Articles}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Articles</em>' containment reference list.
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getAdmin_Articles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Articles> getArticles();

} // Admin
