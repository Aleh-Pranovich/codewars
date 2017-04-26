package tes;

import org.junit.Test;

import static org.junit.Assert.*;

public class SmallerNumberWithSameDigitsTest {

    @Test
    public void basicTests() {
        assertEquals(12, SmallerNumberWithSameDigits.nextSmaller(21));
        assertEquals(790, SmallerNumberWithSameDigits.nextSmaller(907));
        assertEquals(513, SmallerNumberWithSameDigits.nextSmaller(531));
        assertEquals(-1, SmallerNumberWithSameDigits.nextSmaller(1027));
        assertEquals(414, SmallerNumberWithSameDigits.nextSmaller(441));
        assertEquals(123456789, SmallerNumberWithSameDigits.nextSmaller(123456798));
    }

}