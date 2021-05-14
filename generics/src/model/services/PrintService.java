package model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
	
	private List<Integer> list = new ArrayList<Integer>();
	
	public PrintService() {
	}
	
	public void addValue(int value) {
		list.add(value);
	}
	
	public int first() {
		
		if (list.isEmpty()) throw new IllegalStateException("List is empty!");
		
		return list.get(0);
	}
	
	public void print() {
		
		for (int i = 0; i < list.size(); i++) {
			
			if (i == 0) System.out.print("[" + list.get(i) + ", ");
			else if (i == list.size() - 1) System.out.print(list.get(i) + "]");
			else System.out.print(list.get(i) + ", ");
			
		}
		
	}

}
