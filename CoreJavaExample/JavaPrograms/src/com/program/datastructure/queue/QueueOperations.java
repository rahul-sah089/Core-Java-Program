package com.program.datastructure.queue;

import java.util.NoSuchElementException;

public class QueueOperations {
	protected int queue[];
	protected int size, len, front, rear;

	// Initializing the queue
	public QueueOperations(int n) {
		size = n;
		front = -1;
		rear = -1;
	}

	/*
	 * Basic operations: 1) isEmpty() 2) isFull() 3) insert(int i) 4) peek() 5)
	 * remove()
	 */

	// Function to check whether a stack is empty or not
	public boolean isEmpty() {
		return (front == -1);
	}

	// Function to check whether a stack is full or not
	public boolean isFull() {
		return (front == -1 && rear == size - 1);
	}

	/* Function to insert an element in the queue */
	public void insert(int i) {
		if (rear == -1) {
			rear = 0;
			front = 0;
			queue[rear] = i;

		} else if (rear + 1 > size) {
			throw new IndexOutOfBoundsException("OverFlow Exception");
		}

		else if (rear + 1 < size) {
			queue[++rear] = i;
		}
		len++;
	}

	public int peek() {
		int element;
		if (isEmpty()) {
			throw new NoSuchElementException("UnderFlow exception");
		} else {
			element = queue[front];
		}
		return element;
	}

	public int getLength() {
		return len;
	}

	/* Function to remove an element from the queue */
	public int remove() {
		int element;
		if (isEmpty()) {
			throw new NoSuchElementException("UnderFlow Exception");
		} else {
			element = queue[front++];
		}
		if (front == rear) {
			front = -1;
			rear = -1;
		}
		len--;
		return element;
	}

	public void display() {
		System.out.println("Displaying the queue");
		System.out.print("[");
		for (int i = front; i < rear; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.print("]");
	}

}
