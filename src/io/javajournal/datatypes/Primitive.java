package io.javajournal.datatypes;

public class Primitive {
    public static void main(String[] args) {
        // Integers
        byte byteNum = 127; // 1 Byte
        short shortNum = 32767;
        int intNum = 2147483647;
        long longNum = 9223372036854775807L;

        System.out.println((Long.BYTES));

        // Floating Point Numbers
        float floatNum = 3.4028235E38F;
        double doubleNum = 1.7976931348623157E308;
        // 1. Implicit Type Casting (Widening)
        int a;
        a = 10;
        double b = a;
        System.out.println(b);

        // 2. Explicit Type Casting (Narrowing)
        double x = 12.9;
        int y = (int) x;
        System.out.println(y);

        // 3. char to int
        char ch;
        ch = 'A';
        int ascii = ch;
        System.out.println(ascii);

        // 4. int to char
        int n = 66;
        char c = (char) n;
        System.out.println(c);

        // Boolean
        boolean isEligible = true;
        System.out.println(isEligible);

        // Characters
        char symbol = '#';
        System.out.println((int)symbol);
        System.out.println((char) 0x32A33);

    }
}
