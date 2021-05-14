package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My letter");
		p.print("My letter");
		
		System.out.println();
		
		ConcreteScanner s = new ConcreteScanner("2023");
		s.processDoc("My e-mail");
		System.out.println("Scan  result: " + s.scan());
		
		System.out.println();
		
		ComboDevice c = new ComboDevice("5224");
		c.processDoc("My TCC");
		c.print("My TCC");
		System.out.println("Scan result: " + c.scan());

	}

}
