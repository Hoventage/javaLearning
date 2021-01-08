package ru.filimoniya;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Unit test for simple App.
 */
public class ArrayHolderTestsRunner
{

    @Test
    public static void main(String[] args)
    {
        Result result = JUnitCore.runClasses(ArrayHolderTests.class);

        for (Failure failure : result.getFailures())
        {
            System.out.println(failure.toString());
        }
    }
}
