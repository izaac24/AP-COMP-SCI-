/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num3 = 0;
		System.out.print("What is your first number:");
		int num1 = sc.nextInt();
		System.out.print("What is your second number(has to be bigger then the first:");
		int num2 = sc.nextInt();
		int dif = num2 - num1;
		while(5 > num3){
			int sum = (int)(Math.random() * dif + num1);
			System.out.print(sum + ",");
			num3 = num3 + 1;
		}
		
	}
}
