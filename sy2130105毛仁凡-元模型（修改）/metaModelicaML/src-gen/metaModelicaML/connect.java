/**
 */
package metaModelicaML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>connect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModelicaML.connect#getName <em>Name</em>}</li>
 *   <li>{@link metaModelicaML.connect#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see metaModelicaML.MetaModelicaMLPackage#getconnect()
 * @model
 * @generated
 */
public interface connect extends constraint {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metaModelicaML.MetaModelicaMLPackage#getconnect_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metaModelicaML.connect#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link metaModelicaML.port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see metaModelicaML.MetaModelicaMLPackage#getconnect_Port()
	 * @model upper="2"
	 * @generated
	 */
	EList<port> getPort();

} // connect
