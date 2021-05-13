package model.services;

public class PaypalService implements PaymentService {
	
	private final Double SIMPLE_INTEREST = 0.01;
	private final Double PAYMENT_FEE = 0.02;
	
	public PaypalService() {
	}
	
	@Override
	public double interest(Double amount, Integer month) {
		return amount * (1 + SIMPLE_INTEREST * month);
	}
	
	@Override
	public double paymentFee(Double amount) {
		return amount * (1 + PAYMENT_FEE);
	}

}
