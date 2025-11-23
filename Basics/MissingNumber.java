package Basics;
import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5}; // Missing number is 3
        int n = arr.length + 1; // Since one number is missing

        // Calculate expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Calculate actual sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number is: " + missingNumber);
    }
}
