package Basics;
import java.util.*;
public class KthMinMaxElements {
   // code for kth smallest and largest element 
	static void check(int k,int n,int[] arr) {
		if(k > n || k < 1) {
            System.out.println("Invalid value of k!");  
            return;
        }     
        Arrays.sort(arr);
        int kthSmallest = arr[n- k + 1];//gives just one smaller number than k
        int kthLargest = arr[k-1];//gives just one larger number than k
        System.out.println("Kth smallest element: " + kthSmallest);
        System.out.println("Kth largest element: " + kthLargest);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= {2,3,8,99,5,1};
		int n=arr.length;
		System.out.println("Enter value of K(1-6) : ");
		int k=sc.nextInt();//index number
		check(k,n,arr);		
	}}
