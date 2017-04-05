package com.program.designpattern.creational.factory;

/*
 * A Factory Pattern or Factory Method Pattern says that just define an interface
 *  or abstract class for creating an object but let the subclasses decide which class
 *   to instantiate. In other words, subclasses are responsible to create the instance of the class.
 */
import java.util.Scanner;

public class GenerateBill {
	public static void main(String[] args) {
		GetPlanFactory getPlanFactory = new GetPlanFactory();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the plan");
		String planName = scanner.nextLine();
		System.out.println("Enter the number of units for bill will be calculated");
		int units = scanner.nextInt();
		Plan plan = getPlanFactory.getPlan(planName);
		System.out.println("Bill amount for " + planName + " of  " + units + " units is::");
		plan.getRate();
		plan.calculateBills(units);

	}
}
