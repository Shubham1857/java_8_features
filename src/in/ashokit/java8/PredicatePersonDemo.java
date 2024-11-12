package in.ashokit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {

	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
public class PredicatePersonDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("Shubham", 26);
		Person p2 = new Person("Rajesh", 24);
		Person p3 = new Person("Pratik", 27);
		Person p4 = new Person("Rohan", 25);
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4);
		
		Predicate<Person> predicate = p -> p.age > 25;
		
		for (Person person : persons) {
			if(predicate.test(person))
				System.out.println(person.name);
		}
	}
}