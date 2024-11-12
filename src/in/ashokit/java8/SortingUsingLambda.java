package in.ashokit.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingLambda {

	public static void main(String[] args) {

		List<Integer> al = Arrays.asList(12, 34, 21, 87, 75);

		System.out.println("Before Sort : " + al);

		Collections.sort(al, (i, j) -> (i > j) ? -1 : 1); // BiFunction

		System.out.println("After Sort : " + al);

		// Example No.2
		
		try {
			int[] a = { 1, 2, 3, 4, 5 };
			for (int i = 0; i < 7; i++) {
				System.out.print(a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("0");
		}
	}
}