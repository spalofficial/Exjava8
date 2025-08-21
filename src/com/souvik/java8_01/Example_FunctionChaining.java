package com.souvik.java8_01;
import java.util.function.Function;

public class Example_FunctionChaining {
	
	public static void main(String[] args) {
		  Function<Integer,Integer> f1 = (b)-> b*b;
		  Function<Integer,Double> f2 = (b)-> b*1.2;
		  Function<Double,Double> f3 = (b)-> b*b*b;
		  
		  //input type of next function should have same data type of previous function return type
		  
		//using andThen() -- f1 then f2 then f3
		  System.out.println(f1.andThen(f2).andThen(f3).apply(2));
		  
		  Function<Integer,Integer> f4 = (b)-> b*b;
		  Function<Integer,Integer> f5 = (b)-> b*3;
		  Function<Integer,Integer> f6= (b)-> b*b*b;
		  
		//using compose() -- f6 then d5 then f4
		  System.out.println(f4.compose(f5).compose(f6).apply(2));
		  

	}

}
