package com.souvik.java8_01;
import java.util.function.BiFunction;

public class Example_BiFunction {
	
	public static void main(String[] args) {
		//normal process
		x_bifun x = new x_bifun();
		System.out.println(x.mult(12,14));   
		
		// by using lambda & Internal Functional Interface BiFunction
		  BiFunction<Integer,Integer, Double> f = (a,b)-> a*b*1.2;
		  System.out.println(f.apply( 12,14));

	}

}

class x_bifun{
	Double mult(int a, int b) {
		return a*b*1.2;
	}
}