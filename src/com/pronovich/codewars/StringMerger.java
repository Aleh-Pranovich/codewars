package com.pronovich.codewars;

    /*
    At a job interview, you are challenged to write an algorithm to check if a given string, s, can be formed from
    two other strings, part1 and part2.
    The restriction is that the characters in part1 and part2 are in the same order as in s.
    The interviewer gives you the following example and tells you to figure out the rest from the given test cases.
    For example:
    'codewars' is a merge from 'cdw' and 'oears':
    s:  c o d e w a r s   = codewars
    part1:  c   d   w         = cdw
    part2:    o   e   a r s   = oears
    */

import java.util.Arrays;

public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        char[] resChars = s.replaceAll("\\s", "").toCharArray();
        char[] firstChars = part1.replaceAll("\\s", "").toCharArray();
        char[] secondChars = part2.replaceAll("\\s", "").toCharArray();

        int firstIndex = 0;
        int secondIndex = 0;

        for (int resIndex = 0; resIndex < resChars.length; resIndex++) {
            if ( matchWithCharInResArray(firstChars, firstIndex, resChars, resIndex) && !matchWithCharInResArray(secondChars, secondIndex, resChars, resIndex) ) {
                firstIndex++;
            } else if ( !matchWithCharInResArray(firstChars, firstIndex, resChars, resIndex) && matchWithCharInResArray(secondChars, secondIndex, resChars, resIndex) ) {
                secondIndex++;
            } else if ( matchWithCharInResArray(firstChars, firstIndex, resChars, resIndex) && matchWithCharInResArray(secondChars, secondIndex, resChars, resIndex) ) {
                char[] resCharsRemainder = Arrays.copyOfRange(resChars, resIndex, resChars.length );
                char[] firstCharsRemainder = Arrays.copyOfRange(firstChars, firstIndex, firstChars.length );
                char[] secondCharsRemainder = Arrays.copyOfRange(secondChars, secondIndex, secondChars.length );

                if ( firstDifferenceInFirstArray(resCharsRemainder, firstCharsRemainder, secondCharsRemainder ) ) {
                    secondIndex++;
                } else {
                    firstIndex++;
                }
            } else {
                return false;
            }
        }
        if (remainedUnusedChars(firstChars, secondChars, firstIndex, secondIndex)) {
            return false;
        }
        return true;
    }

    private static boolean remainedUnusedChars(char[] firstChars, char[] secondChars, int firstIndex, int secondIndex) {
        return firstIndex != firstChars.length || secondIndex != secondChars.length;
    }

    private static boolean matchWithCharInResArray(char[] arrChars, int arrIndex, char[] resChars, int resIndex) {
        if ( arrIndex >= arrChars.length ) {
            return false;
        }
        return resChars[resIndex] == arrChars[arrIndex];
    }

    private static boolean firstDifferenceInFirstArray(char[] resultChars, char[] firstChars, char[] secondChars) {
        for (int i = 0; i < lengthOfShortestArray(firstChars, secondChars); i++) {
            if (firstChars[i] != secondChars[i]) {
                return firstChars[i] != resultChars[i];
            }
        }
        return false;
    }

    private static int lengthOfShortestArray(char[] firstChars, char[] secondChars) {
        if (firstChars.length < secondChars.length) {
            return  firstChars.length;
        }
        return secondChars.length;
    }
}
