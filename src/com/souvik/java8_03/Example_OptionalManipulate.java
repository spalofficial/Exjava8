package com.souvik.java8_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Example_OptionalManipulate {

	
	//use of filter, map, or , stream on optional object. or is in java 9 only
	public static void main(String[] args) {
		Employee e1= new Employee("1", "Souvik");
		Employee e2= new Employee("2", "Ani");
		Employee e3 = null;
		
		List<Optional<Employee>> l = new ArrayList<>();
		l.add(Optional.ofNullable(e1));
		l.add(Optional.ofNullable(e2));
		l.add(Optional.ofNullable(e3));
		
		for(Optional<Employee> x: l) { 
				x.filter(xo->xo.getId().equals("1")).
				map(y->y.getName().length()).
				ifPresent(len ->System.out.println(x.get()+": Length is "+len));
				//or
				Optional<Integer> xox=x.filter(xo->xo.getId().equals("1")).map(y->y.getName().length());
				xox.ifPresent(xil->System.out.println(x.get()+": Length is "+xil));
		
		}
		l.stream()
		.filter(Optional::isPresent) // remove empty Optional first
		.filter(q -> q.get().getId().equals("1")) // safe now
		.map(u -> u.get().getName().length())
		.forEach(s -> System.out.println(s));
		//or
		l.stream()
		.filter(mm->mm.isPresent()) // remove empty Optional first
		.filter(q -> q.get().getId().equals("1")) // safe now
		.map(u -> u.get().getName().length())
		.forEach(s -> System.out.println(s));

	}
}
