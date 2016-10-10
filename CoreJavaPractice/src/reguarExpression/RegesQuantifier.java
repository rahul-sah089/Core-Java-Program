package reguarExpression;
import java.util.regex.*;

public class RegesQuantifier {
	public static void main(String[] args){
		System.out.println("Main method Started");
		System.out.println("? quantifier ...");//once or none
		System.out.println(Pattern.matches("[amn]?",""));
		System.out.println(Pattern.matches("[amn]?","a"));
		System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)  
		
		System.out.println("+ quantifier ...");
		System.out.println(Pattern.matches("[amn]+","a")); // a or m or n once or more time
		System.out.println(Pattern.matches("[amn]+","aaa")); // a or m or n once or more time
		System.out.println(Pattern.matches("[amn]+","aaammmnnnn")); // a or m or n once or more time
		System.out.println(Pattern.matches("[amn]+","aaammmta")); // a or m or n once or more time
		
		System.out.println("* quantifier ...");
		System.out.println(Pattern.matches("[amn]*","a")); // a or m or n once or more time
		System.out.println(Pattern.matches("[amn]*","aaa")); // a or m or n once or more time
		System.out.println(Pattern.matches("[amn]*","aaammmnnnn")); // a or m or n once or more time
		System.out.println(Pattern.matches("[amn]*","aaammmta")); // a or m or n once or more time
		
		
		
		
		
		
		
		
	}

}
