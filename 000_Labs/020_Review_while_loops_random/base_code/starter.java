/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int numrand = (int)(Math.random()*1001);
		Scanner sc = new Scanner(System.in);
		System.out.print("Guess a number between 1-1000: ");
		int num1 = sc.nextInt();
		while(numrand != num1){
			if(num1 < numrand){
				System.out.print("too low, guess higher: ");
				num1 = sc.nextInt();
			}
			else if(num1 > numrand){
				System.out.print("Too high, guess lower: ");
				num1 = sc.nextInt();
			}
			
		}
		System.out.print("You got it, " + numrand + " was the number" );



		
	}
}
