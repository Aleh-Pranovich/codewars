package com.pronovich.codewars;

    /* You get an array of arrays.
    If you sort the arrays by their length, you will see, that their length-values are consecutive.
    But one array is missing!

    You have to write a method, that return the length of the missing array.

    Example:
    [[1, 2], [4, 5, 1, 1], [1], [5, 6, 7, 8, 9]] --> 3

    If the array of arrays is null/nil or empty, the method should return 0.

    When an array in the array is null or empty, the method should return 0 too!
    There will always be a missing element and its length will be always between the given arrays.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LengthOfMissingArray {

    public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
        if (isNotValid(arrayOfArrays)) {
            return 0;
        }
        List<Integer> lengthsOfhArrays = getSortedLengthsOfArrays(arrayOfArrays);
        return getMissedLength(lengthsOfhArrays);
    }

    private static boolean isNotValid(Object[][] arrayOfArrays) {
        if ( arrayOfArrays == null || arrayOfArrays.length == 0 ) {
            return true;
        }
        for (Object[] arr : arrayOfArrays) {
            if (arr == null || arr.length == 0) {
                return true;
            }
        }
        return false;
    }

    private static List<Integer> getSortedLengthsOfArrays(Object[][] arrayOfArrays) {
        List<Integer> lengthsOfArrays = new ArrayList<>();
        for (Object[] arr : arrayOfArrays) {
            lengthsOfArrays.add(arr.length);
        }
        Collections.sort(lengthsOfArrays);
        return lengthsOfArrays;
    }

    private static int getMissedLength(List<Integer> lengthArr) {
        for (int i = 0; i < lengthArr.size() - 1; i++) {
            int currentLength =  lengthArr.get(i);
            int nextLength = lengthArr.get(i + 1);
            if ( currentLength + 1 !=  nextLength ) {
                return currentLength + 1;
            }
        }
        return 0;
    }
}
