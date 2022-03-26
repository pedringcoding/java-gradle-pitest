package es.pedcod.mutation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Unit Test Class for {@link Operation} to utilities.
 * Only execute tests to return true-coverage.
 */
@DisplayName("True-Tests for common operations")
@TestMethodOrder(MethodName.class)
public class OperationMutationTest {

	@Test
	@DisplayName("For operation (7 + 5), should return 12")
	public void test_add() {
		assertThat(12).isEqualTo(Operation.add(7, 5));
	}

	@Test
	@DisplayName("For operation (15 - 3), should return 12")
	public void test_substract() {
		assertThat(12).isEqualTo(Operation.substract(15, 3));
	}

	@Test
	@DisplayName("For operation (6 * 2), should return 12")
	public void test_multiply() {
		assertThat(12).isEqualTo(Operation.multiply(6, 2));
	}

	@Test
	@DisplayName("For operation (24 / 2), should return 12")
	public void test_divide() {
		assertThat(12).isEqualTo(Operation.divide(24, 2));
	}

	@Test
	@DisplayName("Throws UnsupportedOperationException when try instance utility class")
	public void whenInstanciateClass_shouldThrowUnsupportedOperationException() throws Exception {
		Constructor<Operation> constructor = Operation.class.getDeclaredConstructor();

		assertThat(constructor).satisfies(cons -> {
			assertThat(Modifier.isPrivate(cons.getModifiers())).isTrue();
			assertThat(Modifier.isStatic(cons.getModifiers())).isFalse();
		});

		// Should throw UnsupportedOperation exception when cannot be instantiated
		constructor.setAccessible(Boolean.TRUE);
		assertThrows(InvocationTargetException.class, constructor::newInstance);
	}

}
