package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingComparator {
	
	//Employee emp1 = new Emp//loyee(1, "Rahul", 30000.0, "This is emp1");
	public static void main(String[] args){
		EmployeeNew emp1 = new EmployeeNew(1, "Rahul","This is emp1", 30000.0);
		EmployeeNew emp2 = new EmployeeNew(2, "Maruti","This is emp2", 10000.0);
		EmployeeNew emp3 = new EmployeeNew(3, "David","This is emp3", 50000.0);
		EmployeeNew emp4 = new EmployeeNew(4, "Touseef","This is emp4", 30000.0);
		List<EmployeeNew> empList = new ArrayList<EmployeeNew>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		//Collections.sort(empList, EmployeeNew.empComparatorById);
	}
	
	

}
