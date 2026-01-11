/*
Design a Java program using a switch statement for a menu-driven ATM system that performs the following operations based on user choice:
1 → Check Balance
2 → Deposit Money
3 → Withdraw Money
4 → Exit
Conditions:
Initial balance = ₹10,000
Withdrawal should not exceed available balance
Display appropriate messages for each operation
Handle invalid choices
*/


public class Switch {
    static void main(String[] args) {
        int balance = 100000;
        int amount = 2198;
        int choice = 2;

        switch(choice){
            case 1:
                System.out.println("Your Current Balance is: ₹"+balance);
                break;
            case 2:
                balance+=amount;
                System.out.println("Deposited: ₹" + amount);
                System.out.println("Your New Balance: ₹" + balance);
                break;
            case 3:
                if(amount<=balance){
                    balance-=amount;
                    System.out.println("Your New Balance is: ₹"+balance);
                }
                else{
                    System.out.println("Insufficient Balance: ₹"+balance);
                }
                break;
            case 4:
                System.out.println("Session ended. Please collect your card.");
                break;
            default:
                System.out.println("Invalid Choice");
        }

    }
}
