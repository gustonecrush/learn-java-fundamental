package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ternary operator
        // variable x = ekspresi ? statement true : statement false;

        int input, x;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("input value: ");
        input = inputUser.nextInt();

        x = (input == 6) ? input*input : input/2;

//        if(input == 6) {
//            x = input*input;
//        } else {
//            x = input/2;
//        }

        System.out.println(x);

    }
}
