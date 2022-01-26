package com.codebox;

public class Main {
    public static void main(String[] args) {
        // integer, byte, short, long, double, float, char, boolean

        // integer ( satuan )
        int a = 10;
        System.out.println("===== INTEGER =====");
        System.out.println("int a: " + (a - 1));
        System.out.println("max value of int: " + Integer.MAX_VALUE);
        System.out.println("max value of int: " + Integer.MIN_VALUE);
        System.out.println("size of int: " + Integer.BYTES + "bytes");
        System.out.println("max value of int: " + Integer.SIZE + "bit");

        // byte ( satuan )
        byte b = 10;
        System.out.println("===== BYTE =====");
        System.out.println("byte b: " + (b - 1));
        System.out.println("max value of byte: " + Byte.MAX_VALUE);
        System.out.println("max value of byte: " + Byte.MIN_VALUE);
        System.out.println("size of byte: " + Byte.BYTES + "bytes");
        System.out.println("max value of byte: " + Byte.SIZE + "bit");

        // short ( satuan )
        short c = 10;
        System.out.println("===== SHORT =====");
        System.out.println("short c: " + (c - 1));
        System.out.println("max value of short: " + Short.MAX_VALUE);
        System.out.println("max value of short: " + Short.MIN_VALUE);
        System.out.println("size of short: " + Short.BYTES + "bytes");
        System.out.println("max value of short: " + Short.SIZE + "bit");

        // long ( satuan )
        long d = 10L;
        System.out.println("===== LONG =====");
        System.out.println("long d: " + (d - 1));
        System.out.println("max value of long: " + Long.MAX_VALUE);
        System.out.println("max value of long: " + Long.MIN_VALUE);
        System.out.println("size of long: " + Long.BYTES + "bytes");
        System.out.println("max value of long: " + Long.SIZE + "bit");

        // double ( real )
        double e = 10.9d;
        System.out.println("===== DOUBLE =====");
        System.out.println("double e: " + (e - 1));
        System.out.println("max value of double: " + Double.MAX_VALUE);
        System.out.println("min value of double: " + Double.MIN_VALUE);
        System.out.println("size of double: " + Double.BYTES + "bytes");
        System.out.println("max value of double: " + Double.SIZE + "bit");

        // float ( real )
        float f = 10.9f;
        System.out.println("===== FLOAT =====");
        System.out.println("float f: " + (f - 1));
        System.out.println("max value of float: " + Float.MAX_VALUE);
        System.out.println("min value of float: " + Float.MIN_VALUE);
        System.out.println("size of float: " + Float.BYTES + "bytes");
        System.out.println("max value of float: " + Float.SIZE + "bit");

        // char ( character )
        char g = 'c';
        System.out.println("===== CHAR =====");
        System.out.println("char g: " + g);
        System.out.println("max value of char: " + Character.MAX_VALUE);
        System.out.println("min value of char: " + Character.MIN_VALUE);
        System.out.println("size of char: " + Character.BYTES + "bytes");
        System.out.println("max value of char: " + Character.SIZE + "bit");

        // boolean ( character )
        boolean h = true;
        System.out.println("===== BOOLEAN =====");
        System.out.println("boolean h: " + h);
        System.out.println("max value of boolean: " + Boolean.TRUE);
        System.out.println("min value of boolean: " + Boolean.FALSE);
//        System.out.println("size of boolean: " + Boolean.BYTES + "bytes");
//        System.out.println("max value of boolean: " + Boolean.SIZE + "bit");
    }
}
