package com.souvik.java8_05;

import java.util.Arrays;
import java.util.List;

public class Ex_LimitNSkip {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,27,10,43,23,27,4,3,5,6,3,21,12);
		System.out.println("Limit used");
		list.stream().limit(3).forEach(System.out::println);;
		System.out.println("Skip used");
		list.stream().skip(3).forEach(System.out::println);;
	}

}
