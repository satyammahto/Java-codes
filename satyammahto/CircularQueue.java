package satyammahto;

public class CircularQueue {
    private int[] arr;
    private int size;
    private int front;
    private int rear;

    public CircularQueue(int size) {
        this.size = size;
        this.arr = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full...");
            return;
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        arr[rear] = data;
        System.out.println("Enqueue " + data);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty...");
            return;
        }

        System.out.println("Dequeue " + arr[front]);
        arr[front] = 0;

        if (front == rear) {
            // Only one element was in the queue
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    public boolean isFull() {
        return ((rear + 1) % size) == front;
    }

    public boolean isEmpty() {
        return front == -1;
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
        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue(); // frees up space
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); // this should now work!
        queue.display();   // see the final queue state
    }
}
