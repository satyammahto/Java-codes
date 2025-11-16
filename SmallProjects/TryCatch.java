package SmallProjects;
//import java.util.Scanner;
import java.util.InputMismatchException;
public class TryCatch {

	public static void main(String[] args) {
	//	Scanner sc=new Scanner(System.in);
		try {
		    int[] nums = {1, 2};
		    System.out.println(nums[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("Index is out of bounds.");
		} 
	}
}
