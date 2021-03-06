package uk.co.funert.workshop;

import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.TestInfo;
import org.junit.gen5.api.TestReporter;

import static org.junit.gen5.api.Assertions.assertTrue;

/**
 * Created by mertcaliskan
 */
class ResolversTest {

    @Test
    @DisplayName("my awesome test")
    void shouldAssertTrue(TestInfo info, TestReporter reporter) {
        System.out.println("Test " + info.getDisplayName() + " is executed.");
        assertTrue(true);
        reporter.publishEntry("a key", "a value");
    }
}
