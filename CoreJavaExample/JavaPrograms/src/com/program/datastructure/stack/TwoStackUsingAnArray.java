/*Questions:
 * Given an array of integer in java, create two stack using an single array.
 * 1) We shall be able to perform pop)_ andd push() from both the array
 * 
 */

/*
 * Implementation:
 * 1) We have to use a couple of indexes i.e; top1 and top2 represting top of the stack1 and stack2 respectively
 * top1 = -1 andd top2 = size of the array
 * 
 * 2) Stack1 operations:
 * a) push() : Increment top1 and insert the element to that index
 * b) pop() : Return the element in the top1 and decrement the top value
 * 
 * 3) Stack2 operations:
 * a) push() : Decrement the top2 by index and insert the element to that index of the array
 * b) pop() : Return the elemment in the top2 and increment the top value
 */

package com.program.datastructure.stack;

import java.util.EmptyStackException;

import com.program.stackoverflow.StackOverFlowError;

public class TwoStackUsingAnArray {
	private int arr[];
	private int size;
	private int top1;
	private int top2;

	// Constructor
	public TwoStackUsingAnArray(int size) {
		arr = new int[size];
		top1 = -1;
		top2 = size;
	}

	// push1() ==> push to the 1st stack
	public void push1(int data) {
		if (isFull()) {
			throw new StackOverflowError("TwoStacks is full");
		}
		arr[++top1] = data;

	}

	// pop1() ==> pop from the 1st stack
	public int pop1() {
		if (isEmpty1()) {
			throw new EmptyStackException();
		}
		int data = arr[top1--];
		return data;
	}

	// push2() ==> push to the 2nd stack
	public void push2(int data) {
		if (isFull()) {
			throw new StackOverflowError("TwoStacks is full");
		}
		arr[--top2] = data;
	}

	// pop2() ==> pop from the 2nd stack
	public int pop2() {
		if (isEmpty2()) {
			throw new EmptyStackException();
		}
		int data = arr[top2--];
		return data;
	}

	public boolean isEmpty1() {
		if (top1 == -1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty2() {
		if (top2 == size) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (top1 == top2) {
			return true;
		}
		return false;
	}

}
