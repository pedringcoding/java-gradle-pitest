package es.ekites.mutest.commons;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Unit Test Class for {@link Operation} to operation utilities.
 * Only execute tests to increment fake-coverage.
 */
@DisplayName("Fake-Tests for common operations")
@TestMethodOrder(MethodName.class)
public final class OperationCoverageTest {

	@Test
	@DisplayName("For operation (7 + 5), should return 12")
	public void test_add() {
		Operation.add(7, 5);
	}

	@Test
	@DisplayName("For operation (15 - 3), should return 12")
	public void test_substract() {
		Operation.substract(15, 3);
	}

	@Test
	@DisplayName("For operation (6 * 2), should return 12")
	public void test_multiply() {
		Operation.multiply(6, 2);
	}

	@Test
	@DisplayName("For operation (24 / 2), should return 12")
	public void test_divide() {
		Operation.divide(24, 2);
	}
}
