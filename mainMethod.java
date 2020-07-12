package testProj;

import java.util.HashSet;
import java.util.Set;

public class mainMethod {

	public static void main(String[] args) {
		
		
		
		HSet hs = new HSet();
		hs.intToSet(10);
		hs.intToSet(20);
		
		System.out.println(hs.getAgeSet());
		
		
		
		//HSet hs2 = new HSet(hs.getAge());
		
		Set <Integer> ageSet = new HashSet<>();
		ageSet.add(100);
		ageSet.add(200);
		System.out.println(ageSet);
		
		

	}

}
