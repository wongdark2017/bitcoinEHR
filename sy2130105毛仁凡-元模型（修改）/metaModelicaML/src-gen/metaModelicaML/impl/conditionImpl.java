/**
 */
package metaModelicaML.impl;

import metaModelicaML.MetaModelicaMLPackage;
import metaModelicaML.condition;
import metaModelicaML.constraint;
import metaModelicaML.parameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModelicaML.impl.conditionImpl#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link metaModelicaML.impl.conditionImpl#getDo <em>Do</em>}</li>
 *   <li>{@link metaModelicaML.impl.conditionImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class conditionImpl extends ExpressionImpl implements condition {
	/**
	 * The cached value of the '{@link #getCriterion() <em>Criterion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriterion()
	 * @generated
	 * @ordered
	 */
	protected parameter criterion;

	/**
	 * The cached value of the '{@link #getDo() <em>Do</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDo()
	 * @generated
	 * @ordered
	 */
	protected constraint do_;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected constraint else_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected conditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelicaMLPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public parameter getCriterion() {
		if (criterion != null && criterion.eIsProxy()) {
			InternalEObject oldCriterion = (InternalEObject) criterion;
			criterion = (parameter) eResolveProxy(oldCriterion);
			if (criterion != oldCriterion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetaModelicaMLPackage.CONDITION__CRITERION, oldCriterion, criterion));
			}
		}
		return criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public parameter basicGetCriterion() {
		return criterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriterion(parameter newCriterion) {
		parameter oldCriterion = criterion;
		criterion = newCriterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelicaMLPackage.CONDITION__CRITERION,
					oldCriterion, criterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public constraint getDo() {
		if (do_ != null && do_.eIsProxy()) {
			InternalEObject oldDo = (InternalEObject) do_;
			do_ = (constraint) eResolveProxy(oldDo);
			if (do_ != oldDo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelicaMLPackage.CONDITION__DO,
							oldDo, do_));
			}
		}
		return do_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public constraint basicGetDo() {
		return do_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDo(constraint newDo) {
		constraint oldDo = do_;
		do_ = newDo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelicaMLPackage.CONDITION__DO, oldDo, do_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public constraint getElse() {
		if (else_ != null && else_.eIsProxy()) {
			InternalEObject oldElse = (InternalEObject) else_;
			else_ = (constraint) eResolveProxy(oldElse);
			if (else_ != oldElse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelicaMLPackage.CONDITION__ELSE,
							oldElse, else_));
			}
		}
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public constraint basicGetElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(constraint newElse) {
		constraint oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelicaMLPackage.CONDITION__ELSE, oldElse,
					else_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaModelicaMLPackage.CONDITION__CRITERION:
			if (resolve)
				return getCriterion();
			return basicGetCriterion();
		case MetaModelicaMLPackage.CONDITION__DO:
			if (resolve)
				return getDo();
			return basicGetDo();
		case MetaModelicaMLPackage.CONDITION__ELSE:
			if (resolve)
				return getElse();
			return basicGetElse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetaModelicaMLPackage.CONDITION__CRITERION:
			setCriterion((parameter) newValue);
			return;
		case MetaModelicaMLPackage.CONDITION__DO:
			setDo((constraint) newValue);
			return;
		case MetaModelicaMLPackage.CONDITION__ELSE:
			setElse((constraint) newValue);
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
		case MetaModelicaMLPackage.CONDITION__CRITERION:
			setCriterion((parameter) null);
			return;
		case MetaModelicaMLPackage.CONDITION__DO:
			setDo((constraint) null);
			return;
		case MetaModelicaMLPackage.CONDITION__ELSE:
			setElse((constraint) null);
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
		case MetaModelicaMLPackage.CONDITION__CRITERION:
			return criterion != null;
		case MetaModelicaMLPackage.CONDITION__DO:
			return do_ != null;
		case MetaModelicaMLPackage.CONDITION__ELSE:
			return else_ != null;
		}
		return super.eIsSet(featureID);
	}

} //conditionImpl
