package model.entities;

public class Product implements Comparable<Product> {
	
	private String name;
	private Double value;
	
	public Product() {
	}
	
	public Product(String name, Double value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public Double getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return name + ", $ " + String.format("%.2f", value);
	}

	@Override
	public int compareTo(Product other) {
		return value.compareTo(other.getValue());
	}
	
}
