package Leetcode;

import java.util.Arrays;

public class RevArr {
	public static void main(String args[]) {
		char s[] = {'h','e','a','l','l','s'};
		int left = 0;
		int right = s.length-1;
		for(int i=0;i<s.length/2;i++) {
		char temp = s[left+i];
		s[left+i]=s[right-i];
		s[right-i]= temp;		
		}
		System.out.println(Arrays.toString(s));
	}
}
