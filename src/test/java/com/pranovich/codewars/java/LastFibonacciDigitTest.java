package com.pranovich.codewars.java;


import org.junit.Assert;
import org.junit.Test;

public class LastFibonacciDigitTest {
    @Test
    public void basicTests() {
        Assert.assertEquals("For n = 1", 1, LastFibonacciDigit.lastFibDigit(1));
        Assert.assertEquals("For n = 21", 6, LastFibonacciDigit.lastFibDigit(21));
        Assert.assertEquals("For n = 302", 1, LastFibonacciDigit.lastFibDigit(302));
        Assert.assertEquals("For n = 4003", 7, LastFibonacciDigit.lastFibDigit(4003));
        Assert.assertEquals("For n = 50004", 8, LastFibonacciDigit.lastFibDigit(50004));
        Assert.assertEquals("For n = 600005", 5, LastFibonacciDigit.lastFibDigit(600005));
        Assert.assertEquals("For n = 7000006", 3, LastFibonacciDigit.lastFibDigit(7000006));
        Assert.assertEquals("For n = 80000007", 8, LastFibonacciDigit.lastFibDigit(80000007));
        Assert.assertEquals("For n = 900000008", 1, LastFibonacciDigit.lastFibDigit(900000008));
        Assert.assertEquals("For n = 1000000009", 9, LastFibonacciDigit.lastFibDigit(1000000009));
    }
}