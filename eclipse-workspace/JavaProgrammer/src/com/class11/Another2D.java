package com.class11;

public class Another2D {

	public static void main(String[] args) {
		/*
		 * Create a 2D array where you will store the following values: 
		 * Mr, Mrs, Ms, Miss and Smith, Jordan, Jackson, Obama. 
		 */
         String[][] names=new String[2][4];
         names[0][0]="Mr";
         names[0][1]="Mrs";
         names[0][2]="Ms";
         names[0][3]="Miss";
         
         names[1][0]="Smith";
         names[1][1]="Jordan";
         names[1][2]="Jackson";
         names[1][3]="Obama";
         
         System.out.println(names[0][1]+" "+names[1][0]+", "+names[0][0]+" "+names[1][3]+", "+names[0][2]+" "+names[1][2]+", "+names[0][3]+" "+names[1][1]);
	
        System.out.println("----------------------Second task----------------------------------------");
        
        String [][] nagra= {
        		          {"Gul", "Mohammad", "Dima", "Muborak"},
        		          {"A", "B"}
        		          };
        System.out.println("Name of students that "+nagra[0][1]+", "+nagra[0][3]+" have "+nagra[1][0]+" grades");
        System.out.println("Name of students that "+nagra[0][0]+", "+nagra[0][2]+" have "+nagra[1][1]+" grades");
	}

}
