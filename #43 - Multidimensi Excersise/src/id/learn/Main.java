package id.learn;

public class Main {

    public static void main(String[] args) {

        int[][] matrix_a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix_b = {
                {2, 3, 4},
                {5, 6, 7},
                {8, 9, 10},
        };

        System.out.println("Matrix A");
        displayArray2D(matrix_a);

        System.out.println("Matrix B");
        displayArray2D(matrix_b);

        int[][] result = addingArray2D(matrix_a, matrix_b);

        int[][] matrix_c = {
                {1, 2, 5},
                {4, 5, 7},
        };

        int[][] matrix_d = {
                {2, 3, 4},
                {5, 6, 7},
                {8, 9, 10},
        };

        multipleArray2D(matrix_c, matrix_d);

    }

    public static void displayArray2D(int[][] dataArray) {
        int row = dataArray.length;
        int col = dataArray[0].length;
        for(int i = 0; i < row; i++) {
            System.out.print("[");
            for(int j = 0; j < col; j++) {
                if(j < col-1) {
                    System.out.print(dataArray[i][j] + " ");
                } else {
                    System.out.print(dataArray[i][j] + "]");
                }
            }
            System.out.print("\n");
        }
        System.out.println();
    }

    public static int[][] addingArray2D(int[][] a, int[][] b) {
        int nColA = a[0].length;
        int nRowA = a.length;
        int nColB = b[0].length;
        int nRowB = b.length;

        int[][] result = new int[nRowA][nColB];

        if(nRowA != nRowB && nColA != nColB) {
            System.out.println("Length of Range is not same!");
            displayArray2D(result);
            return result;
        } else {
            int length = a.length;
            for(int i = 0; i < length; i++) {
                for(int j = 0; j < length; j++) {
                    result[i][j] = a[i][j] + b[i][j];
                }
            }
            displayArray2D(result);
            return result;
        }
    }

    public static int[][] multipleArray2D(int[][] a, int[][] b) {
        int nColA = a[0].length;
        int nRowA = a.length;
        int nColB = b[0].length;
        int nRowB = b.length;

        int[][] result = new int[nRowA][nColB];

        int buffer;

        // check if column a is same row b
        if( nColA != nRowB ) {
            System.out.println("nColumn Array 1 is not same nRow Array 2");
            displayArray2D(result);
            return result;
        } else {
            for(int i = 0; i < nRowA; i++) {
                for(int j = 0; j < nColB; j++) {
                    buffer = 0;
                    for(int k = 0; k < nColA; k++) {
                        buffer += a[i][k] * b[k][j];
                    }
                    result[i][j] = buffer;
                }
            }
        }
        displayArray2D(result);
        return result;
    }

}
