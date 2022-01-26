package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String input;

        Scanner userInput = new Scanner(System.in);

        System.out.print("call name: ");
        input = userInput.next();

        // switch case
        switch(input) {
            case "otong":
                System.out.println("Saya Otong & Hadir Bos");
                break;
            default:
                System.out.println("Otong tidak hadir bos");
        }
    }
}
