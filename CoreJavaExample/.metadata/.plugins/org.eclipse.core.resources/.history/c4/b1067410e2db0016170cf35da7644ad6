package creational.example1;

import java.util.Scanner;

public class GenerateBill {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the plan type");
		String planType = scanner.next();
		System.out.println("Enter the no. of unit");
		int unit = scanner.nextInt();
		
		GetPlanFactory getPlanFactory = new GetPlanFactory();
		Plan plan = getPlanFactory.getPlan(planType);
		plan.getRate();
		plan.calculateBill(unit);
		System.out.println("Main mEthod Ended");
		scanner.close();

	}

}
