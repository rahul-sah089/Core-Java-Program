package com.program.datastructure.sorting;

public class MergeSort {
	private int[] array;
	private int[] tempMergeArray;
	private int length;
	
	public static void main(String[] args){
		System.out.println("Main method Started");
		
		System.out.println("main method ended");
	}
	
	public void sort(int inputArr[]){
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergeArray = new int[length];
		
		
	}
}
