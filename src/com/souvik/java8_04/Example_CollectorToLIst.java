package com.souvik.java8_04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example_CollectorToLIst {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Souvik", 31);
        Student s2 = new Student(2, "Rahul", 25);
        Student s3 = new Student(3, "Ankita", 22);
        Student s4 = new Student(4, "Priya", 22);
        Student s5 = new Student(5, "Ravi", 30);
        Student s6 = new Student(6, "Sneha", 29);
        Student s7 = new Student(7, "Amit", 29);
        Student s8 = new Student(8, "Pooja", 27);
        Student s9 = new Student(9, "Kiran", 26);
        Student s10 = new Student(10, "Arjun", 23);
        
        List<Student> studlist = Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
        List<String> studnames =studlist.stream().filter(x->x.getAge()>25).map(x->x.getName()).collect(Collectors.toList());
        System.out.println("Students with age >25 :"+studnames);

	}

}
