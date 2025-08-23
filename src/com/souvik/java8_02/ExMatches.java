package com.souvik.java8_02;

import java.util.Arrays;
import java.util.List;

public class ExMatches {

	public static void main(String[] args) {
	List<String> l = Arrays.asList("Hello","Hello I am Souvik","Hello Kitty", "Hello Bello");
	
	System.out.println(l.stream().anyMatch(x->x.contains("Hello")));
	System.out.println(l.stream().allMatch(x->x.contains("Hello")));
	System.out.println(l.stream().noneMatch(x->x.contains("Hello")));
	
	//sort  operator, if one element is matched it doesn't traverse next element . 
 }
}