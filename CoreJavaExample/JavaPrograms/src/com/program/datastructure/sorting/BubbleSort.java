package com.program.datastructure.sorting;

import java.util.Scanner;

public class BubbleSort {

	public static int[] sort(int[] arr) {
		int size = arr.length;
		int temp = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		int[] arr = initArr();
		System.out.print("Before sorting==>");
		printArr(arr);
		arr = sort(arr);
		System.out.print("After sorting==>");
		printArr(arr);
		System.out.println("Main Method Ended");

	}

	public static int[] initArr() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = in.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		return arr;
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}
}
