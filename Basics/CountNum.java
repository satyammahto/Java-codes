package Basics;

public class CountNum {
	public static void main(String[] args) {
		int num=123456;
		int a=0;
		while(num>0){
		num=num/10;
		a++;	
		}System.out.println(a);
	}
}
