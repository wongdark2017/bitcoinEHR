/**
 */
package metaModelicaML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModelicaML.port#getName <em>Name</em>}</li>
 *   <li>{@link metaModelicaML.port#getConnected <em>Connected</em>}</li>
 * </ul>
 *
 * @see metaModelicaML.MetaModelicaMLPackage#getport()
 * @model
 * @generated
 */
public interface port extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metaModelicaML.MetaModelicaMLPackage#getport_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metaModelicaML.port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connected</b></em>' reference list.
	 * The list contents are of type {@link metaModelicaML.parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' reference list.
	 * @see metaModelicaML.MetaModelicaMLPackage#getport_Connected()
	 * @model
	 * @generated
	 */
	EList<parameter> getConnected();

} // port
