package id.learn;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[][] array2D = {
                {1,2,3},
                {4,5,6},
        };

        System.out.println(array2D);
        System.out.println(Arrays.toString(array2D));
        System.out.println(array2D[0]);
        System.out.println(array2D[1]);
        System.out.println(Arrays.deepToString(array2D));

        char[] arrayChar1 = { 'a', 'b', 'c' };
        char[] arrayChar2 = { 'd', 'e' };

        char[][] arrayChar2D = {
                arrayChar1,
                arrayChar2,
        };

        int[] number = { 1, 2, 3 };

        System.out.println("\n" + arrayChar2D);
        System.out.println(arrayChar1);
        System.out.println(number);
        System.out.println(Integer.toHexString(System.identityHashCode(arrayChar1)));
        System.out.println(Integer.toHexString(System.identityHashCode(arrayChar2)));
        System.out.println(Arrays.toString(arrayChar2D));


        char[] arrayChar3 = { 'a', 'b', 'c' };
        char[] arrayNumber2 = { 1, 2, 3 };
        char[][] arrayMix = {
                arrayChar3,
                arrayNumber2
        };

        System.out.println(Arrays.deepToString(arrayMix));



    }

}
