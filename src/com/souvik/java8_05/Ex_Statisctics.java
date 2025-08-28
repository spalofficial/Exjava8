package com.souvik.java8_05;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Ex_Statisctics {
	public static void main(String[] args) {

		//statistical calculations
     Empl e1= new Empl("1", "Souvik", 32);
     Empl e2= new Empl("2", "Sorav", 31);
     Empl e3= new Empl("3", "Samit", 65);     
     Empl e4= new Empl("4", "Rana", 65);
     Empl e5= new Empl("5", "Rohit", 84);
     Empl e6= new Empl("6", "Ani", 26);
     Empl e7= new Empl("7", "Animesh", 65);
     Empl e8= new Empl("8", "Bubu", 87);
     Empl e9= new Empl("9", "Dudu", 23);
     Empl e10= new Empl("10", "Dodo", 65);
     
     List<Empl> emplist = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
     
     
     double aveageage=emplist.stream().mapToInt(x->x.getAge()).summaryStatistics().getAverage();
     System.out.println(aveageage);
     
     int minage=emplist.stream().mapToInt(x->x.getAge()).summaryStatistics().getMin();
     int maxage=emplist.stream().mapToInt(x->x.getAge()).summaryStatistics().getMax();
     System.out.println(minage);
     System.out.println(maxage);

	}
}

class Empl{
 private String id;
 private String name;
 private Integer age;
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
 public Integer getAge() {
	return age;
 }
 public void setAge(Integer age) {
	this.age = age;
 }
 @Override
 public String toString() {
	return "Empl [id=" + id + ", name=" + name + ", age=" + age + "]";
 }
 public Empl(String id, String name, Integer age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
 }
 public Empl() {
	super();
	// TODO Auto-generated constructor stub
 }

}
