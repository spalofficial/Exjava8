package com.souvik.java8_05;

public class Ex_Mult2nousingFI {

	public static void main(String[] args) {

		custfi<Integer> c = (a,b)-> a*b;
		System.out.println(c.mult(10, 20));
		
		
		//or
		
		custfi<Integer> f = k::multiply;
		System.out.println(f.mult(10, 20));
	}

}
@FunctionalInterface
interface custfi<T>{
	T mult(T t, T u);
}

class k{
	
	static Integer multiply(Integer a, Integer b) {
		return a*b;
	}
}
