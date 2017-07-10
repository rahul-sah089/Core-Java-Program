package com.program.collection.objectSort;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int age;
	private long salary;

	public Employee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee employee) {
		return (this.id - employee.getId());
	}

	/*
	 * Sorting based on the employee salary
	 * 
	 */
	public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee emp1, Employee emp2) {
			long salaryDiffL = emp1.getSalary() - emp2.getSalary();
			int salaryDiffI = (int) salaryDiffL;
			return salaryDiffI;
		}

	};

	/*
	 * Sorting based on age
	 * 
	 */
	public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee emp1, Employee emp2) {
			int ageDiff = emp1.getAge() - emp2.getAge();
			return ageDiff;
		}

	};

}
