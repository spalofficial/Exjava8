package com.souvik.java8_05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex_DuplicateElements {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10,27,10,43,23,27,4,3,5,6,3,21,12);
		
		Set<Integer> set = new HashSet<>();
		
		List<Integer> duplist=list.stream().filter(x-> !set.add(x)).collect(Collectors.toList());
		System.out.println(duplist);

	}

}
