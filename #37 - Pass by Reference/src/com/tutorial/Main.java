package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrayNumber1 = {1,2,3,4,5};
        int[] arrayNumber2 = new int[5];

        System.out.println(arrayNumber1);
        System.out.println(arrayNumber2);

        arrayNumber2 = arrayNumber1;

        System.out.println(arrayNumber1);
        System.out.println(arrayNumber2);

        System.out.println(Arrays.toString(arrayNumber1));
        System.out.println(Arrays.toString(arrayNumber2));

        arrayNumber1[0] = 100;

        System.out.println(Arrays.toString(arrayNumber1));
        System.out.println(Arrays.toString(arrayNumber2));

        changeArray(arrayNumber1);
        System.out.println(arrayNumber1[0]);
        System.out.println(arrayNumber2[0]);

    }

    // method yg argumentny itu referenceny : pass by reference
    // not pass by value
    private static void changeArray(int[] dataArray) {
        dataArray[0] = 125;
    }

}
