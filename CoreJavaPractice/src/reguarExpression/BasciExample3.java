package reguarExpression;
import java.util.regex.Pattern;

public class BasciExample3 {
	public static void main(String[] args){
		System.out.println("Main method Started");
		System.out.println(Pattern.matches(".s","as"));
		System.out.println(Pattern.matches("s.s","sas"));
		System.out.println(Pattern.matches("rahul","rahul"));
		System.out.println(Pattern.matches(".s","mk"));
		System.out.println("Main method Ended");
	}
}
