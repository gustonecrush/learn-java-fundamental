package id.learn;

public class Main {
    public static void main(String[] args) {

        int resultInt = adding(1,3);
        System.out.println(resultInt);

        Float resultFloat = adding(3.5f,3);
        System.out.println(resultFloat);

        resultFloat = adding(4, 4.5f);

        resultFloat = adding(1,3.5f, 20);
        System.out.println(resultFloat);

        displayNumber(10);
        displayNumber(10.5f);
        displayNumber(199.3d);
        displayNumber(39);
        displayNumber(8.3f);

        System.out.println();
        System.out.print("");

    }

    private static float adding(int numberInt1, float numberFloat2, int numberInt3) {
        return numberInt1 + numberFloat2 + numberInt3;
    }

    private static float adding(int numberInt1, float numberFloat2) {
        return numberInt1 + numberFloat2;
    }

    private static float adding(float numberFloat1, int numberInt2) {
        return numberFloat1 + numberInt2;
    }

    private static int adding(int numberInt1, int numberInt2) {
        return numberInt1 + numberInt2;
    }

    // overload method
    private static void displayNumber(double numberDouble) {
        System.out.println("Number of Double: " + numberDouble);
    }

    private static void displayNumber(float numberFloat) {
        System.out.println("Number of Float: " + numberFloat);
    }

    private static void displayNumber(int numberInteger) {
        System.out.println("Number of Integer: " + numberInteger);
    }
}
