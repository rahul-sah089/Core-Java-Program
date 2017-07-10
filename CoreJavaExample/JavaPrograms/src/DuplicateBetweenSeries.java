import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class DuplicateBetweenSeries {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		HashSet<Integer> values = repeative();
		System.out.println("repeative element=>"+values);
		System.out.println("Main Method Ended");
	}

	public static HashSet<Integer> repeative() {
		HashSet<Integer> hashSet = new HashSet<>();
		List<Integer> values = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++) {
			values.add(i);
		}
		values.add(22);
		Collections.sort(values);
		for (int i = 0; i < values.size()-1; i++) {
			if (values.get(i) == values.get(i + 1)) {
				hashSet.add(i);
			}
		}
		return hashSet;
	}

}
