package com.souvik.java8_04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example_CollectorToGroupingBy {

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
       Map<Integer,List<Student>> agewisegroupway1	 = studlist.stream().
    		   			collect(Collectors.groupingBy(x->x.getAge(), ()-> new HashMap<>(), Collectors.toList()));
       
       //using method referencing
       Map<Integer,List<Student>> agewisegroupway2	 = studlist.stream().
	   			collect(Collectors.groupingBy(Student::getAge, HashMap::new, Collectors.toList()));
       System.out.println(agewisegroupway1);
       System.out.println(agewisegroupway2); //same

      
	}

}
