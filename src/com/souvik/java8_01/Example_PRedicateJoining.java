package com.souvik.java8_01;
import java.util.function.Predicate;

public class Example_PRedicateJoining {
	
	public static void main(String[] args) {
		  Predicate<Integer> p1 = (b)-> b>=1;
		  Predicate<Integer> p2 = (b)-> b<=6;
		  Predicate<Integer> p3 = (b)-> b==3;
		  
		  
		//using and()
		  System.out.println(p1.and(p2).and(p3).test(3));
		//using or()
		  System.out.println(p1.or(p2).or(p3).test(3));
		//using negate()
		  System.out.println(p1.negate().test(3));

	}

}
