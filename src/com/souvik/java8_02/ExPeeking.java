package com.souvik.java8_02;

import java.util.Arrays;

public class ExPeeking {

	public static void main(String[] args) {
	
		Integer[] x = new Integer[4];
		x[0] =10;
		x[1] =20;
		x[2] =30;
		x[3] =3;
		//peek is used at each level of operation
		Arrays.asList(x).stream()  
		.filter(xo-> xo>=4) //we can write at each point of operation and check what is the output of peek. helps in debugging.
		.map(xo->xo*xo).peek(xo->System.out.println(xo))
		.sorted()
		.forEach(xo->System.out.println(xo));
	}

}