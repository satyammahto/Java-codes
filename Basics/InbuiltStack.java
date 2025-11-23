package Basics;
import java.util.*;
public class InbuiltStack {

	public static void main(String[] args) {
		Stack<Integer> stack= new Stack<Integer>();
		//pushing
		System.out.println("Pushed "+stack.push(10));
		System.out.println("Pushed "+stack.push(20));
		System.out.println("Pushed "+stack.push(30));
		System.out.println("Pushed "+stack.push(40));
		//full stack
		System.out.println("Stack :"+stack);
		//popping
		System.out.println("Poped "+stack.pop());
		System.out.println("Stack :"+stack);
		//checking empty or not
		System.out.println(stack.isEmpty());
	}
}
