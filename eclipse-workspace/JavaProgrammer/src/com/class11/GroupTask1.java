package com.class11;

public class GroupTask1 {

	public static void main(String[] args) {
		int count=0;
		String[][] countries= {
				{"Usa", "Canada"},
				{"France", "Italy", "Germany"},
				{"Algeria", "Morocco", "Lybia"}
		};
		for(String[] country: countries) {
			 for(String c:country) {
				 System.out.print(c+" ");
				 count++;//one way to calculate = plus countries
			 }
			 System.out.println();
		}
		System.out.println("----------------------------------------------------------------");
		
		for(int i=0; i<countries.length; i++) {
			
			for(int j=0; j<countries[i].length; j++) {
				System.out.print(countries[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int sum =countries[0].length+countries[1].length+countries[2].length;//other way to calculate
		System.out.println("The total of the countries stored is: "+sum);
		System.out.println("The total of the countries stored is: "+count);
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------");
		
		//write a program to swap 2 numbers without temporary variable
		
		int x=10;
		int y=5;// means you cannot re assign value again. 
		
		x=x+y;//15
		y=x-y;//10
		x=x-y;//15-10=5
		System.out.println("After swaping: xa= "+x+", y = "+y);
		
		
		

		
		
		
		
		
		}

	}


