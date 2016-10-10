package reguarExpression;

import java.util.regex.*;

public class BasicExample2 {
	public static void main(String[] args) {
		System.out.println("Main method Started");
		// 1st way
		Pattern p = Pattern.compile(".s");
		Matcher matcher = p.matcher("as");
		boolean status1 = matcher.matches();

		// 2nd way
		boolean status2 = Pattern.compile(".s").matcher("as").matches();

		// 3rd way
		boolean status3 = Pattern.matches(".s", "as");

		System.out.println("Status1::" + status1 + " Status2::" + status2
				+ " status3::" + status3);
	}
}
