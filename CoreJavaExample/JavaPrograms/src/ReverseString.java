public class ReverseString {
	public static void main(String[] args) {
		String values = "This is rahul";
		String reverseStr = "";
		for (int i = (values.length() - 1); i >= 0; i--) {
			reverseStr += values.charAt(i);
		}
		System.out.println("Reversed String--->" + reverseStr);
	}
}
