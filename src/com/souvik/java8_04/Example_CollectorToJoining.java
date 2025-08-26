package com.souvik.java8_04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example_CollectorToJoining {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Souvik", 31);
        Student s2 = new Student(2, "Rahul", 25);
        Student s3 = new Student(3, "Ankita", 22);
        Student s4 = new Student(4, "Priya", 22);
        Student s5 = new Student(5, "Ravi", 30);
        Student s6 = new Student(6, "Sneha", 29);
        Student s7 = new Student(7, "Amit", 29);
        Student s8 = new Student(8, "Pooja", 27);
        Student s9 = new Student(9, "Kiran", 22);
        Student s10 = new Student(10, "Arjun", 23);
        
        
       List<Student> studlist = Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
       
       //using lambda
       String names =studlist.stream().map(x->x.getName()).collect(Collectors.joining(",","[","]"));
     //using lambda
       String names2 =studlist.stream().map(Student::getName).collect(Collectors.joining(",","[","]"));
       System.out.println(names);
       System.out.println(names2);
	}

}
