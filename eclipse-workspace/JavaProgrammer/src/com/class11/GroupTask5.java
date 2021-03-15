package com.class11;

public class GroupTask5 {

	public static void main(String[] args) {
		// write a java program to find the second largest number in the array
		
		int[] arr= {900, 10, 20, 3, 900, 45, 900, 89, 76, 45, 125, 367, 145};
		
		int large, secondLarge;
		
		large=0;
		secondLarge=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>large) {
			    secondLarge=large;
				large=arr[i];
			}else if (arr[i]> secondLarge && arr[i]!=large){
				secondLarge=arr[i];
			}
		}
		System.out.println("Largest num is "+large);
		System.out.println("2nd largest num is "+secondLarge);

	}

}
