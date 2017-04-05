package com.program.designpattern.creational.factory;

//Create GetPlanFactory to generate the object of the concrete class based on the information 
public class GetPlanFactory {
	// use getPlan method to get object of the type plan
	public Plan getPlan(String planType) {
		if (planType == null) {
			return null;
		} else if (planType.equals("DOMESTICPLAN")) {
			return new DomesticPlan();
		} else if (planType.equals("COMMERCIALPLAN")) {
			return new CommercialPlan();
		} else if (planType.equals("INSTUTIONALPLAN")) {
			return new InstitutionalPlan();
		}
		return null;
	}
}
// end of GetPlanFactory class
