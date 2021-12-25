/**
 */
package fr.obs.dsl.tuto.onlinejudge.impl;

import fr.obs.dsl.tuto.onlinejudge.JudgeStatus;
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
 * An implementation of the model object '<em><b>Judge Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.JudgeStatusImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.JudgeStatusImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.JudgeStatusImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.JudgeStatusImpl#getUser_id <em>User id</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.JudgeStatusImpl#getProblem_id <em>Problem id</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.JudgeStatusImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JudgeStatusImpl extends MinimalEObjectImpl.Container implements JudgeStatus {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser_id() <em>User id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_id()
	 * @generated
	 * @ordered
	 */
	protected static final int USER_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUser_id() <em>User id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_id()
	 * @generated
	 * @ordered
	 */
	protected int user_id = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProblem_id() <em>Problem id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblem_id()
	 * @generated
	 * @ordered
	 */
	protected static final int PROBLEM_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProblem_id() <em>Problem id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblem_id()
	 * @generated
	 * @ordered
	 */
	protected int problem_id = PROBLEM_ID_EDEFAULT;

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
	protected JudgeStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OnlinejudgePackage.Literals.JUDGE_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnlinejudgePackage.JUDGE_STATUS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnlinejudgePackage.JUDGE_STATUS__CODE, oldCode,
					code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnlinejudgePackage.JUDGE_STATUS__LANGUAGE,
					oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser_id(int newUser_id) {
		int oldUser_id = user_id;
		user_id = newUser_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnlinejudgePackage.JUDGE_STATUS__USER_ID, oldUser_id,
					user_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProblem_id() {
		return problem_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblem_id(int newProblem_id) {
		int oldProblem_id = problem_id;
		problem_id = newProblem_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnlinejudgePackage.JUDGE_STATUS__PROBLEM_ID,
					oldProblem_id, problem_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUser() {
		if (user == null) {
			user = new EObjectContainmentEList<User>(User.class, this, OnlinejudgePackage.JUDGE_STATUS__USER);
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
		case OnlinejudgePackage.JUDGE_STATUS__USER:
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
		case OnlinejudgePackage.JUDGE_STATUS__ID:
			return getId();
		case OnlinejudgePackage.JUDGE_STATUS__CODE:
			return getCode();
		case OnlinejudgePackage.JUDGE_STATUS__LANGUAGE:
			return getLanguage();
		case OnlinejudgePackage.JUDGE_STATUS__USER_ID:
			return getUser_id();
		case OnlinejudgePackage.JUDGE_STATUS__PROBLEM_ID:
			return getProblem_id();
		case OnlinejudgePackage.JUDGE_STATUS__USER:
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
		case OnlinejudgePackage.JUDGE_STATUS__ID:
			setId((Integer) newValue);
			return;
		case OnlinejudgePackage.JUDGE_STATUS__CODE:
			setCode((String) newValue);
			return;
		case OnlinejudgePackage.JUDGE_STATUS__LANGUAGE:
			setLanguage((String) newValue);
			return;
		case OnlinejudgePackage.JUDGE_STATUS__USER_ID:
			setUser_id((Integer) newValue);
			return;
		case OnlinejudgePackage.JUDGE_STATUS__PROBLEM_ID:
			setProblem_id((Integer) newValue);
			return;
		case OnlinejudgePackage.JUDGE_STATUS__USER:
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
		case OnlinejudgePackage.JUDGE_STATUS__ID:
			setId(ID_EDEFAULT);
			return;
		case OnlinejudgePackage.JUDGE_STATUS__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case OnlinejudgePackage.JUDGE_STATUS__LANGUAGE:
			setLanguage(LANGUAGE_EDEFAULT);
			return;
		case OnlinejudgePackage.JUDGE_STATUS__USER_ID:
			setUser_id(USER_ID_EDEFAULT);
			return;
		case OnlinejudgePackage.JUDGE_STATUS__PROBLEM_ID:
			setProblem_id(PROBLEM_ID_EDEFAULT);
			return;
		case OnlinejudgePackage.JUDGE_STATUS__USER:
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
		case OnlinejudgePackage.JUDGE_STATUS__ID:
			return id != ID_EDEFAULT;
		case OnlinejudgePackage.JUDGE_STATUS__CODE:
			return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
		case OnlinejudgePackage.JUDGE_STATUS__LANGUAGE:
			return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
		case OnlinejudgePackage.JUDGE_STATUS__USER_ID:
			return user_id != USER_ID_EDEFAULT;
		case OnlinejudgePackage.JUDGE_STATUS__PROBLEM_ID:
			return problem_id != PROBLEM_ID_EDEFAULT;
		case OnlinejudgePackage.JUDGE_STATUS__USER:
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
		result.append(" (id: ");
		result.append(id);
		result.append(", code: ");
		result.append(code);
		result.append(", language: ");
		result.append(language);
		result.append(", user_id: ");
		result.append(user_id);
		result.append(", problem_id: ");
		result.append(problem_id);
		result.append(')');
		return result.toString();
	}

} //JudgeStatusImpl
