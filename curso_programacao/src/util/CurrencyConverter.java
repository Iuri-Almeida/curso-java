package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double dolar2Real(double real, double dolar) {
		
		return (1 + IOF) * (real * dolar);
		
	}

}
