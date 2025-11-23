
package Basics;
import java.util.Scanner;
public class AreaOfShape {
	int abc;
	public static void main(String[] args) {
    //Area of Rectangle
			Scanner sc=new Scanner(System.in);	
			System.out.println("Enter the Length of Rectangle : ");
			int l=sc.nextInt();
			System.out.println("Enter the Breadth of Rectangle : ");
			int b=sc.nextInt();
			double area_rec=l*b;
			System.out.println("Area of Rectangle is : "+area_rec);
	
	//Area of circle			
			System.out.println("Enter radius of a Circle : ");
			int radius=sc.nextInt();
			double area_cir=3.14*radius*radius;
			System.out.println("Area of Circle is : "+area_cir);
			sc.close();
		}
	}