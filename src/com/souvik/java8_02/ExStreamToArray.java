package com.souvik.java8_02;


import java.util.Arrays;
import java.util.List;

public class ExStreamToArray {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,23,2,43,4,65,34,6);
		Object[] arr= l.stream().filter(x->x>4).toArray(); //stream to object array.
		for(Object x:arr) {
			System.out.println(x);
		}

	}

}
