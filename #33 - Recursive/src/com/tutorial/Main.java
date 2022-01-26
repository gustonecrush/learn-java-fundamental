package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // recursive
        Scanner userInput = new Scanner(System.in);
        System.out.print("input value: ");
        int value = userInput.nextInt();

        printValue(value);

        // simple recursive function

        System.out.println("jumlah nilai: " + sumValue(value));
        System.out.println("factorial   : " + factorial(value));


    }

    private static int factorial(int parameter) {
        if(parameter == 1) {
            return parameter;
        }
        return parameter * factorial(parameter - 1);
    }

    private static int sumValue(int parameter) {
        if(parameter == 0) {
            return parameter;
        }
        return parameter + sumValue(parameter-1);
    }

    private static void printValue(int parameter) {
        System.out.println("value: " + parameter);

        if(parameter == 0) {
            return;
        }

        parameter--;

        printValue(parameter);
    }


}
