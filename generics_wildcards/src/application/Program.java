package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Shape> shapes = new ArrayList<Shape>();
		Rectangle r = new Rectangle(3.0, 4.0);
		Circle c = new Circle(2.0);
		
		shapes.add(r);
		shapes.add(c);
		
		System.out.println("Total area: " + String.format("%.2f", totalArea(shapes)));
		
		List<Circle> circles = new ArrayList<Circle>();
		circles.add(new Circle(3.0));
		circles.add(new Circle(4.0));
		
		System.out.println("Total area: " + String.format("%.2f", totalArea(circles)));

	}
	
	public static double totalArea(List<? extends Shape> list) {
		
		double total = 0;
		
		for (Shape s : list) total += s.area();
		
		return total;
	}

}
