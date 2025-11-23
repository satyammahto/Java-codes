package Basics;
import java.util.*;
public class RemoveDupElements {
    // Method to remove the element at index j
    static int[] removeIndex(int j, int[] arr) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == j) continue;
            newArr[k++] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 5, 3, 2, 1};
        System.out.println("Original array :"+Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr = removeIndex(j, arr);  // update arr with the new array
                }
            }}      
        System.out.println("Array after removing Duplicate elements ");
        System.out.println("New array :"+Arrays.toString(arr));
    }}