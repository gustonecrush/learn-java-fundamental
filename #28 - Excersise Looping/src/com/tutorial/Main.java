package com.tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        int total = 0;
//        int i, n;
//        Scanner inputUser = new Scanner(System.in);
//
//        System.out.print("input range: ");
//        n = inputUser.nextInt();
//
//        System.out.print("input start:");
//        i = inputUser.nextInt();
//
//        for(; i <= n; i++) {
//            if(i == n) {
//                System.out.print(i + " = ");
//            } else {
//                System.out.print(i + " + ");
//            }
//            total += i;
//        }
//
//        System.out.printf("%d", total);

        // hitung deret fibonacci n
//        int n, f_n, f_n1, f_n2;
//
//        Scanner inputUser = new Scanner(System.in);
//        System.out.print("n: ");
//        n = inputUser.nextInt();
//
//        f_n2 = 0;
//        f_n1 = 1;
//        f_n = 1;
//
//        for(int i = 1; i <= n; i++) {
//            System.out.println(i + ": " + f_n);
//            f_n = f_n1 + f_n2;
//            f_n2 = f_n1;
//            f_n1 = f_n;
//
//        }

        int a = 0;
        while( true ) {
            a++;
            if(a == 20) {
                break;
            } else if(a % 2 == 0) {
                continue;
            } else if(a / 2 == 8) {
                return;
            }
            System.out.println(a);
        }

        System.out.println("finish");

    }
}
