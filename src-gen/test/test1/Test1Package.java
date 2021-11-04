/**
 */
package test.test1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see test.test1.Test1Factory
 * @model kind="package"
 * @generated
 */
public interface Test1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "test1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/test1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "test1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Test1Package eINSTANCE = test.test1.impl.Test1PackageImpl.init();

	/**
	 * The meta object id for the '{@link test.test1.impl.HyperLedgerImpl <em>Hyper Ledger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see test.test1.impl.HyperLedgerImpl
	 * @see test.test1.impl.Test1PackageImpl#getHyperLedger()
	 * @generated
	 */
	int HYPER_LEDGER = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LEDGER__DATA = 0;

	/**
	 * The feature id for the '<em><b>Chain Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LEDGER__CHAIN_CODE = 1;

	/**
	 * The number of structural features of the '<em>Hyper Ledger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LEDGER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Query Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LEDGER___QUERY_DATA = 0;

	/**
	 * The number of operations of the '<em>Hyper Ledger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYPER_LEDGER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link test.test1.impl.DoctorImpl <em>Doctor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see test.test1.impl.DoctorImpl
	 * @see test.test1.impl.Test1PackageImpl#getDoctor()
	 * @generated
	 */
	int DOCTOR = 2;

	/**
	 * The number of structural features of the '<em>Doctor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Check Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR___CHECK_DATA = 0;

	/**
	 * The operation id for the '<em>Add Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR___ADD_DATA = 1;

	/**
	 * The operation id for the '<em>Edit Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR___EDIT_DATA = 2;

	/**
	 * The number of operations of the '<em>Doctor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link test.test1.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see test.test1.impl.UserImpl
	 * @see test.test1.impl.Test1PackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = DOCTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = DOCTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hyperledger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__HYPERLEDGER = DOCTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = DOCTOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Add Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ADD_DATA = DOCTOR___ADD_DATA;

	/**
	 * The operation id for the '<em>Edit Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___EDIT_DATA = DOCTOR___EDIT_DATA;

	/**
	 * The operation id for the '<em>Check Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___CHECK_DATA = DOCTOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Recipe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___GET_RECIPE = DOCTOR_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Reset System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___RESET_SYSTEM = DOCTOR_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Change Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___CHANGE_DATA = DOCTOR_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___LOGIN = DOCTOR_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___REGISTER = DOCTOR_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = DOCTOR_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link test.test1.impl.PatientImpl <em>Patient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see test.test1.impl.PatientImpl
	 * @see test.test1.impl.Test1PackageImpl#getPatient()
	 * @generated
	 */
	int PATIENT = 3;

	/**
	 * The number of structural features of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Check Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT___CHECK_DATA = 0;

	/**
	 * The operation id for the '<em>Get Recipe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT___GET_RECIPE = 1;

	/**
	 * The number of operations of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link test.test1.impl.adminImpl <em>admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see test.test1.impl.adminImpl
	 * @see test.test1.impl.Test1PackageImpl#getadmin()
	 * @generated
	 */
	int ADMIN = 4;

	/**
	 * The number of structural features of the '<em>admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Reset System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___RESET_SYSTEM = 0;

	/**
	 * The operation id for the '<em>Change Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN___CHANGE_DATA = 1;

	/**
	 * The number of operations of the '<em>admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link test.test1.HyperLedger <em>Hyper Ledger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hyper Ledger</em>'.
	 * @see test.test1.HyperLedger
	 * @generated
	 */
	EClass getHyperLedger();

	/**
	 * Returns the meta object for the attribute '{@link test.test1.HyperLedger#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see test.test1.HyperLedger#getData()
	 * @see #getHyperLedger()
	 * @generated
	 */
	EAttribute getHyperLedger_Data();

	/**
	 * Returns the meta object for the attribute '{@link test.test1.HyperLedger#getChainCode <em>Chain Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chain Code</em>'.
	 * @see test.test1.HyperLedger#getChainCode()
	 * @see #getHyperLedger()
	 * @generated
	 */
	EAttribute getHyperLedger_ChainCode();

	/**
	 * Returns the meta object for the '{@link test.test1.HyperLedger#queryData() <em>Query Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Query Data</em>' operation.
	 * @see test.test1.HyperLedger#queryData()
	 * @generated
	 */
	EOperation getHyperLedger__QueryData();

	/**
	 * Returns the meta object for class '{@link test.test1.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see test.test1.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link test.test1.User#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see test.test1.User#getID()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_ID();

	/**
	 * Returns the meta object for the attribute '{@link test.test1.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see test.test1.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link test.test1.User#getHyperledger <em>Hyperledger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hyperledger</em>'.
	 * @see test.test1.User#getHyperledger()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Hyperledger();

	/**
	 * Returns the meta object for the '{@link test.test1.User#login() <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see test.test1.User#login()
	 * @generated
	 */
	EOperation getUser__Login();

	/**
	 * Returns the meta object for the '{@link test.test1.User#register() <em>Register</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register</em>' operation.
	 * @see test.test1.User#register()
	 * @generated
	 */
	EOperation getUser__Register();

	/**
	 * Returns the meta object for class '{@link test.test1.Doctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doctor</em>'.
	 * @see test.test1.Doctor
	 * @generated
	 */
	EClass getDoctor();

	/**
	 * Returns the meta object for the '{@link test.test1.Doctor#checkData() <em>Check Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Data</em>' operation.
	 * @see test.test1.Doctor#checkData()
	 * @generated
	 */
	EOperation getDoctor__CheckData();

	/**
	 * Returns the meta object for the '{@link test.test1.Doctor#addData() <em>Add Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Data</em>' operation.
	 * @see test.test1.Doctor#addData()
	 * @generated
	 */
	EOperation getDoctor__AddData();

	/**
	 * Returns the meta object for the '{@link test.test1.Doctor#editData() <em>Edit Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Data</em>' operation.
	 * @see test.test1.Doctor#editData()
	 * @generated
	 */
	EOperation getDoctor__EditData();

	/**
	 * Returns the meta object for class '{@link test.test1.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient</em>'.
	 * @see test.test1.Patient
	 * @generated
	 */
	EClass getPatient();

	/**
	 * Returns the meta object for the '{@link test.test1.Patient#checkData() <em>Check Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Data</em>' operation.
	 * @see test.test1.Patient#checkData()
	 * @generated
	 */
	EOperation getPatient__CheckData();

	/**
	 * Returns the meta object for the '{@link test.test1.Patient#getRecipe() <em>Get Recipe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Recipe</em>' operation.
	 * @see test.test1.Patient#getRecipe()
	 * @generated
	 */
	EOperation getPatient__GetRecipe();

	/**
	 * Returns the meta object for class '{@link test.test1.admin <em>admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>admin</em>'.
	 * @see test.test1.admin
	 * @generated
	 */
	EClass getadmin();

	/**
	 * Returns the meta object for the '{@link test.test1.admin#resetSystem() <em>Reset System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset System</em>' operation.
	 * @see test.test1.admin#resetSystem()
	 * @generated
	 */
	EOperation getadmin__ResetSystem();

	/**
	 * Returns the meta object for the '{@link test.test1.admin#changeData() <em>Change Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Data</em>' operation.
	 * @see test.test1.admin#changeData()
	 * @generated
	 */
	EOperation getadmin__ChangeData();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Test1Factory getTest1Factory();

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
		 * The meta object literal for the '{@link test.test1.impl.HyperLedgerImpl <em>Hyper Ledger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see test.test1.impl.HyperLedgerImpl
		 * @see test.test1.impl.Test1PackageImpl#getHyperLedger()
		 * @generated
		 */
		EClass HYPER_LEDGER = eINSTANCE.getHyperLedger();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPER_LEDGER__DATA = eINSTANCE.getHyperLedger_Data();

		/**
		 * The meta object literal for the '<em><b>Chain Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYPER_LEDGER__CHAIN_CODE = eINSTANCE.getHyperLedger_ChainCode();

		/**
		 * The meta object literal for the '<em><b>Query Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HYPER_LEDGER___QUERY_DATA = eINSTANCE.getHyperLedger__QueryData();

		/**
		 * The meta object literal for the '{@link test.test1.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see test.test1.impl.UserImpl
		 * @see test.test1.impl.Test1PackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Hyperledger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__HYPERLEDGER = eINSTANCE.getUser_Hyperledger();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___LOGIN = eINSTANCE.getUser__Login();

		/**
		 * The meta object literal for the '<em><b>Register</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___REGISTER = eINSTANCE.getUser__Register();

		/**
		 * The meta object literal for the '{@link test.test1.impl.DoctorImpl <em>Doctor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see test.test1.impl.DoctorImpl
		 * @see test.test1.impl.Test1PackageImpl#getDoctor()
		 * @generated
		 */
		EClass DOCTOR = eINSTANCE.getDoctor();

		/**
		 * The meta object literal for the '<em><b>Check Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCTOR___CHECK_DATA = eINSTANCE.getDoctor__CheckData();

		/**
		 * The meta object literal for the '<em><b>Add Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCTOR___ADD_DATA = eINSTANCE.getDoctor__AddData();

		/**
		 * The meta object literal for the '<em><b>Edit Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCTOR___EDIT_DATA = eINSTANCE.getDoctor__EditData();

		/**
		 * The meta object literal for the '{@link test.test1.impl.PatientImpl <em>Patient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see test.test1.impl.PatientImpl
		 * @see test.test1.impl.Test1PackageImpl#getPatient()
		 * @generated
		 */
		EClass PATIENT = eINSTANCE.getPatient();

		/**
		 * The meta object literal for the '<em><b>Check Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATIENT___CHECK_DATA = eINSTANCE.getPatient__CheckData();

		/**
		 * The meta object literal for the '<em><b>Get Recipe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATIENT___GET_RECIPE = eINSTANCE.getPatient__GetRecipe();

		/**
		 * The meta object literal for the '{@link test.test1.impl.adminImpl <em>admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see test.test1.impl.adminImpl
		 * @see test.test1.impl.Test1PackageImpl#getadmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getadmin();

		/**
		 * The meta object literal for the '<em><b>Reset System</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___RESET_SYSTEM = eINSTANCE.getadmin__ResetSystem();

		/**
		 * The meta object literal for the '<em><b>Change Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMIN___CHANGE_DATA = eINSTANCE.getadmin__ChangeData();

	}

} //Test1Package
