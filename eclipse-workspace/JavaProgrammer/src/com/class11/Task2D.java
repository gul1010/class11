package com.class11;

public class Task2D {

	public static void main(String[] args) {
		//Write a programm to swap 2 numbers without a temporary variable?
		
		int x=10;
		int y=5;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swapping: x="+x+", y="+y);
		
		System.out.println("----------------------------------------------");
		
		//write a program to check whether a given number is prime or not
        int num=13;
        boolean prime=true;
        
        for(int i=2; i<num; i++) {
        	if(num%2==0) {
        		prime=false;
        		break;
        	}
        }
        if(prime) {
        	System.out.println(num+" is a prime");
        }else {
        	System.out.println(num+" isnt a prime");
        }
        System.out.println("------------------------");
        
        int num1=1;
        boolean prime1=true;
        
        if(num1>1) {
        	
        	for(int i=2; i<num1; i++) {
        		if(num1%i==0) {
        			prime1=false;
        			break;
        		}
        	}
        }else {
        	prime1=false;
        }
        if(prime1) {
        	System.out.println(num1+" is prime");
        }else {
        	System.out.println(num1+" isnt");
        }
        
	}

}
