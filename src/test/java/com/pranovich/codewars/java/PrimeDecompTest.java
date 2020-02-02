package com.pranovich.codewars.java;

import org.junit.Assert;
import org.junit.Test;

public class PrimeDecompTest {

    @Test
    public void testPrimeDecompOne() {
        int lst = 7775460;
        Assert.assertEquals("(2**2)(3**3)(5)(7)(11**2)(17)", PrimeDecomp.factors(lst));
    }

    @Test
    public void testPrimeDecompSecond() {
        Assert.assertEquals("(7537)(123863)", PrimeDecomp.factors(933_555_431) );
    }
}
