package com.souvik.java8_01;
import java.util.function.BiConsumer;

public class Example_Biconsumer {
	
	public static void main(String[] args) {
		//normal process
		x_bicon x = new x_bicon();
		x.add(10,23);   
		
		// by using lambda & Internal Functional Interface BiConsumer
		  BiConsumer<Integer, Integer> bic =(a,b)-> System.out.println("Addition is a+b :"+ (a+b));
		  bic.accept(10, 23);

	}

}

class x_bicon{
	void add(int a, int b) {
		System.out.println("Addition is a+b :"+ (a+b));
	}
}