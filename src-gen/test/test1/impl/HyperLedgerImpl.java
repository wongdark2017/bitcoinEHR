/**
 */
package test.test1.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import test.test1.HyperLedger;
import test.test1.Test1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hyper Ledger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link test.test1.impl.HyperLedgerImpl#getData <em>Data</em>}</li>
 *   <li>{@link test.test1.impl.HyperLedgerImpl#getChainCode <em>Chain Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HyperLedgerImpl extends MinimalEObjectImpl.Container implements HyperLedger {
	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected String data = DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getChainCode() <em>Chain Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAIN_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChainCode() <em>Chain Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainCode()
	 * @generated
	 * @ordered
	 */
	protected String chainCode = CHAIN_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HyperLedgerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Test1Package.Literals.HYPER_LEDGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(String newData) {
		String oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Test1Package.HYPER_LEDGER__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChainCode() {
		return chainCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainCode(String newChainCode) {
		String oldChainCode = chainCode;
		chainCode = newChainCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Test1Package.HYPER_LEDGER__CHAIN_CODE, oldChainCode,
					chainCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void queryData() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Test1Package.HYPER_LEDGER__DATA:
			return getData();
		case Test1Package.HYPER_LEDGER__CHAIN_CODE:
			return getChainCode();
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
		case Test1Package.HYPER_LEDGER__DATA:
			setData((String) newValue);
			return;
		case Test1Package.HYPER_LEDGER__CHAIN_CODE:
			setChainCode((String) newValue);
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
		case Test1Package.HYPER_LEDGER__DATA:
			setData(DATA_EDEFAULT);
			return;
		case Test1Package.HYPER_LEDGER__CHAIN_CODE:
			setChainCode(CHAIN_CODE_EDEFAULT);
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
		case Test1Package.HYPER_LEDGER__DATA:
			return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
		case Test1Package.HYPER_LEDGER__CHAIN_CODE:
			return CHAIN_CODE_EDEFAULT == null ? chainCode != null : !CHAIN_CODE_EDEFAULT.equals(chainCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Test1Package.HYPER_LEDGER___QUERY_DATA:
			queryData();
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (Data: ");
		result.append(data);
		result.append(", ChainCode: ");
		result.append(chainCode);
		result.append(')');
		return result.toString();
	}

} //HyperLedgerImpl
