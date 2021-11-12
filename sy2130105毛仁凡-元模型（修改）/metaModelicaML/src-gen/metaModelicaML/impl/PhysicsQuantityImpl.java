/**
 */
package metaModelicaML.impl;

import metaModelicaML.MetaModelicaMLPackage;
import metaModelicaML.PhysicsQuantity;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physics Quantity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModelicaML.impl.PhysicsQuantityImpl#getPhysicsProperty <em>Physics Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicsQuantityImpl extends parameterImpl implements PhysicsQuantity {
	/**
	 * The default value of the '{@link #getPhysicsProperty() <em>Physics Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicsProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICS_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicsProperty() <em>Physics Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicsProperty()
	 * @generated
	 * @ordered
	 */
	protected String physicsProperty = PHYSICS_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicsQuantityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelicaMLPackage.Literals.PHYSICS_QUANTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhysicsProperty() {
		return physicsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicsProperty(String newPhysicsProperty) {
		String oldPhysicsProperty = physicsProperty;
		physicsProperty = newPhysicsProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MetaModelicaMLPackage.PHYSICS_QUANTITY__PHYSICS_PROPERTY, oldPhysicsProperty, physicsProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaModelicaMLPackage.PHYSICS_QUANTITY__PHYSICS_PROPERTY:
			return getPhysicsProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetaModelicaMLPackage.PHYSICS_QUANTITY__PHYSICS_PROPERTY:
			setPhysicsProperty((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetaModelicaMLPackage.PHYSICS_QUANTITY__PHYSICS_PROPERTY:
			setPhysicsProperty(PHYSICS_PROPERTY_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetaModelicaMLPackage.PHYSICS_QUANTITY__PHYSICS_PROPERTY:
			return PHYSICS_PROPERTY_EDEFAULT == null ? physicsProperty != null
					: !PHYSICS_PROPERTY_EDEFAULT.equals(physicsProperty);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (physicsProperty: ");
		result.append(physicsProperty);
		result.append(')');
		return result.toString();
	}

} //PhysicsQuantityImpl
