package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchExample1 {
	public static void mai-n(String[] args){
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean  b = m.matches();
		
		System.out.println("boolean ::"+b);
	}
}
