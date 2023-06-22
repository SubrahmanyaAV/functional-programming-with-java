package com.cruds.fp;

import java.util.List;

public class FP01Exercise {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "Spring MVC"
										, "API", "Hibernate", "REST", "JDBC");

		// 1. print all courses individually
		// courses.stream()
		// .forEach(System.out::println);

		// 2. print Courses containing the word "Spring";
		// courses.stream().filter(course -> course.contains("Spring"))
		// .forEach(System.out::println);

		// 3. print courses whose name has atleast 4 letters
		// courses.stream().filter(course -> course.length() >= 5)
		// .forEach(System.out::println);

		// 4. print the number of characters in each course name
		//	courses.stream()
		//	.map(course -> course + " " + course.length())
		//	.forEach(System.out::println);
			
		// 5. print the course that starts with letter S
			courses.stream()
			.filter(course -> course.startsWith("S"))
			.forEach(System.out::println);
			
			courses.stream()
			.filter(course -> course.endsWith("C"))
			.forEach(System.out::println);
	}

}
