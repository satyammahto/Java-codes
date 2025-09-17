package satyammahto;
import java.util.ArrayList;
public class ArrayListExmp {

	public static void main(String[] args) {
		ArrayList<Integer> nums =new ArrayList<Integer>();//<Integer> --> rapper class
		ArrayList<String> students =new ArrayList<String>();
		nums.add(20);
		nums.add(10);
		nums.add(0,5);//array is 5,20,10
		nums.set(2,30);//updating 10 with 30 
		nums.remove(2);//removing 2nd index value which is 30
		System.out.println(nums);
		students.add("Satyam");
		students.add("Ramesh");
		students.add("Mayank");//array is satyam ramesh mayank
		students.remove(2);//array is satyam ramesh
		System.out.println(students);
	}
}
