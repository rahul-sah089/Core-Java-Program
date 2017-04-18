package com.program.datastructure.sorting;

public class InsertionSort {
	public static void insertionSort(int array[]) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 7, 8, 9, 5, 4, 3, 2, 21 };
		System.out.println("Before sorting");
		for (int n : arr1) {
			System.out.print(n + " ");
		}
		insertionSort(arr1);
		System.out.println("After sorting");
		for (int n : arr1) {
			System.out.print(n + " ");
		}
	}
}
