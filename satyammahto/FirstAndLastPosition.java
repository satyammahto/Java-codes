package satyammahto;

import java.util.Arrays;

public class FirstAndLastPosition {
	public static void main(String args[]) {
		int[] arr = {1,2,2,2,3,3,4};
		int target = 2;
		int[] result = search(arr,target);
		if(result[0] == -1) {
			System.out.println("target not found");
		}else {
			System.out.println(Arrays.toString(result));
		}
		
	}
	public static int[] search(int[] arr, int target) {
		int first=findbound(arr,target,true);
		int second=findbound(arr,target,false);
		return new int[] {first,second};
	}
	public static int findbound(int[] arr,int target,boolean flag) {
		int st=0;
		int end=arr.length-1;
		int ans=-1;
		while(st<=end) {
			int mid=st+(end-st)/2;
			if(target == arr[mid]) {
				ans = mid;
				if(flag) {
					end=mid-1;
				}else {
					st=mid+1;
				}
			}else if(target > arr[mid]) {
				st=mid+1;
			}else {
				end=mid-1;
			}
		}	
		return ans;
	}
}