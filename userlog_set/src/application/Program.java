package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.UserLog;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		// "/home/iuri/vertigo/curso-java/internet_set/log.txt"
		String path = sc.next();
		
		Set<UserLog> users = new HashSet<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while (line != null) {
				
				String[] fields = line.split(" ");
				users.add(new UserLog(fields[0], Date.from(Instant.parse(fields[1]))));
				line = br.readLine();
				
			}
			
			System.out.println("Total users: " + users.size());
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
		
	}

}
