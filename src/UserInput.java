import java.util.*;
public class UserInput {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intVal = scan.nextInt();
        String intBuffer = scan.nextLine();
        System.out.println(intVal);
        scan.close();
    }
}
/*
nextInt() reads only the integer,
leaving the newline character (\n) in the buffer.
When nextLine() is called next,
it reads this leftover newline as an empty string.
To fix this, call nextLine() once after nextInt() to consume the newline.
*/