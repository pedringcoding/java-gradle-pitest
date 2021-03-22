package es.ekites.mutest.commons;

import lombok.experimental.UtilityClass;

/**
 * The available common operations.
 */
@UtilityClass
public class Operation {

	/**
	 * The add operation
	 * @param a Actual number
	 * @param b incremental number
	 * @return The operation result (+)
	 */
	public static final int add(final int a, final int b) {
		return a + b;
	}

	/**
	 * The subtract operation
	 * @param a actual number
	 * @param b decrement number
	 * @return The operation result (-)
	 */
	public static final int substract(final int a, final int b) {
		return a - b;
	}

	/**
	 * The multiply operation
	 * @param a actual number
	 * @param b exponential number
	 * @return The operation result (*)
	 */
	public static final int multiply(final int a, final int b) {
		return a * b;
	}

	/**
	 * The divide operation
	 * @param a actual number
	 * @param b compare number
	 * @return The operation result (/)
	 */
	public static final int divide(final int a, final int b) {
		return a / b;
	}

}
