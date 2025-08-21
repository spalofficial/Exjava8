package com.souvik.java8_01;
import java.util.function.Consumer;

public class Example_ConsumerChaining {
	
	public static void main(String[] args) {
		  Consumer<Integer> c1 = (b)-> System.out.println("The vaalue is:"+b);
		  Consumer<Integer> c2 = (b)-> System.out.println("The vaalue is sq:"+b*b);
		  Consumer<Integer> c3 = (b)-> System.out.println("The vaalue is cube :"+b*b*b);
		 
		//using andThen() 
		  c1.andThen(c2).andThen(c3).accept(2);
		  
		//using compose() -- No compose is there. as there is no input, if we need change in sequence of
		//operation we can just change the sequence in andThen() 
		  
		  c2.andThen(c1).andThen(c3).accept(2); //like this
		  

	}

}
