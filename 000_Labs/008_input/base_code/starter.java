/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first name?");
		String name = sc.nextLine();
		System.out.println("how old are you?");
		int age = sc.nextInt();
		System.out.println("what month of the year were you born in? (1-12)");
		int month = sc.nextInt();
		System.out.println("What day were you born on? (1-31)");
		int day = sc.nextInt();
		System.out.println("What year were you born in?");
		int year = sc.nextInt();
		System.out.println("How much is a buck fitty? (make it a double)");
		double money = sc.nextDouble();
		System.out.println("Your name is " + name + " and you are " + age + " years old. You were born on " + month + "/" + day + "/" + year);
		System.out.print("you said a buck fitty is " + money);
		
		
		
	}
}
