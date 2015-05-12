package com.ervits.play;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Artem Ervits <are9004@nyp.org>
 */

public class FizzBuzzTest {

    public FizzBuzzTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of fizz method, of class FizzBuzz.
     */
    @Test
    public void testFizz() {
        System.out.println("fizz");
        String result = FizzBuzz.fizz();
        assertEquals(result, "fizz");
    }

    /**
     * Test of buzz method, of class FizzBuzz.
     */
    @Test
    public void testBuzz() {
        System.out.println("buzz");
        String result = FizzBuzz.buzz();
        assertEquals(result, "buzz");
    }

    /**
     * Test of fizzbuzz method, of class FizzBuzz.
     */
    @Test
    public void testFizzbuzz() {
        System.out.println("fizzbuzz");
        String result = FizzBuzz.fizzbuzz();
        assertEquals(result, "fizzbuzz");
    }

    /**
     * Test of whatIsIt method, of class FizzBuzz.
     */
    @Test
    public void testWhatIsItFizz() {
        System.out.println("whatIsIt5");
        int value = 5;
        String expResult = "fizz";
        String result = FizzBuzz.whatIsIt(value);
        assertEquals(expResult, result);
    }

    /**
     * Test of whatIsIt method, of class FizzBuzz.
     */
    @Test
    public void testWhatIsItBuzz() {
        System.out.println("whatIsIt7");
        int value = 7;
        String expResult = "buzz";
        String result = FizzBuzz.whatIsIt(value);
        assertEquals(expResult, result);
    }

    /**
     * Test of whatIsIt method, of class FizzBuzz.
     */
    @Test
    public void testWhatIsItFizzBuzz() {
        System.out.println("whatIsIt35");
        int value = 35;
        String expResult = "fizzbuzz";
        String result = FizzBuzz.whatIsIt(value);
        assertEquals(expResult, result);
    }
}
