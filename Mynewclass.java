package com.java;

public class Mynewclass {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(3+3);
		System.out.println(23456);
		
		
		
		int age = 34;
		System.out.println(age);
		
		String name = "Muhammad";
		String lastname = "hamidi";
		String fullname = name +lastname;  
		System.out.println(fullname);
		System.out.println( name + " " + lastname); // concatenation or
		System.out.println(name.concat(lastname));
		
		int x = 5;
		int y= 6;
		System.out.println(5*6);
		
		int a = 4, b = 5 , c = 6;
		System.out.println(a + b + c);
		
		int myNum = 5;               // Integer (whole number)
		float myFloatNum = 5.99f;    // Floating point number
		char myLetter = 'D';         // Character
		boolean myBool = true;       // Boolean
		String myText = "Hello";     // String
		
		byte myNum1 = 100;    // byte can be used instead of int 
		System.out.println(myNum1);
		
		short myNum2 = 5000;    // short store number from -32768 to 32767
		System.out.println(myNum2);
		
		long myNum3 = 15000000000L;
		System.out.println(myNum3);
		
		float myFloat = 3.14f;         // float and double is used for decimal number 
		double myDouble = 3.14;
		System.out.println(myFloat);
		System.out.println(myDouble);
		
		 boolean isJavaFun = true;
		    boolean isFishTasty = false;    
		    System.out.println(isJavaFun);
		    System.out.println(isFishTasty);
		    
		    String text = "Hello World";
		    System.out.println(text.toUpperCase());
		    System.out.println(text.toLowerCase());
		    
		    int number =9; // some operator like > ,< , == also shows if variable is true or false
		    int number2= 8;
		    System.out.println(number<number2);
		    System.out.println(number==number2);
		    System.out.println(number>number2);
		    
		    int x1 = 12;
		    System.out.println(x1==12);   // == is equal

	}

}
