package com.cruds.fp;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {

		List<Integer> num = List.of(1, 7, 12, 6, 5, 2, 1, 88, 100, 12);
	//	printAllNumbersInListStructured(num);
		printAllEvenNumbersInListStructured(num);
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {

		// How to loop the numbers
		for (int num : numbers) {
			System.out.println(num);
		}
	}

	private static void printAllEvenNumbersInListStructured(List<Integer> numbers) {

		// How to loop the numbers
		for (int num : numbers) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
	}
}
