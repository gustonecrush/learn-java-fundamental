package id.codebox;

public class Main {
    public static void main(String[] args) {

        // Operator Bitwise --> operator untuk melakukan operasi pada bit

        byte a = 3;
        byte b, c;
        String a_bits, b_bits, c_bits;

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);

        // Operator SHIFT LEFT
        System.out.println("----- SHIFT LEFT");
        b =  (byte)(a << 1);

        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);

        // Operator SHIFT RIGHT
        System.out.println("----- SHIFT RIGHT");
        a = 24;
        b =  (byte)(a >> 1);

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);

        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);

        // Operator Bitwise OR
        System.out.println("----- BITWISE OR");
        a = 24;
        b =  (byte)(a >> 1);

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);

        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);
        System.out.println("------------- |");
        c = (byte)(a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits,c);

        // Operator Bitwise OR
        System.out.println("----- BITWISE AND");
        a = 24;
        b =  (byte)(a >> 1);

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);

        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);
        System.out.println("------------- &");
        c = (byte)(a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits,c);

        // Operator Bitwise XOR
        System.out.println("----- BITWISE XOR");
        a = 24;
        b =  (byte)(a >> 1);

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);

        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits,b);
        System.out.println("------------- ^");
        c = (byte)(a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n", c_bits,c);

        // Operator Bitwise OR
        System.out.println("----- BITWISE NOT");
        a = 24;
        b = (byte)(~a);

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);

        b_bits = String.format("%8s", Integer.toBinaryString(b).substring(24)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);



    }
}
