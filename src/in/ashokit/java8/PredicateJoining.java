package in.ashokit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {

	String name;
	String location;
	String dept;

	public Employee(String name, String location, String dept) {
		super();
		this.name = name;
		this.location = location;
		this.dept = dept;
	}
}

public class PredicateJoining {

	public static void main(String[] args) {

		Employee e1 = new Employee("Shubham", "Pune", "Development");
		Employee e2 = new Employee("Rajesh", "Bangalore", "DevOps");
		Employee e3 = new Employee("Rohan", "Chennai", "Testing");
		Employee e4 = new Employee("Surekha", "Hyderabad", "DevOps");

		List<Employee> emps = Arrays.asList(e1, e2, e3, e4);

		Predicate<Employee> p1 = e -> e.location.equals("Bangalore");
		Predicate<Employee> p2 = e -> e.dept.equals("DevOps");

		Predicate<Employee> p = p1.or(p2);

		for (Employee emp : emps) {
			if (p.test(emp))
				System.out.println(emp.name);
		}
	}
}