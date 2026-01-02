package datatypes;

public class floatingPoints {
    public static void main(String[] args) {
        // Floating-point
        float num_float = 123.31392323F; // 4 byte
        double num_double = 1221.1321322; // 8 bytes
        System.out.printf("float: %f\ndouble: %f\n", num_float, num_double);

        // Implicit Type Conversion (Widening Conversion)
        int num1;
        num1 = 1000;
        float floatNum = num1;
        System.out.println("int to float: "+floatNum);

        // Explicit Type Conversion (Narrowing / Type Casting)
        double doubleNum = 221.21392732;
        float numFloat = (float) doubleNum;
        System.out.println("Double to float: " + numFloat);
    }
}

