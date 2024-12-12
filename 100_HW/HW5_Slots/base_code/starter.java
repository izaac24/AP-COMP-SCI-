/*
 *	Author:Isaac
 *  Date: 3/10/24
 * 	Collaborator(s): Declan
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int purse = 100;
		while(purse > 0){
		System.out.println("You have $" + purse + " in your wallet. ");
		System.out.print("Do you want to play some slots(Yes/yes/Y/y): ");
		String answer = sc.nextLine();
			if(answer.equals("Yes") || answer.equals("yes") || answer.equals("Y") || answer.equals("y")){
				System.out.print("How much money would you like to bet: ");
			int wager = sc.nextInt();
			String declan = sc.nextLine();
			if(wager > purse || wager < 0){
				System.out.print("Thats invalid ");
			}
			else{
				purse = purse - wager;
			int num1 = (int)(Math.random() * 10);
			int num2 = (int)(Math.random() * 10);
			int num3 = (int)(Math.random() * 10);
			System.out.println("| " + num1 + " | " + num2 + " | " + num3 + " |");
			if(num1 == num2 || num1 == num3|| num2 == num3){
				purse = wager + wager + purse;
				System.out.println("You got lucky, you now have $" + purse);
			}
			else if(num1 == num2 || num2 == num3){
				purse = wager + wager + wager + purse;
				System.out.println("You got really lucky, you now have $" + purse + " in your purse now");
			}
			else if(num1 != num2 || num1 != num3|| num2 != num3){
				System.out.println("Oh no, you lost your money. You now have $" + purse + " in your purse");
			}
			}
			}
			
		}
		System.out.print("You suck you lost all your money");
		
		
	}
}
