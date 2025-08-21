package com.souvik.java8_02;

import java.util.ArrayList;
import java.util.List;

public class ExMap {

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
		
		l.stream().map(x->x*x).forEach(x->System.out.println(x));

	}

}
