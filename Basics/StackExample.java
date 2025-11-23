package Basics;

public class StackExample {
	private int top;
	private int arr[];
	private int size;
	
	public StackExample(int size){
		this.size=size;
		this.arr=new int[size];
		this.top=-1;
	}
	
	public void push(int data) {
		if(isFull()==false) {
			top++;
			arr[top]=data;
			System.out.println("Pushed "+data);
		}else {
			System.out.println("Stack is Overflowed cannot push "+data);
		}
	}
	public boolean isEmpty() {
		return top==-1;
	}
	
	public void pop() {
		if(isEmpty()==false) {
			System.out.println("Poped "+arr[top]);
			arr[top]=0;
			top--;
		}else {
			System.out.println("Stack is empty...");
		}
	}
	
	public boolean isFull() {
		return top==size-1;
	}
	
	public void peek() {
		if(isEmpty()==false) {
		System.out.println("Top element is "+arr[top]);
	}
	}
	public void display() {
		if(top==-1) {
			System.out.println("Stack is empty..");
		}
		else {
		int top=0;
		System.out.print("Stack : ");
		while(top<size) {
			System.out.print(arr[top]+" ");
			top++;
		}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		StackExample stack = new StackExample(5);
		stack.display();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.display();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
	}
}
