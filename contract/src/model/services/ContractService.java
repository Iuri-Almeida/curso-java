package model.services;

import java.util.Calendar;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private PaymentService paymentService;

	public ContractService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public PaymentService getPaymentService() {
		return paymentService;
	}

	public void processContract(Contract contract, Integer months) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(contract.getDate());
		
		double amount = contract.getValue() / months;
		
		for (int i = 1; i <= months; i++) {
			
			cal.add(Calendar.MONTH, 1);
			contract.addInstallment(new Installment(cal.getTime(), paymentService.paymentFee(paymentService.interest(amount, i))));
			
		}
		
	}

}
