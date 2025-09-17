package satyammahto;

public class QueueExmp {
	private int[] arr;
	private int size;
	private int front;
	private int rear;
	
	public QueueExmp(int size){
		this.size=size;
		this.arr=new int[size];
		this.front=-1;
		this.rear=-1;	
	}
	public void enqueue(int data) {
		if (isFull()==false) {
			if(front==-1 && rear==-1) {
				front++;
				rear++;
				arr[rear]=data;
				System.out.println("Enqueue "+data);
			}else {
				rear++;
				arr[rear]=data;
				System.out.println("Enqueue "+data);
			}}else {
				System.out.println("Queue is full cannot enqueue "+data);
			}
		}
	
	public boolean isFull() {
		return rear==size-1;
	}
	
	public void dequeue() {
		if(isEmpty()==false) {
			if(front==size-1 && rear==size-1) {
				System.out.println("Dequeue "+arr[front]);
				arr[front]=0;
				front=-1;
				rear=-1;
			}else {
				System.out.println("Dequeue "+arr[front]);
				arr[front]=0;
				front++;
			}}else {
				System.out.println("Queue is Empty cannot dequeue");
		}
	}
	public boolean isEmpty() {
		return front==-1 && rear==-1;
	}
	
	public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty...");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

	public static void main(String[] args) {
		QueueExmp queue = new QueueExmp(5);
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
	}
}
 