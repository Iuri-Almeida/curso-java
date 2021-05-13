package model.services;

public class PaypalPaymentService implements PaymentService {
	
	private final Double SIMPLE_INTEREST = 0.01;
	private final Double PAYMENT_FEE = 0.02;
	
	public PaypalPaymentService() {
	}
	
	@Override
	public double quota(double amount, int installment) {
		return amount * (1 + SIMPLE_INTEREST * installment) * (1 + PAYMENT_FEE);
	}

}
