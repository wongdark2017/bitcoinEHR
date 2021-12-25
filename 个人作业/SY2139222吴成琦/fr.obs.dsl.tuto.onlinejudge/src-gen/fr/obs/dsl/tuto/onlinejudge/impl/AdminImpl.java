/**
 */
package fr.obs.dsl.tuto.onlinejudge.impl;

import fr.obs.dsl.tuto.onlinejudge.Admin;
import fr.obs.dsl.tuto.onlinejudge.Articles;
import fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.AdminImpl#isIsadmin <em>Isadmin</em>}</li>
 *   <li>{@link fr.obs.dsl.tuto.onlinejudge.impl.AdminImpl#getArticles <em>Articles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdminImpl extends UserImpl implements Admin {
	/**
	 * The default value of the '{@link #isIsadmin() <em>Isadmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsadmin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISADMIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsadmin() <em>Isadmin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsadmin()
	 * @generated
	 * @ordered
	 */
	protected boolean isadmin = ISADMIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArticles() <em>Articles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArticles()
	 * @generated
	 * @ordered
	 */
	protected EList<Articles> articles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdminImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OnlinejudgePackage.Literals.ADMIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsadmin() {
		return isadmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsadmin(boolean newIsadmin) {
		boolean oldIsadmin = isadmin;
		isadmin = newIsadmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OnlinejudgePackage.ADMIN__ISADMIN, oldIsadmin,
					isadmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Articles> getArticles() {
		if (articles == null) {
			articles = new EObjectContainmentEList<Articles>(Articles.class, this, OnlinejudgePackage.ADMIN__ARTICLES);
		}
		return articles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OnlinejudgePackage.ADMIN__ARTICLES:
			return ((InternalEList<?>) getArticles()).basicRemove(otherEnd, msgs);
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
		case OnlinejudgePackage.ADMIN__ISADMIN:
			return isIsadmin();
		case OnlinejudgePackage.ADMIN__ARTICLES:
			return getArticles();
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
		case OnlinejudgePackage.ADMIN__ISADMIN:
			setIsadmin((Boolean) newValue);
			return;
		case OnlinejudgePackage.ADMIN__ARTICLES:
			getArticles().clear();
			getArticles().addAll((Collection<? extends Articles>) newValue);
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
		case OnlinejudgePackage.ADMIN__ISADMIN:
			setIsadmin(ISADMIN_EDEFAULT);
			return;
		case OnlinejudgePackage.ADMIN__ARTICLES:
			getArticles().clear();
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
		case OnlinejudgePackage.ADMIN__ISADMIN:
			return isadmin != ISADMIN_EDEFAULT;
		case OnlinejudgePackage.ADMIN__ARTICLES:
			return articles != null && !articles.isEmpty();
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
		result.append(" (Isadmin: ");
		result.append(isadmin);
		result.append(')');
		return result.toString();
	}

} //AdminImpl
