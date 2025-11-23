package Basics;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		int[] newArr= new int[n];
		for(int i=0;i<n;i++) {
			newArr[i]=arr[n-i-1];
		}
		System.out.println(Arrays.toString(newArr));
	}
}
