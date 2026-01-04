package Conditional;

public class Conditions {
    static void main(String[] args) {
        /*
        Write a Java program to calculate the electricity bill based on the following slabs using if–else.
        ConditionalStatements.Conditions:
        Units ≤ 100 → ₹2 per unit
        Units 101–200 → ₹3 per unit
        Units > 200 → ₹5 per unit
        */

        int units = 250;
        int bill;
        if(units <= 100){
            bill = 2*units;
        }
        else if(units <=200){
            bill = 2*units;
        }
        else {
            bill = 5*units;
        }

        System.out.println("Your Bill is: \u20B9" + bill);
    }
}
