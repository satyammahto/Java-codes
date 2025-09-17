package Sorting;
import java.util.Arrays;

public class SelectionSort {
	public static void main(String args[]) {
		int arr[] = {3,1,5,2,6,4,9,6,8};
		for(int i = 0; i<arr.length -1 ; i++) {
			int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[min] ) {
					min = j;
				}
			}
			if(min != i)
			{
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			}
		}System.out.println(Arrays.toString(arr));
	}
}