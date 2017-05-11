package com.program.mcq;

public class DataTypes1 {
	public static void main(String[] args){
		int g = 3 ;
		System.out.println(++g * 8);
	}
}

/*
 * Explanation:Operator ++ has more preference than *,
 *  thus g becomes 4 and when multiplied by 8 gives 32.
 */
