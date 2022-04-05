package com.company.section4;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(56000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int kbRest = kiloBytes % 1024;
            int megaBytes = kiloBytes / 1024;
            System.out.printf("%d KB = %d MB and %d KB", kiloBytes, megaBytes, kbRest);
        }
    }
}
