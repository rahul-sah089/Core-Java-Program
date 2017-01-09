package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjectSortExample1 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Rahul", 30000.0, "This is emp1");
		Employee emp2 = new Employee(1, "Sunil", 10000.0, "This is emp1");
		Employee emp3 = new Employee(1, "David", 30000.0, "This is emp1");
		Employee emp4 = new Employee(1, "Maruti", 20000.0, "This is emp1");
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		System.out.println("Element before sort-->"+emps);
		Collections.sort(emps);
		System.out.println("Element after sort-->"+emps);
		

	}

}
