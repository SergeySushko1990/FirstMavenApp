package ru.sergeys.testApp;

import junit.framework.TestCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class randomizerTest extends TestCase {

    @Test
    @DisplayName("Тест первый")
    public void testRandomID() {
    int x = randomizer.randomID();
    int y = 1000;
    boolean actual = x < 1000;
    boolean expected = y == 1000;
    assertEquals(expected, actual);
    }


    @Test
@DisplayName("Тест второй")
    public void testDiscount() {
        int actual = randomizer.discount(100, 10);
        int expected = 90;
        assertEquals(expected, actual);
    }
}