package uk.co.funert.workshop;

import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;

/**
 * Created by mertcaliskan
 */
@DisplayName("This is my awesome test class")
class SimpleNamedTest {

    @DisplayName("This is my lonely test method")
    @Test
    void simpleTestIsPassing() {
        org.junit.gen5.api.Assertions.assertTrue(true);
    }
}
