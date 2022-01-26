package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int length, width;
        char again;
        Scanner inputUser = new Scanner(System.in);

        while(true) {
            // take length
            System.out.print("input length: ");
            length = inputUser.nextInt();

            // take width
            System.out.print("input width : ");
            width = inputUser.nextInt();

            displayAreaCircum(length, width);
            createSquare(length, width);

            System.out.print("Wanna try again? y/n: ");
            again = inputUser.next().charAt(0);

            if(again == 'y' || again == 'Y') {
                continue;
            } else if(again == 'n' || again == 'N') {
                break;
            } else {
                continue;
            }
        }






    }

    private static int findArea(int length, int width) {
        return length * width;
    }

    private static int findCicumtances(int length, int width) {
        return (2*length) + (2*width);
    }

    private static void displayAreaCircum(int length, int width) {
        System.out.println("Area : " + findArea(length, width));
        System.out.println("Circumtances : " + findCicumtances(length, width));
    }

    private static void createSquare(int length, int width) {
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

}
