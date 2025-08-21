package com.souvik.java8_01;
import java.util.function.BiPredicate;

public class Example_Bipredicate {
	
	public static void main(String[] args) {
		//normal process
		x_bipre x = new x_bipre();
		System.out.println(x.check(10,20));   
		
		// by using lambda & Internal Functional Interface BiPredicate
		  BiPredicate<Integer, Integer> p = (a,b)-> a>=5 && b<=9;
		  System.out.println(p.test( 10,20));

	}

}
class x_bipre{
	boolean check(int a, int b) {
		return a>=5 && b<=9;
	}
}