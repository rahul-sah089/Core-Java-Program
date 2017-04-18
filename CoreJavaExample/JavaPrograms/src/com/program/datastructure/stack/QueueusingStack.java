package com.program.datastructure.stack;

import java.util.Stack;

public class QueueusingStack {
	Stack<Integer> newStack;
	Stack<Integer> oldStack;

	/* Constructur */
	public QueueusingStack() {
		this.newStack = new Stack<Integer>();
		this.oldStack = new Stack<Integer>();
	}

	public void enque(int data) {
		// push to the old stack
		oldStack.push(data);
	}

	public Integer deque() {
		// when for the new stack
		// if the reverse stack is empty then fill from old stack till it is
		// empty
		if (newStack.isEmpty()) {
			while (!oldStack.isEmpty()) {
				newStack.push(oldStack.pop());
			}
		}
		return newStack.pop();
	}

}
