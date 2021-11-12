/**
 */
package metaModelicaML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelica Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModelicaML.ModelicaModel#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link metaModelicaML.ModelicaModel#getComponent <em>Component</em>}</li>
 *   <li>{@link metaModelicaML.ModelicaModel#getExtend <em>Extend</em>}</li>
 *   <li>{@link metaModelicaML.ModelicaModel#getPrototype <em>Prototype</em>}</li>
 *   <li>{@link metaModelicaML.ModelicaModel#getName <em>Name</em>}</li>
 *   <li>{@link metaModelicaML.ModelicaModel#getParameter <em>Parameter</em>}</li>
 *   <li>{@link metaModelicaML.ModelicaModel#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see metaModelicaML.MetaModelicaMLPackage#getModelicaModel()
 * @model
 * @generated
 */
public interface ModelicaModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link metaModelicaML.constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see metaModelicaML.MetaModelicaMLPackage#getModelicaModel_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<constraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link metaModelicaML.ModelicaModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see metaModelicaML.MetaModelicaMLPackage#getModelicaModel_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelicaModel> getComponent();

	/**
	 * Returns the value of the '<em><b>Extend</b></em>' reference list.
	 * The list contents are of type {@link metaModelicaML.ModelicaModel}.
	 * It is bidirectional and its opposite is '{@link metaModelicaML.ModelicaModel#getPrototype <em>Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend</em>' reference list.
	 * @see metaModelicaML.MetaModelicaMLPackage#getModelicaModel_Extend()
	 * @see metaModelicaML.ModelicaModel#getPrototype
	 * @model opposite="prototype"
	 * @generated
	 */
	EList<ModelicaModel> getExtend();

	/**
	 * Returns the value of the '<em><b>Prototype</b></em>' reference list.
	 * The list contents are of type {@link metaModelicaML.ModelicaModel}.
	 * It is bidirectional and its opposite is '{@link metaModelicaML.ModelicaModel#getExtend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prototype</em>' reference list.
	 * @see metaModelicaML.MetaModelicaMLPackage#getModelicaModel_Prototype()
	 * @see metaModelicaML.ModelicaModel#getExtend
	 * @model opposite="extend"
	 * @generated
	 */
	EList<ModelicaModel> getPrototype();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metaModelicaML.MetaModelicaMLPackage#getModelicaModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metaModelicaML.ModelicaModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link metaModelicaML.parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see metaModelicaML.MetaModelicaMLPackage#getModelicaModel_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link metaModelicaML.port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see metaModelicaML.MetaModelicaMLPackage#getModelicaModel_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<port> getPort();

} // ModelicaModel
