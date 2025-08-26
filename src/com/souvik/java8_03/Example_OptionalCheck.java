package com.souvik.java8_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Example_OptionalCheck {

	public static void main(String[] args) {
		
		Employee e1= new Employee("1", "Souvik");
		Employee e2= new Employee("2", "Ani");
		Employee e3 = null;
		
		List<Optional<Employee>> l = new ArrayList<>();
		l.add(Optional.ofNullable(e1));
		l.add(Optional.ofNullable(e2));
		l.add(Optional.ofNullable(e3));
		
		System.out.println("USING ISPRESENT");
		for(Optional<Employee> x: l) {
			if(x.isPresent()) {
				System.out.println(x.get());
			}
		}
		System.out.println("USING IFPRESENT");
		//or we can use this 
		for(Optional<Employee> x: l) {
			x.ifPresent((t)->System.out.println(t));
		}
		//or we can use this in case we need else part -- ifPresentOrElse() -- Java 9
		// isEmpty() -- Java 9

	}

}
