import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.BeforeClass;
import org.junit.AfterClass;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertEquals;

public class AddTwoValuesTest {

    @BeforeClass
    public static void before() {
        System.out.println("010001010111010010010....011101");
    }

    @AfterClass
    public static void after() {
        System.out.println("PROCESS FINISH IS COMING!!");
    }

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");

    }

    @Test
    public void testAddTwoPositiveValues() {
        Calculate calc = new Calculate();
        assertEquals( 15, calc.add(10, 5));
    }
    @Test
    public void testAddTwoPOSITIVENEGATIVEValues() {
        Calculate calc = new Calculate();
        assertEquals( -5, calc.add(-10, 5));
    }
    @Test
    public void testAddTwoSUPERSTUPIDValues() {
        Calculate calc = new Calculate();
        assertEquals(300, calc.add(200, 100));
    }
    @Test
    public void testAddTwoBOOMPositiveValues() {
        Calculate calc = new Calculate();
        assertEquals( -15, calc.add(-10, -5));
    }
    @Test
    public void testAddTwoNegativeValues() {
        Calculate calc = new Calculate();
        assertEquals( -15, calc.add(-10, -5));

    }

    @Test
    public void subs() {
        Calculate calc = new Calculate();
        assertEquals(5, calc.subs(10, 5));
    }

    @Test
    public void mult() {
        Calculate calc = new Calculate();
        assertEquals(50, calc.mult(10, 5));
    }

    @Test
    public void div() {
        Calculate calc = new Calculate();
        assertEquals(10, calc.div(50, 5));
    }

    @Test
    public void sqwroot() {
        Calculate calc = new Calculate();
        TestCase.assertEquals(11.0, calc.sqroot(121));
    }

    @Ignore
    public void x2please() {
        Calculate calc = new Calculate();
        assertEquals(100, calc.x2(10));
    }

    //TODO
    //add new 5 tests for add() method

    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished....next one!!! ");

    }
}
