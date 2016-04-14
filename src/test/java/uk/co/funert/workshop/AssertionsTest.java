package uk.co.funert.workshop;

import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;

/**
 * Created by mertcaliskan
 */
class AssertionsTest {

    @Test
    void assertionShouldBeTrue() {
        assertEquals(3 == 2, true);
    }

    @Test
    void assertionShouldBeTrueWithLambda() {
        assertEquals(3 == 2, true, () -> "3 not equals to 2!");
    }
}
