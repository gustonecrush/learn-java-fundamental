package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // SIMPLE CALCULATOR WITH SWITCH CASE

        // create new object Scanner
        Scanner inputUser = new Scanner(System.in);

        // variables
        float operand_a, operand_b, result;
        char operator;

        // fetch user input
        // take operand a value, then convert to Float type
        System.out.print("a: ");
        operand_a = inputUser.nextFloat();

        // take operand b value, then convert to Float type
        System.out.print("b: ");
        operand_b = inputUser.nextFloat();

        // take char opeartor then covert to String and take first char on index 0
        System.out.print("operator: ");
        operator = inputUser.next().charAt(0);

        // conditional
        switch( operator ) {
            case '+':
                result = operand_a + operand_b;
                System.out.println("result: " + result);
                break;
            case '-':
                result = operand_a - operand_b;
                System.out.println("result: " + result);
                break;
            case '*':
                result = operand_a * operand_b;
                System.out.println("result: " + result);
                break;
            case '/':
                if(operand_b == 0) {
                    System.out.println("your deminator is 0. couldn't do division cuz it will infinite");
                    break;
                }
                result = operand_a / operand_b;
                System.out.println("result: " + result);
                break;
            case '%':
                result = operand_a % operand_b;
                System.out.println("result: " + result);
                break;
            default:
                System.out.println("operator doesn't exist");
                break;
        }

    }
}
