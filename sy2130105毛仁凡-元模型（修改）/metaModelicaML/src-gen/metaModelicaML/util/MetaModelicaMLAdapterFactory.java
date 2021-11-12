/**
 */
package metaModelicaML.util;

import metaModelicaML.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see metaModelicaML.MetaModelicaMLPackage
 * @generated
 */
public class MetaModelicaMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetaModelicaMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelicaMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetaModelicaMLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaModelicaMLSwitch<Adapter> modelSwitch = new MetaModelicaMLSwitch<Adapter>() {
		@Override
		public Adapter caseModelicaModel(ModelicaModel object) {
			return createModelicaModelAdapter();
		}

		@Override
		public Adapter caseconstraint(constraint object) {
			return createconstraintAdapter();
		}

		@Override
		public Adapter caseModelicaBool(ModelicaBool object) {
			return createModelicaBoolAdapter();
		}

		@Override
		public Adapter caseModelicaInt(ModelicaInt object) {
			return createModelicaIntAdapter();
		}

		@Override
		public Adapter caseModelicaReal(ModelicaReal object) {
			return createModelicaRealAdapter();
		}

		@Override
		public Adapter caseModelicaComplex(ModelicaComplex object) {
			return createModelicaComplexAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter casePhysicsQuantity(PhysicsQuantity object) {
			return createPhysicsQuantityAdapter();
		}

		@Override
		public Adapter caseparameter(parameter object) {
			return createparameterAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseconnect(connect object) {
			return createconnectAdapter();
		}

		@Override
		public Adapter caseport(port object) {
			return createportAdapter();
		}

		@Override
		public Adapter caseequation(equation object) {
			return createequationAdapter();
		}

		@Override
		public Adapter casecondition(condition object) {
			return createconditionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModelicaML.ModelicaModel <em>Modelica Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModelicaML.ModelicaModel
	 * @generated
	 */
	public Adapter createModelicaModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModelicaML.constraint <em>constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModelicaML.constraint
	 * @generated
	 */
	public Adapter createconstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModelicaML.ModelicaBool <em>Modelica Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModelicaML.ModelicaBool
	 * @generated
	 */
	public Adapter createModelicaBoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModelicaML.ModelicaInt <em>Modelica Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModelicaML.ModelicaInt
	 * @generated
	 */
	public Adapter createModelicaIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModelicaML.ModelicaReal <em>Modelica Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModelicaML.ModelicaReal
	 * @generated
	 */
	public Adapter createModelicaRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModelicaML.ModelicaComplex <em>Modelica Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModelicaML.ModelicaComplex
	 * @generated
	 */
	public Adapter createModelicaComplexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModelicaML.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModelicaML.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModelicaML.PhysicsQuantity <em>Physics Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModelicaML.PhysicsQuantity
	 * @generated
	 */
	public Adapter createPhysicsQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModelicaML.parameter <em>parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModelicaML.parameter
	 * @generated
	 */
	public Adapter createparameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModelicaML.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModelicaML.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModelicaML.connect <em>connect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModelicaML.connect
	 * @generated
	 */
	public Adapter createconnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModelicaML.port <em>port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModelicaML.port
	 * @generated
	 */
	public Adapter createportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModelicaML.equation <em>equation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModelicaML.equation
	 * @generated
	 */
	public Adapter createequationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metaModelicaML.condition <em>condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metaModelicaML.condition
	 * @generated
	 */
	public Adapter createconditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MetaModelicaMLAdapterFactory
