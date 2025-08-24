package com.souvik.java8_03;

public class Example_DefaultDiamondProblem {

	public static void main(String[] args) {


			souvik s= new souvikimpl();
			s.show();
			souvik u= new aniimpl();
			u.show();
		}

	}

	interface s1{
		
		default void show() {
			System.out.println("This is default menthod Interface 1");
		}
	}
	interface s2{
		
		default void show() {
			System.out.println("This is default menthod Interface 2");
		}
	}
	
	

	class xox implements s1,s2{

		@Override
		public void show() {  //without override code will not compile, it will force you to overwrite.  You have to mention which superclass method to call. or provide own implementation
			
			//s1.super.show(); 
			
			//or
			
			//s2.super.show();
			
			//or
			
			System.out.println("This is default menthod class itself");
			
		} 
		
		// Note : No diamond problem in static method of interface as it is static can needs to be called by interface so no ambiguity.

	}