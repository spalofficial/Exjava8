package com.souvik.java8_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Example_OptionalRetrive {

	public static void main(String[] args) {
		Employee e1= new Employee("1", "Souvik");
		Employee e2= new Employee("2", "Ani");
		Employee e3 = null;
		
		List<Optional<Employee>> l = new ArrayList<>();
		l.add(Optional.ofNullable(e1));
		l.add(Optional.ofNullable(e2));
		l.add(Optional.ofNullable(e3));
		
		System.out.println("USING GET");
		for(Optional<Employee> x: l) { // Get only employee if present using get
			if(x.isPresent()) {
				System.out.println(x.get());
			}
		}
		
		System.out.println("USING ORELSE");
		for(Optional<Employee> x: l) { // Get employee if present or give a default value

				System.out.println(x.orElse(new Employee()));
		}
		System.out.println("USING ORSELSEGET");
		for(Optional<Employee> x: l) { // Get employee if present or give a default value

			System.out.println(x.orElseGet(()->new Employee()));
	}
		//NOTE DEFAULT PART IS ALWAYS CALLED BY ORELSE EVEN WHEN VALUE IS PRESENT. THIS IS BAD.
		// IN CASE OF ORELSEGET DEFAULT IS CALLED ONLY IF VALUE IS NOT PRESENT.
		
		for(Optional<Employee> x: l) { // throw custom exception if exception is occurred

			System.out.println(x.orElseThrow(()->new IllegalArgumentException("Employee null")));
	}

	}

}
