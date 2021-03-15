package com.class11;

public class TwoDTasks {

	public static void main(String[] args) {
		
		//Create 2d array of cars; american, german, korean, italian.
		
		String[][] cars= {
				{"Chevrolet", "Ford", "GME"},
				{"Audi", "BMW"},
				{"Hyundai", "Kia", "Renold"},
				{"Ferrari", "Lamborghini", "Fiat", "Alfaromeo"}
				
		};
		
		for(int i=0; i<cars.length; i++) {
			
			for(int c=0; c<cars[i].length; c++) {
				System.out.print(cars[i][c]+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------");
		
		for(String[] car:cars) {
			for(String ca:car) {
				System.out.print(ca+" ");
				
			}
			System.out.println();
		}
		System.out.println("-----------------------------------SECOND TASK----------------------------------------");
		
		String[][] groccery= {
				{"potatoes", "tomatoes", "cabbage"},
				{"Apple", "strawberry", "melon"},
				{"milk", "butter", "yogurt"},
				{"chocolate", "kitkat", "snacks", "ice cream"}
		};
		
		for(int i=0; i<groccery.length; i++) {
			for(int d=0; d<groccery[i].length; d++) {
				System.out.print(groccery[i][d]+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------------------");
		
		for(String[] groc:groccery) {
			for(String g:groc) {
				System.out.print(g+" ");
			}
			System.out.println();
		}
	}

}
