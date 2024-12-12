/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Pls enter your x double: ");
		double x = sc.nextDouble();
		System.out.print("Pls enter your y double: ");
		double y = sc.nextDouble();
		System.out.println("The max between your numbers is " + Math.max(x,y));
		System.out.println("The sqaure root of your y is " + Math.sqrt(y));
		System.out.println("The x to the power of y is " + Math.pow(x,y));
		
		
	}
}
