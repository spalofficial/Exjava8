package com.souvik.java8_03;

public class Example_MethodReferrencing {
	
	public static void main(String[] args) {
		
		sss s= new sss();
		
		xcalc<Integer, Double> xcalc = sss :: average;  // method referencing for static . direct call with class.
		System.out.println(xcalc.calaverage(3, 5, 5));
		
		ycalc<Integer> ycalc = s :: add;                // method referencing for non-static .  call with class object.
		System.out.println(ycalc.caladd(3, 5));
		
	}
}

class sss{              // This is a class that has 2 methods . I will reuse its methods using method referencing .
	
	public Integer add(Integer a, Integer b) {             
		return a+b;
	}
	public static double average(Integer a, Integer b, Integer c) {
		return (a+b+c)/3.0;
	}
}

@FunctionalInterface
interface xcalc <T,R>{
	R calaverage(T t, T u, T v);
}

@FunctionalInterface
interface ycalc <T>{
	T caladd(T t, T u);
}