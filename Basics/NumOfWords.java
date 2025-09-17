package satyammahto;
import java.util.*;
public class NumOfWords {
	//code for count no of words in a sentence
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any sentence : ");
		String sentence=sc.nextLine();
		String arr[]=sentence.split(" ");
		int count=0;
		while(count<arr.length) {
			count++;
		}
		System.out.println("Number of words in sentence is : "+count);
	}
}
