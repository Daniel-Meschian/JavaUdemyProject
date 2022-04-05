package com.company.section4;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            barking = false;
        } else barking = (hourOfDay < 8 || hourOfDay > 22) && barking;
        return barking;
    }
}
