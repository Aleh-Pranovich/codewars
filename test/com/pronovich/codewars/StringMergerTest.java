package com.pronovich.codewars;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringMergerTest {

    @Test
    public void normalHappyFlow() {
        assertTrue("codewars can be created from code and wars",
                StringMerger.isMerge("codewars", "code", "wars"));
        assertTrue("codewars can be created from cdwr and oeas",
                StringMerger.isMerge("codewars", "cdwr", "oeas"));
        assertFalse("Codewars are not codwars",
                StringMerger.isMerge("codewars", "cod", "wars"));
    }

    @Test
    public void canHandleCharactersInWrongOrder() {
        assertFalse("codewars can't be created from code and wasr",
                StringMerger.isMerge("codewars", "code", "wasr"));
    }

    @Test
    public void canHandleExtraChars() {
        assertFalse("codewars is not codewarss",
                StringMerger.isMerge("codewars", "code", "warss"));
    }

    @Test
    public void evenMoreRandomCases() {
        assertTrue("40\\EH= t<\\pcKqKl6q_q",
                StringMerger.isMerge("40\\EH= t<\\pcKqKl6q_q", "\\<K_q", "40EH= t\\pcKql6q"));
    }

    @Test
    public void evenMoreRandomCases2() {
        assertTrue("KqKl6q_q",
                StringMerger.isMerge("KqKl6q_q", "K_q", "Kql6q"));
    }

    @Test
    public void correctTest() {
        assertTrue("abcdeabc is correct for ",
                StringMerger.isMerge("abcdefabc", "abcdef", "abc"));
    }
}
