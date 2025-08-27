package com.souvik.java8_05;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex_CountOccurenceInString {

	public static void main(String[] args) {

		String u = "Hello my name is Ani . Hello to my world . Some gibberish is in my trend";
		String[] arr=u.split(" ");
		Map<String, Long> mm=Arrays.asList(arr).stream().collect(Collectors.groupingBy(xi->xi,Collectors.counting()));
		//or same
		Map<String, Long> mmo=Arrays.asList(arr).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(mm);
		System.out.println(mmo);
	}

}
