package model.services;

public interface PaymentService {
	
	public double interest(Double amount, Integer month);
	
	public double paymentFee(Double amount);
	
}
