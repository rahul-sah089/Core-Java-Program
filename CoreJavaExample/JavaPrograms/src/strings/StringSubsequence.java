package strings;

public class StringSubsequence {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		String str = "www.rahulsah.me";
		System.out.println("Last four char of the string-->"
				+ str.subSequence(str.length() - 4, str.length()));
		System.out.println("First four char of string-->"
				+ str.subSequence(0, 4));
		//substring vs subsequence
		System.out.println("subString == subSequence-->"+(str.substring(0,4) == str.subSequence(0, 4)));
		System.out.println("subString equals subSequence-->"+(str.substring(0,4).equals(str.subSequence(0, 4))));
		System.out.println("Main Method Ended");
	}
}
