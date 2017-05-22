package com.program.datastructure.singlelinkedList;

public class SingleLinkedList {
	/*
	 * Operations: 1) Insertion a) Insertion at head b) Insertion at end c)
	 * Insertion in middle
	 */
	/*
	 * 2) Deletion a) At head b) At tail c) In between
	 * 
	 * 
	 */

	public Node head;
	public int size;

	public SingleLinkedList() {
		head = null;
		size = 0;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public int getSize() {
		return size;
	}

	// 1) Insertions
	// a) At head
	public void insertAtHead(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
		size++;
	}

	// b) At tail
	public void insertAtTail(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		} else {
			Node tempNode = head;
			Node prevNode = null;
			while (tempNode != null) {
				prevNode = tempNode;
				tempNode = tempNode.getNext();
			}
			tempNode = newNode;
			prevNode.setNext(tempNode);
		}
		size++;
	}

	// c) At position
	public void insertAtPosition(int value, int position) {
		Node tempNode = head;
		Node newNode = new Node(value);
		// Check for the position
		if (position < 0) {
			position = 0;
		}
		if (position > size) {
			position = size - 1;
		}
		if (position == 0) {
			insertAtHead(value);
		} else if (position == size - 1) {
			insertAtTail(value);
		} else {
			// insert in middle
			for (int i = 0; i < position - 1; i++) {
				tempNode = tempNode.getNext();
			}
			newNode.setNext(tempNode.getNext());
			tempNode.setNext(newNode);

		}
		size++;

	}

	public void reverseLinkList() {
		Node prev = null;
		Node temp = head;
		Node nextNode;
		while (temp != null) {
			nextNode = temp.getNext();
			temp.setNext(prev);
			// time to move pointers
			prev = temp;
			temp = nextNode;
		}
		head = prev;
	}

	public void removeElement(int index) {
		Node currentNode = head;
		Node prevNode;
		if (index == 0) {
			System.out.println("Remove element from the head");
			head = head.getNext();
		}
		if (index == size - 1) {
			System.out.println("Remove element from the tail");
			while (currentNode != null) {
				prevNode = currentNode;
				currentNode = currentNode.getNext();
			}
		} else {
			System.out.println("REmove element frrom the middle");
		}

	}

	public void printList() {
		Node tempNode = head;
		while (tempNode != null) {
			System.out.print(tempNode.getData() + " ");
			tempNode = tempNode.getNext();
		}
		System.out.println();
	}

}
