package collections;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {
		Set<String> cities = new HashSet<>();
		
		cities.add("Jacobina");
		cities.add("Rio de Janeiro");
		cities.add("Recife");
		cities.add("Salvador");
		
		System.out.println(cities);
		System.out.println(cities.contains("São Paulo"));
	}
}
