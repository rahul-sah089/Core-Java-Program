package com.program.misllenous;
/*
 *  identify a given positive decimal number as even/odd without using % or / operator 
 * */

public class OddEven {
	public static void main(String[] args){
		int num = 8;
		while(num > 2){
			num = num-2;
		}
		if(num == 1){
			System.out.println("Number is odd");
		}
		else{
			System.out.println("Number is even");
		}
	}
}
