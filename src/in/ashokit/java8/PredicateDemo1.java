package in.ashokit.java8;

import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {

		String[] names = { "Kajol", "Janhavi", "Kriti", "Aishwarya", "Kangana" };

		Predicate<String> p = name -> name.startsWith("K");

		for (String name : names) {
			if (p.test(name))
				System.out.println(name);
		}
	}
}