/**
 */
package test.test1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hyper Ledger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.test1.HyperLedger#getData <em>Data</em>}</li>
 *   <li>{@link test.test1.HyperLedger#getChainCode <em>Chain Code</em>}</li>
 * </ul>
 *
 * @see test.test1.Test1Package#getHyperLedger()
 * @model
 * @generated
 */
public interface HyperLedger extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see test.test1.Test1Package#getHyperLedger_Data()
	 * @model
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link test.test1.HyperLedger#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>Chain Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain Code</em>' attribute.
	 * @see #setChainCode(String)
	 * @see test.test1.Test1Package#getHyperLedger_ChainCode()
	 * @model
	 * @generated
	 */
	String getChainCode();

	/**
	 * Sets the value of the '{@link test.test1.HyperLedger#getChainCode <em>Chain Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain Code</em>' attribute.
	 * @see #getChainCode()
	 * @generated
	 */
	void setChainCode(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void queryData();

} // HyperLedger
