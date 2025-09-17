package practiceOOP;

import java.util.Scanner;

public class CharacterOccurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = sc.nextLine();
        
        char ch[] = input.toCharArray();
        int count[] = new int[256];
        for(int i=0;i<ch.length;i++) {
        	count[input.charAt(i)]++;
        }
        
        for(int i=0;i<256;i++) {
        	if(count[i]>0) {
        	System.out.println((char)i+" : "+count[i]);
        }
        }
    }
    
}
