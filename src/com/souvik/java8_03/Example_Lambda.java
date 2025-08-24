package com.souvik.java8_03;

public class Example_Lambda {

	public static void main(String[] args) {
			
			
			xcalcu<Integer, Double> xcalcu = (a,b,c)-> (a+b+c)/3.0; // Using lambda & custom FI.
			System.out.println(xcalcu.calaverage(3, 5, 5));
			
			ycalcu<Integer> ycalcu = (a,b)-> a+b;                // Using lambda & custom FI.
			System.out.println(ycalcu.caladd(3, 5));
			
		}
	}


	@FunctionalInterface
	interface xcalcu <T,R>{
		R calaverage(T t, T u, T v);
	}

	@FunctionalInterface
	interface ycalcu <T>{
		T caladd(T t, T u);
	}
