 package Concept;

public class BsInfiniteArr {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
		int st = 0;
		int end=1;
		int target = 13;
		while(target > arr[end]) {
			int temp = end + 1;
			end = end + (end - st + 1)*2  ;
			st = temp;
			
		}
		System.out.println(binary(arr,target,st,end));
	}
	public static int binary(int[] arr,int target,int st,int end) {

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
		return -1;
	}
}


