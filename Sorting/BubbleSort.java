package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {3,1,5,2,9,8,2,5};
		System.out.println("Original Array : "+Arrays.toString(arr));
		int n=arr.length;
		boolean flag ;
		for(int i=0;i<n-1;i++) {
			flag = false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true ;
				}
			}
			if(!flag) {
				break;
			}
		}
		System.out.println("Sorted Array : "+Arrays.toString(arr));
	}
}
