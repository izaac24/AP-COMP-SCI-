/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] random = new int[1000];
		int num = 0;
		while(num < random.length){
			random[num] = (int)(Math.random() * 1000000);
			System.out.print(random[num] + ", ");
			num++;
		}
		
		


		
	}
}
