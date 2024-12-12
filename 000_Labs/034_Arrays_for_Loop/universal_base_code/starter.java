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
		for(int num = 0; num < random.length; num++){
			random[num] = (int)(Math.random() * 1000000);
			System.out.print(random[num] + ", ");
		}


		
	}
}
