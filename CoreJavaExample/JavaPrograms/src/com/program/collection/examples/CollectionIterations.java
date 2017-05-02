/*
 * Description 1:
	All of the collection classes provides iterator() method to iterate through the collection.
	The iterator() method returns the Iterator object through which you can access the collection
 	elements in an order.
  Enumeration also does the same purpose.
  The difference between Iterator and Enumerations is: 
  Iterators allow the caller to remove elements from the underlying collection 
  during the iteration with well-defined semantics.
 * 
 */
/*
 * Description 2:
 * You can iterate through any collection object by using Iterator object.
 * It provides two methods to iterate.
 * The hasNext() method returns true if the iteration has more elements.
 * The next() method returns the next element in the iteration.
 *   
 */
/*
 * Description 3: Removing element from the list
 * 
 * Below example shows how to remove an element from collection object using Iterator object.
 * The remove() method removes from the underlying collection the last element 
 * returned by the iterator 
 */
package com.program.collection.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionIterations {
	public static void makeList() {
		System.out.println("Method ==> MakeList() starts");
		List<String> values = new ArrayList<String>();
		values.add("Rahul");
		values.add("is");
		values.add("a");
		values.add("java");
		values.add("freak");
		System.out.println(values);
		Iterator<String> itr = values.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Method ==> MakeList() ends");
	}

	public static void removeElementWhileIterating() {
		System.out.println("Method ==> removeElement() starts");
		List<String> values = new ArrayList<String>();
		values.add("Rahul");
		values.add("is");
		values.add("a");
		values.add("java");
		values.add("freak");
		Iterator<String> itr = values.iterator();
		String removedElement = "freak";
		while (itr.hasNext()) {
			if (itr.next().equals(removedElement)) {
				itr.remove();
			}
		}

		System.out.println(values);
		System.out.println("Method ==> removeElement() ends");
	}

	public static void main(String[] args) {
		makeList();
		removeElementWhileIterating();
	}
}
