// Programmers:  [your names here]
// Course:  CS 212
// Due Date: 2/11/24
// Lab Assignment: Code an ATM
// Problem Statement: Allow the user to deposit and withdraw any amount and output their balance
// Data In: Choice of action, type of receipt
// Data Out: Balance, goodbye message
// Credits: None

import java.util.Objects;
import java.util.Scanner;
import java.lang.Object;
import java.lang.String;

import static java.lang.Character.isDigit;

class Lab3 {

    //5. Error checking method:
    public static String errorCheck(String choice){
        Scanner input = new Scanner(System.in);
        choice = choice.toLowerCase();

        while(!Objects.equals(choice,"deposit") && !Objects.equals(choice,"balance") && !Objects.equals(choice,"withdraw") && !Objects.equals(choice,"leave")){
            System.out.println("Invalid Choice");
            System.out.println("What would you like to do? Pick either deposit, balance, or withdraw:");
            choice = input.next();
        }
        return choice;
    }
    //        a. while action not equal to "deposit" or "withdraw" or "check balance" or "leave"
//        i. Output error message and ask for input again

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        1. Ask user for name
        System.out.println("What is your name?");
        String name = input.next();
//        2. Greet user with name
        System.out.println("");
//        3. Set balance value
        double currentBalance = 212.90;
//        4. Get user input for action
        System.out.println("What would you like to do? Pick either deposit, balance, withdraw, or leave to exit:");
        String action;
        action = input.next();
//        6. Main method:
//        a. While action is not equal to "leave":
        action = errorCheck(action);

        while(!Objects.equals(action,"leave") ) {


//        i. If action is equal to "deposit":
            if(Objects.equals(action, "deposit")){
                //Ask for amountDeposited
                System.out.println("How much would you like to deposit?");
                double amountDeposited = input.nextInt();
                // If amountDeposited if less than zero:
                if (amountDeposited < 0){
                    //Output error message
                    System.out.println("Cannot deposit less than 0");
                }
                //Else
                else{
                    //Add currentBalance with amountDeposited
                    currentBalance+=amountDeposited;
                    System.out.println("Your balance is now: " + currentBalance);
                }
            }







//        ii. Otherwise if action is equal to "withdraw":
            else if (Objects.equals(action, "withdraw")) {
//        1. Ask for amountWithdraw
                System.out.println("How much would you like to withdraw?");
                double amountWithdraw = input.nextInt();
//        2. If amountWithdraw is greater than currentBalance:
                if (amountWithdraw > currentBalance) {
//        a. Output error message
                    System.out.println("Invalid amount, must be less than your current balance");
                }
                //Else:
                else{
                    //Subtract withdraw amount from current balance
                    currentBalance = currentBalance - amountWithdraw;
                    System.out.println("Your balance is now: " + currentBalance);
                }
            }
//        iii. Otherwise if action is equal to "balance":
            else if (Objects.equals(action, "balance")) {
                // 1. output currentBalance
                System.out.println("Your balance is now: " + currentBalance);;
            }
            //Ask for user input again
            System.out.println("Please choose an action. Pick either deposit, balance, withdraw or leave to exit:");
            action = input.next();

//        iv. Call Error checking method
            action = errorCheck(action);

        } // end of while loop

//        b. Ask user if they'd like a receipt printed or emailed
        System.out.println("Would you like your receipt printed or emailed?");
        String receiptChoice = input.next();
//        c. Display currentBalance
        System.out.println("Your balance is now: " + currentBalance);
//        d. If receiptChoice is equal to "printed":
        if (Objects.equals(receiptChoice, "printed")) {
            //  i. Output to take receipt
            System.out.println("Please take your receipt and have a nice day!");
        }
        //        e. Otherwise if receiptChoice is equal to "email":
        else if (Objects.equals(receiptChoice, "emailed")) {
            //        i. Output to check email
            System.out.println("Check your email for your receipt and have a nice day!");
        }




    }
}

