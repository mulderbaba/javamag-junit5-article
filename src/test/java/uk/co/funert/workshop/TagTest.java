package uk.co.funert.workshop;

import org.junit.gen5.api.Tag;
import org.junit.gen5.api.Tags;
import org.junit.gen5.api.Test;

/**
 * Created by mertcaliskan
 */
@Tag("marvelous-test")
@Tags({@Tag("fantastic-test"), @Tag("awesome-test")})
class TagTest {

    @Test
    void normalTest() {
    }

    @Test
    @Tag("fast-test")
    void fastTest() {
    }
}
