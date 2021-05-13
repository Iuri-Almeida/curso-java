package model.services;

public class BrazilTaxService implements TaxService {
	
	private final Double TAX_BELOW_100 = 0.20;
	private final Double TAX_OVER_100 = 0.15;
	
	public BrazilTaxService() {
	}
	
	@Override
	public double tax(double amount) {
		return amount * ((amount <= 100) ? TAX_BELOW_100 : TAX_OVER_100);
	}

}
