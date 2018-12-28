package setdemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		//TreeSet maintains the ascending order		
		TreeSet<String> s1 = new TreeSet<>(); //all the methods come from Set parent interface
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
