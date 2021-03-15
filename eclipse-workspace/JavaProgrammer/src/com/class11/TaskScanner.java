package com.class11;

import java.util.Scanner;

public class TaskScanner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		double sum=0;
		double [] numbers;
		
		
		System.out.println("How many elements do u want?");
		int size=scan.nextInt();
		
		numbers=new double[size];
		for(int i=0; i<size; i++) {
			System.out.println("Please enter a double");
			numbers[i]=scan.nextDouble();
			sum+=numbers[i];
			
		}
		System.out.println("The num sum "+size+" elements from an array ="+sum);
		
		
		System.out.println("-------------OR-----------------------------");
		
		System.out.println("Your elements");
		for(double doub:numbers) {
			sum+=doub;
			System.out.print(sum);
		}
		
		System.out.println("----------------------------OR--------------------------------");
		
		sum=0;
		
		for(double num:numbers) {
			sum+=num;
			
		}
		System.out.println(sum);
		

	}

}
