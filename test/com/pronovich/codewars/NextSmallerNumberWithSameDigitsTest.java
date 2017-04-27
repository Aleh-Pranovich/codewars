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
    public void basicTests123456789() {
        assertEquals(123456789, NextSmallerNumberWithSameDigits.nextSmaller(123456798));
    }
}