package Leetcode;

import java.util.Arrays;

public class FirstAndLastPos2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,3,4};
		int target = 3;
		int[] ans= {-1,-1};
		ans[0]=search(arr,target,true);
		ans[1]=search(arr,target,false);
		System.out.println(Arrays.toString(ans));

	}
	public static int search(int[] arr,int target,boolean findIndex) {
		int st=0;
		int end=arr.length-1;
		int ans=-1;
		while(st<=end) {
			int mid = st+(end-st)/2;
			if(target > arr[mid]) {
				st = mid+1;
			}else if(target < arr[mid]) {
				end = mid -1;
			}else {
				ans = mid;
				if(findIndex) {
					end = mid-1;
				}else {
					st = mid+1;
				}
			}
		}
		return ans;
	}
}
