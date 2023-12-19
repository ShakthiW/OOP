package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void twoPlusTwo() {
        Main test = new Main();
        assertEquals(4, test.add(2,2));
    }
}