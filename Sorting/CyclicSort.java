package Sorting;
import java.util.Arrays;
public class CyclicSort {
//	if ele of arr is 1,n then only we can use it
	public static void main(String[] args) {
		int[] arr= {2,1,5,4,3,6};
		int i=0;
		while(i < arr.length-1) {
			int check = arr[i] - 1;
			if(arr[i] != arr[check]) {
				int temp = arr[i];
				arr[i] = arr[check];
				arr[check] = temp;
			}else {
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
