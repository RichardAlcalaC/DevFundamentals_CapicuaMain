import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestMain.
 *
 * @author  Richard Alcala C
 * @version 0.1
 */
public class TestMain
{
    /**
     * Default constructor for test class TestMain
     */
    public TestMain()
    {
    }
    
    @Test
    public void numberOfSingleDigitIsCapicua()
    {
        assertTrue(Main.numberIsCapicua(3));
    }
    
    @Test
    public void numberWithAllEqualDigitsIsCapicua()
    {
        assertTrue(Main.numberIsCapicua(22));
        assertTrue(Main.numberIsCapicua(333));
        assertTrue(Main.numberIsCapicua(444));

    }
    
    @Test
    public void hundredNumberIsNotCapicua()
    {
        assertFalse(Main.numberIsCapicua(100));
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
