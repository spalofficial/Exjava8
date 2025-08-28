package com.souvik.java8_05;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex_UppercaseJoining {

	public static void main(String[] args) {

		System.out.println(Stream.<String>builder().add("Souvik").add("Karun").add("Varun").build().collect(Collectors.joining(",")));

	}

}
