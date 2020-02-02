package com.pranovich.codewars.java;

    /*Write a function that takes a positive integer and returns the next smaller positive integer containing
    the same digits.

    For example:
    nextSmaller(21) == 12
    nextSmaller(531) == 513
    nextSmaller(2071) == 2017
    Return -1, when there is no smaller number that contains the same digits. Also return -1 when the next smaller
    number with the same digits would require the leading digit to be zero.

    nextSmaller(9) == -1
    nextSmaller(111) == -1
    nextSmaller(135) == -1
    nextSmaller(1027) == -1 // 0721 is out since we don't write numbers with leading zeros
    some tests will include very large numbers.
    test data only employs positive integers.

    https://www.codewars.com/kata/next-smaller-number-with-the-same-digits/train/java*/

import java.util.Arrays;
import java.util.Collections;

public class NextSmallerNumberWithSameDigits {

    public static long nextSmaller(long n) {
        Integer [] digits = splitNumberIntoArrayOfDigits(n);
        arrangeDigitsInCorrectOrder(digits);
        long result = convertArrayOfDigitsIntoLong(digits);
        if (isValid(result, n)) {
            return result;
        }
        return -1;
    }

    private static Integer[] splitNumberIntoArrayOfDigits(long n) {
        int size = String.valueOf(n).length();
        Integer[] digits = new Integer[size];
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = Math.toIntExact(n % 10);
            n /= 10L;
        }
        return digits;
    }

    private static Integer[] arrangeDigitsInCorrectOrder(Integer[] digits) {
        //1. find the first digit from the end which > than previous
        for (int j = digits.length - 2; j >= 0; j--) {
            if (digits[j] > digits[j + 1]) {
                //2. find the next lower digit from the right sequence from the end
                for (int x = digits.length - 1; x > j; x--) {
                    if (digits[j] > digits[x]) {
                        //3. swap them
                        int temp = digits[j];
                        digits[j] = digits[x];
                        digits[x] = temp;
                        //4. sort the right sequence in descending order
                        Arrays.sort(digits, j + 1, digits.length, Collections.reverseOrder());
                        return digits;
                    }
                }
            }
        }
        return digits;
    }

    private static long convertArrayOfDigitsIntoLong(Integer[] digits) {
        StringBuilder builder = new StringBuilder(digits.length);
        for (int digit : digits) {
            builder.append(digit);
        }
        return Long.parseLong(builder.toString());
    }

    private static boolean isValid(long result, long n) {
        if (n == result) {
            return false;
        }
        return String.valueOf(n).length() == String.valueOf(result).length();
    }
}
