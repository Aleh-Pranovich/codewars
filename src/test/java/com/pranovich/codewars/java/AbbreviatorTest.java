package com.pranovich.codewars.java;

import org.junit.Assert;
import org.junit.Test;


public class AbbreviatorTest {

    private Abbreviator abbr = new Abbreviator();

    @Test
    public void testInternationalization() {
        Assert.assertEquals("i18n", abbr.abbreviate("internationalization"));
    }

}