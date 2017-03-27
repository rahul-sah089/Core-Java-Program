package com.program.datastructure.bst;

public class BstNode {
	int data;
	BstNode left;
	BstNode right;

	public BstNode() {
		data = 0;
		left = right = null;
	}

	public BstNode(int n) {
		data = n;
		left = right = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BstNode getLeft() {
		return left;
	}

	public void setLeft(BstNode left) {
		this.left = left;
	}

	public BstNode getRight() {
		return right;
	}

	public void setRight(BstNode right) {
		this.right = right;
	}

}
