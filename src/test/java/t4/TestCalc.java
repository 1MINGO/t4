package t4;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */
public class TestCalc
    extends TestCase
{
    private final Assertions Assert = null;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestCalc()
    {
        int result = Calc.add(3,2);
        Assert.assertEquals(5, result );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestCalc.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
