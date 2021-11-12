/**
 */
package metaModelicaML.impl;

import java.util.Collection;

import metaModelicaML.MetaModelicaMLPackage;
import metaModelicaML.ModelicaModel;
import metaModelicaML.constraint;
import metaModelicaML.parameter;
import metaModelicaML.port;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modelica Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModelicaML.impl.ModelicaModelImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link metaModelicaML.impl.ModelicaModelImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link metaModelicaML.impl.ModelicaModelImpl#getExtend <em>Extend</em>}</li>
 *   <li>{@link metaModelicaML.impl.ModelicaModelImpl#getPrototype <em>Prototype</em>}</li>
 *   <li>{@link metaModelicaML.impl.ModelicaModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link metaModelicaML.impl.ModelicaModelImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link metaModelicaML.impl.ModelicaModelImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelicaModelImpl extends MinimalEObjectImpl.Container implements ModelicaModel {
	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<constraint> constraint;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelicaModel> component;

	/**
	 * The cached value of the '{@link #getExtend() <em>Extend</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtend()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelicaModel> extend;

	/**
	 * The cached value of the '{@link #getPrototype() <em>Prototype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrototype()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelicaModel> prototype;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<parameter> parameter;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<port> port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelicaModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelicaMLPackage.Literals.MODELICA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<constraint>(constraint.class, this,
					MetaModelicaMLPackage.MODELICA_MODEL__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelicaModel> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<ModelicaModel>(ModelicaModel.class, this,
					MetaModelicaMLPackage.MODELICA_MODEL__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelicaModel> getExtend() {
		if (extend == null) {
			extend = new EObjectWithInverseResolvingEList.ManyInverse<ModelicaModel>(ModelicaModel.class, this,
					MetaModelicaMLPackage.MODELICA_MODEL__EXTEND, MetaModelicaMLPackage.MODELICA_MODEL__PROTOTYPE);
		}
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelicaModel> getPrototype() {
		if (prototype == null) {
			prototype = new EObjectWithInverseResolvingEList.ManyInverse<ModelicaModel>(ModelicaModel.class, this,
					MetaModelicaMLPackage.MODELICA_MODEL__PROTOTYPE, MetaModelicaMLPackage.MODELICA_MODEL__EXTEND);
		}
		return prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelicaMLPackage.MODELICA_MODEL__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<parameter>(parameter.class, this,
					MetaModelicaMLPackage.MODELICA_MODEL__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<port>(port.class, this, MetaModelicaMLPackage.MODELICA_MODEL__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModelicaMLPackage.MODELICA_MODEL__EXTEND:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getExtend()).basicAdd(otherEnd, msgs);
		case MetaModelicaMLPackage.MODELICA_MODEL__PROTOTYPE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPrototype()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaModelicaMLPackage.MODELICA_MODEL__CONSTRAINT:
			return ((InternalEList<?>) getConstraint()).basicRemove(otherEnd, msgs);
		case MetaModelicaMLPackage.MODELICA_MODEL__COMPONENT:
			return ((InternalEList<?>) getComponent()).basicRemove(otherEnd, msgs);
		case MetaModelicaMLPackage.MODELICA_MODEL__EXTEND:
			return ((InternalEList<?>) getExtend()).basicRemove(otherEnd, msgs);
		case MetaModelicaMLPackage.MODELICA_MODEL__PROTOTYPE:
			return ((InternalEList<?>) getPrototype()).basicRemove(otherEnd, msgs);
		case MetaModelicaMLPackage.MODELICA_MODEL__PARAMETER:
			return ((InternalEList<?>) getParameter()).basicRemove(otherEnd, msgs);
		case MetaModelicaMLPackage.MODELICA_MODEL__PORT:
			return ((InternalEList<?>) getPort()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaModelicaMLPackage.MODELICA_MODEL__CONSTRAINT:
			return getConstraint();
		case MetaModelicaMLPackage.MODELICA_MODEL__COMPONENT:
			return getComponent();
		case MetaModelicaMLPackage.MODELICA_MODEL__EXTEND:
			return getExtend();
		case MetaModelicaMLPackage.MODELICA_MODEL__PROTOTYPE:
			return getPrototype();
		case MetaModelicaMLPackage.MODELICA_MODEL__NAME:
			return getName();
		case MetaModelicaMLPackage.MODELICA_MODEL__PARAMETER:
			return getParameter();
		case MetaModelicaMLPackage.MODELICA_MODEL__PORT:
			return getPort();
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
		case MetaModelicaMLPackage.MODELICA_MODEL__CONSTRAINT:
			getConstraint().clear();
			getConstraint().addAll((Collection<? extends constraint>) newValue);
			return;
		case MetaModelicaMLPackage.MODELICA_MODEL__COMPONENT:
			getComponent().clear();
			getComponent().addAll((Collection<? extends ModelicaModel>) newValue);
			return;
		case MetaModelicaMLPackage.MODELICA_MODEL__EXTEND:
			getExtend().clear();
			getExtend().addAll((Collection<? extends ModelicaModel>) newValue);
			return;
		case MetaModelicaMLPackage.MODELICA_MODEL__PROTOTYPE:
			getPrototype().clear();
			getPrototype().addAll((Collection<? extends ModelicaModel>) newValue);
			return;
		case MetaModelicaMLPackage.MODELICA_MODEL__NAME:
			setName((String) newValue);
			return;
		case MetaModelicaMLPackage.MODELICA_MODEL__PARAMETER:
			getParameter().clear();
			getParameter().addAll((Collection<? extends parameter>) newValue);
			return;
		case MetaModelicaMLPackage.MODELICA_MODEL__PORT:
			getPort().clear();
			getPort().addAll((Collection<? extends port>) newValue);
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
		case MetaModelicaMLPackage.MODELICA_MODEL__CONSTRAINT:
			getConstraint().clear();
			return;
		case MetaModelicaMLPackage.MODELICA_MODEL__COMPONENT:
			getComponent().clear();
			return;
		case MetaModelicaMLPackage.MODELICA_MODEL__EXTEND:
			getExtend().clear();
			return;
		case MetaModelicaMLPackage.MODELICA_MODEL__PROTOTYPE:
			getPrototype().clear();
			return;
		case MetaModelicaMLPackage.MODELICA_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetaModelicaMLPackage.MODELICA_MODEL__PARAMETER:
			getParameter().clear();
			return;
		case MetaModelicaMLPackage.MODELICA_MODEL__PORT:
			getPort().clear();
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
		case MetaModelicaMLPackage.MODELICA_MODEL__CONSTRAINT:
			return constraint != null && !constraint.isEmpty();
		case MetaModelicaMLPackage.MODELICA_MODEL__COMPONENT:
			return component != null && !component.isEmpty();
		case MetaModelicaMLPackage.MODELICA_MODEL__EXTEND:
			return extend != null && !extend.isEmpty();
		case MetaModelicaMLPackage.MODELICA_MODEL__PROTOTYPE:
			return prototype != null && !prototype.isEmpty();
		case MetaModelicaMLPackage.MODELICA_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetaModelicaMLPackage.MODELICA_MODEL__PARAMETER:
			return parameter != null && !parameter.isEmpty();
		case MetaModelicaMLPackage.MODELICA_MODEL__PORT:
			return port != null && !port.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModelicaModelImpl
