package Basics;

import java.util.Scanner;

 interface Payment {
    void makePayment(double amount);
}

 class UPI implements Payment {
    public void makePayment(double amount) {
    	System.out.println();
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

 class PayPal implements Payment {
    public void makePayment(double amount) {
    	System.out.println();
        System.out.println("Paid ₹" + amount + " using PayPal.");
    }
}

 class CreditCard implements Payment {
    public void makePayment(double amount) {
    	System.out.println();
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

public class AbstractionOops {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        Payment payment ;  // Interface reference
    
        System.out.println("\nChoose payment method:");
        System.out.println("1. UPI");
        System.out.println("2. PayPal");
        System.out.println("3. Credit Card");
            
        int choice = sc.nextInt();
            
        System.out.print("\nEnter amount: ₹");
        double amount = sc.nextDouble();
            
        switch (choice) {
            case 1:
                payment = new UPI();
                payment.makePayment(amount);
                break;
            case 2:
                payment = new PayPal();
                payment.makePayment(amount);
                break;
            case 3:
                payment = new CreditCard();
                payment.makePayment(amount);
                break;
            default:
                System.out.println("\nInvalid choice.");
                return;                      
        }  // Polymorphic call     
        sc.close();
    }
}
