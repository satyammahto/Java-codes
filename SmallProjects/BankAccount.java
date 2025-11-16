package SmallProjects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccount {

    // Step 1: Encapsulation - make fields private
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private int pin; // Step 2: Move PIN into class

    // Constructor with PIN
    BankAccount(String accountHolder, String accountNumber, int pin) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = 0.0;
    }

    // Step 2: Verify pin method
    boolean verifyPin(int enteredPin) {
        return this.pin == enteredPin;
    }

    // Deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("===Deposit successful.===");
            System.out.println(" Current balance: " + balance);

        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("===Withdrawal successful.===");
            System.out.println(" Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Check balance
    void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    // Optional: Show account info
    void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Create New Bank Account ===");

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();

        System.out.print("Set a 4-digit PIN: ");
        int pin = sc.nextInt();

        // Step 2: Store PIN inside object
        BankAccount ba = new BankAccount(name, accNum, pin);

        System.out.println("\nAccount created successfully!");
        ba.showAccountInfo();

        int choice;
        do {
            System.out.println("\n--- Banking System Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter your 4-digit PIN: ");
                        int depositPin = sc.nextInt();
                        if (ba.verifyPin(depositPin)) {
                            System.out.print("Enter amount to deposit: ");
                            double depositAmount = sc.nextDouble();
                            ba.deposit(depositAmount);
                        } else {
                            System.out.println("Incorrect PIN. Try again.");
                        }
                        break;

                    case 2:
                        System.out.print("Enter your 4-digit PIN: ");
                        int withdrawPin = sc.nextInt();
                        if (ba.verifyPin(withdrawPin)) {
                            System.out.print("Enter amount to withdraw: ");
                            double withdrawAmount = sc.nextDouble();
                            ba.withdraw(withdrawAmount);
                        } else {
                            System.out.println("Incorrect PIN. Try again.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter your 4-digit PIN: ");
                        int checkPin = sc.nextInt();
                        if (ba.verifyPin(checkPin)) {
                            ba.checkBalance();
                        } else {
                            System.out.println("Incorrect PIN. Try again.");
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using our Bank System!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numeric values only.");
                sc.next(); // clear the invalid input
                choice = 0; // reset choice so loop continues
            }

        } while (choice != 4);

        sc.close();
    }
}
