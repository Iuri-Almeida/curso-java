package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int n = teclado.nextInt();
		
		List<Shape> shapes = new ArrayList<Shape>();
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf("\nShape #%d data:\n", i + 1);
			
			System.out.print("Rectangle or Circle? (r/c) ");
			char shapeChoice = teclado.next().toLowerCase().charAt(0);
			
			System.out.print("Color (BLACK, BLUE or RED): ");
			String color = teclado.next().toUpperCase();
			
			Shape shape;
			
			if (shapeChoice == 'r') {
				
				System.out.print("Width: ");
				double width = teclado.nextDouble();
				
				System.out.print("Height: ");
				double height = teclado.nextDouble();
				
				shape = new Rectangle(Color.valueOf(color), width, height);
				
			} else {
				
				System.out.print("Radius: ");
				double radius = teclado.nextDouble();
				
				shape = new Circle(Color.valueOf(color), radius);
				
			}
			
			shapes.add(shape);
			
		}
		
		System.out.println("\nSHAPE AREAS:");
		
		for (Shape s : shapes) System.out.printf("%.2f\n", s.area());
		
		teclado.close();

	}

}
