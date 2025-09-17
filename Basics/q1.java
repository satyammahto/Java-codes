package satyammahto;
import java.util.*;
public class q1 {
		    public static int[] twoSum(int[] nums, int target) {
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(target==(nums[i]+nums[j])){
	                  return new int[]{i,j};
	                }
	            }
	        }
	        return new int[]{0};
	    }
	    public static void main(String[] args){
	        int[] arr={3,2,4}; 
	       // int[] value=twoSum(arr,6);
	   //    System.out.println(Arrays.toString(twoSum(arr,6)));
	      	    }
	}

