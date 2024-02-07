// Programmers:  [your names here]
// Course:  CS 212
// Due Date:
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

import java.util.Objects;
import java.util.Scanner;
import java.lang.Object;
import java.lang.String;
class Lab3 {

    //5. Error checking method:
    public static String errorCheck(String choice){
        Scanner input = new Scanner(System.in);
        choice = choice.toLowerCase();

        while(!Objects.equals(choice,"deposit") && !Objects.equals(choice,"check balance") && !Objects.equals(choice,"withdraw") && !Objects.equals(choice,"leave")){
            System.out.println("Invalid Choice");
            System.out.println("What would you like to do?");
            choice = input.next();
    }
        return choice;
    }
    //        a. while action not equal to "deposit" or "withdraw" or "check balance" or "leave"
//        i. Output error message and ask for input again
//        b. return action
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
        System.out.println("What would you like to do?");
        String action;
        action = input.next();
//        6. Main method:
//        a. While action is not equal to "leave":
        action = errorCheck(action);
        System.out.println(action);
        while(!Objects.equals(action,"leave") ) {


//        i. If action is equal to "deposit":
            if(Objects.equals(action, "deposit")){
                System.out.println("How much would you like to deposit?");
                double amountDeposited = input.nextInt();
                if (amountDeposited < 0){
                    System.out.println("Cannot deposit less than 0");
                }
                else{
                    currentBalance+=amountDeposited;
                }
            }
//        1. Ask for amountDeposited
//        2. If amountDeposited if less than zero:
//        a. Output error message
//        3.Else:
//        a. Add currentBalance with amountDeposited


//        ii. Otherwise if action is equal to "withdraw":
            else if (Objects.equals(action, "withdraw")) {
//        1. Ask for amountWithdraw
                System.out.println("How much would you like to withdraw?");
                double amountWithdraw = input.nextDouble();
//        2. If amountWithdraw is greater than currentBalance:
                if (amountWithdraw > currentBalance) {
//        a. Output error message
                    System.out.println("Invalid amount, must be less than your current balance");
                }
                //Else:
                else{
                    //Subtract withdraw amount from current balance
                    currentBalance = currentBalance - amountWithdraw;
                }
            }
//        iii. Otherwise if action is equal to "balance":
            else if (Objects.equals(action, "balance")) {
                // 1. output currentBalance
                System.out.println(currentBalance);
            }
            //Ask for user input again
            System.out.println("Please choose an action");
            action = input.next();

//        iv. Call Error checking method
            action = errorCheck(action);

        } // end of while loop

//        b. Ask user if they'd like a receipt printed or emailed
        System.out.println("Would you like your receipt printed or emailed?");
        String receiptChoice = input.next();
//        c. Display currentBalance
        System.out.println(currentBalance);
//        d. If receiptChoice is equal to "printed":
        if (Objects.equals(receiptChoice, "receipt")) {
          //  i. Output to take receipt
            System.out.println("Please take your receipt and have a nice day!");
        }
        //        e. Otherwise if receiptChoice is equal to "email":
        else if (Objects.equals(receiptChoice, "email")) {
            //        i. Output to check email
        System.out.println("Check your email for your receipt and have a nice day!");
        }




    }
}
//Decimal format
//Make another method to check if digit