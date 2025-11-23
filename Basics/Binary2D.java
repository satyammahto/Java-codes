package Basics;

import java.util.*;
public class Binary2D {
	public static void main(String[] args) {
	int arr[][]={
		{10,20,30,40},
		{21,23,35,45},
		{28,29,37,48},
		{30,34,38,50},
		};
		int target=29
				;
		System.out.println(Arrays.toString(search(arr,target)));
	}
	public static int[] search(int[][] matrix,int target){
		int r=0;
		int c=matrix[r].length-1;
		while(r<matrix.length && c>=0){
		if(target==matrix[r][c]){
			return new int[]{r,c};
			}	
			else if(target<matrix[r][c]){
				c--;
			}else{
				r++;
			}
		}
	return new int[]{-1,-1};	
	}
}