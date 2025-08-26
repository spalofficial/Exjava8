package com.souvik.java8_02;

import java.util.Arrays;
import java.util.List;

public class ExReduce {

	public static void main(String[] args) {

		//reduce performs operation on all elements of a stream and generates a single output. 
		//it uses binary operator so inputs and output should be same type
 List<Integer> l = Arrays.asList(21,2,12,3);
 Integer s= l.stream().reduce((a,b)->a+b).get(); //addition 
 System.out.println(s); 
	}

}
