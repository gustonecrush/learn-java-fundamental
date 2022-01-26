package id.apple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int result, m, x, c;;
        result = 10 / 2 * 5;

        System.out.println(result);

        result = 5 * (2 + 10);
        System.out.println(result);

        Scanner userInput = new Scanner(System.in);
        System.out.println("HITUNG PERSAMAAN KUADRAT");


        System.out.print("nilai x   : ");
        x = userInput.nextInt();

        System.out.print("gradient m: ");
        m = userInput.nextInt();

        System.out.print("bias c    : ");
        c = userInput.nextInt();

        int y = m * x * x + c;

        System.out.println("niali y   : " + y);



    }
}
