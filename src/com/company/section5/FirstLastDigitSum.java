package com.company.section5;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        if (number < 10) {
            return number * 2;
        } else {
            int count = 0;
            int firstNumber = number;
            while (firstNumber >= 10) {
                firstNumber /= 10;
            }
            count += firstNumber;
            count += number % 10;
            return count;
        }
    }
}
