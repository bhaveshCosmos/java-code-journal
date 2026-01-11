

public class Loops {
    static void main(String[] args) {
        // 1. The for Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop: " + i);
        }

        // 2. The while Loop
                int j = 1;
                while (j <= 5) {
                    System.out.println("While Loop: " + j);
                    j++;
                }

        // 3. The do-while Loop
                int k = 1;
                do {
                    System.out.println("Do-While Loop: " + k);
                    k++;
                } while (k <= 5);

        // The for-each Loop
        String[] colors = {"Red", "Green", "Blue"};
        for (String color : colors) {
            System.out.println(color);
        }
    }

}
