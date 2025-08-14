package week4.day1_home;

import java.util.Arrays;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		// declaring and initializing arrays
		Integer arr1[] = { 3, 2, 11, 4, 6, 7 };
		Integer arr2[] = { 1, 2, 8, 4, 9, 7 };

		// convert arrays to list
		List<Integer> list1 = Arrays.asList(arr1);
		List<Integer> list2 = Arrays.asList(arr2);

		System.out.println("Intersection of two lists are:");
		// compare using nested for loop
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i).equals(list2.get(j))) {
					// print the matching elements
					System.out.println(list1.get(i));

				}

			}

		}

	}

}
