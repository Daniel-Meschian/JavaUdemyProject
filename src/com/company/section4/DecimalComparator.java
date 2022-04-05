package com.company.section4;

public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double myFirstDouble, double mySecondDouble) {
        int myFirstCheck = (int) (myFirstDouble * 1000);
        int mySecondCheck = (int) (mySecondDouble * 1000);
        return myFirstCheck - mySecondCheck == 0;
    }
}
