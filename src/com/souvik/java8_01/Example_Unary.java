package com.souvik.java8_01;
import java.util.function.UnaryOperator;

public class Example_Unary {
	
	public static void main(String[] args) {
		//normal process
		x_unary x = new x_unary();
		System.out.println(x.mult(12));   
		
		// by using lambda & Internal Functional Interface Unary --> Same input type same return type
		  UnaryOperator<Integer> u = (b)-> b*3;
		  System.out.println(u.apply( 12));

	}

}

class x_unary{
	Integer mult(int b) {
		return b*3;
	}
}