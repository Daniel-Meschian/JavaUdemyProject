package com.company.section5;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
    }

    public static int getGreatestCommonDivisor(int firstNum, int secondNum) {
        if (firstNum < 10 || secondNum < 10) {
            return -1;
        }
        int gcd = 1;
        for (int i = 1; i <= firstNum && i <= secondNum; i++) {
            if (firstNum % i == 0 && secondNum % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
