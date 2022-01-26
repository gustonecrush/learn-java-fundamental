package com.tutorial;

public class Main {
    public static void main(String[] args) {

        // y = (x + 2) * x

        int x, y;
        x = 10;
        y = hitung(x);
        System.out.println("x: " + x + " y: " + y);
//        x = 10;
//        y = (x + 2) * x;
//        System.out.println("x: " + x + " y: " + y);
//
//        x = 8;
//        y = (x + 2) * x;
//        System.out.println("x: " + x + " y: " + y);
//
//        x = 3;
//        y = (x + 2) * x;
//        System.out.println("x: " + x + " y: " + y);

    }

    private static int hitung(int input) {
        return (input + 2) * input;
    }

}
