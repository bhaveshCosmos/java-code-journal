/*
Write a Java program that uses the ternary operator to determine whether a user is eligible for a loan based on salary per month and credit score.
Conditions:
Input: salary and creditScore
If salary ≥ 30,000 and creditScore ≥ 700 → Loan Approved
Else → Loan Rejected
Use only the ternary operator (no if–else)
*/
package Conditional;

public class TernaryOperator {
    static void main(String[] args) {
        int salary = 450000;
        int creditScore = 750;

        boolean isEligible = ((salary >= 30000) && (creditScore >= 700)) ? true : false;
        if(isEligible) System.out.println("Loan Approved");
        else System.out.println("Loan Rejected");
    }
}

