package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter rental data");
			
			System.out.print("Car model: ");
			String carModel = sc.nextLine();
			
			System.out.print("Pickup (DD/MM/YYYY HH:MM): ");
			Date pickupDate = sdf.parse(sc.nextLine());
			
			System.out.print("Return (DD/MM/YYYY HH:MM): ");
			Date returnDate = sdf.parse(sc.nextLine());
			
			CarRental car = new CarRental(new Vehicle(carModel), pickupDate, returnDate);
			
			System.out.print("Enter price per hour: R$");
			double pricePerHour = sc.nextDouble();
			
			System.out.print("Enter price per day: R$");
			double pricePerDay = sc.nextDouble();
			
			RentalService rs = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
			
			rs.processInvoice(car);
			
			System.out.println("\nINVOICE:");
			System.out.println("Basic payment: $ " + String.format("%.2f", car.getInvoice().getBasicPayment()));
			System.out.println("Tax: $ " + String.format("%.2f", car.getInvoice().getTax()));
			System.out.println("Total payment: $ " + String.format("%.2f", car.getInvoice().totalPayment()));
			
		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Error unexpected.");
		}
		
		sc.close();
		
	}

}
