package com.program.misllenous;

/*
 * Write a java program to find the largest number ‘L’ 
 * less than a given number ‘N’ which should not contain a given digit ‘D’.
 *  For example, If 145 is the given number and 4 is the given digit,
 *   then you should find the largest number less than 145 such that it 
 *   should not contain 4 in it. In this case, 139 will be the answer.
 */
public class LargestNumberLessThan {
	public static void main(String[] args){
		System.out.println("Main method started");
		System.out.println(findMin(145, 4));
		System.out.println("Main method ended");
	}
	public static int findMin(int digit, int number) {
		char ch = Integer.toString(number).charAt(0);

		for (int i = digit; i > 0; i--) {
			if (Integer.toString(i).indexOf(ch) == -1) {
				return i;
			}
		}
		return -1;
	}
}
