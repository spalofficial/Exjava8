package com.souvik.java8_02;

import java.util.Arrays;

public class ExIteration {

	public static void main(String[] args) {
	
		Integer[] x = new Integer[7];
		x[0] =10;
		x[1] =20;
		x[2] =30;
		x[3] =3;
		x[4] =37;
		x[5] =4;
		x[6] =58;
		
		//use of ForEach()  -- ordering is indeterministic.
		System.out.println("For each");
		Arrays.asList(x).parallelStream().filter(xo-> xo>=4).map(xo->xo*xo).forEach(xo->System.out.println(xo));
		//use of ForEachOrdered() -- see ordering is maintained
		System.out.println("For each ordered");
		Arrays.asList(x).parallelStream().filter(xo-> xo>=4).map(xo->xo*xo).forEachOrdered(xo->System.out.println(xo));
	}

}