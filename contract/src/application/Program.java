package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter contract data");
			
			System.out.print("Number: ");
			int number = sc.nextInt();
			
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			
			System.out.print("Contract value: R$");
			double value = sc.nextDouble();
			
			Contract contract = new Contract(number, date, value);
			
			System.out.print("Enter number of installments: ");
			int numberOfInstallments = sc.nextInt();
			
			ContractService cs = new ContractService(new PaypalService());
			cs.processContract(contract, numberOfInstallments);
			
			System.out.println("\nInstallments:");
			
			for (Installment i : contract.getInstallments()) System.out.println(sdf.format(i.getDueDate()) + " - R$" + String.format("%.2f", i.getAmount()));
			
		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error.");
		}
		
		sc.close();

	}

}
