/**
 */
package fr.obs.dsl.tuto.onlinejudge;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgeFactory
 * @model kind="package"
 * @generated
 */
public interface OnlinejudgePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "onlinejudge";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/onlinejudge";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "onlinejudge";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OnlinejudgePackage eINSTANCE = fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.obs.dsl.tuto.onlinejudge.impl.ProblemImpl <em>Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.ProblemImpl
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getProblem()
	 * @generated
	 */
	int PROBLEM = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__TIME = 1;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__MEMORY = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__ID = 3;

	/**
	 * The feature id for the '<em><b>Judgestatus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__JUDGESTATUS = 4;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__PASSWORD = 5;

	/**
	 * The feature id for the '<em><b>Problemtag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__PROBLEMTAG = 6;

	/**
	 * The number of structural features of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obs.dsl.tuto.onlinejudge.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.UserImpl
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getUser()
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
	int USER__ID = 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERNAME = 1;

	/**
	 * The feature id for the '<em><b>Ac num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__AC_NUM = 2;

	/**
	 * The feature id for the '<em><b>Submit num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SUBMIT_NUM = 3;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PROBLEM = 4;

	/**
	 * The feature id for the '<em><b>Contest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CONTEST = 5;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FILE = 6;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obs.dsl.tuto.onlinejudge.impl.JudgeStatusImpl <em>Judge Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.JudgeStatusImpl
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getJudgeStatus()
	 * @generated
	 */
	int JUDGE_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGE_STATUS__ID = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGE_STATUS__CODE = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGE_STATUS__LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>User id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGE_STATUS__USER_ID = 3;

	/**
	 * The feature id for the '<em><b>Problem id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGE_STATUS__PROBLEM_ID = 4;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGE_STATUS__USER = 5;

	/**
	 * The number of structural features of the '<em>Judge Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGE_STATUS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Judge Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUDGE_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obs.dsl.tuto.onlinejudge.impl.ArticlesImpl <em>Articles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.ArticlesImpl
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getArticles()
	 * @generated
	 */
	int ARTICLES = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLES__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLES__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLES__CONTENT = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLES__USER = 3;

	/**
	 * The feature id for the '<em><b>Admin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLES__ADMIN = 4;

	/**
	 * The number of structural features of the '<em>Articles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLES_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Articles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTICLES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obs.dsl.tuto.onlinejudge.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.AdminImpl
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__USERNAME = USER__USERNAME;

	/**
	 * The feature id for the '<em><b>Ac num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__AC_NUM = USER__AC_NUM;

	/**
	 * The feature id for the '<em><b>Submit num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__SUBMIT_NUM = USER__SUBMIT_NUM;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__PROBLEM = USER__PROBLEM;

	/**
	 * The feature id for the '<em><b>Contest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__CONTEST = USER__CONTEST;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__FILE = USER__FILE;

	/**
	 * The feature id for the '<em><b>Isadmin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__ISADMIN = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Articles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__ARTICLES = USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = USER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obs.dsl.tuto.onlinejudge.impl.ContestUserImpl <em>Contest User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.ContestUserImpl
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getContestUser()
	 * @generated
	 */
	int CONTEST_USER = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_USER__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_USER__USERNAME = USER__USERNAME;

	/**
	 * The feature id for the '<em><b>Ac num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_USER__AC_NUM = USER__AC_NUM;

	/**
	 * The feature id for the '<em><b>Submit num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_USER__SUBMIT_NUM = USER__SUBMIT_NUM;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_USER__PROBLEM = USER__PROBLEM;

	/**
	 * The feature id for the '<em><b>Contest</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_USER__CONTEST = USER__CONTEST;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_USER__FILE = USER__FILE;

	/**
	 * The feature id for the '<em><b>Contest id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_USER__CONTEST_ID = USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contest User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_USER_FEATURE_COUNT = USER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contest User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_USER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obs.dsl.tuto.onlinejudge.impl.ContestImpl <em>Contest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.ContestImpl
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getContest()
	 * @generated
	 */
	int CONTEST = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST__NAME = 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST__USER = 2;

	/**
	 * The number of structural features of the '<em>Contest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Contest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obs.dsl.tuto.onlinejudge.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.FileImpl
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getFile()
	 * @generated
	 */
	int FILE = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Md5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MD5 = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__USER = 3;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obs.dsl.tuto.onlinejudge.impl.ProblemTagImpl <em>Problem Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.ProblemTagImpl
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getProblemTag()
	 * @generated
	 */
	int PROBLEM_TAG = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_TAG__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_TAG__NAME = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_TAG__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_TAG__PROBLEM = 3;

	/**
	 * The number of structural features of the '<em>Problem Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_TAG_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Problem Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obs.dsl.tuto.onlinejudge.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obs.dsl.tuto.onlinejudge.Status
	 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 9;

	/**
	 * Returns the meta object for class '{@link fr.obs.dsl.tuto.onlinejudge.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Problem
	 * @generated
	 */
	EClass getProblem();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.Problem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Problem#getDescription()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_Description();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.Problem#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Problem#getTime()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_Time();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.Problem#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Problem#getMemory()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_Memory();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.Problem#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Problem#getID()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obs.dsl.tuto.onlinejudge.Problem#getJudgestatus <em>Judgestatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Judgestatus</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Problem#getJudgestatus()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Judgestatus();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.Problem#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Problem#getPassword()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_Password();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obs.dsl.tuto.onlinejudge.Problem#getProblemtag <em>Problemtag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Problemtag</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Problem#getProblemtag()
	 * @see #getProblem()
	 * @generated
	 */
	EReference getProblem_Problemtag();

	/**
	 * Returns the meta object for class '{@link fr.obs.dsl.tuto.onlinejudge.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.User#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.User#getID()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_ID();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Username();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.User#getAc_num <em>Ac num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ac num</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.User#getAc_num()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Ac_num();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.User#getSubmit_num <em>Submit num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Submit num</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.User#getSubmit_num()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Submit_num();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obs.dsl.tuto.onlinejudge.User#getProblem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Problem</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.User#getProblem()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Problem();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obs.dsl.tuto.onlinejudge.User#getContest <em>Contest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contest</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.User#getContest()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Contest();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obs.dsl.tuto.onlinejudge.User#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.User#getFile()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_File();

	/**
	 * Returns the meta object for class '{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus <em>Judge Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Judge Status</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.JudgeStatus
	 * @generated
	 */
	EClass getJudgeStatus();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getId()
	 * @see #getJudgeStatus()
	 * @generated
	 */
	EAttribute getJudgeStatus_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getCode()
	 * @see #getJudgeStatus()
	 * @generated
	 */
	EAttribute getJudgeStatus_Code();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getLanguage()
	 * @see #getJudgeStatus()
	 * @generated
	 */
	EAttribute getJudgeStatus_Language();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getUser_id <em>User id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User id</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getUser_id()
	 * @see #getJudgeStatus()
	 * @generated
	 */
	EAttribute getJudgeStatus_User_id();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getProblem_id <em>Problem id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Problem id</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getProblem_id()
	 * @see #getJudgeStatus()
	 * @generated
	 */
	EAttribute getJudgeStatus_Problem_id();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.JudgeStatus#getUser()
	 * @see #getJudgeStatus()
	 * @generated
	 */
	EReference getJudgeStatus_User();

	/**
	 * Returns the meta object for class '{@link fr.obs.dsl.tuto.onlinejudge.Articles <em>Articles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Articles</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Articles
	 * @generated
	 */
	EClass getArticles();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.Articles#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Articles#getID()
	 * @see #getArticles()
	 * @generated
	 */
	EAttribute getArticles_ID();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.Articles#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Articles#getTitle()
	 * @see #getArticles()
	 * @generated
	 */
	EAttribute getArticles_Title();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.Articles#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Articles#getContent()
	 * @see #getArticles()
	 * @generated
	 */
	EAttribute getArticles_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obs.dsl.tuto.onlinejudge.Articles#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Articles#getUser()
	 * @see #getArticles()
	 * @generated
	 */
	EReference getArticles_User();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obs.dsl.tuto.onlinejudge.Articles#getAdmin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Admin</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Articles#getAdmin()
	 * @see #getArticles()
	 * @generated
	 */
	EReference getArticles_Admin();

	/**
	 * Returns the meta object for class '{@link fr.obs.dsl.tuto.onlinejudge.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.Admin#isIsadmin <em>Isadmin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isadmin</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Admin#isIsadmin()
	 * @see #getAdmin()
	 * @generated
	 */
	EAttribute getAdmin_Isadmin();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obs.dsl.tuto.onlinejudge.Admin#getArticles <em>Articles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Articles</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Admin#getArticles()
	 * @see #getAdmin()
	 * @generated
	 */
	EReference getAdmin_Articles();

	/**
	 * Returns the meta object for class '{@link fr.obs.dsl.tuto.onlinejudge.ContestUser <em>Contest User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contest User</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.ContestUser
	 * @generated
	 */
	EClass getContestUser();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.ContestUser#getContest_id <em>Contest id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contest id</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.ContestUser#getContest_id()
	 * @see #getContestUser()
	 * @generated
	 */
	EAttribute getContestUser_Contest_id();

	/**
	 * Returns the meta object for class '{@link fr.obs.dsl.tuto.onlinejudge.Contest <em>Contest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contest</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Contest
	 * @generated
	 */
	EClass getContest();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.Contest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Contest#getId()
	 * @see #getContest()
	 * @generated
	 */
	EAttribute getContest_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.Contest#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Contest#getName()
	 * @see #getContest()
	 * @generated
	 */
	EAttribute getContest_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obs.dsl.tuto.onlinejudge.Contest#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Contest#getUser()
	 * @see #getContest()
	 * @generated
	 */
	EReference getContest_User();

	/**
	 * Returns the meta object for class '{@link fr.obs.dsl.tuto.onlinejudge.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.File#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.File#getID()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_ID();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.File#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.File#getType()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.File#getMd5 <em>Md5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Md5</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.File#getMd5()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Md5();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obs.dsl.tuto.onlinejudge.File#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.File#getUser()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_User();

	/**
	 * Returns the meta object for class '{@link fr.obs.dsl.tuto.onlinejudge.ProblemTag <em>Problem Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Tag</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.ProblemTag
	 * @generated
	 */
	EClass getProblemTag();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.ProblemTag#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.ProblemTag#getID()
	 * @see #getProblemTag()
	 * @generated
	 */
	EAttribute getProblemTag_ID();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.ProblemTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.ProblemTag#getName()
	 * @see #getProblemTag()
	 * @generated
	 */
	EAttribute getProblemTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.obs.dsl.tuto.onlinejudge.ProblemTag#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.ProblemTag#getColor()
	 * @see #getProblemTag()
	 * @generated
	 */
	EAttribute getProblemTag_Color();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obs.dsl.tuto.onlinejudge.ProblemTag#getProblem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Problem</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.ProblemTag#getProblem()
	 * @see #getProblemTag()
	 * @generated
	 */
	EReference getProblemTag_Problem();

	/**
	 * Returns the meta object for enum '{@link fr.obs.dsl.tuto.onlinejudge.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see fr.obs.dsl.tuto.onlinejudge.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OnlinejudgeFactory getOnlinejudgeFactory();

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
		 * The meta object literal for the '{@link fr.obs.dsl.tuto.onlinejudge.impl.ProblemImpl <em>Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.ProblemImpl
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getProblem()
		 * @generated
		 */
		EClass PROBLEM = eINSTANCE.getProblem();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__DESCRIPTION = eINSTANCE.getProblem_Description();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__TIME = eINSTANCE.getProblem_Time();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__MEMORY = eINSTANCE.getProblem_Memory();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__ID = eINSTANCE.getProblem_ID();

		/**
		 * The meta object literal for the '<em><b>Judgestatus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM__JUDGESTATUS = eINSTANCE.getProblem_Judgestatus();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__PASSWORD = eINSTANCE.getProblem_Password();

		/**
		 * The meta object literal for the '<em><b>Problemtag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM__PROBLEMTAG = eINSTANCE.getProblem_Problemtag();

		/**
		 * The meta object literal for the '{@link fr.obs.dsl.tuto.onlinejudge.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.UserImpl
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getUser()
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
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USERNAME = eINSTANCE.getUser_Username();

		/**
		 * The meta object literal for the '<em><b>Ac num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__AC_NUM = eINSTANCE.getUser_Ac_num();

		/**
		 * The meta object literal for the '<em><b>Submit num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__SUBMIT_NUM = eINSTANCE.getUser_Submit_num();

		/**
		 * The meta object literal for the '<em><b>Problem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__PROBLEM = eINSTANCE.getUser_Problem();

		/**
		 * The meta object literal for the '<em><b>Contest</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__CONTEST = eINSTANCE.getUser_Contest();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__FILE = eINSTANCE.getUser_File();

		/**
		 * The meta object literal for the '{@link fr.obs.dsl.tuto.onlinejudge.impl.JudgeStatusImpl <em>Judge Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.JudgeStatusImpl
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getJudgeStatus()
		 * @generated
		 */
		EClass JUDGE_STATUS = eINSTANCE.getJudgeStatus();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDGE_STATUS__ID = eINSTANCE.getJudgeStatus_Id();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDGE_STATUS__CODE = eINSTANCE.getJudgeStatus_Code();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDGE_STATUS__LANGUAGE = eINSTANCE.getJudgeStatus_Language();

		/**
		 * The meta object literal for the '<em><b>User id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDGE_STATUS__USER_ID = eINSTANCE.getJudgeStatus_User_id();

		/**
		 * The meta object literal for the '<em><b>Problem id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUDGE_STATUS__PROBLEM_ID = eINSTANCE.getJudgeStatus_Problem_id();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUDGE_STATUS__USER = eINSTANCE.getJudgeStatus_User();

		/**
		 * The meta object literal for the '{@link fr.obs.dsl.tuto.onlinejudge.impl.ArticlesImpl <em>Articles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.ArticlesImpl
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getArticles()
		 * @generated
		 */
		EClass ARTICLES = eINSTANCE.getArticles();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLES__ID = eINSTANCE.getArticles_ID();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLES__TITLE = eINSTANCE.getArticles_Title();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTICLES__CONTENT = eINSTANCE.getArticles_Content();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTICLES__USER = eINSTANCE.getArticles_User();

		/**
		 * The meta object literal for the '<em><b>Admin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTICLES__ADMIN = eINSTANCE.getArticles_Admin();

		/**
		 * The meta object literal for the '{@link fr.obs.dsl.tuto.onlinejudge.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.AdminImpl
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '<em><b>Isadmin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMIN__ISADMIN = eINSTANCE.getAdmin_Isadmin();

		/**
		 * The meta object literal for the '<em><b>Articles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN__ARTICLES = eINSTANCE.getAdmin_Articles();

		/**
		 * The meta object literal for the '{@link fr.obs.dsl.tuto.onlinejudge.impl.ContestUserImpl <em>Contest User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.ContestUserImpl
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getContestUser()
		 * @generated
		 */
		EClass CONTEST_USER = eINSTANCE.getContestUser();

		/**
		 * The meta object literal for the '<em><b>Contest id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEST_USER__CONTEST_ID = eINSTANCE.getContestUser_Contest_id();

		/**
		 * The meta object literal for the '{@link fr.obs.dsl.tuto.onlinejudge.impl.ContestImpl <em>Contest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.ContestImpl
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getContest()
		 * @generated
		 */
		EClass CONTEST = eINSTANCE.getContest();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEST__ID = eINSTANCE.getContest_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEST__NAME = eINSTANCE.getContest_Name();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEST__USER = eINSTANCE.getContest_User();

		/**
		 * The meta object literal for the '{@link fr.obs.dsl.tuto.onlinejudge.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.FileImpl
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__ID = eINSTANCE.getFile_ID();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__TYPE = eINSTANCE.getFile_Type();

		/**
		 * The meta object literal for the '<em><b>Md5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__MD5 = eINSTANCE.getFile_Md5();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__USER = eINSTANCE.getFile_User();

		/**
		 * The meta object literal for the '{@link fr.obs.dsl.tuto.onlinejudge.impl.ProblemTagImpl <em>Problem Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.ProblemTagImpl
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getProblemTag()
		 * @generated
		 */
		EClass PROBLEM_TAG = eINSTANCE.getProblemTag();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM_TAG__ID = eINSTANCE.getProblemTag_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM_TAG__NAME = eINSTANCE.getProblemTag_Name();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM_TAG__COLOR = eINSTANCE.getProblemTag_Color();

		/**
		 * The meta object literal for the '<em><b>Problem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBLEM_TAG__PROBLEM = eINSTANCE.getProblemTag_Problem();

		/**
		 * The meta object literal for the '{@link fr.obs.dsl.tuto.onlinejudge.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obs.dsl.tuto.onlinejudge.Status
		 * @see fr.obs.dsl.tuto.onlinejudge.impl.OnlinejudgePackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

	}

} //OnlinejudgePackage
