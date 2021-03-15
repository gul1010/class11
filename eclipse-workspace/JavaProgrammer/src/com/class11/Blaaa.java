
package com.class11;

public class Blaaa {

	public static void main(String[] args) {
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
	   int count=0;
	   for(int i=0; i<a.length; i++){
	     count=count+i;
	   }
	   System.out.println(count);
	}

}
