package org.junit.jupiter.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import extentions_batch_2.StringRecursion;

public class StringRecursionTest {
	@Test
    public void testReverseString() {
        assertEquals("olleh", StringRecursion.reverseString("hello"));
        assertEquals("abcde", StringRecursion.reverseString("edcba"));
        assertEquals("", StringRecursion.reverseString(""));
        assertEquals("a", StringRecursion.reverseString("a"));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(StringRecursion.isPalindrome("racecar"));
        assertTrue(StringRecursion.isPalindrome("ILOVECSE131131ESCEVOLI"));
        assertFalse(StringRecursion.isPalindrome("hello"));
        assertFalse(StringRecursion.isPalindrome("noLemonnomelon"));
    }

    @Test
    public void testCountOccurrences() {
        assertEquals(2, StringRecursion.countOccurrences("programming", 'm'));
        assertEquals(3, StringRecursion.countOccurrences("banana", 'a'));
        assertEquals(0, StringRecursion.countOccurrences("hello", 'z'));
        assertEquals(0, StringRecursion.countOccurrences("", 'a'));
    }
}
