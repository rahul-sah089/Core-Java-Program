import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class NonRepeativeElement {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string value");
		String value = in.nextLine();
		char[] nonRepeative = getNonRepeativeChars(value);
		if (nonRepeative.length == 0) {
			System.out.println("All elements are repeative");
		}else{
			System.out.println(nonRepeative);
		}
		

		System.out.println("Main Method Ended");
	}

	public static char[] getNonRepeativeChars(String str) {
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		String nonRepeativeChar = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (charCount.containsKey(ch)) {
				charCount.put(ch, (charCount.get(ch) + 1));
			} else {
				charCount.put(ch, 1);
			}
		}

		Set<Character> keySet = charCount.keySet();
		for (Character key : keySet) {
			if (charCount.get(key) == 1) {
				nonRepeativeChar += key;
			}
		}

		return nonRepeativeChar.toCharArray();
	}
}
