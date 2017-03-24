package com.program.datastructure.singlelinkedList;

public class Test {
	public static void main(String[] args){
		System.out.println("Main Method started");
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		singleLinkedList.insertAtStart(1);
		singleLinkedList.insertAtStart(2);
		singleLinkedList.insertAtStart(3);
		singleLinkedList.insertAtStart(4);
		singleLinkedList.insertAtPosition(12, 2);
		//singleLinkedList.insertAtStart(5);
		singleLinkedList.displayList();
		System.out.println("Main Method ended");
	}
}
