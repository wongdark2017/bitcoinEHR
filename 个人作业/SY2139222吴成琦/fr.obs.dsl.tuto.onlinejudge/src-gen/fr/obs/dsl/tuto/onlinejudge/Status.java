/**
 */
package fr.obs.dsl.tuto.onlinejudge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.obs.dsl.tuto.onlinejudge.OnlinejudgePackage#getStatus()
 * @model
 * @generated
 */
public enum Status implements Enumerator {
	/**
	 * The '<em><b>ACCEPTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTED(0, "ACCEPTED", "ACCEPTED"),

	/**
	 * The '<em><b>WRONG QAANSWER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONG_QAANSWER_VALUE
	 * @generated
	 * @ordered
	 */
	WRONG_QAANSWER(1, "WRONG_QAANSWER", "WRONG_QAANSWER"),

	/**
	 * The '<em><b>TLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TLE_VALUE
	 * @generated
	 * @ordered
	 */
	TLE(2, "TLE", "TLE"),

	/**
	 * The '<em><b>MLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MLE_VALUE
	 * @generated
	 * @ordered
	 */
	MLE(3, "MLE", "MLE"),

	/**
	 * The '<em><b>RE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RE_VALUE
	 * @generated
	 * @ordered
	 */
	RE(4, "RE", "RE"),

	/**
	 * The '<em><b>CE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CE_VALUE
	 * @generated
	 * @ordered
	 */
	CE(5, "CE", "CE");

	/**
	 * The '<em><b>ACCEPTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTED_VALUE = 0;

	/**
	 * The '<em><b>WRONG QAANSWER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRONG_QAANSWER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WRONG_QAANSWER_VALUE = 1;

	/**
	 * The '<em><b>TLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TLE_VALUE = 2;

	/**
	 * The '<em><b>MLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MLE_VALUE = 3;

	/**
	 * The '<em><b>RE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RE_VALUE = 4;

	/**
	 * The '<em><b>CE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Status[] VALUES_ARRAY = new Status[] { ACCEPTED, WRONG_QAANSWER, TLE, MLE, RE, CE, };

	/**
	 * A public read-only list of all the '<em><b>Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Status> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Status get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Status result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Status getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Status result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Status get(int value) {
		switch (value) {
		case ACCEPTED_VALUE:
			return ACCEPTED;
		case WRONG_QAANSWER_VALUE:
			return WRONG_QAANSWER;
		case TLE_VALUE:
			return TLE;
		case MLE_VALUE:
			return MLE;
		case RE_VALUE:
			return RE;
		case CE_VALUE:
			return CE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Status(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Status
