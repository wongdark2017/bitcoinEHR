/**
 */
package test.test1.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import test.test1.Doctor;
import test.test1.HyperLedger;
import test.test1.Patient;
import test.test1.Test1Factory;
import test.test1.Test1Package;
import test.test1.User;
import test.test1.admin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Test1PackageImpl extends EPackageImpl implements Test1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hyperLedgerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doctorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see test.test1.Test1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Test1PackageImpl() {
		super(eNS_URI, Test1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Test1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Test1Package init() {
		if (isInited)
			return (Test1Package) EPackage.Registry.INSTANCE.getEPackage(Test1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredTest1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Test1PackageImpl theTest1Package = registeredTest1Package instanceof Test1PackageImpl
				? (Test1PackageImpl) registeredTest1Package
				: new Test1PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTest1Package.createPackageContents();

		// Initialize created meta-data
		theTest1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTest1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Test1Package.eNS_URI, theTest1Package);
		return theTest1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHyperLedger() {
		return hyperLedgerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHyperLedger_Data() {
		return (EAttribute) hyperLedgerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHyperLedger_ChainCode() {
		return (EAttribute) hyperLedgerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHyperLedger__QueryData() {
		return hyperLedgerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_ID() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Name() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Hyperledger() {
		return (EReference) userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__Login() {
		return userEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__Register() {
		return userEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoctor() {
		return doctorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoctor__CheckData() {
		return doctorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoctor__AddData() {
		return doctorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoctor__EditData() {
		return doctorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatient() {
		return patientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatient__CheckData() {
		return patientEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatient__GetRecipe() {
		return patientEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getadmin() {
		return adminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getadmin__ResetSystem() {
		return adminEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getadmin__ChangeData() {
		return adminEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test1Factory getTest1Factory() {
		return (Test1Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		hyperLedgerEClass = createEClass(HYPER_LEDGER);
		createEAttribute(hyperLedgerEClass, HYPER_LEDGER__DATA);
		createEAttribute(hyperLedgerEClass, HYPER_LEDGER__CHAIN_CODE);
		createEOperation(hyperLedgerEClass, HYPER_LEDGER___QUERY_DATA);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__ID);
		createEAttribute(userEClass, USER__NAME);
		createEReference(userEClass, USER__HYPERLEDGER);
		createEOperation(userEClass, USER___LOGIN);
		createEOperation(userEClass, USER___REGISTER);

		doctorEClass = createEClass(DOCTOR);
		createEOperation(doctorEClass, DOCTOR___CHECK_DATA);
		createEOperation(doctorEClass, DOCTOR___ADD_DATA);
		createEOperation(doctorEClass, DOCTOR___EDIT_DATA);

		patientEClass = createEClass(PATIENT);
		createEOperation(patientEClass, PATIENT___CHECK_DATA);
		createEOperation(patientEClass, PATIENT___GET_RECIPE);

		adminEClass = createEClass(ADMIN);
		createEOperation(adminEClass, ADMIN___RESET_SYSTEM);
		createEOperation(adminEClass, ADMIN___CHANGE_DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		userEClass.getESuperTypes().add(this.getDoctor());
		userEClass.getESuperTypes().add(this.getPatient());
		userEClass.getESuperTypes().add(this.getadmin());

		// Initialize classes, features, and operations; add parameters
		initEClass(hyperLedgerEClass, HyperLedger.class, "HyperLedger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHyperLedger_Data(), ecorePackage.getEString(), "Data", null, 0, 1, HyperLedger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHyperLedger_ChainCode(), ecorePackage.getEString(), "ChainCode", null, 0, 1,
				HyperLedger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getHyperLedger__QueryData(), null, "queryData", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_ID(), ecorePackage.getEString(), "ID", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Name(), ecorePackage.getEString(), "Name", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Hyperledger(), this.getHyperLedger(), null, "hyperledger", null, 0, 2, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUser__Login(), null, "login", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUser__Register(), null, "register", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(doctorEClass, Doctor.class, "Doctor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDoctor__CheckData(), null, "checkData", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDoctor__AddData(), null, "addData", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDoctor__EditData(), null, "editData", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(patientEClass, Patient.class, "Patient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPatient__CheckData(), null, "checkData", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPatient__GetRecipe(), null, "getRecipe", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(adminEClass, admin.class, "admin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getadmin__ResetSystem(), null, "resetSystem", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getadmin__ChangeData(), null, "changeData", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Test1PackageImpl
