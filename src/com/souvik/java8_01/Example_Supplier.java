package com.souvik.java8_01;
import java.util.Date;
import java.util.function.Supplier;

public class Example_Supplier {
	
	public static void main(String[] args) {
		//normal process
		x_sup x = new x_sup();
		System.out.println(x.currdate());   
		
		// by using lambda & Internal Functional Interface Supplier
		  Supplier<Date> s = ()-> new Date();
		  System.out.println(s.get( ));

	}

}

class x_sup{
	Date currdate() {
		return new Date();
	}
}