package application;

import devices.Printer;
import devices.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Printer p = new Printer("1080");
		p.processDoc("My letter");
		p.print("My letter");
		
		System.out.println();
		
		Scanner s = new Scanner("2023");
		s.processDoc("My e-mail");
		System.out.println("Scan  result: " + s.scan());

	}

}
