package com.souvik.java8_01;
import java.util.function.Consumer;

public class Example_Consumer {
	
	public static void main(String[] args) {
		//normal process
		x_con x = new x_con();
		x.show(3);   
		
		// by using lambda & Internal Functional Interface Consumer
		  Consumer<Integer> c = (b)-> System.out.println("Value of b is :"+ b);
		  c.accept( 3);

	}

}

class x_con{
	void show(int b) {
		System.out.println("Value of b is :"+ b);
	}
}