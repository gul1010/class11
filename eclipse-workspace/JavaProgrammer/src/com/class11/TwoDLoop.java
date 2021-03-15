package com.class11;

public class TwoDLoop {

	public static void main(String[] args) {
		// Cities
		
		String[][] usa= {
				{"Alexandria", "Oakton", "Arlington", "Virginia Beach", "Fairfax"},
				{"Philly", "Strassburg", "Pittsburgh"},
				{"Boston", "Quincy", "Springfield", "Burlington"},
				{"Los Angeles", "Long Beach", "San Francisco", "Sacramento", "Santa Barbara"},
				{"Miami", "Orlando", "Tampa", "Tallahasee"}
		};

		for(int r=0; r<usa.length; r++) {
			for(int c=0; c<usa[r].length; c++) {
				System.out.print(usa[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------for each loop----------------------------------------------");
		
		for(String[] cities:usa) {
			
			for(String city:cities) {
				
				System.out.print(city+" ");
				
			}
			System.out.println();
		}
	}

}
