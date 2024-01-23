package com.java;

public class IfStatement {

	public static void main(String[] args) {
		int x = 24 ;
		int y = 23;
		if (x > y) {
			System.out.println("x is smaller than y");
		}
		
		int time = 20 ;
		if (time < 18 ) {
			System.out.println("Good moring" );
			
		}else {
			System.out.println("good evening");
		}
		
		int time1 = 22;
		if (time1<10) {
			System.out.println("Good day");
		}else if (time < 10) {
			System.out.println("Good evening");
		}else {
			System.out.println("good afternood");
		}
		
		int day = 2;
		switch (day) {
		case 1: 
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:System.out.println("Thur");
		break ;
		default:
		System.out.println("Looding forward weekend");
			
		}	
		
	}

}
