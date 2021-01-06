package ru.filimoniya;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import javax.swing.*;

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
