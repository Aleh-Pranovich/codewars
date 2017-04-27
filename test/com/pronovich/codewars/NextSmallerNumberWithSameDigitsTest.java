package com.pronovich.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class NextSmallerNumberWithSameDigitsTest {

    @Test
    public void basicTests4() {
        assertEquals(-1, NextSmallerNumberWithSameDigits.nextSmaller(4));
    }

    @Test
    public void basicTests12() {
        assertEquals(12, NextSmallerNumberWithSameDigits.nextSmaller(21));
    }

    @Test
    public void basicTests513() {
        assertEquals(513, NextSmallerNumberWithSameDigits.nextSmaller(531));
    }

    @Test
    public void basicTests414() {
        assertEquals(414, NextSmallerNumberWithSameDigits.nextSmaller(441));
    }

    @Test
    public void basicTests790() {
        assertEquals(790, NextSmallerNumberWithSameDigits.nextSmaller(907));
    }

    @Test
    public void basicTests1027() {
        assertEquals(-1, NextSmallerNumberWithSameDigits.nextSmaller(1027));
    }

    @Test
    public void basicTests1234567890120() {
        assertEquals(1234567890102L, NextSmallerNumberWithSameDigits.nextSmaller(1234567890120L));
    }

    @Test
    public void basicTestsTooLong() {
        assertEquals(989_997_999_999_999L, NextSmallerNumberWithSameDigits.nextSmaller(989_999_799_999_999L));
    }

    @Test
    public void basicTests153() {
        assertEquals(153, NextSmallerNumberWithSameDigits.nextSmaller(315));
    }

    @Test
    public void basicTests139085() {
        assertEquals(139085, NextSmallerNumberWithSameDigits.nextSmaller(139508));
    }

    @Test
    public void basicTests5812349() {
        assertEquals(5498321, NextSmallerNumberWithSameDigits.nextSmaller(5812349));
    }

}