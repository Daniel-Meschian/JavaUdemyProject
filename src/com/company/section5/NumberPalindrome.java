package com.company.section5;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int savedNumber = Math.abs(number);
        String numberLength = String.valueOf(savedNumber);
        for (int i = 0; i < numberLength.length(); i++) {
            int remainder = savedNumber % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            savedNumber = savedNumber / 10;
        }
        return Math.abs(number) == reversedNumber;
    }
}
