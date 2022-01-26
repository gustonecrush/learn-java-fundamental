package id.apple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create object scanner
        Scanner userInput = new Scanner(System.in);

        // create simple program to guess a number
        int trueValue = 6;
        int guessValue;
        boolean guessStatus;

        System.out.print("Your guess: ");
        guessValue = userInput.nextInt();

        // logica operator
        guessStatus = (guessValue == trueValue);
        System.out.println("Your guess: " + guessStatus);

        // aljabar boolean operator
        System.out.println("input value between 4 and 9: ");
        guessValue = userInput.nextInt();
        guessStatus = (guessValue > 4) && (guessValue < 9);
        System.out.println("Your guess: " + guessStatus);
    }
}
