package reguarExpression;
import java.util.regex.Pattern;

public class RegexExample6 {
	public static void main(String[] args){
		System.out.println(Pattern.matches("[a-zA-Z0-9]{7}", "rahul89")); //true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{7}", "rahuls89")); //false (chars more then once)
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "SDFF90")); //true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{7}", "rah!l89")); //false
		System.out.println(Pattern.matches("[a-zA-Z0-9]{7}", "rahul89")); //true
	}
}
