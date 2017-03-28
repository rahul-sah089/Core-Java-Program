package com.program.datastructure.bst;

import java.lang.management.MemoryManagerMXBean;
import java.util.LinkedList;
import java.util.Queue;

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

	public int count() {
		return count(root);
	}

	public void preOrder() {
		preOrder(root);
	}

	public void inOrder() {
		inOrder(root);
	}

	public void postOrder() {
		postOrder(root);
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

	/* 4)level order traversal */
	public void levelOrder(BstNode root) {
		Queue<BstNode> queue = new LinkedList<BstNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BstNode temp = queue.poll();
			if (temp.getLeft() != null) {
				queue.add(temp.getLeft());
				System.out.println(temp.getData() + ",");
			} else if (temp.getRight() != null) {
				queue.add(temp.getRight());
			}
		}
	}

	static int height(BstNode root) {
		int height = 0;
		Queue<BstNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BstNode temp = queue.poll();
			height++;
			if (temp.left != null) {
				queue.add(temp.left);
			} else if (temp.right != null) {
				queue.add(temp.right);
			}
		}
		return height;
	}

	public static int maxDepth(BstNode node) {
		if (node == null) {
			return -1;
		}
		return 1 + Math.max(maxDepth(node.getLeft()), maxDepth(node.getRight()));
	}

	// height of the binary search tree

	// delete
	// Delete is the bst are of three type:
	// 1) Deleting the node which is the leaf node
	// 2)

}
