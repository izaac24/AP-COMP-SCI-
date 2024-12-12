/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter your x value: ");
		int x = sc.nextInt();
		System.out.println("Pls enter your y value: ");
		int y = sc.nextInt();
	
		if(x == y){
			System.out.println("x and y are equal.");
		}
	}
}
