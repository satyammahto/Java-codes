package satyammahto;
import java.util.*;
public class SwapUsingVar {
    //code for swapping number using third variable
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1=sc.nextInt();
		System.out.println("Enter Second number : ");
		int num2=sc.nextInt();
		System.out.println("Before swapping : "+num1+" "+num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swapping : "+num1+" "+num2);

	}
}
