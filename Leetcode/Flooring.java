package Leetcode;

public class Flooring {

	public static void main(String[] args) {
		int[] arr= {2,3,5,9,14,16,18};
		System.out.println(flooring(arr,6));
	}
	public static int flooring(int[] arr , int target) {
		int st=0;
		int end=arr.length-1;
		while(st<=end) {
			int mid = st+(end-st)/2;
			
			if(target == arr[mid]) {
				return mid;
			}else if(target > arr[mid]) {
				st=mid+1;
			}else {
				end=mid-1;		
		    }
		}
		return arr[end];
	}

}
