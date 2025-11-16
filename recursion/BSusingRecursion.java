package recursion;

public class BSusingRecursion {

	static int search(int arr[] , int target , int s , int e) {
		
		if(s > e) {
			return -1;
		}
		
		int m = s + (e-s)/2;
		
		if(target == arr[m]) {
			return m;
		}
		
		if(target > arr[m]) {
			return search(arr , target , m+1 , e);
		}
		
		return search(arr , target , s , m-1);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,10,15,20,22,30,55}; 
		int target = 10;
		System.out.println(search(arr , target , 0 , arr.length-1 ));
	}
}
