package com.program.datastructure.bst;

public class BstOperations {
	private BstNode root;

	public BstOperations() {
		root = null;
	}

	/* Check whether the bst is empty or not */
	public boolean isEmpty() {
		return (root == null);
	}

	public void insert(int value) {
		root = insert(root, value);
	}

	/* Function to insert the data */
	public BstNode insert(BstNode node, int value) {
		if (node == null) {
			node = new BstNode(value);
		} else if (value <= node.getData()) {
			node.setLeft(insert(node.getLeft(), value));
		} else
			node.setRight(insert(node.getRight(), value));
		return node;
	}

	/* Count the number of nodes in BST */
	public int count(BstNode root) {
		if (root == null) {
			return 0;
		} else {
			int l = 1;
			l += count(root.getLeft());
			l += count(root.getRight());
			return l;
		}
	}

	/* Tree traversal */
	/* 1) Pre Order */
	// root,left,right
	public void preOrder(BstNode root) {
		if (root != null) {
			System.out.print("==>" + root.getData());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}

	/* 2) Post Order */
	// left,right,root
	public void postOrder(BstNode root) {
		if (root != null) {
			preOrder(root.getLeft());
			preOrder(root.getRight());
			System.out.println("==>" + root.getData());
		}
	}

	/* 3) In Order */
	// left,root,right
	public void inOrder(BstNode root) {
		if (root != null) {
			preOrder(root.getLeft());
			System.out.println(root.getData());
			preOrder(root.getRight());
		}
	}

}
