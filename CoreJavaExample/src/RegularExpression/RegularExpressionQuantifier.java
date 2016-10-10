package RegularExpression;
import java.util.regex.Pattern;

public class RegularExpressionQuantifier {
	public static void main(String[] args){
		System.out.println("Quantifier example started");
		//Match for a or m or n occurance once
		System.out.println(Pattern.matches("[amn]?", "a"));
		System.out.println(Pattern.matches("[amn]?", "aaaa"));
		System.out.println(Pattern.matches("[amn]?", "abiza"));
		System.out.println("Quantifier example ended");
		
	}

}
