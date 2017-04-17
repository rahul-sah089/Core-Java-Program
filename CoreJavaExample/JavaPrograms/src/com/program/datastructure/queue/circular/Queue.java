package com.program.datastructure.queue.circular;

public class Queue {
	int a[];
	int front, rear;

	public Queue() {
		a = new int[5];
		front = rear = 0;
	}

	public Queue(int size) {
		a = new int[size];
		front = rear = 0;
	}

	// 1) enqueue from the rear
	public void enqueue(int n) {
		int p;
		p = (rear + 1) % a.length;
		if (p == front) {
			throw new IndexOutOfBoundsException("Queue is full");
		} else {
			rear = p;
			a[rear] = n;
		}
		if (front == -1) {
			front = 0;
		}
	}

	// 2) dequeue from the front
	public int dequeue() {
		int p = (front + 1) % a.length;
		// if the stack is empty
		if (front == rear) {
			rear = -1;
			front = -1;
			throw new IndexOutOfBoundsException("Queue is empty");
		}
		int element = a[front];
		front = p;
		return element;
	}

	/*// 3) Display
	public void display() {
		int i = front;
		while(i ){
			
		}
	}*/

}
