package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import model.Person;

public class TestIterator {
	public static void main(String[] args) {
		Set<Person> people = new HashSet<>();
		
		people.add(new Person("Bruno", 28));

		Iterator<Person> it = people.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
