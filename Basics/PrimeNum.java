package satyammahto;

import java.util.*;
public class PrimeNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	int m = s.nextInt();
	boolean isPrime=true;
	for(int i=2;i<=m/2;i++){//another method for(int i=2;i<=Math.sqrt(m);i++)
                           //another method is i*i<=m
		if(m%i==0){
			isPrime=false;
			break;
		}
	}
	if(isPrime){
		System.out.println("Prime");
	}else {
		System.out.println("Non prime");
	}
	}
}