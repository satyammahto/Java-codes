package Leetcode;
import java.util.*;
public class Long_SubStr {
	    public static int lengthOfLongestSubstring(String s) {
	        int count ;
	        String[] str=s.split(" ");
	        for(int i=0;i<str.length;i++){
	            for(int j=i+1;j<str.length;j++){
	                if(str[i]==str[j]){
	                    return j;
	                }
	            }
	        }
	        return 0;
	    }
	    
	    public static void main(String args[]) {
	    	String q="abcabcbb";
	    	int value = lengthOfLongestSubstring(q); 
	    	System.out.println(value);
	    }
	}