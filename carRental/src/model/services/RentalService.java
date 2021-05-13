package model.services;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private final long twelveHours = 12 * 60 * 60 * 1000;
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService;

	public RentalService() {
	}

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
	public void setTaxService(BrazilTaxService taxService) {
		this.taxService = taxService;
	}

	private long duration(Date start, Date finish) {
		return finish.getTime() - start.getTime();
	}

	public void processInvoice(CarRental carRental) {
		
		long milisseconds = duration(carRental.getPickupDate(), carRental.getReturnDate());
		
		long hours = TimeUnit.HOURS.convert(milisseconds, TimeUnit.MILLISECONDS) + 1;
		long days = TimeUnit.DAYS.convert(milisseconds, TimeUnit.MILLISECONDS) + 1;
		
		double basicPayment = (milisseconds < twelveHours) ? hours * pricePerHour : days * pricePerDay;
		
		carRental.setInvoice(new Invoice(basicPayment, taxService.tax(basicPayment)));
		
	}

}
