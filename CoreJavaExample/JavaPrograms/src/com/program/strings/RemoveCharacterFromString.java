package com.program.strings;

public class RemoveCharacterFromString {
	public static void main(String[] args){
		String str = "Rahul Sah";
		System.out.println(removeCharAt(str,5));
	}
	public static String removeCharAt(String s,int pos){
		String result = "";
		try{
			result = s.substring(0,pos)+s.substring(pos+1);
		}catch(StringIndexOutOfBoundsException ex){
			System.out.println("Provide position value in range");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return result;
		
	}
}
