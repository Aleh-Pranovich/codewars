package com.pranovich.codewars.java;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfMissingArrayTest {

    @Test
    public void BasicTests() {
        Assert.assertEquals(3, LengthOfMissingArray.getLengthOfMissingArray(new Object[][] { new Object[] { 1, 2 },
                new Object[] { 4, 5, 1, 1 }, new Object[] { 1 }, new Object[] { 5, 6, 7, 8, 9 }} ));

        Assert.assertEquals(2, LengthOfMissingArray.getLengthOfMissingArray(new Object[][] { new Object[] { 5, 2, 9 },
                new Object[] { 4, 5, 1, 1 }, new Object[] { 1 }, new Object[] { 5, 6, 7, 8, 9 }} ));

        Assert.assertEquals(2, LengthOfMissingArray.getLengthOfMissingArray(new Object[][] { new Object[] { null },
                new Object[] { null, null, null } } ));

        Assert.assertEquals(5, LengthOfMissingArray.getLengthOfMissingArray(new Object[][] {
                new Object[] { 'a', 'a', 'a' }, new Object[] { 'a', 'a' }, new Object[] { 'a', 'a', 'a', 'a' },
                new Object[] { 'a' }, new Object[] { 'a', 'a', 'a', 'a', 'a', 'a' }} ));

        Assert.assertEquals(0, LengthOfMissingArray.getLengthOfMissingArray(new Object[][] { }));
    }

    @Test
    public void BasicTestsWr() {
        Assert.assertEquals(0, LengthOfMissingArray.getLengthOfMissingArray( new Object[][]{
                new Object[]{2, 0, 3, 3, 4},
                new Object[]{3, 2, 0},
                new Object[]{},
                new Object[]{3, 0, 0, 2, 4, 1, 4},
                new Object[]{4, 3, 4, 4},
                new Object[]{4, 2, 4, 2, 1, 0, 2, 2, 3},
                new Object[]{4, 1},
                new Object[]{4, 2, 2, 3, 2, 2, 1, 1},
                new Object[]{1},
                new Object[]{4, 0, 4, 4, 0, 0, 1, 3, 3, 3}
        } ) );
    }

    @Test
    public void BasicTestsNull() {
        Assert.assertEquals(0, LengthOfMissingArray.getLengthOfMissingArray( new Object[][]{null} ) );
    }
}
