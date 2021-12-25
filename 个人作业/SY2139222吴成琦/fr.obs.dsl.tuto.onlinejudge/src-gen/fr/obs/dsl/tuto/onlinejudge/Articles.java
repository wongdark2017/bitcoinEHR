/**
 */
package fr.obs.dsl.tuto.onlinejudge;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Articles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.Articles#getID <em>ID</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.Articles#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.Articles#getContent <em>Content</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.Articles#getUser <em>User</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.Articles#getAdmin <em>Admin</em>}</li>
 * </ul>
 *
 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getArticles()
 * @model
 * @generated
 */
public interface Articles extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getArticles_ID()
	 * @model
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.Articles#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getArticles_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.Articles#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getArticles_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.Articles#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obs.dsl.tuto.onlinejudge.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference list.
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getArticles_User()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUser();

	/**
	 * Returns the value of the '<em><b>Admin</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obs.dsl.tuto.onlinejudge.Admin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin</em>' containment reference list.
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getArticles_Admin()
	 * @model containment="true"
	 * @generated
	 */
	EList<Admin> getAdmin();

} // Articles
