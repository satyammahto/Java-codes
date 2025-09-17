package practiceOOP;

class Student{
	static int age;
	static String name;
	static int roll_No;
//	Student(){
//		this.age=age;
//		this.name=name;
//		this.roll_No=roll_No;
//	}
}
public class ClassQues {

	public static void main(String[] args) {
		Student std = new Student();
		std.age=10;
		std.name="satyam";
		std.roll_No=31;
		System.out.println("Age is "+std.age);
		System.out.println("Name is "+std.name);
		System.out.println("roll no is "+std.roll_No);
	}
}
