/*
 *	Author:  Isaac Porath
 *  Date: 9/3/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me your first integer");
		int num1 =sc.nextInt();
		System.out.println("Give me your second integer");
		int num2 =sc.nextInt();
		System.out.println("Give me your third integer");
		int num3 =sc.nextInt();
		if((num1 > num2) && (num1 > num3)){
			System.out.println("Your first number has the greatest in value");
		}
		if((num2 > num1) && (num2 > num3)){
			System.out.println("Your second number has the greatest in value");
		}
		if((num3 > num1) && (num3 > num2)){
			System.out.println("Your third number has the greatest in value");
		}
		if((num1 < num2) && (num1 < num3)){
			System.out.println("Your first number has the least value");
		}
		if((num2 < num1) && (num2 < num3)){
			System.out.println("Your second number has the least value");
		}
		if((num3 < num1) && (num3 < num2)){
			System.out.println("Your third number has the least value");
		}
	}
}
