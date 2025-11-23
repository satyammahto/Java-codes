package Basics;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5; // Number of terms
        fibonacciSeries(n);
    }

    static void fibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}


