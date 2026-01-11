public class Bitwise {
    public static void main(String[] args) {

        int a = 10;
        int b = 6;

        // Bitwise AND (&)
        System.out.println("&: Binary: "+ Integer.toBinaryString(a & b) + ", Decimal: "+(a & b));

        // Bitwise OR (|)
        System.out.println("|: Binary: "+ Integer.toBinaryString(a | b) + ", Decimal: "+(a | b));   // 1  -> 0001

        // Bitwise XOR (^)
        System.out.println("^: Binary: "+ Integer.toBinaryString(a ^ b) + ", Decimal: "+(a ^ b));   // 1  -> 0001

        // Bitwise NOT (~)
        System.out.println("~: Binary: "+ Integer.toBinaryString(~a) + ", Decimal: "+(~a));   // 1  -> 0001

        // Left Shift (<<)
        System.out.println("<<: Binary: "+ Integer.toBinaryString(a << 2) + ", Decimal: "+(a << 2));   // 1  -> 0001

        // Right Shift (>>)
        System.out.println(">>: Binary: "+ Integer.toBinaryString(a >> 2) + ", Decimal: "+(a >> 2));   // 1  -> 0001

        // Unsigned Right Shift (>>>)
        int c = -8;
        System.out.println(">>>: Binary: "+ Integer.toBinaryString(a >>> 2) + ", Decimal: "+(c >>> 2));   // 1  -> 0001
    }
}
