/**
 */
package fr.obs.dsl.tuto.onlinejudge.impl;

import fr.obs.dsl.tuto.onlinejudge.File;
import fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage;
import fr.obs.dsl.tuto.onlinejudge.User;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.FileImpl#getID <em>ID</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.FileImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.FileImpl#getMd5 <em>Md5</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.FileImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileImpl extends MinimalEObjectImpl.Container implements File {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMd5() <em>Md5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMd5()
	 * @generated
	 * @ordered
	 */
	protected static final String MD5_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMd5() <em>Md5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMd5()
	 * @generated
	 * @ordered
	 */
	protected String md5 = MD5_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected EList<User> user;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OnlinejudgePackage.Literals.FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnlinejudgePackage.FILE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnlinejudgePackage.FILE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMd5() {
		return md5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMd5(String newMd5) {
		String oldMd5 = md5;
		md5 = newMd5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnlinejudgePackage.FILE__MD5, oldMd5, md5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUser() {
		if (user == null) {
			user = new EObjectContainmentEList<User>(User.class, this, OnlinejudgePackage.FILE__USER);
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OnlinejudgePackage.FILE__USER:
			return ((InternalEList<?>) getUser()).basicRemove(otherEnd, msgs);
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
		case OnlinejudgePackage.FILE__ID:
			return getID();
		case OnlinejudgePackage.FILE__TYPE:
			return getType();
		case OnlinejudgePackage.FILE__MD5:
			return getMd5();
		case OnlinejudgePackage.FILE__USER:
			return getUser();
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
		case OnlinejudgePackage.FILE__ID:
			setID((Integer) newValue);
			return;
		case OnlinejudgePackage.FILE__TYPE:
			setType((String) newValue);
			return;
		case OnlinejudgePackage.FILE__MD5:
			setMd5((String) newValue);
			return;
		case OnlinejudgePackage.FILE__USER:
			getUser().clear();
			getUser().addAll((Collection<? extends User>) newValue);
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
		case OnlinejudgePackage.FILE__ID:
			setID(ID_EDEFAULT);
			return;
		case OnlinejudgePackage.FILE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case OnlinejudgePackage.FILE__MD5:
			setMd5(MD5_EDEFAULT);
			return;
		case OnlinejudgePackage.FILE__USER:
			getUser().clear();
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
		case OnlinejudgePackage.FILE__ID:
			return id != ID_EDEFAULT;
		case OnlinejudgePackage.FILE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case OnlinejudgePackage.FILE__MD5:
			return MD5_EDEFAULT == null ? md5 != null : !MD5_EDEFAULT.equals(md5);
		case OnlinejudgePackage.FILE__USER:
			return user != null && !user.isEmpty();
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(", md5: ");
		result.append(md5);
		result.append(')');
		return result.toString();
	}

} //FileImpl
