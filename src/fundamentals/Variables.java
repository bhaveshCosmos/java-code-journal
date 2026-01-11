public class Variables {
    public static void main(String[] args) {

        double radius = 2.5;
        final float PI = 3.14F;
        // Variable declared with final becomes a constant, which means immutable
        double area = PI*radius*radius;
        double perimeter = 2*PI*radius;
        System.out.printf("Area: %.2f\nPerimeter: %.2f\n",area, perimeter);

        // Var Keyword
        var LangName = "Java";
        var version = 10;
        System.out.print(LangName);
        System.out.print(version);
    }

}
