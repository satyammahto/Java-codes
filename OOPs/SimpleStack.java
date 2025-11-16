package OOPs;

public class SimpleStack {
	int arr[]=new int[5];
	int top=-1;
	int size=arr.length;
    void push(int data) {  	
    	if(top==size-1) {
    		System.out.println("Overflow");
    	}else {
    		arr[++top]=data;
    		System.out.println("Pushed "+data);
    	}
    }
    void pop() {
    	if(top==-1) {
    		System.out.println("Cannot Pop");
    	}else {
    		System.out.println("poped "+arr[top]);
    		arr[top]=0;
    		top--;
    	}
    }
	public static void main(String[] args) {
		SimpleStack s = new SimpleStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);	
	}
}
