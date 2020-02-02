package com.pranovich.codewars.java;

public class LastFibonacciDigit {

    static int lastFibDigit(int n) {
        int first = 1;
        int second = 1;
        int result = 1;

        for (int i = 3; i <= n; i++) {
            result = (first + second) % 10;
            first = second;
            second = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(lastFibDigit(1000));
    }
}
