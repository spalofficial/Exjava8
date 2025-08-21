package com.souvik.java8_02;

import java.util.ArrayList;
import java.util.List;

public class ExSlicing {

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
		// Use of limit -- only 4 elements
		System.out.println("Limit ");
		l.stream().sorted().limit(4).forEach(x->System.out.println(x));
		// Use of skip -- skip 4 elements
		System.out.println("Skip ");
		l.stream().sorted().skip(2).forEach(x->System.out.println(x));
				

	}

}
