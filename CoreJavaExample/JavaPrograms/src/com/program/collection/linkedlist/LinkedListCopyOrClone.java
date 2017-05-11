package com.program.collection.linkedlist;

import java.util.LinkedList;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class LinkedListCopyOrClone {
	public static void main(String[] args){
		System.out.println("Linked list copy program starts");
		LinkedList<String> li = new LinkedList<String>();
		
		li.add("FXCRS");
		li.add("Foregin");
		li.add("Exchange");
		li.add("Control");
		li.add("Reserve");
		System.out.println("Actual List ==> "+li);
		LinkedList<String> copy = (LinkedList<String>)li.clone();
		System.out.println("Cloned List ==>" + copy);
		
				
		System.out.println("Linked list copy program ends");
	}
}
