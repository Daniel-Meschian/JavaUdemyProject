package com.company.section4;

public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;

            long days = hours / 24;

            long years = days / 365;
            long remainingDays = days % 365;
            System.out.printf("%d min = %d y and %d d", minutes, years, remainingDays);
        }
    }
}
