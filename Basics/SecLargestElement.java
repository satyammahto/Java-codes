package Basics;
import java.util.Arrays;
public class SecLargestElement {
    //code for second-largest element
	public static void main(String[] args) {
		int arr[]= {3,1,5,2,8,9};
		int n = arr.length;
		Arrays.sort(arr);//sorting an array
		System.out.println("Second Largest element is : "+arr[n-2]);
	}

}
