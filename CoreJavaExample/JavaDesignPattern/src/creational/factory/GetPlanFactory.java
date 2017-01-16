package creational.factory;

public class GetPlanFactory {
	public Plan getPlan(String planType) {
		if (planType == null) {
			return null;
		}
		if (planType.equalsIgnoreCase("Domestic")) {
			return new DomesticPlan();
		}

		if (planType.equalsIgnoreCase("Commericial")) {
			return new CommercialPlan();
		}

		if (planType.equalsIgnoreCase("Institutional")) {
			return new InstitutionalPlan();
		}
		return null;
	}
}
