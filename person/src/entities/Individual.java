package entities;

public class Individual extends TaxPayer {

	private Double healthSpending;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthSpending) {
		super(name, anualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}
	
	@Override
	public double taxPaid() {
		double tax = (super.getAnualIncome() < 20000) ? 0.15 : 0.25;
		return (super.getAnualIncome() * tax) - (healthSpending * 0.5);
	}

}
