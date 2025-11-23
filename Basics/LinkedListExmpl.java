package Basics;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class LinkedListExmpl{
	static Node head;
	public static void insertAfter(Node head,int after,int data) {
		Node temp=head;
		Node newNode = new Node(data);
		while(temp!=null && temp.data!=after) {
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;
	}
	public static void display(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
		}
		System.out.print("null");
		System.out.println();
	}
	public static void search(Node head,int data) {
		Node temp=head;
		int pos=1;
		boolean flag=false;
		while(temp!=null) {
			if(temp.data==data) {
				flag=true;
				System.out.println(data+" is found at position "+pos);
			}
			temp=temp.next;
			pos++;			
		}if(flag==false) {
			System.out.println(data+" is not found ");
		}
	}
	public static void main(String args[]) {
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		
		Node head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
	}
}