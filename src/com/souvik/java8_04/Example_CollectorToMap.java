package com.souvik.java8_04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example_CollectorToMap {

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
       
       //for actual grouping we need groupingby
       //using lambda
       Map<Integer,String> mapway1 =studlist.stream().
    		   							 collect(Collectors.
    	   									 toMap(x->x.getAge(), x->x.getName(), (u1,u2)->u1+","+u2, ()->new HashMap<>()));
       
       //using method referencing
       Map<Integer,String> mapway2 =studlist.stream().
					 collect(Collectors.
						 toMap(Student::getAge, Student::getName, (u1,u2)->u1+","+u2, HashMap::new));
       System.out.println(mapway1);
       System.out.println(mapway2); //same
	}

}
