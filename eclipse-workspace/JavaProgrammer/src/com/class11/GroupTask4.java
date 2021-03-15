package com.class11;

public class GroupTask4 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array
		
		int[] arr= {900, 20, 10, 9, 5, -1, 6, 7, 34, 88, 90, 156};
		
		int max, min;
		min=arr[0];
		max=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];//two independents conditions
			}
		}
		System.out.println(max+" is maximum number");
		System.out.println(min+" is minimum number");

	}

}
