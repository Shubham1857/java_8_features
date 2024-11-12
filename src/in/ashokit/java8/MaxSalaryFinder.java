package in.ashokit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Comparator;

class Employee1 {

	private String name;
	private double salary;

	public Employee1(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
}

public class MaxSalaryFinder {

	public static void main(String[] args) {

		List<Employee1> emps = Arrays.asList(
				new Employee1("Alice", 70000), 
				new Employee1("Bob", 85000),
				new Employee1("Charlie", 60000), 
				new Employee1("David", 95000), 
				new Employee1("Eve", 90000)
				);

		// Finding Employee With Maximum Salary
		Optional<Employee1> maxSalaryEmployee = emps.stream()
				                                       .max(Comparator.comparing(Employee1::getSalary));

		if (maxSalaryEmployee.isPresent()) {
			System.out.println("Employee with the maximum salary : " + maxSalaryEmployee.get().getName());
		} else {
			System.out.println("No Employee Found");
		}
		// Finding Employee With Minimum Salary
		Optional<Employee1> minSalaryEmployee = emps.stream()
				                                       .min(Comparator.comparing(Employee1::getSalary));

		if (minSalaryEmployee.isPresent())
			System.out.println("Employee with the minimum salary : " + minSalaryEmployee.get().getName());
		
		// Finding Average Salary Of Employees
		Double avgSalary = emps.stream().collect(Collectors.averagingDouble(e -> e.getSalary()));
		System.out.println("Avg Salary Of Employees : " + avgSalary);
	}
}
