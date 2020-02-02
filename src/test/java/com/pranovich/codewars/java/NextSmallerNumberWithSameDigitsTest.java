package com.pranovich.codewars.java;

import org.junit.Assert;
import org.junit.Test;

public class NextSmallerNumberWithSameDigitsTest {

    @Test
    public void basicTests4() {
        Assert.assertEquals(-1, NextSmallerNumberWithSameDigits.nextSmaller(4));
    }

    @Test
    public void basicTests12() {
        Assert.assertEquals(12, NextSmallerNumberWithSameDigits.nextSmaller(21));
    }

    @Test
    public void basicTests513() {
        Assert.assertEquals(513, NextSmallerNumberWithSameDigits.nextSmaller(531));
    }

    @Test
    public void basicTests414() {
        Assert.assertEquals(414, NextSmallerNumberWithSameDigits.nextSmaller(441));
    }

    @Test
    public void basicTests790() {
        Assert.assertEquals(790, NextSmallerNumberWithSameDigits.nextSmaller(907));
    }

    @Test
    public void basicTests1027() {
        Assert.assertEquals(-1, NextSmallerNumberWithSameDigits.nextSmaller(1027));
    }

    @Test
    public void basicTests1234567890120() {
        Assert.assertEquals(1234567890102L, NextSmallerNumberWithSameDigits.nextSmaller(1234567890120L));
    }

    @Test
    public void basicTestsTooLong() {
        Assert.assertEquals(989_997_999_999_999L, NextSmallerNumberWithSameDigits.nextSmaller(989_999_799_999_999L));
    }

    @Test
    public void basicTests153() {
        Assert.assertEquals(153, NextSmallerNumberWithSameDigits.nextSmaller(315));
    }

    @Test
    public void basicTests139085() {
        Assert.assertEquals(139085, NextSmallerNumberWithSameDigits.nextSmaller(139508));
    }

    @Test
    public void basicTests5812349() {
        Assert.assertEquals(5498321, NextSmallerNumberWithSameDigits.nextSmaller(5812349));
    }

}