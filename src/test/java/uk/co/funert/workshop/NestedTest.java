package uk.co.funert.workshop;

import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Nested;
import org.junit.gen5.api.Test;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

import static org.junit.gen5.api.Assertions.*;

/**
 * Created by mertcaliskan
 */
class NestedTest {

    private Queue<String> items;

    @BeforeEach
    void setup() {
        items = new LinkedList<>();
    }

    @Test
    void isEmpty() {
        assertTrue(items.isEmpty());
    }

    @Nested
    class WhenEmpty {
        @Test
        public void removeShouldThrowException() {
            expectThrows(NoSuchElementException.class, items::remove);
        }
    }

    @Nested
    class WhenWithOneElement {
        @Test
        void addingOneElementShouldIncreaseSize() {
            items.add("Item");
            assertEquals(items.size(), 1);
        }
    }
}
