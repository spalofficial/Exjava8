package com.souvik.java8_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExStream {

	public static void main(String[] args) {
	
		List<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(1);
		l.add(21);
		l.add(32);
		l.add(4);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(3);
		
		// this creates a stream of elements of the collection list l.
		Stream<Integer> s = l.stream();  
		Stream<Integer> f=s.filter( x-> x>=4 ); //filter used to filter the element
		Stream<Integer> m=f.map( x -> x*x); //map used to square the elements
		Stream<Integer> so= m.sorted(); //sort the stream.	
		List<Integer> k = so.collect(Collectors.toList()); //collect the elements to a list	
		System.out.println("Explained Process stream from collection");
		k.stream().forEach(x->System.out.println(x)); // print the list
		
		//THis is to explain that all stream intermediate operators create a new stream of elements	
		// One line of the above operations -----
		System.out.println("One lined Process same");
		l.stream().filter(x-> x>=4).map(x->x*x).sorted().forEach(x->System.out.println(x));
		
		System.out.println("Stream from arrays");
		//Create stream from array of elements
		Arrays.asList(1,2,43,3,12,43,53,23).stream().filter(x-> x>=4).map(x->x*x).sorted().forEach(x->System.out.println(x));
		
		System.out.println("Stream from array");
		//Take a normal array and also we can pass it to the Arrays
		Integer[] x = new Integer[4];
		x[0] =10;
		x[1] =20;
		x[2] =30;
		x[3] =3;
		Arrays.asList(x).stream().filter(xo-> xo>=4).map(xo->xo*xo).sorted().forEach(xo->System.out.println(xo));
	}

}
