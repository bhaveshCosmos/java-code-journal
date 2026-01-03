package operator;

public class bitwise {
    public static void main() {
        int num = 14;
        System.out.println("Binary of "+num+" is: "+Integer.toBinaryString(num));

        int val1 = 10;
        System.out.println("Binary of "+val1+" is "+Integer.toBinaryString(val1));
        int val2 = 6;
        System.out.println("Binary of "+val2+" is "+Integer.toBinaryString(val2));


        // AND (&)
        // Returns true (1) if both corresponding bits are true (1).
        int bitAnd = val1 & val2;
        System.out.printf("AND\nBinary:"+Integer.toBinaryString(bitAnd)+" Decimal: "+bitAnd+"\n");

        // OR (|)
        // returns true (1) if at least one of the bit is true.
        int bitOr = val1 | val2;
        System.out.printf("OR\nBinary: "+Integer.toBinaryString(bitOr)+" Decimal: "+bitOr+"\n");

        // XOR (^)
        // returns true (1) only when the two bits are different.
        int bitXor = val1 ^ val2;
        System.out.printf("XOR\nBinary: "+Integer.toBinaryString(bitXor)+" Decimal: "+bitXor+"\n");

        // NOT (~)
        // Returns true (1) where the bit is false (0) and false (0) where the bit is true (1).
        int bitNot = ~val1;
        System.out.printf("NOT\nBinary: "+Integer.toBinaryString(bitNot)+" Decimal: "+bitNot+"\n");

        // Left Shift (<<)
        // Returns a value where bits are shifted left, dropping left bits and adding 0s on the right.
        int bitLeftShift = val1 << 2;
        System.out.printf("Left Shift\nBinary: "+Integer.toBinaryString(bitLeftShift)+" Decimal: "+bitLeftShift+"\n");

        // Right Shift (>>)
        // Returns a value where bits are shifted right, dropping right bits and copying the sign bit on the left
        int val3 = -8;
        int bitRightShift = val3 >> 2;
        System.out.printf("Right Shift\nBinary: "+Integer.toBinaryString(bitRightShift)+" Decimal: "+bitRightShift+"\n");

        // Unsigned Right Shift (>>>)
        // Returns a value where bits are shifted right, dropping right bits and adding 0s on the left.
        int bitUnsignedRightShift = val3 >>> 3;
        System.out.printf("Unsigned Right Shift\nBinary: "+Integer.toBinaryString(bitUnsignedRightShift)+" Decimal: "+bitUnsignedRightShift+"\n");
    }
}
