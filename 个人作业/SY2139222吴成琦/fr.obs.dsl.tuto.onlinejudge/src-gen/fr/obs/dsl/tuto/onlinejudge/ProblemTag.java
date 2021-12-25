/**
 */
package fr.obs.dsl.tuto.onlinejudge;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.ProblemTag#getID <em>ID</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.ProblemTag#getName <em>Name</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.ProblemTag#getColor <em>Color</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.ProblemTag#getProblem <em>Problem</em>}</li>
 * </ul>
 *
 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getProblemTag()
 * @model
 * @generated
 */
public interface ProblemTag extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getProblemTag_ID()
	 * @model
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.ProblemTag#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getProblemTag_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.ProblemTag#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getProblemTag_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link fr.obs.dsl.tuto.onlinejudge.ProblemTag#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Problem</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obs.dsl.tuto.onlinejudge.Problem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem</em>' containment reference list.
	 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getProblemTag_Problem()
	 * @model containment="true"
	 * @generated
	 */
	EList<Problem> getProblem();

} // ProblemTag
