package com.souvik.java8_02;

import java.util.Arrays;
import java.util.List;

public class ExDistinct {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,23,43,43,12,54,33,12,1,2,32,53);
		l.stream().distinct().forEach(x-> System.out.println(x)); //distinct elements in a collection


	}

}
