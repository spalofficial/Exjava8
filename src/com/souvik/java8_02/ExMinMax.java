package com.souvik.java8_02;

import java.util.ArrayList;
import java.util.List;

public class ExMinMax {

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
		// For min and max we must provide a comparator based on which the min max will be found.
		System.out.println(l.stream().min((x,y)->x.compareTo(y)).get());  
		System.out.println(l.stream().max((x,y)->x.compareTo(y)).get());  
		
		
		// min max can work oppositely if we change the sequence of operation
		System.out.println(l.stream().max((x,y)->y.compareTo(x)).get()); // we are telling max but actually getting min.

	}

}
