package setdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//HashSet<String> s1 = new HashSet<>();
		Set<String> s1 = new HashSet<>(); //all the methods come from Set parent interface
		s1.add("Selenium");
		s1.add("QTP");
		s1.add("Satya");
		s1.add("RFT");
		System.out.println("Values from the Set "+s1);
		
		//print all the values using extended for loop
		for(String st:s1) {
			System.out.println("All the values "+st);
		}
		
		//converting set values to List values, we can get the values based on the index
		//ArrayList<String> ls = new AtrrayList<String>(Set)
		ArrayList<String> ls = new ArrayList<String>(s1);
		System.out.println("Values return from list"+ls);
		System.out.println(ls.get(3));

	}

}
