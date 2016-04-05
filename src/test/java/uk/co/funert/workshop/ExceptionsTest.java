package uk.co.funert.workshop;

import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertThrows;

/**
 * Created by mertcaliskan
 */
class ExceptionsTest {

    @Test
    void expectingArithmeticException() {
        assertThrows(ArithmeticException.class, () -> divideByZero());
    }

    int divideByZero() {
        return 3/0;
    }
}
