package com.program.datastructure.singlelinkedList;

public class Test {
	public static void main(String[] args){
		System.out.println("Main Method Started");
		SingleLinkedList sll = new SingleLinkedList();
		sll.insertAtHead(12);
		sll.insertAtHead(24);
		sll.insertAtHead(36);
		sll.insertAtHead(48);
		sll.insertAtHead(60);
		sll.insertAtTail(72);
		sll.insertAtTail(84);
		sll.insertAtTail(96);
		sll.insertAtPosition(100, 3);
		sll.reverseLinkList();
		sll.printList();
		System.out.println("Main Method Ended");
	}
}
