/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1 =(int)(Math.random() * 1000);
		System.out.println("Guess a number from 1-1000");
		int num2 = sc.nextInt();
		if(num2 == num1){
			System.out.println("You were correct, great job!!!");
		}
		else{
			System.out.println("you suck at guessing, you were wrong, womp womp");
		}
	}
}
