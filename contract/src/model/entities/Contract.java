package model.entities;

import java.util.Calendar;
import java.util.Date;

import model.services.PaymentService;

public class Contract {
	
	private Integer number;
	private Date date;
	private Double value;
	
	private PaymentService paymentService;
	
	public Contract() {
	}

	public Contract(Integer number, Date date, Double value, PaymentService paymentService) {
		this.number = number;
		this.date = date;
		this.value = value;
		this.paymentService = paymentService;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public PaymentService getPaymentService() {
		return paymentService;
	}
	
	public Date installmentDate(int installment) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		
		cal.add(Calendar.MONTH, installment);
		
		return cal.getTime();
		
	}
	
	public double installmentQuota(double amount, int installment) {
		return paymentService.quota(amount, installment);
	}
	
}
