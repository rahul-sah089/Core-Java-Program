import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first element");
		String str1 = in.nextLine();
		System.out.println("Enter the second element");
		String str2 = in.nextLine();
		if (isAnagram1(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
		}
	}

	public static boolean isAnagram1(String str1, String str2) {
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		if (str1.length() != str2.length()) {
			return false;
		} else {
			char[] charArr1 = str1.toLowerCase().toCharArray();
			char[] charArr2 = str2.toLowerCase().toCharArray();
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);
			return Arrays.equals(charArr1, charArr2);
		}

	}
}
