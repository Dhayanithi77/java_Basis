package firststepjava.oops;

import java.math.BigDecimal;

public class simpleinterestcalculation {

	public static void main(String[] args) {
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("234", "2333");
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println(totalValue);
	}

}
