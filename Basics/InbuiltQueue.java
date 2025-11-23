package Basics;
import java.util.*;
public class InbuiltQueue {
	public static void main(String args[]) {
		//by using linked list
		Queue<Integer> queue = new LinkedList<>();
		//for enqueue
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		//display all elements
		System.out.println(queue);
		//display front element		
		System.out.println(queue.peek());
		//reomve queue
		queue.remove();
		System.out.println(queue);
	}
}
