/**
 */
package metaModelicaML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModelicaML.Variable#getVariableType <em>Variable Type</em>}</li>
 * </ul>
 *
 * @see metaModelicaML.MetaModelicaMLPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends parameter {
	/**
	 * Returns the value of the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Type</em>' attribute.
	 * @see #setVariableType(String)
	 * @see metaModelicaML.MetaModelicaMLPackage#getVariable_VariableType()
	 * @model
	 * @generated
	 */
	String getVariableType();

	/**
	 * Sets the value of the '{@link metaModelicaML.Variable#getVariableType <em>Variable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Type</em>' attribute.
	 * @see #getVariableType()
	 * @generated
	 */
	void setVariableType(String value);

} // Variable
