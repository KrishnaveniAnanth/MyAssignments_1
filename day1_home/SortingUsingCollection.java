package week4.day1_home;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// Declare and initialize string array
		String companies[] = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		// convert array to a list
		List<String> companyList = Arrays.asList(companies);

		// Sort list in ascending order
		Collections.sort(companyList);

		// Iterate the values in the list to print in reverse order
		for (int i = companyList.size() - 1; i >= 0; i--) {
			System.out.print(companyList.get(i));
			if (i != 0) {
				System.out.print(",");

			}
		}

	}
}