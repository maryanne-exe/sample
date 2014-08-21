package com.packtpub;

        import junit.framework.TestCase;
        import junit.framework.*;

public class CalculatorTest extends TestCase {

    public void testBad() throws Exception {
        Assert.fail("Some bad test has failed");
    }
}