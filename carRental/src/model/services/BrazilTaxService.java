package model.services;

public class BrazilTaxService {
	
	private final Double TAX_BELOW_100 = 0.20;
	private final Double TAX_OVER_100 = 0.15;
	
	public BrazilTaxService() {
	}
	
	public double tax(Double amount) {
		return amount * ((amount <= 100) ? TAX_BELOW_100 : TAX_OVER_100);
	}

}
