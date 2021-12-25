/**
 */
package fr.obs.dsl.tuto.onlinejudge.impl;

import fr.obs.dsl.tuto.onlinejudge.JudgeStatus;
import fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage;
import fr.obs.dsl.tuto.onlinejudge.Problem;
import fr.obs.dsl.tuto.onlinejudge.ProblemTag;

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
 * An implementation of the model object '<em><b>Problem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.ProblemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.ProblemImpl#getTime <em>Time</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.ProblemImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.ProblemImpl#getID <em>ID</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.ProblemImpl#getJudgestatus <em>Judgestatus</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.ProblemImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.ProblemImpl#getProblemtag <em>Problemtag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProblemImpl extends MinimalEObjectImpl.Container implements Problem {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected int time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected int memory = MEMORY_EDEFAULT;

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
	 * The cached value of the '{@link #getJudgestatus() <em>Judgestatus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJudgestatus()
	 * @generated
	 * @ordered
	 */
	protected EList<JudgeStatus> judgestatus;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProblemtag() <em>Problemtag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemtag()
	 * @generated
	 * @ordered
	 */
	protected EList<ProblemTag> problemtag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OnlinejudgePackage.Literals.PROBLEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnlinejudgePackage.PROBLEM__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(int newTime) {
		int oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnlinejudgePackage.PROBLEM__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(int newMemory) {
		int oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnlinejudgePackage.PROBLEM__MEMORY, oldMemory,
					memory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OnlinejudgePackage.PROBLEM__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JudgeStatus> getJudgestatus() {
		if (judgestatus == null) {
			judgestatus = new EObjectContainmentEList<JudgeStatus>(JudgeStatus.class, this,
					OnlinejudgePackage.PROBLEM__JUDGESTATUS);
		}
		return judgestatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnlinejudgePackage.PROBLEM__PASSWORD, oldPassword,
					password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemTag> getProblemtag() {
		if (problemtag == null) {
			problemtag = new EObjectContainmentEList<ProblemTag>(ProblemTag.class, this,
					OnlinejudgePackage.PROBLEM__PROBLEMTAG);
		}
		return problemtag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OnlinejudgePackage.PROBLEM__JUDGESTATUS:
			return ((InternalEList<?>) getJudgestatus()).basicRemove(otherEnd, msgs);
		case OnlinejudgePackage.PROBLEM__PROBLEMTAG:
			return ((InternalEList<?>) getProblemtag()).basicRemove(otherEnd, msgs);
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
		case OnlinejudgePackage.PROBLEM__DESCRIPTION:
			return getDescription();
		case OnlinejudgePackage.PROBLEM__TIME:
			return getTime();
		case OnlinejudgePackage.PROBLEM__MEMORY:
			return getMemory();
		case OnlinejudgePackage.PROBLEM__ID:
			return getID();
		case OnlinejudgePackage.PROBLEM__JUDGESTATUS:
			return getJudgestatus();
		case OnlinejudgePackage.PROBLEM__PASSWORD:
			return getPassword();
		case OnlinejudgePackage.PROBLEM__PROBLEMTAG:
			return getProblemtag();
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
		case OnlinejudgePackage.PROBLEM__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case OnlinejudgePackage.PROBLEM__TIME:
			setTime((Integer) newValue);
			return;
		case OnlinejudgePackage.PROBLEM__MEMORY:
			setMemory((Integer) newValue);
			return;
		case OnlinejudgePackage.PROBLEM__ID:
			setID((Integer) newValue);
			return;
		case OnlinejudgePackage.PROBLEM__JUDGESTATUS:
			getJudgestatus().clear();
			getJudgestatus().addAll((Collection<? extends JudgeStatus>) newValue);
			return;
		case OnlinejudgePackage.PROBLEM__PASSWORD:
			setPassword((String) newValue);
			return;
		case OnlinejudgePackage.PROBLEM__PROBLEMTAG:
			getProblemtag().clear();
			getProblemtag().addAll((Collection<? extends ProblemTag>) newValue);
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
		case OnlinejudgePackage.PROBLEM__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case OnlinejudgePackage.PROBLEM__TIME:
			setTime(TIME_EDEFAULT);
			return;
		case OnlinejudgePackage.PROBLEM__MEMORY:
			setMemory(MEMORY_EDEFAULT);
			return;
		case OnlinejudgePackage.PROBLEM__ID:
			setID(ID_EDEFAULT);
			return;
		case OnlinejudgePackage.PROBLEM__JUDGESTATUS:
			getJudgestatus().clear();
			return;
		case OnlinejudgePackage.PROBLEM__PASSWORD:
			setPassword(PASSWORD_EDEFAULT);
			return;
		case OnlinejudgePackage.PROBLEM__PROBLEMTAG:
			getProblemtag().clear();
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
		case OnlinejudgePackage.PROBLEM__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case OnlinejudgePackage.PROBLEM__TIME:
			return time != TIME_EDEFAULT;
		case OnlinejudgePackage.PROBLEM__MEMORY:
			return memory != MEMORY_EDEFAULT;
		case OnlinejudgePackage.PROBLEM__ID:
			return id != ID_EDEFAULT;
		case OnlinejudgePackage.PROBLEM__JUDGESTATUS:
			return judgestatus != null && !judgestatus.isEmpty();
		case OnlinejudgePackage.PROBLEM__PASSWORD:
			return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
		case OnlinejudgePackage.PROBLEM__PROBLEMTAG:
			return problemtag != null && !problemtag.isEmpty();
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
		result.append(" (Description: ");
		result.append(description);
		result.append(", Time: ");
		result.append(time);
		result.append(", Memory: ");
		result.append(memory);
		result.append(", ID: ");
		result.append(id);
		result.append(", Password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //ProblemImpl
