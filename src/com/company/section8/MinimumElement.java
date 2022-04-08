package com.company.section8;

import java.util.Scanner;

public class MinimumElement {
    private static final Scanner scanner = new Scanner(System.in);


    public int readInteger() {
        System.out.println("Enter number");
        return scanner.nextInt();
    }

    public int[] readElements(int elements) {
        System.out.println("Enter " + elements +" numbers");
        int[] arr = new int[elements];
        for (int i = 0; i < elements ; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j <= min) {
                min = j;
            }
        }
        return min;
    }
}
