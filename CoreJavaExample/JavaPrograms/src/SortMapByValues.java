import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Sort or order a HashMap or TreeSet or any map item by value. Write a comparator
 * which compares by value, not by key. Entry class might hleps you here.
 */
public class SortMapByValues {

	public static void main(String[] args) {
		sortByValues();
	}

	public static void sortByValues() {
		Map<String, Integer> hasMap = new HashMap<String, Integer>();
		hasMap.put("Java", 1);
		hasMap.put(".Net", 4);
		hasMap.put("C++", 2);
		hasMap.put("Cobal", 3);

		Set<Entry<String, Integer>> values = hasMap.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(values);

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue() - o2.getValue();
			}
		});

		Set<Entry<String, Integer>> valuess = hasMap.entrySet();
		for (Entry<String, Integer> value : valuess) {
			System.out.println("Key==>" + value.getKey() + " & value=" + value.getValue());
		}

	}

}
