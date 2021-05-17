package exercicios;

import java.util.Map;
import java.util.TreeMap;

public class ex023 {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Iuri");
		cookies.put("email", "testando@gmail.com");
		cookies.put("phone", "989281920");
		
		cookies.remove("email");
		cookies.put("phone", "9999999999");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("\nAll cookies:");
		for (String key : cookies.keySet()) System.out.println(key + ": " + cookies.get(key));

	}

}
