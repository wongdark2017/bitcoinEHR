/**
 */
package metaModelicaML.impl;

import metaModelicaML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaModelicaMLFactoryImpl extends EFactoryImpl implements MetaModelicaMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetaModelicaMLFactory init() {
		try {
			MetaModelicaMLFactory theMetaModelicaMLFactory = (MetaModelicaMLFactory) EPackage.Registry.INSTANCE
					.getEFactory(MetaModelicaMLPackage.eNS_URI);
			if (theMetaModelicaMLFactory != null) {
				return theMetaModelicaMLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetaModelicaMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelicaMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MetaModelicaMLPackage.MODELICA_MODEL:
			return createModelicaModel();
		case MetaModelicaMLPackage.MODELICA_BOOL:
			return createModelicaBool();
		case MetaModelicaMLPackage.MODELICA_INT:
			return createModelicaInt();
		case MetaModelicaMLPackage.MODELICA_REAL:
			return createModelicaReal();
		case MetaModelicaMLPackage.MODELICA_COMPLEX:
			return createModelicaComplex();
		case MetaModelicaMLPackage.VARIABLE:
			return createVariable();
		case MetaModelicaMLPackage.PHYSICS_QUANTITY:
			return createPhysicsQuantity();
		case MetaModelicaMLPackage.CONNECT:
			return createconnect();
		case MetaModelicaMLPackage.PORT:
			return createport();
		case MetaModelicaMLPackage.EQUATION:
			return createequation();
		case MetaModelicaMLPackage.CONDITION:
			return createcondition();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaModel createModelicaModel() {
		ModelicaModelImpl modelicaModel = new ModelicaModelImpl();
		return modelicaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaBool createModelicaBool() {
		ModelicaBoolImpl modelicaBool = new ModelicaBoolImpl();
		return modelicaBool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaInt createModelicaInt() {
		ModelicaIntImpl modelicaInt = new ModelicaIntImpl();
		return modelicaInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaReal createModelicaReal() {
		ModelicaRealImpl modelicaReal = new ModelicaRealImpl();
		return modelicaReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaComplex createModelicaComplex() {
		ModelicaComplexImpl modelicaComplex = new ModelicaComplexImpl();
		return modelicaComplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicsQuantity createPhysicsQuantity() {
		PhysicsQuantityImpl physicsQuantity = new PhysicsQuantityImpl();
		return physicsQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public connect createconnect() {
		connectImpl connect = new connectImpl();
		return connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public port createport() {
		portImpl port = new portImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public equation createequation() {
		equationImpl equation = new equationImpl();
		return equation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public condition createcondition() {
		conditionImpl condition = new conditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelicaMLPackage getMetaModelicaMLPackage() {
		return (MetaModelicaMLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetaModelicaMLPackage getPackage() {
		return MetaModelicaMLPackage.eINSTANCE;
	}

} //MetaModelicaMLFactoryImpl
