package Basics;
import java.util.*;
public class CelciusToFaren {

	public static void main(String[] args) {
		//celcius to farenheit
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter celcius : ");
	int cel=sc.nextInt();
	int faren=cel*9/5+32;
	System.out.println("Farenheit is : "+ faren);
	}
}
