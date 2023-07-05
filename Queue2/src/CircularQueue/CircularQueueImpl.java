package CircularQueue;



class CircularQueue {
	int size;
	int arr[];
	int rear, front;

	public CircularQueue(int size) {
		arr = new int[size];
		rear = -1;
		front = -1;
	}

	public boolean isFull() {
		return (front == (rear + 1) % arr.length-1);
	}

	public boolean isEmpty() {
		return (front == -1 && rear == -1);
	}

	public boolean enQueue(int data) {
		if (isFull()) {
			return false;
		}
		if (front == -1) {
			front = 0;
		}
		rear = (rear + 1) % size;
		arr[rear] = data;
		return true;
	}

	public int deQueue() {
		if (isEmpty()) {
			return -1;
		}
		int result = arr[front];
		if (front == rear) {
			front = -1;
			rear = -1;
		}else {
		front = (front + 1) % size;
		}
		return result;
	}
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return arr[front];
		
	}
}
public class CircularQueueImpl {
	public static void main(String[] args) {
        CircularQueue c = new CircularQueue(5);
        c.enQueue(10);
        c.enQueue(20);
        c.enQueue(30);
        c.enQueue(40);
        c.enQueue(50);
        System.out.println(c.peek());
        System.out.println(c.deQueue());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
