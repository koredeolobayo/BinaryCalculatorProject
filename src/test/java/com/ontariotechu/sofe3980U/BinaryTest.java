package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest 
{
    // Existing test methods...

    /**
     * Test the OR function with two binary numbers
     */
    @Test
    public void testOr() {
        Binary b1 = new Binary("1010");
        Binary b2 = new Binary("1100");
        Binary result = Binary.or(b1, b2);
        assertTrue(result.getValue().equals("1110"));
    }

    /**
     * Test the AND function with two binary numbers
     */
    @Test
    public void testAnd() {
        Binary b1 = new Binary("1010");
        Binary b2 = new Binary("1100");
        Binary result = Binary.and(b1, b2);
        assertTrue(result.getValue().equals("1000"));
    }

    /**
     * Test the Multiply function with two binary numbers
     */
    @Test
    public void testMultiply() {
        Binary b1 = new Binary("1010");
        Binary b2 = new Binary("1100");
        Binary result = Binary.multiply(b1, b2);
        assertTrue(result.getValue().equals("1111000"));  // Corrected expected value
    }
}
