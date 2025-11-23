package Basics;
import java.util.*;
public class PalindromeOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.next();
		char arr[]=str.toCharArray();
		boolean flag=true;
		int st=0,end=arr.length-1;
		while(st<end) {
			if(arr[st]!=arr[end]) {
				flag=false;
				break;
			}
			st++;
			end--;
		}
		if(flag==true) {
			System.out.println("String is a Palindrome string...");
		}else {
			System.out.println("String is not a Palindrome string...");
		}}
}