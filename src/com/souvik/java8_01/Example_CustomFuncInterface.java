package com.souvik.java8_01;
public class Example_CustomFuncInterface {
	
	public static void main(String[] args) {
		//normal process
		x_cusfun x = new x_cusfun();
		System.out.println(x_cusfun.mult(12, 14,3.6));   // for static method
		System.out.println(x.mult_non_static(12, 14,3.6));  // for non static method
		
		
		// by using lambda & Internal Functional Interface Function -- static method referencing
		  cust_fuc<Integer,Integer,Integer,Double> f1 = x_cusfun::mult;
		  System.out.println(f1.calc(12,14,3.6));
		  
		// by using lambda & Internal Functional Interface Function -- non-static method referencing
		  cust_fuc<Integer,Integer,Integer,Double> f2 = x::mult_non_static;
		  System.out.println(f2.calc(12,14,3.6));
		  
		  //for static we don't need a class object. direct call or reference method by class name.
		 //for non-static we need a class object, then call or reference method by class object.

	}

}

class x_cusfun{
	static Double mult(int a, int b, Double c) {
		return a*b*c*1.2;
	}
	Double mult_non_static(int a, int b, Double c) {
		return a*b*c*1.2;
	}
}

@FunctionalInterface
interface cust_fuc<T,U,V,R>{
	//T is type of 1st argument
	//U is type of 2st argument
	//U is type of 3RD argument
	//R is type of RETURN
	 Double calc(Integer a, Integer b, Double c);
}

