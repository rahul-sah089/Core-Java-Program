package com.program.collection.examples;
/*
 * Description 1:
 * A class that implements Enumeration interface provides access to series of elements one at a time.
 * You need to call nextElement method to get next element in the series. 
 * Also hasMoreElements() method gives you status about the availability of next element in the series.
 * 
 */

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationIterator {
	public static void main(String[] args){
		System.out.println("Main Method Started");
		Vector<String> vect = new Vector<String>();
		vect.add("Rahul");
		vect.add("loves");
		vect.add("Java");
		Enumeration<String> enumer = vect.elements();
		while(enumer.hasMoreElements()){
			System.out.println(enumer.nextElement());
		}
		System.out.println(vect);
		System.out.println("Main method Ended");
	}
}
