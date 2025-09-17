package Leetcode;

public class Rev_Int {	
	    public static int reverse(int x) {
	        int temp=x;
	        int rev=0,rem;
	        while(x!=0){
	            rem=x%10;
	            rev=rev*10+rem;
	            x/=10;
	        }
	        return rev;
	    }
	    public static void main(String args[]){
	        int x=-321;
	        System.out.println(reverse(x));
	    }
	}
