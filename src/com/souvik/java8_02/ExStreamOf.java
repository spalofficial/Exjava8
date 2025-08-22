package com.souvik.java8_02;

import java.util.stream.Stream;

public class ExStreamOf {

	public static void main(String[] args) {

		Integer [] arr= {1,32,13,43,64,23,13,2,5,65,3,67,43};
		System.out.println("Array to stream");
		Stream.of(arr).forEach(x->System.out.println(x)); // convert array to stream
		System.out.println("A group of element to stream");
		Stream.of("Hello", "Bello", "cello").map(x-> { return x+"--"+x.length();}).forEach(x->System.out.println(x)); //direct pass a group of value to stream
		

	}

}
