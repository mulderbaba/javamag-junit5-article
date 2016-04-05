package uk.co.funert.workshop;

import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.*;

/**
 * Created by mertcaliskan
 */
class GroupedAssertionsTest {

    @Test
    void groupedAssertionsAreValid() {
        assertAll(
            () -> assertTrue(true),
            () -> assertFalse(false)
        );
    }
}
