package uk.co.funert.workshop;

import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.expectThrows;

/**
 * Created by mertcaliskan
 */
class Exceptions2Test {

    @Test
    void expectingArithmeticException() {
        ArithmeticException exception = expectThrows(ArithmeticException.class, () -> divideByZero());
        assertEquals(exception.getMessage(), "/ by zero");
    }

    int divideByZero() {
        return 3/0;
    }
}
