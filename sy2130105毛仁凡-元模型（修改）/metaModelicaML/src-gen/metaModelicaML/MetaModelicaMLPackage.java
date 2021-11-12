/**
 */
package metaModelicaML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see metaModelicaML.MetaModelicaMLFactory
 * @model kind="package"
 * @generated
 */
public interface MetaModelicaMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metaModelicaML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/metaModelicaML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metaModelicaML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaModelicaMLPackage eINSTANCE = metaModelicaML.impl.MetaModelicaMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link metaModelicaML.impl.ModelicaModelImpl <em>Modelica Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelicaML.impl.ModelicaModelImpl
	 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getModelicaModel()
	 * @generated
	 */
	int MODELICA_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL__CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL__COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Extend</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL__EXTEND = 2;

	/**
	 * The feature id for the '<em><b>Prototype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL__PROTOTYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL__NAME = 4;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL__PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL__PORT = 6;

	/**
	 * The number of structural features of the '<em>Modelica Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Modelica Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModelicaML.impl.constraintImpl <em>constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelicaML.impl.constraintImpl
	 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getconstraint()
	 * @generated
	 */
	int CONSTRAINT = 1;

	/**
	 * The number of structural features of the '<em>constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModelicaML.impl.parameterImpl <em>parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelicaML.impl.parameterImpl
	 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getparameter()
	 * @generated
	 */
	int PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The number of structural features of the '<em>parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModelicaML.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelicaML.impl.VariableImpl
	 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VARIABLE_TYPE = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelicaML.impl.ModelicaBoolImpl <em>Modelica Bool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelicaML.impl.ModelicaBoolImpl
	 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getModelicaBool()
	 * @generated
	 */
	int MODELICA_BOOL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_BOOL__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_BOOL__VARIABLE_TYPE = VARIABLE__VARIABLE_TYPE;

	/**
	 * The number of structural features of the '<em>Modelica Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_BOOL_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modelica Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_BOOL_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelicaML.impl.ModelicaIntImpl <em>Modelica Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelicaML.impl.ModelicaIntImpl
	 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getModelicaInt()
	 * @generated
	 */
	int MODELICA_INT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_INT__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_INT__VARIABLE_TYPE = VARIABLE__VARIABLE_TYPE;

	/**
	 * The number of structural features of the '<em>Modelica Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_INT_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modelica Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_INT_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelicaML.impl.ModelicaRealImpl <em>Modelica Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelicaML.impl.ModelicaRealImpl
	 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getModelicaReal()
	 * @generated
	 */
	int MODELICA_REAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_REAL__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_REAL__VARIABLE_TYPE = VARIABLE__VARIABLE_TYPE;

	/**
	 * The number of structural features of the '<em>Modelica Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_REAL_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modelica Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_REAL_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelicaML.impl.ModelicaComplexImpl <em>Modelica Complex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelicaML.impl.ModelicaComplexImpl
	 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getModelicaComplex()
	 * @generated
	 */
	int MODELICA_COMPLEX = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_COMPLEX__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_COMPLEX__VARIABLE_TYPE = VARIABLE__VARIABLE_TYPE;

	/**
	 * The number of structural features of the '<em>Modelica Complex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_COMPLEX_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modelica Complex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELICA_COMPLEX_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelicaML.impl.PhysicsQuantityImpl <em>Physics Quantity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelicaML.impl.PhysicsQuantityImpl
	 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getPhysicsQuantity()
	 * @generated
	 */
	int PHYSICS_QUANTITY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICS_QUANTITY__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Physics Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICS_QUANTITY__PHYSICS_PROPERTY = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Physics Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICS_QUANTITY_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Physics Quantity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICS_QUANTITY_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelicaML.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelicaML.impl.ExpressionImpl
	 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelicaML.impl.connectImpl <em>connect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelicaML.impl.connectImpl
	 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getconnect()
	 * @generated
	 */
	int CONNECT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__NAME = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__PORT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelicaML.impl.portImpl <em>port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelicaML.impl.portImpl
	 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getport()
	 * @generated
	 */
	int PORT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CONNECTED = 1;

	/**
	 * The number of structural features of the '<em>port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModelicaML.impl.equationImpl <em>equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelicaML.impl.equationImpl
	 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getequation()
	 * @generated
	 */
	int EQUATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelicaML.impl.conditionImpl <em>condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelicaML.impl.conditionImpl
	 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getcondition()
	 * @generated
	 */
	int CONDITION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Criterion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CRITERION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Do</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__DO = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ELSE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link metaModelicaML.ModelicaModel <em>Modelica Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Model</em>'.
	 * @see metaModelicaML.ModelicaModel
	 * @generated
	 */
	EClass getModelicaModel();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModelicaML.ModelicaModel#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see metaModelicaML.ModelicaModel#getConstraint()
	 * @see #getModelicaModel()
	 * @generated
	 */
	EReference getModelicaModel_Constraint();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModelicaML.ModelicaModel#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see metaModelicaML.ModelicaModel#getComponent()
	 * @see #getModelicaModel()
	 * @generated
	 */
	EReference getModelicaModel_Component();

	/**
	 * Returns the meta object for the reference list '{@link metaModelicaML.ModelicaModel#getExtend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extend</em>'.
	 * @see metaModelicaML.ModelicaModel#getExtend()
	 * @see #getModelicaModel()
	 * @generated
	 */
	EReference getModelicaModel_Extend();

	/**
	 * Returns the meta object for the reference list '{@link metaModelicaML.ModelicaModel#getPrototype <em>Prototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prototype</em>'.
	 * @see metaModelicaML.ModelicaModel#getPrototype()
	 * @see #getModelicaModel()
	 * @generated
	 */
	EReference getModelicaModel_Prototype();

	/**
	 * Returns the meta object for the attribute '{@link metaModelicaML.ModelicaModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metaModelicaML.ModelicaModel#getName()
	 * @see #getModelicaModel()
	 * @generated
	 */
	EAttribute getModelicaModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModelicaML.ModelicaModel#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see metaModelicaML.ModelicaModel#getParameter()
	 * @see #getModelicaModel()
	 * @generated
	 */
	EReference getModelicaModel_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link metaModelicaML.ModelicaModel#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see metaModelicaML.ModelicaModel#getPort()
	 * @see #getModelicaModel()
	 * @generated
	 */
	EReference getModelicaModel_Port();

	/**
	 * Returns the meta object for class '{@link metaModelicaML.constraint <em>constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>constraint</em>'.
	 * @see metaModelicaML.constraint
	 * @generated
	 */
	EClass getconstraint();

	/**
	 * Returns the meta object for class '{@link metaModelicaML.ModelicaBool <em>Modelica Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Bool</em>'.
	 * @see metaModelicaML.ModelicaBool
	 * @generated
	 */
	EClass getModelicaBool();

	/**
	 * Returns the meta object for class '{@link metaModelicaML.ModelicaInt <em>Modelica Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Int</em>'.
	 * @see metaModelicaML.ModelicaInt
	 * @generated
	 */
	EClass getModelicaInt();

	/**
	 * Returns the meta object for class '{@link metaModelicaML.ModelicaReal <em>Modelica Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Real</em>'.
	 * @see metaModelicaML.ModelicaReal
	 * @generated
	 */
	EClass getModelicaReal();

	/**
	 * Returns the meta object for class '{@link metaModelicaML.ModelicaComplex <em>Modelica Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelica Complex</em>'.
	 * @see metaModelicaML.ModelicaComplex
	 * @generated
	 */
	EClass getModelicaComplex();

	/**
	 * Returns the meta object for class '{@link metaModelicaML.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see metaModelicaML.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link metaModelicaML.Variable#getVariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Type</em>'.
	 * @see metaModelicaML.Variable#getVariableType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_VariableType();

	/**
	 * Returns the meta object for class '{@link metaModelicaML.PhysicsQuantity <em>Physics Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physics Quantity</em>'.
	 * @see metaModelicaML.PhysicsQuantity
	 * @generated
	 */
	EClass getPhysicsQuantity();

	/**
	 * Returns the meta object for the attribute '{@link metaModelicaML.PhysicsQuantity#getPhysicsProperty <em>Physics Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physics Property</em>'.
	 * @see metaModelicaML.PhysicsQuantity#getPhysicsProperty()
	 * @see #getPhysicsQuantity()
	 * @generated
	 */
	EAttribute getPhysicsQuantity_PhysicsProperty();

	/**
	 * Returns the meta object for class '{@link metaModelicaML.parameter <em>parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>parameter</em>'.
	 * @see metaModelicaML.parameter
	 * @generated
	 */
	EClass getparameter();

	/**
	 * Returns the meta object for the attribute '{@link metaModelicaML.parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metaModelicaML.parameter#getName()
	 * @see #getparameter()
	 * @generated
	 */
	EAttribute getparameter_Name();

	/**
	 * Returns the meta object for class '{@link metaModelicaML.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see metaModelicaML.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link metaModelicaML.Expression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metaModelicaML.Expression#getName()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Name();

	/**
	 * Returns the meta object for class '{@link metaModelicaML.connect <em>connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>connect</em>'.
	 * @see metaModelicaML.connect
	 * @generated
	 */
	EClass getconnect();

	/**
	 * Returns the meta object for the attribute '{@link metaModelicaML.connect#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metaModelicaML.connect#getName()
	 * @see #getconnect()
	 * @generated
	 */
	EAttribute getconnect_Name();

	/**
	 * Returns the meta object for the reference list '{@link metaModelicaML.connect#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port</em>'.
	 * @see metaModelicaML.connect#getPort()
	 * @see #getconnect()
	 * @generated
	 */
	EReference getconnect_Port();

	/**
	 * Returns the meta object for class '{@link metaModelicaML.port <em>port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>port</em>'.
	 * @see metaModelicaML.port
	 * @generated
	 */
	EClass getport();

	/**
	 * Returns the meta object for the attribute '{@link metaModelicaML.port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metaModelicaML.port#getName()
	 * @see #getport()
	 * @generated
	 */
	EAttribute getport_Name();

	/**
	 * Returns the meta object for the reference list '{@link metaModelicaML.port#getConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected</em>'.
	 * @see metaModelicaML.port#getConnected()
	 * @see #getport()
	 * @generated
	 */
	EReference getport_Connected();

	/**
	 * Returns the meta object for class '{@link metaModelicaML.equation <em>equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>equation</em>'.
	 * @see metaModelicaML.equation
	 * @generated
	 */
	EClass getequation();

	/**
	 * Returns the meta object for the reference list '{@link metaModelicaML.equation#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variable</em>'.
	 * @see metaModelicaML.equation#getVariable()
	 * @see #getequation()
	 * @generated
	 */
	EReference getequation_Variable();

	/**
	 * Returns the meta object for class '{@link metaModelicaML.condition <em>condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>condition</em>'.
	 * @see metaModelicaML.condition
	 * @generated
	 */
	EClass getcondition();

	/**
	 * Returns the meta object for the reference '{@link metaModelicaML.condition#getCriterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Criterion</em>'.
	 * @see metaModelicaML.condition#getCriterion()
	 * @see #getcondition()
	 * @generated
	 */
	EReference getcondition_Criterion();

	/**
	 * Returns the meta object for the reference '{@link metaModelicaML.condition#getDo <em>Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Do</em>'.
	 * @see metaModelicaML.condition#getDo()
	 * @see #getcondition()
	 * @generated
	 */
	EReference getcondition_Do();

	/**
	 * Returns the meta object for the reference '{@link metaModelicaML.condition#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else</em>'.
	 * @see metaModelicaML.condition#getElse()
	 * @see #getcondition()
	 * @generated
	 */
	EReference getcondition_Else();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetaModelicaMLFactory getMetaModelicaMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link metaModelicaML.impl.ModelicaModelImpl <em>Modelica Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelicaML.impl.ModelicaModelImpl
		 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getModelicaModel()
		 * @generated
		 */
		EClass MODELICA_MODEL = eINSTANCE.getModelicaModel();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_MODEL__CONSTRAINT = eINSTANCE.getModelicaModel_Constraint();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_MODEL__COMPONENT = eINSTANCE.getModelicaModel_Component();

		/**
		 * The meta object literal for the '<em><b>Extend</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_MODEL__EXTEND = eINSTANCE.getModelicaModel_Extend();

		/**
		 * The meta object literal for the '<em><b>Prototype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_MODEL__PROTOTYPE = eINSTANCE.getModelicaModel_Prototype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELICA_MODEL__NAME = eINSTANCE.getModelicaModel_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_MODEL__PARAMETER = eINSTANCE.getModelicaModel_Parameter();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELICA_MODEL__PORT = eINSTANCE.getModelicaModel_Port();

		/**
		 * The meta object literal for the '{@link metaModelicaML.impl.constraintImpl <em>constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelicaML.impl.constraintImpl
		 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getconstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getconstraint();

		/**
		 * The meta object literal for the '{@link metaModelicaML.impl.ModelicaBoolImpl <em>Modelica Bool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelicaML.impl.ModelicaBoolImpl
		 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getModelicaBool()
		 * @generated
		 */
		EClass MODELICA_BOOL = eINSTANCE.getModelicaBool();

		/**
		 * The meta object literal for the '{@link metaModelicaML.impl.ModelicaIntImpl <em>Modelica Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelicaML.impl.ModelicaIntImpl
		 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getModelicaInt()
		 * @generated
		 */
		EClass MODELICA_INT = eINSTANCE.getModelicaInt();

		/**
		 * The meta object literal for the '{@link metaModelicaML.impl.ModelicaRealImpl <em>Modelica Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelicaML.impl.ModelicaRealImpl
		 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getModelicaReal()
		 * @generated
		 */
		EClass MODELICA_REAL = eINSTANCE.getModelicaReal();

		/**
		 * The meta object literal for the '{@link metaModelicaML.impl.ModelicaComplexImpl <em>Modelica Complex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelicaML.impl.ModelicaComplexImpl
		 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getModelicaComplex()
		 * @generated
		 */
		EClass MODELICA_COMPLEX = eINSTANCE.getModelicaComplex();

		/**
		 * The meta object literal for the '{@link metaModelicaML.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelicaML.impl.VariableImpl
		 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Variable Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VARIABLE_TYPE = eINSTANCE.getVariable_VariableType();

		/**
		 * The meta object literal for the '{@link metaModelicaML.impl.PhysicsQuantityImpl <em>Physics Quantity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelicaML.impl.PhysicsQuantityImpl
		 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getPhysicsQuantity()
		 * @generated
		 */
		EClass PHYSICS_QUANTITY = eINSTANCE.getPhysicsQuantity();

		/**
		 * The meta object literal for the '<em><b>Physics Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICS_QUANTITY__PHYSICS_PROPERTY = eINSTANCE.getPhysicsQuantity_PhysicsProperty();

		/**
		 * The meta object literal for the '{@link metaModelicaML.impl.parameterImpl <em>parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelicaML.impl.parameterImpl
		 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getparameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getparameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getparameter_Name();

		/**
		 * The meta object literal for the '{@link metaModelicaML.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelicaML.impl.ExpressionImpl
		 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__NAME = eINSTANCE.getExpression_Name();

		/**
		 * The meta object literal for the '{@link metaModelicaML.impl.connectImpl <em>connect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelicaML.impl.connectImpl
		 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getconnect()
		 * @generated
		 */
		EClass CONNECT = eINSTANCE.getconnect();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT__NAME = eINSTANCE.getconnect_Name();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECT__PORT = eINSTANCE.getconnect_Port();

		/**
		 * The meta object literal for the '{@link metaModelicaML.impl.portImpl <em>port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelicaML.impl.portImpl
		 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getport()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getport();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getport_Name();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__CONNECTED = eINSTANCE.getport_Connected();

		/**
		 * The meta object literal for the '{@link metaModelicaML.impl.equationImpl <em>equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelicaML.impl.equationImpl
		 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getequation()
		 * @generated
		 */
		EClass EQUATION = eINSTANCE.getequation();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION__VARIABLE = eINSTANCE.getequation_Variable();

		/**
		 * The meta object literal for the '{@link metaModelicaML.impl.conditionImpl <em>condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelicaML.impl.conditionImpl
		 * @see metaModelicaML.impl.MetaModelicaMLPackageImpl#getcondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getcondition();

		/**
		 * The meta object literal for the '<em><b>Criterion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__CRITERION = eINSTANCE.getcondition_Criterion();

		/**
		 * The meta object literal for the '<em><b>Do</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__DO = eINSTANCE.getcondition_Do();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__ELSE = eINSTANCE.getcondition_Else();

	}

} //MetaModelicaMLPackage
