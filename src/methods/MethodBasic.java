import java.util.Scanner;
public class MethodBasic {

    public static int sum(int a, int b) {
        return a+b;
    }

    public static int sum(int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();

        System.out.println(sum(num1,num2));
        System.out.println(sum(num1,num2,100));

        // Java is strictly pass-by-value.
        // Function overloading (or method overloading) in Java is a feature that allows a class to have multiple methods with the same name, provided their parameter lists are different (in number, type, or order).
    }

}
