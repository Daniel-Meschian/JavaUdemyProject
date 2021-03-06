package com.company.section5;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        while (number > 0) {
            int currentDigit = number % 10;
            number /= 10;

            if(currentDigit % 2 == 0) {
                sum += currentDigit;
            }
        }
        return sum;
    }
}
