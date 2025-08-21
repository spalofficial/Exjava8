package com.souvik.java8_01;
import java.util.function.Function;

public class Example_Function {
	
	public static void main(String[] args) {
		//normal process
		x_fun x = new x_fun();
		System.out.println(x.mult(12));   
		
		// by using lambda & Internal Functional Interface Function
		  Function<Integer,Double> f = (b)-> b*1.2;
		  System.out.println(f.apply( 12));

	}

}

class x_fun{
	Double mult(int b) {
		return b*1.2;
	}
}