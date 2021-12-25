/**
 */
package fr.obs.dsl.tuto.onlinejudge.impl;

import fr.obs.dsl.tuto.onlinejudge.Contest;
import fr.obs.dsl.tuto.onlinejudge.File;
import fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage;
import fr.obs.dsl.tuto.onlinejudge.Problem;
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
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.UserImpl#getID <em>ID</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.UserImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.UserImpl#getAc_num <em>Ac num</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.UserImpl#getSubmit_num <em>Submit num</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.UserImpl#getProblem <em>Problem</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.UserImpl#getContest <em>Contest</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.UserImpl#getFile <em>File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
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
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAc_num() <em>Ac num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAc_num()
	 * @generated
	 * @ordered
	 */
	protected static final int AC_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAc_num() <em>Ac num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAc_num()
	 * @generated
	 * @ordered
	 */
	protected int ac_num = AC_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubmit_num() <em>Submit num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmit_num()
	 * @generated
	 * @ordered
	 */
	protected static final int SUBMIT_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSubmit_num() <em>Submit num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmit_num()
	 * @generated
	 * @ordered
	 */
	protected int submit_num = SUBMIT_NUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProblem() <em>Problem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblem()
	 * @generated
	 * @ordered
	 */
	protected EList<Problem> problem;

	/**
	 * The cached value of the '{@link #getContest() <em>Contest</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContest()
	 * @generated
	 * @ordered
	 */
	protected EList<Contest> contest;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected EList<File> file;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OnlinejudgePackage.Literals.USER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OnlinejudgePackage.USER__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnlinejudgePackage.USER__USERNAME, oldUsername,
					username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAc_num() {
		return ac_num;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAc_num(int newAc_num) {
		int oldAc_num = ac_num;
		ac_num = newAc_num;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnlinejudgePackage.USER__AC_NUM, oldAc_num, ac_num));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSubmit_num() {
		return submit_num;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmit_num(int newSubmit_num) {
		int oldSubmit_num = submit_num;
		submit_num = newSubmit_num;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnlinejudgePackage.USER__SUBMIT_NUM, oldSubmit_num,
					submit_num));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Problem> getProblem() {
		if (problem == null) {
			problem = new EObjectContainmentEList<Problem>(Problem.class, this, OnlinejudgePackage.USER__PROBLEM);
		}
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contest> getContest() {
		if (contest == null) {
			contest = new EObjectContainmentEList<Contest>(Contest.class, this, OnlinejudgePackage.USER__CONTEST);
		}
		return contest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFile() {
		if (file == null) {
			file = new EObjectContainmentEList<File>(File.class, this, OnlinejudgePackage.USER__FILE);
		}
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OnlinejudgePackage.USER__PROBLEM:
			return ((InternalEList<?>) getProblem()).basicRemove(otherEnd, msgs);
		case OnlinejudgePackage.USER__CONTEST:
			return ((InternalEList<?>) getContest()).basicRemove(otherEnd, msgs);
		case OnlinejudgePackage.USER__FILE:
			return ((InternalEList<?>) getFile()).basicRemove(otherEnd, msgs);
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
		case OnlinejudgePackage.USER__ID:
			return getID();
		case OnlinejudgePackage.USER__USERNAME:
			return getUsername();
		case OnlinejudgePackage.USER__AC_NUM:
			return getAc_num();
		case OnlinejudgePackage.USER__SUBMIT_NUM:
			return getSubmit_num();
		case OnlinejudgePackage.USER__PROBLEM:
			return getProblem();
		case OnlinejudgePackage.USER__CONTEST:
			return getContest();
		case OnlinejudgePackage.USER__FILE:
			return getFile();
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
		case OnlinejudgePackage.USER__ID:
			setID((Integer) newValue);
			return;
		case OnlinejudgePackage.USER__USERNAME:
			setUsername((String) newValue);
			return;
		case OnlinejudgePackage.USER__AC_NUM:
			setAc_num((Integer) newValue);
			return;
		case OnlinejudgePackage.USER__SUBMIT_NUM:
			setSubmit_num((Integer) newValue);
			return;
		case OnlinejudgePackage.USER__PROBLEM:
			getProblem().clear();
			getProblem().addAll((Collection<? extends Problem>) newValue);
			return;
		case OnlinejudgePackage.USER__CONTEST:
			getContest().clear();
			getContest().addAll((Collection<? extends Contest>) newValue);
			return;
		case OnlinejudgePackage.USER__FILE:
			getFile().clear();
			getFile().addAll((Collection<? extends File>) newValue);
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
		case OnlinejudgePackage.USER__ID:
			setID(ID_EDEFAULT);
			return;
		case OnlinejudgePackage.USER__USERNAME:
			setUsername(USERNAME_EDEFAULT);
			return;
		case OnlinejudgePackage.USER__AC_NUM:
			setAc_num(AC_NUM_EDEFAULT);
			return;
		case OnlinejudgePackage.USER__SUBMIT_NUM:
			setSubmit_num(SUBMIT_NUM_EDEFAULT);
			return;
		case OnlinejudgePackage.USER__PROBLEM:
			getProblem().clear();
			return;
		case OnlinejudgePackage.USER__CONTEST:
			getContest().clear();
			return;
		case OnlinejudgePackage.USER__FILE:
			getFile().clear();
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
		case OnlinejudgePackage.USER__ID:
			return id != ID_EDEFAULT;
		case OnlinejudgePackage.USER__USERNAME:
			return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
		case OnlinejudgePackage.USER__AC_NUM:
			return ac_num != AC_NUM_EDEFAULT;
		case OnlinejudgePackage.USER__SUBMIT_NUM:
			return submit_num != SUBMIT_NUM_EDEFAULT;
		case OnlinejudgePackage.USER__PROBLEM:
			return problem != null && !problem.isEmpty();
		case OnlinejudgePackage.USER__CONTEST:
			return contest != null && !contest.isEmpty();
		case OnlinejudgePackage.USER__FILE:
			return file != null && !file.isEmpty();
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
		result.append(", username: ");
		result.append(username);
		result.append(", ac_num: ");
		result.append(ac_num);
		result.append(", submit_num: ");
		result.append(submit_num);
		result.append(')');
		return result.toString();
	}

} //UserImpl
