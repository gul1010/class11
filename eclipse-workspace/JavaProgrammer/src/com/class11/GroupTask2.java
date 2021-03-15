package com.class11;

public class GroupTask2 {

	public static void main(String[] args) {
		
		/*
		 * Write a java program to check whether a given number is prime or not?
		 *divisible by 1 and itself only
		 */
		
		int num=-9;
		boolean prime=true;
		
		if(num>1) {//for -numbers to add 
		for(int i=2; i<num; i++) {
			
			if(num%i==0) {
				prime=false;
			    break;
			}
		}
		}else {//otherwise number less than 1
			prime=false;
		}
		if(prime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
	}

}
