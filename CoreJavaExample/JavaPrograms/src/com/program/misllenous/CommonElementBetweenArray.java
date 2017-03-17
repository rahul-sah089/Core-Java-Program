package com.program.misllenous;

/*
 * Write a program to identify common elements or numbers between two given arrays.
 * You should not use any inbuilt methods are list to find common values.
 * */
public class CommonElementBetweenArray {
	public static void main(String[] args){
		int[] arr1 ={7,8,6,4,3,5,4};
		int[] arr2 ={1,2,3,4,5,6,7};
		for(int i = 0;i< arr1.length;i++){
			for(int j = 0 ; j< arr2.length;j++){
				if (arr1[i] == arr2[j]){
					System.out.print(arr1[i]+",");
					break;
				}
			}
		}
	}
}
