package Basics;

import java.util.*;
public class IAE1_1Q {
	public static void main(String[] args) {	
System.out.println("Enter a number :");
Scanner sc = new Scanner(System.in);
		int num;
int sum=0;
boolean choice=true;
		do{
		num=sc.nextInt();
		if(num<0){
		 System.out.println("entered number is negative ");
		 choice=false;
		 break;
		}
		 sum=sum+num;
		System.out.println("if u want to continue then enter positive number or negative number to iterate");
		System.out.println("Sum is "+sum);
		
	}while(choice);
	}
}