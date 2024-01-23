package com.java;

public class MethodClass {

	public static void main(String[] args) {  // this is main method
		
		newMethod();
		fullName("fatema", 23);// argument is added 
		fullName("basera" , 24);
		System.out.println(age(6));
		int z = Method2(7, 9);
		System.out.println(z);
		checkAge(20); // method called here in main method
		
	}
	
	public static void newMethod() { // method is created within class outside main method
		
	System.out.println("this is my first cod in method"); // method much be called in main method
	}
	public static void fullName(String name , int age) { // parameter is added
		
		System.out.println(name + "  " +  "karimi" + " is "  + age );
		
	}
	
	public static int age(int x) {
		return 5 + x ;
		
		
	}
	public static int Method2(int x, int y) {
		return x+y;
		
		
	}
	  // Create a checkAge() method with an integer parameter called age
	  static void checkAge(int age) {

	    // If age is less than 18, print "access denied"
	    if (age < 18) {
	      System.out.println("Access denied - You are not old enough!"); 
	      
	    // If age is greater than, or equal to, 18, print "access granted"
	    } else {
	      System.out.println("Access granted - You are old enough!"); 
	    }
	    
	  } 

	 
	  
	}


