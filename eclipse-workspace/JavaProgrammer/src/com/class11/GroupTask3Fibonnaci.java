package com.class11;

public class GroupTask3Fibonnaci {

	public static void main(String[] args) {
		/*0+1=1->2->3->5->8->13->20
		 *   + + +  +  +  +   +   
		 * Numbers which is added the previous ones step by step 
		 */
        int a=0;
        int b=1;
        int c;
        
        for(int i=1; i<=10; i++) {
        	
        	c=a+b;
        	
        	a=b;
        	b=c;
        	
        	System.out.print(c+" ");
        	
        }
        System.out.println();
        System.out.println("--------------------------------Another way--------------");
        
        int f1=0;
        int f2=1;
        
        for(int f=1; f<=10; f++ ) {
        	
        	System.out.print(f1+" ");
        	f1=f1+f2;
        	f2=f1-f2;
        }
	}

}
