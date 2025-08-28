package com.souvik.java8_05;

import java.util.Arrays;
import java.util.List;

public class Ex_SortDesconSalaryThenOperate {
	public static void main(String[] args) {

     Emp e1= new Emp("1", "Souvik", 32000);
     Emp e2= new Emp("2", "Sorav", 31000);
     Emp e3= new Emp("3", "Samit", 65445);     
     Emp e4= new Emp("4", "Rana", 67765);
     Emp e5= new Emp("5", "Rohit", 87564);
     Emp e6= new Emp("6", "Ani", 23546);
     Emp e7= new Emp("7", "Animesh", 67554);
     Emp e8= new Emp("8", "Bubu", 87564);
     Emp e9= new Emp("9", "Dudu", 23456);
     Emp e10= new Emp("10", "Dodo", 65453);
     
     List<Emp> emplist = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
     
     System.out.println("List in sorted order");
     
     emplist.stream().sorted((x1,x2)-> x2.getSalary().compareTo(x1.getSalary())).forEach(System.out::println);
     
     System.out.println("Top 3 salaried person");
     
     emplist.stream().sorted((x1,x2)-> x2.getSalary().compareTo(x1.getSalary())).limit(3).forEach(System.out::println);

     System.out.println("SKip the top 3 salaried person");
     
     emplist.stream().sorted((x1,x2)-> x2.getSalary().compareTo(x1.getSalary())).skip(3).forEach(System.out::println);
     
System.out.println("find 4 th, 5th high salaried person");
     
     emplist.stream().sorted((x1,x2)-> x2.getSalary().compareTo(x1.getSalary())).skip(3).limit(2).forEach(System.out::println);

	}
}

class Emp{
 private String id;
 private String name;
 private Integer salary;
 public String getId() {
	return id;
 }
 public void setId(String id) {
	this.id = id;
 }
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public Integer getSalary() {
	return salary;
 }
 public void setSalary(Integer salary) {
	this.salary = salary;
 }
 @Override
 public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
 }
 public Emp(String id, String name, Integer salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
 }
 public Emp() {
	super();
 }
}
