package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // nested if
        int x = 10;
        int y = 23;

        System.out.println("Program Start");

        if( x == 10 ) {
            if( y == 23 ) {
                System.out.println("this is action, where x = 10 & b = 23");
            } else {
                System.out.println("this is action default 1");
            }
        } else {
            System.out.println("this is action, where x & y are false");
        }

        System.out.println("Program End");
    }
}
