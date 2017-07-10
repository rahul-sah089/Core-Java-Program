import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = in.nextInt();
		System.out.println(reverseInt(number));
		System.out.println("Main Method Ended");
	}

	public static Integer reverseInt(int numbers) {
		int reverseNumber = 0;
		while (numbers != 0) {
			reverseNumber = (reverseNumber * 10) + (numbers % 10);
			numbers = numbers / 10;
		}
		return reverseNumber;
	}
}
