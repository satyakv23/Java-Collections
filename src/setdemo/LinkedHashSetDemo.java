package setdemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		//linked hash set maintains the insertion order		
		LinkedHashSet<String> s1 = new LinkedHashSet<>(); //all the methods come from Set parent interface
		s1.add("Selenium");
		s1.add("QTP");
		s1.add("Satya");
		s1.add("RFT");
		System.out.println("Values from the Set "+s1);
		
		//print all the values using extended for loop
		for(String st:s1) {
			System.out.println("All the values "+st);
		}

	}

}
