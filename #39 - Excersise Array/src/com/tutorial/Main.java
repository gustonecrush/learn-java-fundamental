package com.tutorial;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {10,2,3,4,5};
        int[] array2 = {2,3,4,5,6};
        printArray(array1, "ArrayNumber 1");

        // task: sum two arrays

        sumArray(array1, array2);

        // task: merge two arrays
        mergeArray(array1, array2);

        // task: reverse sorting
//        Arrays.sort(array1);
//        printArray(array1, "sorted");
//
//        int[] arrayBuffer = Arrays.copyOf(array1, array1.length);
//        for(int i = 0; i < array1.length; i++) {
//            array1[i] = arrayBuffer[arrayBuffer.length - 1 - i];
//        }
        reverseArray(array1);
        printArray(array1, "reversed");

        // simple reverse array
        printArray(array2, "array 2");
        reverseArray2(array2);
        printArray(array2, "reversed");


    }

    private static int[] reverseArray2(int[] dataArray) {
        Arrays.sort(dataArray);
        int buffer;

        for(int i = 0; i < dataArray.length/2; i++) {
            buffer = dataArray[i];
            dataArray[i] = dataArray[dataArray.length - 1 - i];
            dataArray[dataArray.length - 1 - i] = buffer;
        }

        return dataArray;
    }

    private static int[] reverseArray(int[] dataArray) {
        Arrays.sort(dataArray);
        int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);
        for(int i = 0; i < dataArray.length; i++) {
            dataArray[i] = arrayBuffer[arrayBuffer.length - 1 - i];
        }
        return dataArray;
    }

    private static void printArray(int[] dataArray, String message) {
        System.out.println(message + ": " + Arrays.toString(dataArray));
    }

    private static void sumArray(int[] array1, int[] array2) {
        if( array1.length != array2.length ) {
            System.out.println("array's length is not same");
        } else {
            int length = array1.length;
            int[] result = new int[length];
            for(int i = 0; i < length; i++) {
                result[i] = array1[i] + array2[i];
            }
            System.out.println("array: " + Arrays.toString(result));
        }
    }

    private static void mergeArray(int[] array1, int[] array2) {
        int length = array1.length + array2.length;
        int[] result = new int[length];
        int indexArray2 = 0;
        for(int i = 0; i < length; i++) {
            if(i < array1.length) {
                result[i] = array1[i];
            } else {
                result[i] = array2[indexArray2];
                indexArray2++;
            }
        }

        /*
        *
        * for(int i = 0; i < array1.length; i++) {
        *   result[i] = array1[i]
        * }
        *
        * for(int i = 0; i < array2.length; i++) {
        *   result[i + array1.length] = array2[i]
        * }
        *
        * */

        System.out.println("array: " + Arrays.toString(result));
    }

}
