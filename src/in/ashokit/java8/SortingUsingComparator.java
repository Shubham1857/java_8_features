package in.ashokit.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class NumberComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer i, Integer j) {

		if (i > j) {
			return -1;
		} else if (i < j) {
			return 1;
		}
		return 0;
	}
}

public class SortingUsingComparator {

	public static void main(String[] args) {

		List<Integer> al = Arrays.asList(12, 34, 21, 87, 75);

		System.out.println("Before Sort : " + al);
		
		Collections.sort(al, new NumberComparator());
		
		System.out.println("After Sort : " + al);
	}
}