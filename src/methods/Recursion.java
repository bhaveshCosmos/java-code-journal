import java.util.*;

public class Recursion {

    public static int factorial(int num) {

        if(num <=1) return 1;
        else return (num*factorial(num-1));
    }
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        System.out.println("Factorial of"+ num +"is: "+ factorial(num));
    }
}
