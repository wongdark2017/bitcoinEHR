/**
 */
package metaModelicaML.util;

import metaModelicaML.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see metaModelicaML.MetaModelicaMLPackage
 * @generated
 */
public class MetaModelicaMLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetaModelicaMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelicaMLSwitch() {
		if (modelPackage == null) {
			modelPackage = MetaModelicaMLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MetaModelicaMLPackage.MODELICA_MODEL: {
			ModelicaModel modelicaModel = (ModelicaModel) theEObject;
			T result = caseModelicaModel(modelicaModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelicaMLPackage.CONSTRAINT: {
			constraint constraint = (constraint) theEObject;
			T result = caseconstraint(constraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelicaMLPackage.MODELICA_BOOL: {
			ModelicaBool modelicaBool = (ModelicaBool) theEObject;
			T result = caseModelicaBool(modelicaBool);
			if (result == null)
				result = caseVariable(modelicaBool);
			if (result == null)
				result = caseparameter(modelicaBool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelicaMLPackage.MODELICA_INT: {
			ModelicaInt modelicaInt = (ModelicaInt) theEObject;
			T result = caseModelicaInt(modelicaInt);
			if (result == null)
				result = caseVariable(modelicaInt);
			if (result == null)
				result = caseparameter(modelicaInt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelicaMLPackage.MODELICA_REAL: {
			ModelicaReal modelicaReal = (ModelicaReal) theEObject;
			T result = caseModelicaReal(modelicaReal);
			if (result == null)
				result = caseVariable(modelicaReal);
			if (result == null)
				result = caseparameter(modelicaReal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelicaMLPackage.MODELICA_COMPLEX: {
			ModelicaComplex modelicaComplex = (ModelicaComplex) theEObject;
			T result = caseModelicaComplex(modelicaComplex);
			if (result == null)
				result = caseVariable(modelicaComplex);
			if (result == null)
				result = caseparameter(modelicaComplex);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelicaMLPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseparameter(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelicaMLPackage.PHYSICS_QUANTITY: {
			PhysicsQuantity physicsQuantity = (PhysicsQuantity) theEObject;
			T result = casePhysicsQuantity(physicsQuantity);
			if (result == null)
				result = caseparameter(physicsQuantity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelicaMLPackage.PARAMETER: {
			parameter parameter = (parameter) theEObject;
			T result = caseparameter(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelicaMLPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = caseconstraint(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelicaMLPackage.CONNECT: {
			connect connect = (connect) theEObject;
			T result = caseconnect(connect);
			if (result == null)
				result = caseconstraint(connect);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelicaMLPackage.PORT: {
			port port = (port) theEObject;
			T result = caseport(port);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelicaMLPackage.EQUATION: {
			equation equation = (equation) theEObject;
			T result = caseequation(equation);
			if (result == null)
				result = caseExpression(equation);
			if (result == null)
				result = caseconstraint(equation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MetaModelicaMLPackage.CONDITION: {
			condition condition = (condition) theEObject;
			T result = casecondition(condition);
			if (result == null)
				result = caseExpression(condition);
			if (result == null)
				result = caseconstraint(condition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelica Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelica Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelicaModel(ModelicaModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconstraint(constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelica Bool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelica Bool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelicaBool(ModelicaBool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelica Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelica Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelicaInt(ModelicaInt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelica Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelica Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelicaReal(ModelicaReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modelica Complex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modelica Complex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelicaComplex(ModelicaComplex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physics Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physics Quantity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicsQuantity(PhysicsQuantity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseparameter(parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>connect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>connect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconnect(connect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseport(port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>equation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>equation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseequation(equation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecondition(condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MetaModelicaMLSwitch
