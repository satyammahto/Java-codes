package satyammahto;
import java.util.Scanner;
public class PalindromeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp,rev=0,rem,num;
		System.out.println("Enter a Number :");
		num=sc.nextInt();
		temp=num;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==temp) {
			System.out.println("Entered Number is a palindrome number");
		}else {
			System.out.println("Entered Number is not a palindrome number");
		}
	}
}
