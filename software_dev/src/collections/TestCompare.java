package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.Person;

public class TestCompare {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();

		list.add(new Person("Jose", 28));
		list.add(new Person("Carlos", 20));
		list.add(new Person("Diego", 18));
		list.add(new Person("Ana", 19));	

		Collections.sort(list);
		System.out.println(list);

		list.sort(Comparator.comparing(Person::getAge));

		System.out.println(list);
	}
}