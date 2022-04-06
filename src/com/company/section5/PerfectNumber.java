package com.company.section5;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int perfectCount = 0;
        for (int i = 1; i < number ; i++) {
            if (number % i == 0) {
                perfectCount += i;
            }
        }
        return perfectCount == number;
    }
}
