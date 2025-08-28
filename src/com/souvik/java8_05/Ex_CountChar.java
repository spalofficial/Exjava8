package com.souvik.java8_05;

public class Ex_CountChar {

	public static void main(String[] args) {

		char c= 'c';
		String s= "cat is not chilling, cat needs milk cookies";
		System.out.println(s.chars().filter(x->x==c).count());

	}

}
