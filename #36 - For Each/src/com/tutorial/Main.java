package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrayNumber = {1,2,3,4,5};
        System.out.println(Arrays.toString(arrayNumber));

        // standard loop
        for(int i = 0; i < 5; i++) {
            System.out.println("index-" + i + ": " + arrayNumber[i]);
        }

        // array's property loop
        for(int i = 0; i <arrayNumber.length; i++) {
            System.out.println("index-" + i + ": " + arrayNumber[i]);
        }

        // looping khusus array
        for( int n : arrayNumber) {
            System.out.println("data: " + n);
        }

    }
}
