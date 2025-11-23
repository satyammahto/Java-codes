package Basics;
import java.util.*;
public class SmallestNum {
    //code for smallest num among three num
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1=sc.nextInt();
		System.out.println("Enter Second number : ");
		int num2=sc.nextInt();
		System.out.println("Enter Third number : ");
		int num3=sc.nextInt();
		int smallestNum=Math.min((Math.min(num1, num2)), num3);
		System.out.println("Smallest number among three number is : "+smallestNum);

	}
}
