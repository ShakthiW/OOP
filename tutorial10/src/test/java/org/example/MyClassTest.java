package org.example;

import org.junit.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

public class MyClassTest {
    @Test
    public void testForString() {
        MyClass myClass = new MyClass();
        assertThrows(InputMismatchException.class,  () -> {
            myClass;
        });
    }
}