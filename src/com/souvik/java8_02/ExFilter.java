package com.souvik.java8_02;

import java.util.ArrayList;
import java.util.List;

public class ExFilter {

	public static void main(String[] args) {
	
		List<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(1);
		l.add(21);
		l.add(32);
		l.add(4);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(3);
		
		l.stream().filter(x->x%2==0).forEach(x->System.out.println(x));

	}

}
