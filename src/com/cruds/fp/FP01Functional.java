package com.cruds.fp;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(1, 2, 3, 4, 9, 8, 7, 6, 5);
		// printAllNumbersInListFunctional(numbers);
		// printAllEvenNumbersInListFunctional(numbers);
		// functionalUsingLambdaExpression(numbers);
		// functionalUsingLambdaExpressionForOddNum(numbers);
		 printSquaresOfNumbersInTheListFunctional(numbers);
		//printCubesOfNumbersInTheListFunctional(numbers);

	}
	
	// Lambda expression is a simpler way of defining another method

	public static void print(int num) {
		System.out.println(num);
	}

	private static boolean isEven(int num) {
		return num % 2 == 0;
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {

		// converting numbers list into stream
		numbers.stream().forEach(FP01Functional::print);
		// in functional approach
		numbers.stream().forEach(System.out::println);// Method Reference
	}

	private static void printAllEvenNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream().filter(FP01Functional::isEven)// Filter only even numbers
				.forEach(System.out::println);// Method reference

	}

	private static void functionalUsingLambdaExpression(List<Integer> numbers) {

		numbers.stream().filter(num -> num % 2 == 0) // lambda expression
				.forEach(System.out::println);
	}
	
	private static void functionalUsingLambdaExpressionForOddNum(List<Integer> numbers) {

		numbers.stream().filter(num -> num % 2 != 0) // lambda expression
				.forEach(System.out::println);
	}
	
	private static void printSquaresOfNumbersInTheListFunctional(List<Integer> numbers) {
		
		//print the squares of even numbers
		numbers.stream()
		//mapping x -> x * x to get square num
		.map(num -> num * num)
		.filter(num -> num % 2 == 0)
		.forEach(System.out::println);
		
		//print the squares of odd numbers
		numbers.stream()
		.filter(num -> num % 2 != 0)
		.map(num -> num * num)
		.forEach(System.out::println);
		
	}

	private static void printCubesOfNumbersInTheListFunctional(List<Integer> numbers) {

		//print the cubes of even numbers
		numbers.stream()
		.map(number -> number * number * number)
		.filter(number -> number % 2 == 0)
		.forEach(System.out::println);
		
		//print the cubes of odd numbers
		numbers.stream()
		.map(no -> no * no * no)
		.filter(no -> no % 2 != 0)
		.forEach(System.out::println);
	}


}
