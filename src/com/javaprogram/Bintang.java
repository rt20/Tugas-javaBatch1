package com.javaprogram;

public class Bintang {
    public static void main(String[] args) {
        int a = 5;
        for (int b = 1; b <= a; b++){
            for (int c = 1; c <= b; c++) {
                System.out.print('*');
            }
            System.out.println();
        }

        int e = 5;
        for (int f = 1; f <= e; f++){
            for (int g = 5; g >= f; g--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
