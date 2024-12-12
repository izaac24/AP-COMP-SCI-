/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your first integer: ");
		int num1 = sc.nextInt();
		System.out.print("What is your second integer: ");
		int num2 = sc.nextInt();
		if(num1 % 2 == 0){
			System.out.println("Your first  numer is even");
		}
		if(num1 % 3 != 0 && num1 % 4 != 0 && num1 % 5 != 0){
			System.out.println("Your first number is not divisible by three, four, or five");
		}
		if(num1 % 3 == 0){
			System.out.println("Your first number is divisible by three");
		}
		if(num1 % 4 == 0){
			System.out.println("Your first number is divisible by four");
		}
		if(num1 % 5 == 0){
			System.out.println("Your first number is divisible by five");
			
		}
		if(num2 % 2 == 0){
			System.out.println("Your second number is even");
		}
		if(num2 % 3 != 0 && num1 % 4 != 0 && num1 % 5 != 0){
			System.out.println("Your second number is not divisible by three, four, or five");
		}
		if(num2 % 3 == 0){
			System.out.println("Your second number is divisible by three");
		}
		if(num2 % 4 == 0){
			System.out.println("Your second number is divisible by four");
		}
		if(num2 % 5 == 0){
			System.out.println("Your second number is divisible by five");
		}
	}
}
