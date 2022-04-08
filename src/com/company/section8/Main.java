package com.company.section8;

public class Main {

    public static void main(String[] args) {

        MinimumElement minimumElement = new MinimumElement();
        int ele = minimumElement.readInteger();
        int[] arr = minimumElement.readElements(ele);
        System.out.println(minimumElement.findMin(arr));

    }
}
