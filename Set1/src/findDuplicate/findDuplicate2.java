package findDuplicate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class findDuplicate2 {
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		List<Integer> arr = makeArr();
		List<Integer> dupli = findDuplicate(arr);
		printArr(dupli);
	}

	public static void printArr(List<Integer> arr) {
		System.out.println("Element of the arr");
		for(int i = 0; i < arr.size(); i++) {
			System.out.print("-->" + arr.get(i));
		}
		if(arr.size() == 0){
			System.out.print("no duplicate element found");
		}
	}

	public static List<Integer> makeArr() {
		System.out.println("Enter the number of element");
		int val = 0;
		List<Integer> values = new ArrayList<Integer>();
		try {
			int num = in.nextInt();
			for (int i = 0; i < num; i++) {
				System.out.println("Enter element no  ::" + (i + 1));
				val = in.nextInt();
				values.add(val);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return values;
	}

	public static List<Integer> findDuplicate(List<Integer> arr) {
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> duplicate = new ArrayList<Integer>();
		for (Integer val : arr) {
			// This set return "false" if we add duplicate values in it
			if (set.add(val)) {

			} else {
				duplicate.add(val);
			}
		}
		return duplicate;
	}
}
