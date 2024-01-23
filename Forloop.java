package com.java;

public class Forloop {

    public static void main(String[] args) {  // for loop
    	
    	multidimensionalArray();   // the below method called here in main method
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println(i);
        }
        
        String[] cars = { "BMW", "BENZ", "JEEP" }; // for-each loop
        for (String x : cars) {
            System.out.println(x);
        }
        
        String[] animal = { "lion", "tiger", "cheetah" }; // array 
        System.out.println(animal[2]);
        
        String[] car = { "Nissan", "honda", "opel" }; // in array index starts from zero 
        car[1] = "mazda";
        System.out.println(car[1]);
    }

     public static void multidimensionalArray() {  // arrays start from 0 , index also start from 0
    	int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
       myNumbers[1][2] = 9; // 1 is here is second because the first is 0 , 2 is 7 and modified to 9
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7
        
    }
}
