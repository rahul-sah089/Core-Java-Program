/*
 * 
 * A left rotation operation on an array of size  shifts each of the array's elements unit to the left.
 * For example, if 2 left rotations are performed on array [1,2,3,4,5] , then the array would become [3,4,5,1,2]
 * 
	Given an array of "n" integers and a number d, perform "d" left rotations on the array.
	 Then print the updated array as a single line of space-separated integers.
 * 
 */

package com.program.datastructure.hackerank;

import java.util.Scanner;

public class ArrayRotation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String firstLine = in.nextLine();
		String[] values = firstLine.split(" ");
		String secondLine = in.nextLine();
		String[] values2 = secondLine.split(" ");
		int[] inputArr = new int[Integer.parseInt(values[0])];
		int i = 0;
		for (String str : values2) {
			inputArr[i] = Integer.parseInt(str);
			i++;
		}

		rotateArray(Integer.parseInt(values[1]), inputArr);
	}

	public static void rotateArray(int shift, int[] arr) {
		int[] arrCopy = arr.clone();

		for (int i = 0; i < arrCopy.length; i++) {
			arr[i] = arrCopy[(i + shift) % (arrCopy.length)];
		}
		for (int value : arr) {
			System.out.print(value + " ");
		}

	}

}
