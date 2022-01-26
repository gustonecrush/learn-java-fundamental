package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // SIMPLE CALCULATOR WITH IF ELSE STATEMENT
        float operand_a, operand_b, result;
        char operator;

        // create object Scanner
        Scanner inputUser = new Scanner(System.in);

        // initialize operand a with input user -> then convert to float type
        System.out.print("a: ");
        operand_a = inputUser.nextFloat();

        // initialize operand b with input user -> then convert to float type
        System.out.print("b: ");
        operand_b = inputUser.nextFloat();

        // initialize operator -> then convert to string and take char at index 0
        System.out.print("operator: ");
        operator = inputUser.next().charAt(0);

        System.out.printf("%f %s %f = ", operand_a, operator, operand_b);

        // CONDITIONAL
        if( operator == '+' ) {
            // addition
            result = operand_a + operand_b;
            System.out.println(result);
        } else if( operator == '-' ) {
            // substraction
            result = operand_a - operand_b;
            System.out.println(result);
        } else if( operator == '*' ) {
            // multiplication
            result = operand_a * operand_b;
            System.out.println(result);
        } else if( operator == '/' ) {
            // division
            if( operand_b == 0 ) {
                // if denominator is 0
                System.out.println("Pembagian dengan 0 menghasilakan tak hingga");
            } else {
                result = operand_a / operand_b;
                System.out.println(result);
            }
        } else if( operator == '%' ) {
            // modulo
            result = operand_a % operand_b;
            System.out.println(result);
        } else {
            // if user input operator that doesn't exit
            System.out.println("Operator doesn't exist");
        }

    }
}
