package model.entities;

import java.util.Date;

public class CarRental {
	
	private Date pickupDate;
	private Date returnDate;
	
	private Vehicle model;
	private Invoice invoice;
	
	public CarRental() {
	}

	public CarRental(Vehicle model, Date pickupDate, Date returnDate) {
		this.model = model;
		this.pickupDate = pickupDate;
		this.returnDate = returnDate;
	}
	
	public Vehicle getModel() {
		return model;
	}
	
	public void setModel(Vehicle model) {
		this.model = model;
	}

	public Date getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	public Invoice getInvoice() {
		return invoice;
	}
	
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
}
