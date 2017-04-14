package com.program.datastructure.queue;

import java.util.Scanner;

public class QueueUsingArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the queue");
		// get the size
		int size = scanner.nextInt();
		QueueOperations queue = new QueueOperations(size);
		char ch = 'N';
		do {
			System.out.println("Queue operations");
			System.out.println("1) Insert");
			System.out.println("2) Remove");
			System.out.println("3) Peek");
			System.out.println("4) Check empty");
			System.out.println("5) Check full");
			System.out.println("6) Length");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the element to insert");
				try {
					int element = scanner.nextInt();
					queue.insert(element);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				break;
			case 2:
				try {
					System.out.println("Removed item ==>" + queue.remove());
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				break;
			case 3:
				try {
					System.out.println("Item peeked==>" + queue.peek());
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				break;
			case 4:
				try {
					System.out.println("Is queue empty ==>" + queue.isEmpty());
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				break;
			case 5:
				try {
					System.out.println("Is queue full ==>" + queue.isFull());
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				break;
			case 6:
				try {
					System.out.println("Queue length==>" + queue.getLength());
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				break;
			default:
				System.out.println("Wrong Entry\n");
			}
			System.out.println("Enter 'Y' to exit");
			ch = scanner.nextLine().charAt(0);
		} while (ch != 'Y');
		scanner.close();
	}
}
