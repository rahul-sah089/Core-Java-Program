package com.program.collection.examples;

import java.util.ArrayList;
import java.util.List;

/*
 * Description 1:
 * Using ListIterator, we can iterate all elements of a list in either direction.
 * You can access next element by calling next() method,
 * and also you can access previous element by calling previous() method on the list.
 */

public class ListIterator {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		List<Integer> values = new ArrayList<Integer>();
		values.add(101);
		values.add(201);
		values.add(301);
		values.add(401);
		values.add(501);
		print(values);

		System.out.println("Main Method Ended");
	}

	public static void print(List<Integer> values) {
		System.out.println("Printing the list in forward direction");
		java.util.ListIterator<Integer> li = values.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("Printing the list in backward direction");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
