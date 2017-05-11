package com.program.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ListIteration {
	public static void main(String[] args) {
		System.out.println("List iteration starts");
		LinkedList<String> li = new LinkedList<String>();
		li.add("First");
		li.add("Second");
		li.add("Third");
		li.addFirst("Zero");
		li.addLast("Fourth");
		Iterator<String> itr = li.iterator();
		while (itr.hasNext()) {
			System.out.print(" " + itr.next());
		}
		System.out.println();
		System.out.println("List iteration ends");
	}
}
