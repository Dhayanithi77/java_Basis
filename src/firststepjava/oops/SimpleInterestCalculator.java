package firststepjava.oops;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	BigDecimal principle;
	BigDecimal interest;

	public SimpleInterestCalculator(String principle, String interest) {
		this.principle = new BigDecimal(principle);
		this.interest = new BigDecimal(interest);
	}

	public BigDecimal calculateTotalValue(int year) {
		BigDecimal totalValue = principle.add(principle.multiply(interest).multiply(new BigDecimal(year)));
		return totalValue;
	}

}
