/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;


class starter {
	public static int pow(int base,int power){
		int product = 1;
		while(power != 0){
			product = product * base;
			power = power - 1;
		}
		return product;
		
	}
	public static void main(String args[]) {
		System.out.println(pow(5,3));
	}
}
