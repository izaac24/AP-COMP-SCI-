/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int [(int)(Math.random() * 149 + 51)];
		for(int num = 0; num < arr.length; num++){
			arr[num] = (int)(Math.random() * 99 + 1);
		}
		
		// this is the average section
		int total = 0;
		for(int num = 0; num < arr.length; num ++){
			total = total + arr[num];
		}
		total = total/arr.length;
		System.out.println("the average of the array is " + total);
		
		// this is the minimum section
		int min = Integer.MAX_VALUE;
		for(int num = 0; num < arr.length; num++){
			if(arr[num] < min){
				min = arr[num];
			}
		}
		System.out.println("The min is " + min);
		
		// This is the maximum section
		int max = arr[0];
		for(int num = 0; num < arr.length; num++){
			if(arr[num] > max){
				max = arr[num];
			}
		}
		System.out.println("The max is " + max);
		


		
	}
}
