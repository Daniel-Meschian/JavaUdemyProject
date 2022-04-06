package com.company.section5;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
    }
    public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum) {
        if (isValid(firstNum) && isValid(secondNum) && isValid(thirdNum)) {
            int firstResult = firstNum % 10;
            int secondResult = secondNum % 10;
            int thirdResult = thirdNum % 10;
            return firstResult == secondResult || firstResult == thirdResult || secondResult == thirdResult;
        }
        return false;
    }
    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}
