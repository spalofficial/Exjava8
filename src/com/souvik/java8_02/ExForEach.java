package com.souvik.java8_02;


import java.util.ArrayList;
import java.util.List;

public class ExForEach {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(2);
		l.add(76);
		l.add(4);
		l.add(16);
		l.add(1);
		l.add(32);
		l.add(46);

		// for sequential stream out is same.
		System.out.println("For Each --seq stream");
		l.stream().forEach(x-> System.out.println(x));
		System.out.println("For Each ordered --seq stream");
		l.stream().forEachOrdered(x-> System.out.println(x));
		
		// for parallel stream out is different.
		System.out.println("For Each --par stream"); // order is indeterministic
		l.parallelStream().forEach(x-> System.out.println(x));
		System.out.println("For Each ordered --par stream"); //order is maintained
		l.parallelStream().forEachOrdered(x-> System.out.println(x));

	}

}
