package com.tutorial;

public class Main {
    public static void main(String[] args) {
        System.out.println(simple());
        display("everything");
        goodMoring("emak");
        goodMoring("abah");
    }

    private static void goodMoring(String name) {
        System.out.println("Selamat pagi " + name + "!");
    }

    // method or function without return
    private static void display(String input) {
        System.out.println(input);
    }

    // method or function with return
    // so using return keyword to
    // returning a value
    private static float simple() {
        return 10.0f;
    }
}
