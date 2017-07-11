package com.program.random;

import java.util.ArrayList;
import java.util.List;

public class CommonBetweenArrays {
	public static void main(String[] args) {
		List<Integer> checked = new ArrayList<Integer>();
		int[] arr1 = { 3, 6, 8, 9, 5, 3, 2 };
		int[] arr2 = { 89, 5, 7, 6, 4, 3, 6 };
		for (int i = 0; i < arr1.length; i++) {
			if (checked.contains(arr1[i])) {
				break;
			}
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
					checked.add(arr1[i]);
					break;
				}
			}
		}
	}
}
