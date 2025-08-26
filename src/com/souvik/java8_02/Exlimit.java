package com.souvik.java8_02;

import java.util.Arrays;
import java.util.List;

public class Exlimit {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(32,12,3,43,12,4,6,3);
		l.stream().limit(3).forEach(x->System.out.println(x));;

	}

}
