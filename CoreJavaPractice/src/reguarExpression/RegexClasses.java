package reguarExpression;
import java.util.regex.*;

public class RegexClasses {
	public static void main(String[] args){
		System.out.println("Main Method Started");
		//search for a or m or n only once
		System.out.println(Pattern.matches("[amn]","abcd")); //false
		System.out.println(Pattern.matches("[amn]","a")); //true
		System.out.println("Main Method Ended");
	}
}
