package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> courses = new ArrayList<String>(Arrays.asList("A", "B", "C"));
		Set<Integer> students = new HashSet<>();
		
		for (String course : courses) {
			
			System.out.printf("How many students for course %s? ", course);
			int n = sc.nextInt();
			
			System.out.println();
			
			for (int i = 0; i < n; i++) {
				
				System.out.printf("What is the student #%d id? ", i + 1);
				students.add(sc.nextInt());
				
			}
			
			System.out.println();
			
		}
		
		System.out.println("\nTotal students: " + students.size());
		
		sc.close();

	}

}
