package com.class11;

public class QuizQuestions {

	public static void main(String[] args) {
		int nums[] = { 12, 15, 16, 17, 19 };

		   for (int i = nums.length-1; i >0; i--) {

		      System.out.println(nums[i]);

		    }
        
		   System.out.println("--------------------------------------");
		   
		   
		   
		   int i = 50;

		     int[] a = new int[10];

		     System.out.println(a.length);

		     a = new int[100];

		     System.out.println(a.length);

		     a = new int[i];

		     System.out.println(a.length);
		     
		     System.out.println("---------------------------------------------");
		     int[] a1 = {12, 15, 11, 13, 9, 25};
		     int[] a2 = {12, 15, 11, 13, 9, 25};
		     int sum = 0;
		     for (int q = 0; q <a1.length; q++) {
		              if (a1[q] % 2== a2[q ] % 5)  {
		                       sum += q * q;
		              }
		     }
		     System.out.println("sum = " + sum);
		     System.out.println("-----------------------------------------");
		     
		     int[] eg_Array = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };

		     for ( int index= 0 ; index < 5 ; index++ ) {
		            System.out.print( eg_Array[ index ] + " " );
		     }
		     
		     System.out.println("--------------------------------------------------");
		     char array_variable [] = new char[10];
		     for (int p = 0; p < 10; ++p) {
		              array_variable[p] = 'i';
		              System.out.print(array_variable[p] + " ");
		     }
		     System.out.println("----------------------------------------------------");
		     int arrayVariable[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		     int sum1 = 0;

		     for (int o = 0; o < 3; ++o) {

		        for (int j = 0; j < 3; ++j) {

		            sum = sum + arrayVariable[o][j];

		        }

		     }

		     System.out.print(sum / 5);
		     System.out.println("-----------------------------------------------------------");
		     int[] array = { 1, 4, 3, 6, 8, 2, 5 };

		     int what = array[0];

		     for (int index = 0; index < array.length; index++) {

		            if (array[index] > what) {

		                       what = array[index];

		             }

		     }

		     System.out.println(what);
		     
		     System.out.println("----------------------------------------------------");
		     int[] zip = new int[5];

		     zip[0] = 7;
		     zip[1] = 3;
		     zip[2] = 4;
		     zip[3] = 1;
		     zip[4] = 9;

		     System.out.println( zip[ 2 + 1 ] );
		     
		     System.out.println("--------------------------------------------------");
		     
		     for(int u=1; u<15; u=u+3) {

		    	    System.out.print(u);
		     }
		     
		     System.out.println("-------------------------------------");
		     int x=1;

		     while(x<5) {   

		        x++;   

		        System.out.print(x);

		     }
		     System.out.println("---------------------------------------------");
		     
		     System.out.println("----------------------------------------------");
		     
		     System.out.println("---------------------------------------");
		     int y = 0;
		     for (int l = 0; l < 10; ++l) {
		     y += 1;
		     }
		     System.out.println(y);
		     System.out.println("-------------------------------------");
		     for(int k = 0; k <= 5; k++ ) {
		    	   System.out.println("i = " + k );
		    	}
		     System.out.println("--------------------------------------");
		     int k=3, tot=0;

		     do{

		        tot=tot+k;

		        k++;

		     } while(k<11);

		     System.out.print(tot);
		     System.out.println("--------------------------------------");
		     int s=1;

		     do{

		        s++;

		        System.out.print(s);

		     }while(s<5);
      System.out.println("---------------------------------------------");
      int z=2, sum2=0;

      while(z<9) {

         z++;

         sum2=sum2+z;

      }

      System.out.print(sum2);
      System.out.println("-------------------");
      int m=2, total=0;

      while(m<6) {

         total=total+m;

         m++;

      }

      System.out.print(total);
		    	
	}

}
