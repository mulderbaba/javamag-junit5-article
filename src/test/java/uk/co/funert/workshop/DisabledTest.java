package uk.co.funert.workshop;

import org.junit.gen5.api.Disabled;
import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.fail;

/**
 * Created by mertcaliskan
 */
class DisabledTest {

    @Test
    @Disabled("test is skipped")
    void skippedTest() {
        fail("feautre not implemented yet");
    }
}
