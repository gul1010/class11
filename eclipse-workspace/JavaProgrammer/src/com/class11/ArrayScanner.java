package com.class11;

import java.util.Scanner;

public class ArrayScanner{

	public static void main(String[] args) {
		
		Scanner scan;
		String[] array;
		
		scan=new Scanner(System.in);
		System.out.println("How many String elements would you like to store?");
        int size=scan.nextInt();
        
        array=new String[size];
        
        for(int i=0; i<size; i++) { //or we can use i<array.length which is name of index.
              System.out.println("Please enter a String");
              array[i]=scan.next();
        }
        System.out.println("-------------Let's see what we have stored--------------");
        
        for(String str:array) {
        	System.out.println(str);
        }
	}

}
