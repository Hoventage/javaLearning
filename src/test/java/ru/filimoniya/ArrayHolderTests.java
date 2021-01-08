package ru.filimoniya;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArrayHolderTests {
    ArrayHolder arrayHolder = new ArrayHolder();

    @Test
    public void shouldCreateDefaultArrayTest() {
        assertEquals(arrayHolder.toString(), "[1, 2, 3, 4, 5]");
    }

    @Test
    public void shouldCatchSomeException() {
        assertEquals(arrayHolder.toString(), "[1, 2, 3, 4, 100]");

    }
}
