package linearQueue;

import java.util.Iterator;
import java.util.Scanner;

public class LinearQueue {
	int size;
	int arr[];
	int rear;

	public LinearQueue(int size) {
		arr = new int[size];
		rear = -1;
	}

	public boolean enQueue(int data) {
		if (rear == arr.length - 1) {
			System.out.println("Queue is Full....!");
			return false;
		}
		rear++;
		arr[rear] = data;
		return true;
	}

	public int deQueue() {
		if (rear == -1) {
			System.out.println("Queue is Empty......");
			return -1;
		}

		int result = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		rear--;
		return result;

	}

	public int peek() {
		if (rear == -1) {
			System.out.println("queue is empty");
			return -1;
		}
		return arr[0];
	}
}

class QueueImpl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean exit = false;

		System.out.println("Enter size of Queue : ");
		LinearQueue l1 = new LinearQueue(sc.nextInt());
		while (!exit) {
			System.out.println("Enter choice : 1.Add , 2.Remove ,3.Peek ,4.Exit");
			int choice = sc.nextInt();
			int data;

			switch (choice) {
			case 1:
				System.out.println("Enter element to insert :");
				data = sc.nextInt();
				l1.enQueue(data);
				break;
			case 2:
				data = l1.deQueue();
				System.out.println("removed Element : " + data);
				break;
			case 3:
				data = l1.peek();
				System.out.println("Peeked element: " + data);
				break;
			case 4:
				exit = true;
			default:
				break;
			}
		}
	}

}
