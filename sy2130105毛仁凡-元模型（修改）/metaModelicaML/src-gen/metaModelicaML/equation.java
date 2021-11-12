/**
 */
package metaModelicaML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>equation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModelicaML.equation#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see metaModelicaML.MetaModelicaMLPackage#getequation()
 * @model
 * @generated
 */
public interface equation extends Expression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference list.
	 * The list contents are of type {@link metaModelicaML.parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference list.
	 * @see metaModelicaML.MetaModelicaMLPackage#getequation_Variable()
	 * @model
	 * @generated
	 */
	EList<parameter> getVariable();

} // equation
