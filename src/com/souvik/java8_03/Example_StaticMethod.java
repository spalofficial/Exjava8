package com.souvik.java8_03;

public class Example_StaticMethod{

	
	public static void main(String[] args) {

		souvik s= new souvikimpl();
		s.show();
		souvik u= new aniimpl();
		u.show();
	}

}

interface souvik{
	
	default void show() {
		System.out.println("This is default menthod call of interface");
	}
}

class souvikimpl implements souvik{   // original default of interface is used

}

class aniimpl implements souvik{    // overridden default of interface is done
	@Override
	public void show() {                      
		System.out.println("Default method id overridden");
	}
}