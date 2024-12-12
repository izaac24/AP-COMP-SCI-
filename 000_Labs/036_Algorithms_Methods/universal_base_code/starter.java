/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] x){
		for(int i = 0; i < x.length; i ++){
			System.out.print(x[i] + " ");
		}
	}
	
	public static int getArrayAverage(int[] x){
		int average;
		int total = 0;
		for(int i = 0; i < x.length; i++){
			total = total + x[i];
		}
		average = (int)total/x.length;
		return average;
	}
	
	public static int getArrayMax(int[] x){
		int max = x[0];
		for(int num = 0; num < x.length; num++){
			if(x[num] > max){
				max = x[num];
			}
		}
		return max;
	}
	
	public static int getArrayMin(int[] x){
		int min = x[0];
		for(int num = 0; num < x.length; num++){
			if(x[num] < min){
				min = x[num];
			}
		}
		return min;
	}
	public static void main(String args[]) {
		int [] arr = new int [100];
		for(int egg = 0; egg < arr.length; egg++){
			arr[egg] = (int)(Math.random() * 99 + 1);
		}
		toStringArray(arr);
		System.out.println();
		System.out.println("average: " + getArrayAverage(arr));
		System.out.println("max: " + getArrayMax(arr));
		System.out.println("min: " + getArrayMin(arr));
	}
}
