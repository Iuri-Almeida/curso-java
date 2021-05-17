package exercicios;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ex022 {

	public static void main(String[] args) {
		
		Set<Integer> a = new TreeSet<Integer>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<Integer>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		// Union
		Set<Integer> union = new TreeSet<>(a);
		union.addAll(b);
		System.out.println(union);
		
		// Intersection
		Set<Integer> intersection = new TreeSet<Integer>(a);
		intersection.retainAll(b);
		System.out.println(intersection);
		
		// difference
		Set<Integer> difference = new TreeSet<>(a);
		difference.removeAll(b);
		System.out.println(difference);

	}

}
