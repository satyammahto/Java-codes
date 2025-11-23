package Basics;

import java.util.*;
public class Factorial {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a num : ");
	int n=sc.nextInt();
	int m=1;
	/*for(int i=n;i>1;i-=2){
		 m=m*i*(i-1);
		 }
		 System.out.println(m);
		 
		Another method is calling a function[ex.fact(n)] for output we use
		return n*fact(n-1)
			*/
		 for(int i=2;i<=n;i++){
		 	m*=i;
		 		}System.out.println(m);	
}}
