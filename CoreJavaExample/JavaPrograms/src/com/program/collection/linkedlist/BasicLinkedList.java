package com.program.collection.linkedlist;

import java.util.LinkedList;

public class BasicLinkedList {
	public static void main(String[] args){
		System.out.println("Basic Linked list example starts");
		LinkedList<String> li = new LinkedList<String>();
		li.add("MTA");
		li.add("Western");
		li.add("Union");
		li.add("Bank");
		System.out.println(li);
		System.out.println("Size od linked list "+li.size());
		System.out.println("Is linked list empty "+li.isEmpty());
		System.out.println("Does linkedlist contatins 'Western' "+li.contains("Western"));
		System.out.println("Basic Linked list example ends");
	}
}
