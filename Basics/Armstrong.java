package Basics;
import java.util.*;
public class Armstrong {
    //code for checking number is an armstrong number or not
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3 digit number : ");
		int num=sc.nextInt();
		int temp,rem,sum=0;
		temp=num;
		while(num>0) {
			rem=num%10;
			sum+=rem*rem*rem;
			num/=10;
		}
		if(temp==sum) {
			System.out.println("Number is an Armstrong number..");
		}else {
			System.out.println("Number is not an Armstrong number..");
		}
	}
}
