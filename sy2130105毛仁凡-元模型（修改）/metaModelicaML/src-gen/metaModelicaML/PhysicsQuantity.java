/**
 */
package metaModelicaML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physics Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModelicaML.PhysicsQuantity#getPhysicsProperty <em>Physics Property</em>}</li>
 * </ul>
 *
 * @see metaModelicaML.MetaModelicaMLPackage#getPhysicsQuantity()
 * @model
 * @generated
 */
public interface PhysicsQuantity extends parameter {
	/**
	 * Returns the value of the '<em><b>Physics Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physics Property</em>' attribute.
	 * @see #setPhysicsProperty(String)
	 * @see metaModelicaML.MetaModelicaMLPackage#getPhysicsQuantity_PhysicsProperty()
	 * @model
	 * @generated
	 */
	String getPhysicsProperty();

	/**
	 * Sets the value of the '{@link metaModelicaML.PhysicsQuantity#getPhysicsProperty <em>Physics Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physics Property</em>' attribute.
	 * @see #getPhysicsProperty()
	 * @generated
	 */
	void setPhysicsProperty(String value);

} // PhysicsQuantity
