package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrayNumber1 = {1,2,3,4,5};

        // convert array to string
        System.out.println("\nArray to String\n====================");
        displayArray(arrayNumber1);

        // copy array
        System.out.println("\nCopy Array\n====================");
        int[] arrayNumber2 = new int[5];
        displayArray(arrayNumber1);
        displayArray(arrayNumber2);

        System.out.println("\nCopy with loop\n====================");
        for(int i = 0; i < arrayNumber1.length; i++) {
            arrayNumber2[i] = arrayNumber1[i];
        }

        displayArray(arrayNumber1);
        System.out.println(arrayNumber1);
        displayArray(arrayNumber2);
        System.out.println(arrayNumber2);

        System.out.println("\nCopy with copyOf\n====================");
        int[] arrayNumber3 = Arrays.copyOf(arrayNumber1, 3);
        displayArray(arrayNumber1);
        System.out.println(arrayNumber1);
        displayArray(arrayNumber3);
        System.out.println(arrayNumber3);

        System.out.println("\nCopy with copyOfRange\n====================");
        int[] arrayNumber4 = Arrays.copyOfRange(arrayNumber1, 2, 4);
        displayArray(arrayNumber1);
        System.out.println(arrayNumber1);
        displayArray(arrayNumber4);
        System.out.println(arrayNumber4);

        System.out.println("\nFill Array\n====================");
        int[] arrayNumber5 = new int[10];
        displayArray(arrayNumber5);
        Arrays.fill(arrayNumber5, 1);
        displayArray(arrayNumber5);

        System.out.println("\nComparasi Arrays\n====================");
        int[] arrayNumber6 = {7,2,3,4,5};
        int[] arrayNumber7 = {7,2,3,4,5};

        if(Arrays.equals(arrayNumber6, arrayNumber7)) {
            System.out.println("same");
        } else{
            System.out.println("different");
        }

        System.out.println("\nWhich Greater\n====================");
        System.out.println("array: " + Arrays.compare(arrayNumber6, arrayNumber7));

        System.out.println("\nWhich Different Index\n====================");
        System.out.println(Arrays.mismatch(arrayNumber6, arrayNumber7));

        System.out.println("\nSort Array\n====================");
        int[] arrayNumber8 = {1,34,5,2,6,7};
        displayArray(arrayNumber8);
        Arrays.sort(arrayNumber8);
        displayArray(arrayNumber8);


        System.out.println("\nSearch Array\n====================");
        displayArray(arrayNumber8);
        int number = 34;
        int position = Arrays.binarySearch(arrayNumber8, number);
        System.out.println("array found in index- " + position);


    }
    
    private static void displayArray(int[] dataArray) {
        System.out.println("array: " + Arrays.toString(dataArray));
    }
    
}
