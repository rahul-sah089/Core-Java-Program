package com.program.datastructure.stack;

public class BasicStack {
	// Default array capacity
	public static final int CAPACITY = 10;

	// Index of the top element of the stack
	protected int top = -1;

	// Array used to implement the stack
	protected int[] stackrep;

	public BasicStack() {
		stackrep = new int[CAPACITY];
	}

	// Test whether the stack is empty. Time Complexity ==> O)(1)
	public boolean isEmpty() {
		return (top < 0);
	}

	// return the number if element in the stack. Time Complexity ==> O)(1)
	public int size() {
		return (top + 1);
	}

	// Insert the element to the top of the stack. Time Complexity ==> O)(1)
	public void push(int data) throws Exception {
		if (top == CAPACITY) {
			throw new Exception("Stack is full");
		}
		stackrep[++top] = data;
	}

	// Insert the element on top of the stack. Time Complexity ==> O)(1)
	public int top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is empty");
		}
		return stackrep[top];
	}

	// remove the element from the stack. Time Complexity ==> O(1)
	public int pop() throws Exception {
		int data;
		if (isEmpty()) {
			throw new Exception("Stack is empty");
		}
		data = stackrep[top];
		stackrep[top--] = Integer.MIN_VALUE;
		return data;
	}

	// return the element in the stack as list . In String format
	public String toString() {
		String s = "[";
		if (size() > 0) {
			for (int i = 0; i < size() - 1; i++) {
				s += stackrep[i];
			}
		}
		s += "]";
		return s;
	}

}
