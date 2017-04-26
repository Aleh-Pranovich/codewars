package com.pronovich.codewars;

    /*Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with
    the following form :
    "(p1**n1)(p2**n2)...(pk**nk)"
    with the p(i) in increasing order and n(i) empty if n(i) is 1.
    Example: n = 86240 should return "(2**5)(5)(7**2)(11)"*/

import java.util.*;

public class PrimeDecomp {

    public static String factors(int n) {
        List<Integer> listPrimeNumbers = getListPrimeNumbersForDivisionByThem(n);
        List<Integer> listFactors = getListPrimeFactors(n, listPrimeNumbers);
        return convertListFactorsToString(listFactors);
    }

    private static List<Integer> getListPrimeNumbersForDivisionByThem(int n) {
        List<Integer> listPrimeNumbers = new ArrayList<>();
        listPrimeNumbers.add(2);
        for (int i=3; i*i <= n; i+=2) {
            if (isPrime(i)) {
                listPrimeNumbers.add(i);
            }
        }
        return listPrimeNumbers;
    }

    private static List<Integer> getListPrimeFactors(int n, List<Integer> listPrimeNumbers) {
        List<Integer> listFactors = new ArrayList<>();
        int index = 0;
        while ( index < listPrimeNumbers.size() ) {
            if (isPrime(n)) {
                listFactors.add(n);
                break;
            }
            int primeNumber  = listPrimeNumbers.get(index++);
            if (n % primeNumber == 0) {
                listFactors.add(primeNumber);
                n /= primeNumber;
                index = 0;
            }
        }
        return listFactors;
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i=3; i*i <= n; i+=2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static String convertListFactorsToString(List<Integer> listFactors) {
        Map<Integer, Integer> resultMap = getFactorCountMap(listFactors);
        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry entry : resultMap.entrySet()) {
            stringBuilder.append("(").append(entry.getKey());
            if ( !entry.getValue().equals(1) ){
                stringBuilder.append("**").append(entry.getValue());
            }
            stringBuilder.append(")");
        }
        return stringBuilder.toString();
    }

    private static Map<Integer,Integer> getFactorCountMap(List<Integer> listFactors) {
        Map<Integer, Integer> resultMap = new LinkedHashMap<>();
        for (Integer factor: listFactors) {
            resultMap.put(factor, Collections.frequency(listFactors, factor));
        }
        return resultMap;
    }
}
