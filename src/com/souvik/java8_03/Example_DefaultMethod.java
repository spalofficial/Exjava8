package com.souvik.java8_03;

public class Example_DefaultMethod {

	public static void main(String[] args) {

		ani.show();  // direct call to static method of interface.
		souvikimp.show(); // direct call to static method of impl class.
	}

}


interface ani{
	
	static void show() {
		System.out.println("This is static menthod call of interface");
	}
}

class souvikimp implements ani{    // Overriding is not happening . when same static method id written here the interface static method is 
								   // hidden .
	
	public static void show() {    // if you write @override annotation it will give an error . Static cannot be overwritten                 
		System.out.println("Static method of the interface is hidden, this is a new static method of class scope only");
	}
}
