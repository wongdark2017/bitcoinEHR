/**
 */
package metaModelicaML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see metaModelicaML.MetaModelicaMLPackage
 * @generated
 */
public interface MetaModelicaMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaModelicaMLFactory eINSTANCE = metaModelicaML.impl.MetaModelicaMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Modelica Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Model</em>'.
	 * @generated
	 */
	ModelicaModel createModelicaModel();

	/**
	 * Returns a new object of class '<em>Modelica Bool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Bool</em>'.
	 * @generated
	 */
	ModelicaBool createModelicaBool();

	/**
	 * Returns a new object of class '<em>Modelica Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Int</em>'.
	 * @generated
	 */
	ModelicaInt createModelicaInt();

	/**
	 * Returns a new object of class '<em>Modelica Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Real</em>'.
	 * @generated
	 */
	ModelicaReal createModelicaReal();

	/**
	 * Returns a new object of class '<em>Modelica Complex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelica Complex</em>'.
	 * @generated
	 */
	ModelicaComplex createModelicaComplex();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Physics Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physics Quantity</em>'.
	 * @generated
	 */
	PhysicsQuantity createPhysicsQuantity();

	/**
	 * Returns a new object of class '<em>connect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>connect</em>'.
	 * @generated
	 */
	connect createconnect();

	/**
	 * Returns a new object of class '<em>port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>port</em>'.
	 * @generated
	 */
	port createport();

	/**
	 * Returns a new object of class '<em>equation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>equation</em>'.
	 * @generated
	 */
	equation createequation();

	/**
	 * Returns a new object of class '<em>condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>condition</em>'.
	 * @generated
	 */
	condition createcondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetaModelicaMLPackage getMetaModelicaMLPackage();

} //MetaModelicaMLFactory
