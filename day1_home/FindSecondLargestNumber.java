package week4.day1_home;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// declare and initialize array
		Integer array[] = { 3, 2, 11, 4, 6, 7 };

		// convert array to list
		List<Integer> numList = Arrays.asList(array);

		// Sort the list
		Collections.sort(numList);

		// get the second largest number and print
		Integer integer = numList.get(numList.size() - 2);
		System.out.println("The second largest number is " + integer);

	}

}
