package exercicios;
import java.util.Locale;

public class ex001 {

	public static void main(String[] args) {
		
		String product_01 = "Computer";
		String product_02 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price_01 = 2100.0;
		double price_02 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product_01, price_01);
		System.out.printf("%s, which price is $ %.2f%n", product_02, price_02);
		
		System.out.printf("%nRecord: %d years old, code %d and gender: %s%n", age, code, gender);
		
		System.out.printf("%nMeasure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point %.3f", measure);

	}

}
