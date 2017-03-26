package collections;

import java.util.HashSet;
import java.util.Set;

import model.Person;

public class TestEqualsAndHashCode {
	public static void main(String[] args) {
		Set<Person> people = new HashSet<>();
		
		people.add(new Person("Bruno", 28));
		
		System.out.println(people.contains(new Person("Diego", 28)));
		System.out.println(people.contains(new Person("Bruno", 28)));
	}
}
