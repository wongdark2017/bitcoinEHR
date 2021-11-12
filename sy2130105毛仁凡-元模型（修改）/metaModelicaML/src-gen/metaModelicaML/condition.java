/**
 */
package metaModelicaML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModelicaML.condition#getCriterion <em>Criterion</em>}</li>
 *   <li>{@link metaModelicaML.condition#getDo <em>Do</em>}</li>
 *   <li>{@link metaModelicaML.condition#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see metaModelicaML.MetaModelicaMLPackage#getcondition()
 * @model
 * @generated
 */
public interface condition extends Expression {
	/**
	 * Returns the value of the '<em><b>Criterion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criterion</em>' reference.
	 * @see #setCriterion(parameter)
	 * @see metaModelicaML.MetaModelicaMLPackage#getcondition_Criterion()
	 * @model
	 * @generated
	 */
	parameter getCriterion();

	/**
	 * Sets the value of the '{@link metaModelicaML.condition#getCriterion <em>Criterion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criterion</em>' reference.
	 * @see #getCriterion()
	 * @generated
	 */
	void setCriterion(parameter value);

	/**
	 * Returns the value of the '<em><b>Do</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do</em>' reference.
	 * @see #setDo(constraint)
	 * @see metaModelicaML.MetaModelicaMLPackage#getcondition_Do()
	 * @model
	 * @generated
	 */
	constraint getDo();

	/**
	 * Sets the value of the '{@link metaModelicaML.condition#getDo <em>Do</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do</em>' reference.
	 * @see #getDo()
	 * @generated
	 */
	void setDo(constraint value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' reference.
	 * @see #setElse(constraint)
	 * @see metaModelicaML.MetaModelicaMLPackage#getcondition_Else()
	 * @model
	 * @generated
	 */
	constraint getElse();

	/**
	 * Sets the value of the '{@link metaModelicaML.condition#getElse <em>Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(constraint value);

} // condition
