import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> times = new TreeSet<Integer>();
		times.add(1200);
		times.add(900);
		times.add(800);
		times.add(1300);
		times.add(1130);
		times.add(2200);
		times.add(2215);
		times.add(2212);
		times.add(2240);
		times.add(2330);

		Iterator<Integer> itr = times.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Java 5 version
		TreeSet<Integer> subset1 = new TreeSet<Integer>();
		subset1 = (TreeSet<Integer>) times.headSet(1600);

		TreeSet<Integer> subset2 = new TreeSet<Integer>();
		subset2 = (TreeSet<Integer>) times.tailSet(2000);

		System.out.println("last before 4pm is -->" + subset1.last());
		System.out.println("first after 8pm is -->" + subset2.first());

		// Java 6 version using lower() and higer()
		System.out.println("last before 4pm is -->" + times.lower(1600));
		System.out.println("first after 8pm is -->" + times.higher(2000));

	}
}
