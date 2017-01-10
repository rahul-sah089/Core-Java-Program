import java.util.ArrayList;
import java.util.List;

public class ListOfPrime {
	public static void main(String[] args) {
		System.out.println(getPrimeList());
	}

	public static List<Integer> getPrimeList() {
		List<Integer> primeList = new ArrayList<Integer>();
		for (int i = 2; i <= 1000; i++) {
			if (isPrime(i)) {
				primeList.add(i);
			}
		}
		return primeList;
	}

	public static boolean isPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
