package com.program.collection.vector;

import java.util.Vector;
/*
 * Description:
 * This program showss the basic operation on vector
 * Like inserting,retrieving,etc
 */

public class VectorBasic {
	public static void main(String[] args){
		System.out.println("Main Method Started");
		Vector<String> vect = new Vector<String>();
		vect.add("Rahul");
		vect.add("is");
		vect.add("java");
		vect.add("freak");
		System.out.println("Element at index 3==>"+vect.get(3));
		System.out.println("Length of the vector==>"+vect.capacity());
		System.out.println("First element ==>"+vect.firstElement());
		System.out.println("last element ==>"+vect.lastElement());
		System.out.println("Is empty==>"+vect.isEmpty());
		System.out.println("Main Method Ended");
	}
}
