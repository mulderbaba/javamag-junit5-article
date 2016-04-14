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
        StringIndexOutOfBoundsException exception = expectThrows(StringIndexOutOfBoundsException.class,
                () -> "JUnit5 Rocks!".substring(-1));
        assertEquals(exception.getMessage(), "String index out of range: -1");
    }
}
