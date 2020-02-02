package com.pranovich.codewars.java;

import org.junit.Assert;
import org.junit.Test;

public class StringMergerTest {

    @Test
    public void normalHappyFlow() {
        Assert.assertTrue("codewars can be created from code and wars",
                StringMerger.isMerge("codewars", "code", "wars"));
        Assert.assertTrue("codewars can be created from cdwr and oeas",
                StringMerger.isMerge("codewars", "cdwr", "oeas"));
        Assert.assertFalse("Codewars are not codwars",
                StringMerger.isMerge("codewars", "cod", "wars"));
    }

    @Test
    public void canHandleCharactersInWrongOrder() {
        Assert.assertFalse("codewars can't be created from code and wasr",
                StringMerger.isMerge("codewars", "code", "wasr"));
    }

    @Test
    public void canHandleExtraChars() {
        Assert.assertFalse("codewars is not codewarss",
                StringMerger.isMerge("codewars", "code", "warss"));
    }

    @Test
    public void evenMoreRandomCases() {
        Assert.assertTrue("40\\EH= t<\\pcKqKl6q_q",
                StringMerger.isMerge("40\\EH= t<\\pcKqKl6q_q", "\\<K_q", "40EH= t\\pcKql6q"));
    }

    @Test
    public void evenMoreRandomCases2() {
        Assert.assertTrue("KqKl6q_q",
                StringMerger.isMerge("KqKl6q_q", "K_q", "Kql6q"));
    }

    @Test
    public void correctTest() {
        Assert.assertTrue("abcdeabc is correct for ",
                StringMerger.isMerge("abcdefabc", "abcdef", "abc"));
    }
}
