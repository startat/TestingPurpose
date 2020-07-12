package testProj;

import java.util.HashSet;
import java.util.Set;

public class HSet {

	public Set<String> name;
	private Set<Integer> age;

	
	HSet() {
	}
	
	HSet(Set<Integer> age) {
		this.age = age;
		System.out.println("call constructor 2");
	}
	
	public void set (String name) {
		Set<String> mySet = new HashSet<>();
		mySet.add(name);
		this.name = mySet;
	}
	
	public void groupAge (Set<Integer> age) {
		this.age = age;
	}
	
	public void intToSet (Integer num) {
		Set<Integer> mySet = new HashSet<>();
		mySet.add(num);
	
		for (Integer ints : mySet) {
			System.out.println(ints);
			this.age = <ints>;
			/*I wanna field age = every num I put in to this method
			 * but num is int, field age is a set
			 * and I'm currly in the method where convert int to set
			 * super confusing right now........ feels like circling in a loop
			 * 重理一下思路：
			 * step 1: put all int into a set
			 * step 2: for every int, store the value in the set field
			 */
		}
	}
	
	public Set<Integer> getAgeSet () {
		return this.age;
		
	}
	
}
