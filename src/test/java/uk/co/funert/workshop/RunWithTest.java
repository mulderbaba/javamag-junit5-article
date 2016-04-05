package uk.co.funert.workshop;

import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

/**
 * Created by mertcaliskan
 */
@RunWith(JUnit5.class)
public class RunWithTest {

    @Test
    public void simpleTestIsPassing() {
        org.junit.gen5.api.Assertions.assertTrue(true);
    }
}
