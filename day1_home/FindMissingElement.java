package week4.day1_home;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
		// declaring and initializing array
		Integer array[] = { 1, 2, 3, 4, 10, 6, 8 };

		// convert array to list
		List<Integer> list = Arrays.asList(array);

		// sort
		Collections.sort(list);

		System.out.println("Missing elements are:");
		// loop to find missing element
		for (int i = 0; i < list.size() - 1; i++) {
			//check for gap
			if (list.get(i) + 1 != list.get(i + 1)) {
				//print the missing element
				for (int j = list.get(i) + 1; j < list.get(i + 1); j++) {
					System.out.println(j + " ");
				}

			}

		}

	}

}
