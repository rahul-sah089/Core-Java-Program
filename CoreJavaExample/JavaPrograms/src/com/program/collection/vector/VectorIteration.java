package com.program.collection.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorIteration {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Vector<String> vect = new Vector<String>();
		vect.add("Rahul");
		vect.add("is");
		vect.add("java");
		vect.add("freak");
		//using iterator
		Iterator<String> itr = vect.iterator();
		while (itr.hasNext()) {
			System.out.print(" " + itr.next());
		}
		System.out.println();
		///using enumeration
		Enumeration<String> enumeration =  vect.elements();
		while(enumeration.hasMoreElements()){
			System.out.print(" "+enumeration.nextElement());
		}
		System.out.println();
		System.out.println("Main Method Ended");
	}
}
