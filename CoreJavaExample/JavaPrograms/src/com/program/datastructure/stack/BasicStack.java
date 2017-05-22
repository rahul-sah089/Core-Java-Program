package com.program.datastructure.stack;

public class BasicStack {
	static final int MAX = 100;
	private int top;
	int a[] = new int[MAX];

	public BasicStack() {
		top = -1;
	}

	public Integer peek() {
		return a[top];
	}

	public Integer pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		return a[top--];
	}

	public void push(int data) {
		if (isFull()) {
			throw new IllegalStateException("Stack is full");
		}
		top++;
		a[top] = data;
	}

	public boolean isEmpty() {
		return (top < 0);
	}

	public boolean isFull() {
		return (top == MAX - 1);
	}
	
	public void printStack(){
		int tempTop = top;
		for(int i = 0 ; i <= tempTop;i++){
			System.out.println(a[i] + " ");
		}
	}

}
