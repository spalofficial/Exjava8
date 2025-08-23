package com.souvik.java8_02;

import java.util.Arrays;
import java.util.List;

public class ExFindAllAndAny {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("Hello","Hello I am Souvik","Hello Kitty", "Hello Bello");
		
		System.out.println(l.stream().filter(x->x.contains("Hello")).findFirst().get());
		System.out.println(l.stream().filter(x->x.contains("Hello")).findAny().get());
		
		//result same above for both because its a  stream that works on one thread.
		
		//for parallel stream the value can differ as output can be from any thread. 
		System.out.println(l.parallelStream().filter(x->x.contains("Hello")).findFirst().get());
		System.out.println(l.parallelStream().filter(x->x.contains("Hello")).findAny().get());  
		// find any becomes indeterministic in parallel stream
	}

}
