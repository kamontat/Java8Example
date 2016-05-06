package com.kamontat.language.lambda;

import java.util.*;

/**
 * @author kamontat
 * @since 7/5/59 - 01:24
 */
public class main {
	public static void main(String[] args) {
		// create array with 4 element and print (one statement)
		Arrays.asList(1, 5, 4, 8).forEach(i -> System.out.print(i + " "));

		System.out.println();

		// create array with 4 element and print (more than one statement)
		Arrays.asList(1, 5, 4, 8).forEach(i -> {
			if (i % 2 == 0) System.out.print(i + " ");
			else System.out.print("not ");
		});

		// lambda method with return statement
		Arrays.asList(4, 5, 2, 8, 3).sort((i1, i2) -> i1.compareTo(i2));

		// or
		Arrays.asList(4, 5, 2, 8, 3).sort((i1, i2) -> {
			int result = i1.compareTo(i2);
			return result;
		});
	}
}
