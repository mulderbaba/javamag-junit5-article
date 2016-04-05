package uk.co.funert.workshop;

import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assumptions.*;

/**
 * Created by mertcaliskan
 */
class AssumptionsTest {

    @Test
    void shouldBeTrue() {
        assumeTrue(true);
    }

    @Test
    void shouldBeAlsoTrue() {
        assumingThat(true, () -> System.out.println("Assumption is valid!"));
    }

    @Test
    void shouldBeFalse() {
        assumeFalse(false);
    }
}
