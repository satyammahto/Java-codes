package Leetcode;
import java.util.*;
public class FirstAndLastPos {//using two pointers method

	public static void main(String[] args) {
		int[] arr = {1,2,3,2,4,3,2};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(search(arr,2)));
	}	
	public static int[] search(int[] arr , int target) {
		int st=0;
		int end=arr.length-1;
		for(int i=0;i<arr.length;i++) {
		if(arr[st]!=target) {
			st++;
		}else if(arr[end]!=target) {
			end--;
		}else
			break;
		}
		return new int[] {st,end};
	}
}
