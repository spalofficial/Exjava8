package com.souvik.java8_01;
import java.util.function.BinaryOperator;

public class Example_Binary {
	
	public static void main(String[] args) {
		//normal process
		x_binary x = new x_binary();
		System.out.println(x.mult(12,14));   
		
		// by using lambda & Internal Functional Interface Binary operator -- same input type same output type
		  BinaryOperator<Integer> f = (a,b)-> a*b;
		  System.out.println(f.apply( 12,14));

	}

}

class x_binary{
	Integer mult(int a, int b) {
		return a*b;
	}
}