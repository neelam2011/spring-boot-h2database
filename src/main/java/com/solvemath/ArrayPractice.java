package com.solvemath;

public class ArrayPractice {
	public static void main(String[] args) {
		// int[] num = new int[] { 1, 2, 3, 4, 5 };

		// iterate all num
		/*
		 * for(int i=0; i<= num.length; i++) {
		 *  System.out.println("num: "+i); }
		 */

		/* sum of all nums in array
		
		int[] num = new int[] { 1, 2, 3, 4, 5 };
		int sum = 0; 
		for(int i=0; i<= num.length; i++) {

		  sum += num[i];
		
		System.out.println("sum: "+sum);
		//
		}
		*/
		
		
		//find average of an array
		
		int[] num=new int[] {10,20,30,50,40};
		
		for (int i=0; i<= num.length; i++) {
			int sum=0;
			sum += num[i];
			int mean=0;
			mean = sum/num.length;
			System.out.println("mean is : "+mean);
		}
		
		 }}
	

