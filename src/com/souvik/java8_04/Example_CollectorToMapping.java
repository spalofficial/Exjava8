package com.souvik.java8_04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example_CollectorToMapping {

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
 
       //now what we don't want the entire list, we need to group names by age , we want just the name
       
      Map<Integer,List<String>> groupjustname	 =
       studlist.stream().
	   			collect(Collectors.groupingBy(x->x.getAge(), ()-> new HashMap<>(), Collectors.mapping(x->x.getName(),  Collectors.toList())));
      Map<Integer,List<String>> groupjustname2	 =
    	       studlist.stream().
    		   			collect(Collectors.groupingBy(Student::getAge, HashMap::new, Collectors.mapping(x->x.getName(),  Collectors.toList())));
      System.out.println(groupjustname);
      System.out.println(groupjustname2); //same
      
      //partition only name --mapping with partition.  if age > 25 then in one partition else other partition
      
      Map<Boolean,List<String>> agewisepartitionnme	 =  studlist.stream().
    		  collect(Collectors.partitioningBy(x->x.getAge()<=25, Collectors.mapping(x->x.getName(), Collectors.toList())));
           
           //using method referencing
           System.out.println(agewisepartitionnme);

      
	}

}
