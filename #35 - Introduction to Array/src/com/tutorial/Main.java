package com.tutorial;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Assignment
        // dataType[] name = {elements}
        //           index =  0,1,2,3, ...
        int[] arrayInteger = {1,2,3,4};
        int b = 10;

        System.out.println(b); // stack memory
        System.out.println(arrayInteger); // heap memory
        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        // Declaration
        // dataType[] name = new int[nArray];
        System.out.println("Declaration Array");
        float[] arrayFloat = new float[5];

        arrayFloat[1] = 10;
        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);

        System.out.println(Arrays.toString(arrayFloat));

    }
}
