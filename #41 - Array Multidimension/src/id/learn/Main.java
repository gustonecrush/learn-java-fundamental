package id.learn;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Array Multidimensi");

        // create array two dimension with assignment
        int[] array_1D = {1, 2, 3, 4, 5};
        int[][] array_2D = {
                { 1, 2 },
                { 3, 4 }
        };

        // create array two dimension with assignment
        int[] number1 = new int[5];
        int[][] number2 = new int[2][6];

        System.out.println(Arrays.toString(array_1D));
        displayArray2D(array_2D);
        displayArray2D(number2);

        // using nested looping
//        for(int i = 0; i < number2.length; i++) {
//            System.out.print("[");
//            for(int j = 0; j < number2[i].length; j++) {
//                System.out.print(number2[i][j] + ",");
//            }
//            System.out.print("]\n");
//        }

        // using foreach
//        for( int[] row: number2 ) {
//            System.out.print("[");
//            for( int number: row ) {
//                System.out.print(number + ",");
//            }
//            System.out.print("]\n");
//        }

        // array secara manual, untuk pembuktian
        int[][] array2D = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
        };

        displayArray2D(array2D);

        // array ragged
        int[][] array2D_2 = {
                {1,2,3},
                {2,3},
                {4},
        };

        displayArray2D(array2D_2);


    }

    private static void displayArray2D(int[][] dataArray) {
        System.out.println("\n");
        for(int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }


}
