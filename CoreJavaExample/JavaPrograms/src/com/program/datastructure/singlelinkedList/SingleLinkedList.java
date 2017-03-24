package com.program.datastructure.singlelinkedList;

public class SingleLinkedList {
	private Node start;
	private Node end;
	private int size;

	public SingleLinkedList() {
		start = null;
		end = null;
		size = 0;
	}

	public boolean isEmpty() {
		return (start == null);
	}

	public int getSize() {
		return size;
	}

	public void insertAtStart(int value) {
		size++;
		Node tempNode = new Node(value, null);
		if (start == null) {
			start = tempNode;
			end = start;
		} else {
			tempNode.setNext(start);
			start = tempNode;
		}
	}

	public void insertAtEnd(int value) {
		size++;
		Node tempNode = new Node(value, null);
		if (start == null) {
			start = tempNode;
			end = start;
		} else {
			end.setNext(tempNode);
			end = tempNode;
		}
	}

	public void displayList() {
		Node tempNode = start;
		while (tempNode.getNext() != null) {
			System.out.print("==>" + tempNode.getData());
			tempNode = tempNode.getNext();
		}
		System.out.print("==>" + tempNode.getData());
		System.out.println();
	}

	public void insertAtPosition(int value, int position) {
		Node tempNode = new Node(value, null);
		Node current = start;
		if (position > size) {
			System.out.println("Invalid position provided");
		}
		for (int i = 0; i < size; i++) {
			System.out.println("i value==>" + i);
			if (i == position - 1) {
				Node aux = current.getNext();
				current.setNext(tempNode);
				tempNode.setNext(aux);
			}
			current = current.getNext();
		}
	}
}
