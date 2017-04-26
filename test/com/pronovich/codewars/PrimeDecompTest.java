package com.pronovich.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeDecompTest {

    @Test
    public void testPrimeDecompOne() {
        int lst = 7775460;
        assertEquals("(2**2)(3**3)(5)(7)(11**2)(17)", PrimeDecomp.factors(lst));
    }

    @Test
    public void testPrimeDecompSecond() {
        assertEquals("(7537)(123863)", PrimeDecomp.factors(933_555_431) );
    }
}
