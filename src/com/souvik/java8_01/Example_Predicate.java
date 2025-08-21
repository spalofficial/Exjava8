package com.souvik.java8_01;
import java.util.function.Predicate;

public class Example_Predicate {
	
	public static void main(String[] args) {
		//normal process
		x_pre x = new x_pre();
		System.out.println(x.check(10));   
		
		// by using lambda & Internal Functional Interface Predicate
		  Predicate<Integer> p = (b)-> b>=5;
		  System.out.println(p.test( 10));

	}

}

class x_pre{
	boolean check(int b) {
		return b>=5;
	}
}