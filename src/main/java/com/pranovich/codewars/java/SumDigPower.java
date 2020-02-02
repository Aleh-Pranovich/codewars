package com.pranovich.codewars.java;

    /*The number 89 is the first integer with more than one digit that fulfills the property partially introduced in
     the title of this kata. What's the use of saying "Eureka"? Because this sum gives the same number.

    In effect: 89 = 8^1 + 9^2

    The next number in having this property is 135.
    See this property again: 135 = 1^1 + 3^2 + 5^3

    We need a function to collect these numbers, that may receive two integers a, b that defines the range [a, b]
    (inclusive) and outputs a list of the sorted numbers in the range that fulfills the property described above.

    Let's see some cases:
    sum_dig_pow(1, 10) == [1, 2, 3, 4, 5, 6, 7, 8, 9]
    sum_dig_pow(1, 100) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]

    If there are no numbers of this kind in the range [a, b] the function should output an empty list.

    sum_dig_pow(90, 100) == []

    https://www.codewars.com/kata/take-a-number-and-sum-its-digits-raised-to-the-consecutive-powers-and-dot-dot-dot-eureka/train/java
    */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<>();
        for (long number = a; number <= b; number++) {
            if (isEurekaNumber(number)) {
                result.add(number);
            }
        }
        return result;
    }

    private static boolean isEurekaNumber(long number) {
        long sum = getSum(number);
        return sum == number;
    }

    private static long getSum(long number) {
        LinkedList<Long> stackDigitsOfNumber = getStackDigits(number);
        return sumDigitsPower(stackDigitsOfNumber);
    }

    private static LinkedList<Long> getStackDigits(long number) {
        LinkedList<Long> stackDigitsOfNumber = new LinkedList<>();
        while (number > 0) {
            stackDigitsOfNumber.push(number % 10);
            number /= 10;
        }
        return stackDigitsOfNumber;
    }

    private static long sumDigitsPower(LinkedList<Long> stackDigitsOfNumber) {
        long sum = 0;
        int power = 1;
        while (!stackDigitsOfNumber.isEmpty()) {
            long digit = stackDigitsOfNumber.pop();
            sum += Math.pow(digit, power++);
        }
        return sum;
    }
}
