package Basics;
import java.util.*;
public class VowelChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char vow[]={'a','e','i','o','u'};
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);
        boolean flag=false;
        for(int i=0;i<vow.length;i++) {
        	if(ch == vow[i]) {
        		flag=true;
        	}
        }
        if(flag == true) {
        	System.out.println("Entered character is a vowel...");
        }
        else {
        	System.out.println("Entered character is a consonant...");
        }
	}
}